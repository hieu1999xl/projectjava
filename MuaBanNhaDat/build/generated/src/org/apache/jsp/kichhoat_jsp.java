package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.UsersDAO;
import model.Users;

public final class kichhoat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Kích Hoạt</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0\" >\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.2/css/all.css\" />\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function ($)\n");
      out.write("            {\n");
      out.write("                $(\".scroll\").click(function (event)\n");
      out.write("                {\n");
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
      out.write("        <script>$(document).ready(function (c)\n");
      out.write("            {\n");
      out.write("                $('.alert-close').on('click', function (c) {\n");
      out.write("                    $('.message').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function (c) {\n");
      out.write("                $('.alert-close1').on('click', function (c) {\n");
      out.write("                    $('.message1').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message1').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            /*======================\n");
      out.write("                404 page\n");
      out.write("            =======================*/\n");
      out.write("\n");
      out.write("\n");
      out.write("            .page_404{ padding:40px 0; background:rgba(0,0,0,0); font-family: 'Arvo', serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .page_404  img{ width:100%;}\n");
      out.write("\n");
      out.write("            .four_zero_four_bg{\n");
      out.write("\n");
      out.write("                background-image: url(https://cdn.dribbble.com/users/285475/screenshots/2083086/dribbble_1.gif);\n");
      out.write("                height: 400px;\n");
      out.write("                background-position: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .four_zero_four_bg h1{\n");
      out.write("                font-size:52px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .four_zero_four_bg h3{\n");
      out.write("                font-size:80px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .link_404\n");
      out.write("            {\t\t\t \n");
      out.write("                color: #fff!important;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background: #39ac31;\n");
      out.write("                margin: 20px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                border-radius: 6px;\n");
      out.write("            }\n");
      out.write("            .contant_box_404{ margin-top:-50px;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background:url(video/bann.jpg) fixed;color:white;\" >\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");

            String uuid = request.getParameter("ID");
            Users u = UsersDAO.getUser(request.getParameter("TK"));
            if (uuid.equals(u.getUser_code())) {
                UsersDAO.kichhoat_taikhoan(u.getStt());
            }
        
      out.write("\n");
      out.write("        <div>\n");
      out.write("            \n");
      out.write("            <section class=\"page_404\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\t\n");
      out.write("                        <div class=\"col-sm-12 \">\n");
      out.write("                            <div class=\"col-sm-10 col-sm-offset-1  text-center\">\n");
      out.write("                                <div class=\"four_zero_four_bg\">\n");
      out.write("                                    <h1 class=\"text-center \" style=\"color: #522908;\">Tks You :v Đã Đăng Ký</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"contant_box_404\">\n");
      out.write("                                    <h3 class=\"h2\">\n");
      out.write("                                        Tks u\n");
      out.write("                                    </h3>\n");
      out.write("\n");
      out.write("                                    <p>");
      out.print(u.getHovaten());
      out.write(" !,Tài khoản của bạn đã được Active!</p>\n");
      out.write("\n");
      out.write("                                    <a href=\"login.jsp\" class=\"link_404\">Quay Về Đăng Nhập</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
