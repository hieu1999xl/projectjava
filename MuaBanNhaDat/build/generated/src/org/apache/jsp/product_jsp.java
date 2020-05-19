package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Users;
import java.util.ArrayList;
import model.Cart;
import model.Product;
import dao.ProductDAO;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>product</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("          <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0\" >\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("          <link href=\"https://fonts.googleapis.com/css2?family=Muli:wght@200&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function ($)\n");
      out.write("            {\n");
      out.write("                $(\".scroll\").click(function (event) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--slider-script-->\n");
      out.write("        <script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function ()\n");
      out.write("            {\n");
      out.write("                $(\"#slider1\").responsiveSlides({\n");
      out.write("                    auto: true,\n");
      out.write("                    speed: 100,\n");
      out.write("                    namespace: \"callbacks\",\n");
      out.write("                    pager: true,\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--//slider-script-->\n");
      out.write("        <script>$(document).ready(function (c) {\n");
      out.write("                $('.alert-close').on('click', function (c) {\n");
      out.write("                    $('.message').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>$(document).ready(function (c) {\n");
      out.write("                $('.alert-close1').on('click', function (c) {\n");
      out.write("                    $('.message1').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message1').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>    \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: linear-gradient(to left bottom, #F2E3C6 0%, #A7A1A5 100%)\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            ProductDAO x = new ProductDAO();
            String category_id = "";
            if (request.getParameter("category") != null) 
            {
                category_id = request.getParameter("category");
            }
            Cart cart = (Cart) session.getAttribute("cart");
            if(cart == null)
            {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
            int pages = 0, firstResult = 0 ,maxResult = 0,total = 0;
            if(request.getParameter("pages") != null )
            {
                pages = Integer.parseInt(request.getParameter("pages")) ;
            }
            total = ProductDAO.countProductByCategory(Long.parseLong(category_id));
            if(total <= 4 )
            {
                firstResult = 1;
                maxResult = total;
            }
            else
            {
                firstResult = (pages)* 4 - 4;
                maxResult = 4;
            }
            ArrayList<Product> list = ProductDAO.getListProductByNav(Long.parseLong(category_id) , firstResult, maxResult)  ;
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"content-top\">\n");
      out.write("                    <h3 class=\"future\">Bài Đăng</h3>\n");
      out.write("                    ");

                        for(Product p: ProductDAO.getListProductByNav(Long.parseLong(category_id) , firstResult, maxResult) )  {
                    
      out.write("\n");
      out.write("                    <div class=\"col-md-4 md-col\" style=\"margin-top:30px;\">\n");
      out.write("                            <div  class=\"col-md\" style=\"background:rgba(0,0,0,0.4)\">\n");
      out.write("                                <div><i class=\"fas fa-home\" style=\"color: white;\" > ");
      out.print(p.getHinhthuc());
      out.write("</i><span><i style=\"padding-left: 53px;float: right;color: white;\" class=\"far fa-calendar-alt\"> ");
      out.print(p.getNgaydang());
      out.write("</i></span></div>\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                                <a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\"><img  src=\"");
      out.print(p.getProductImage());
      out.write("\" style=\"height: 253px;\" alt=\"");
      out.print(p.getProductName());
      out.write("\" /></a>\t\n");
      out.write("                                <div class=\"top-content\">\n");
      out.write("                                    <h5><a style=\"color:white;\" href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write('"');
      out.write('>');
      out.print(p.getProductName());
      out.write("</a></h5>\n");
      out.write("                                    <h5 style=\"padding: 0px;margin-top: -9px;\"><i class=\"fas fa-compass\" style=\"color: white;\"> ");
      out.print(p.getVitri());
      out.write("</i></h5>\n");
      out.write("                                    <h5 style=\"padding: 0px;margin-top: 4px;\"><i class=\"fab fa-laravel\" style=\"color:white;padding: 0px;margin-top: -9px;\"> ");
      out.print(p.getDientich());
      out.write("m<sup>2</sup></i></h5>\n");
      out.write("                                    ");

                                        Users users = null;
                                        if (session.getAttribute("user") != null) {
                                            users = (Users) session.getAttribute("user");
                                        }
                                        if (users != null) {
                                    
      out.write("\n");
      out.write("                                    <div class=\"white\">\n");
      out.write("                                        ");

                                            if (!cart.getCartItems().containsKey(p.getProductID())) {
                                        
      out.write("\n");
      out.write("                                        <a href=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("\" id=\"luuthongtin\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Lưu Thông Tin</a>\n");
      out.write("                                        ");

                                        } else {
                                        
      out.write("\n");
      out.write("                                        <a href=\"\" style=\"cursor:unset;background:black;\" id=\"luuthongtin\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Đã Lưu</a>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                        <p class=\"dollar\"> <span>");
      out.print(p.getProductPrice());
      out.write("</span><span>Tỷ</span><span class=\"in-dollar\">VNĐ</span></p>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </div>\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    ");

                        }
                    
      out.write("                                   \n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"start\">\n");
      out.write("                ");
 int i=1 ;
      out.write("\n");
      out.write("                <li ><a href=\"product.jsp?category=");
      out.print(category_id);
      out.write("&pages=");
      out.print(i);
      out.write("\"><i></i></a></li>\n");
      out.write("                ");
 for(i = 1;i<= (total/4)+1 ;i++){ 
      out.write("\n");
      out.write("                <li class=\"arrow\"><a href=\"product.jsp?category=");
      out.print(category_id);
      out.write("&pages=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a></li>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("                <li ><a href=\"product.jsp?category=");
      out.print(category_id);
      out.write("&pages=");
      out.print(i=(total/4)+1);
      out.write("\"><i  class=\"next\"> </i></a></li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!---->\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
