package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Users;
import model.ChoThue;
import dao.ChoThueDAO;
import java.util.ArrayList;
import model.Cart;
import model.Product;
import dao.ProductDAO;

public final class product_005fchothue_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>product</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0\" >\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.1/css/all.css\" />\n");
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
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"content-top\">\n");
      out.write("                        <h3 style=\"color: #000\" class=\"future\">Bài đăng nhà đất cho thuê</h3>\n");
      out.write("                    ");


                        Cart cart = (Cart) session.getAttribute("cart");
                        if (cart == null) {
                            cart = new Cart();
                            session.setAttribute("cart", cart);
                        }
                        String category_id = "";
                        if (request.getParameter("category") != null) {
                            category_id = request.getParameter("category");
                        }
                        for (ChoThue c : ChoThueDAO.getListChoThueByChapNhan(Integer.parseInt(category_id) )) 
                        {
                    
      out.write("\n");
      out.write("                    <div class=\"col-md-4 md-col\" style=\"margin-top:30px;\">\n");
      out.write("                        <div  class=\"col-md\" style=\"background:rgba(0,0,0,0.4); margin-bottom: 5em;\">\n");
      out.write("                            <div><i class=\"fas fa-home\" style=\"color: #000;\" > ");
      out.print(c.getChothue_loainhadat());
      out.write("</i><span><i style=\"padding-left: 53px;float: right;color: #000;\" class=\"far fa-calendar-alt\"> ");
      out.print(c.getChothue_ngaydang());
      out.write("</i></span></div>\n");
      out.write("                            <div class=\"clearfix\"></div> \n");
      out.write("                            <a href=\"singleChoThue.jsp?ChoThueID=");
      out.print(c.getChothue_id());
      out.write("\"><img  src=\"");
      out.print(c.getChothue_hinhanh());
      out.write("\" style=\"height: 253px;\" alt=\"");
      out.print(c.getChothue_tieude());
      out.write("\" /></a>\t\n");
      out.write("                            <div class=\"top-content\">\n");
      out.write("                                <h5><a style=\"color:#000;\" href=\"single.jsp?ChoThueID=");
      out.print(c.getChothue_id());
      out.write("\"> ");
      out.print(c.getChothue_tieude());
      out.write("</a></h5>\n");
      out.write("                                <h5 style=\"padding: 0px;margin-top: -9px;\"><i class=\"fas fa-compass\" style=\"color: #000;\"> ");
      out.print(c.getChothue_diadiem());
      out.write("</i></h5>\n");
      out.write("                                <h5 style=\"padding: 0px;margin-top: 4px;\"><i class=\"fab fa-laravel\" style=\"color:#000;padding: 0px;margin-top: -9px;\"> ");
      out.print(c.getChothue_dientich());
      out.write("m<sup>2</sup></i></h5>\n");
      out.write("                                ");

                                    Users users = null;
                                    if (session.getAttribute("user") != null) {
                                        users = (Users) session.getAttribute("user");
                                    }
                                    if (users != null) {
                                
      out.write("\n");
      out.write("                                <div class=\"white\">\n");
      out.write("                                    ");

                                        if (!cart.getCartItems().containsKey(c.getChothue_id())) {
                                    
      out.write("\n");
      out.write("                                    <a href=\"#\" id=\"luuthongtinchothue\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Lưu Thông Tin</a>\n");
      out.write("                                    ");

                                    } else {
                                    
      out.write("\n");
      out.write("                                    <a href=\"#\" style=\"cursor:unset;background:black;\" id=\"luuthongtin\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Đã Lưu</a>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                    <p class=\"dollar\"><span>");
      out.print(c.getChothue_gia());
      out.write("</span><span>Tỷ</span><span class=\"in-dollar\">VNĐ</span></p>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                                <script type=\"text/javascript\">\n");
      out.write("                                    $(function ()\n");
      out.write("                                    {\n");
      out.write("                                        $(\"#luuthongtinchothue\").click(function ()\n");
      out.write("                                        {\n");
      out.write("                                            if (confirm(\"Chức năng Lưu ở mục Cho Thuê này tạm thời khóa\"))\n");
      out.write("                                            {\n");
      out.write("                                                window.location.reload(true);\n");
      out.write("                                            }\n");
      out.write("                                        });\n");
      out.write("                                    });\n");
      out.write("                                </script>\n");
      out.write("                            </div>\t\t\t\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        }
                    
      out.write("                                   \n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
