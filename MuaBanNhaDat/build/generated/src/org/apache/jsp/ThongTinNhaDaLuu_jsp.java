package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import model.Item;
import model.Cart;
import model.Users;

public final class ThongTinNhaDaLuu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lưu Thông Tin Nhà,Đất</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0\" >\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
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
      out.write("        </script>  \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.2/css/all.css\" />\n");
      out.write("        <style>\n");
      out.write("            #baidang {\n");
      out.write("                   margin-top: 4em;\n");
      out.write("                    font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("                    border-collapse: collapse;\n");
      out.write("                    width: 100%;\n");
      out.write("                    margin-bottom: 4em;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #baidang td, #baidang th {\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                padding: 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #baidang tr:nth-child(even){background-color: rgba(0,0,0,0.4);color:white;}\n");
      out.write("\n");
      out.write("            #baidang tr:hover {background-color: #544949;}\n");
      out.write("\n");
      out.write("            #baidang th {\n");
      out.write("                padding-top: 12px;\n");
      out.write("                padding-bottom: 12px;\n");
      out.write("                text-align: left;\n");
      out.write("                background-color: rgba(0,0,0,0.4);\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .fas\n");
      out.write("            {\n");
      out.write("                font-size:20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("      <body style=\"background-image: linear-gradient(to left bottom, #F2E3C6 0%, #A7A1A5 100%)\" >\n");
      out.write("        ");

            Users users = null;
            if (session.getAttribute("user") != null) {
                users = (Users) session.getAttribute("user");
            }
            Cart cart = (Cart) session.getAttribute("cart");

            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <table id=\"baidang\">\n");
      out.write("                  \n");
      out.write("                    <tr>\n");
      out.write("                        <th>STT</th>\n");
      out.write("                        <th>Họ Và Tên Người Đăng</th>\n");
      out.write("                        <th>SĐT</th>\n");
      out.write("                        <th>Tiêu Đề</th>\n");
      out.write("                        <th>Nội Dung Bài Đăng</th>\n");
      out.write("                    </tr>\n");
      out.write("                ");

                    int countt = 0;
                    for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {
                        countt++;
                
      out.write("\n");
      out.write("                <tr style=\"color: white;\">\n");
      out.write("                    <td>");
      out.print(countt);
      out.write(" </td>\n");
      out.write("                    <td>");
      out.print(list.getValue().getProduct().getHoten());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(list.getValue().getProduct().getSdt() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(list.getValue().getProduct().getProductName() );
      out.write("</td>\n");
      out.write("                    <td><span><a href=\"CartServlet?command=remove&productID=");
      out.print(list.getValue().getProduct().getProductID() );
      out.write("\"><i class=\"fas fa-trash-alt\" style=\"color:white;\"> [Xóa]</i></a></span><span><a href=\"single.jsp?productID=");
      out.print(list.getValue().getProduct().getProductID());
      out.write("\"><i class=\"fas fa-link\" style=\"color:white;\"> Chi Tiết</i></span></a> </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
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
