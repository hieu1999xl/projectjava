package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Users;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Dang Nhap</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src='https://www.google.com/recaptcha/api.js'></script>\n");
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
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            #tb:hover\n");
      out.write("            {\n");
      out.write("                animation: swing 1s ease;\n");
      out.write("                border-color: #00c6d7;\n");
      out.write("                box-shadow: 0 10px 6px -6px #777;\n");
      out.write("                color: #00c6d7;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("     <body style=\"background-image: linear-gradient(to left bottom, #F2E3C6 0%, #A7A1A5 100%)\" >\n");
      out.write("        ");

            if (session.getAttribute("user") != null || session.getAttribute("admin") != null) {
                response.sendRedirect("index.jsp");
            }
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"container\" >\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"account\">\n");
      out.write("                        <h2 class=\"account-in\" style=\"color:#000;\">Đăng Nhập Tài Khoản</h2>\n");
      out.write("                        <form action=\"UsersServlet\" method=\"POST\">\n");
      out.write("                        ");
 String err = (String) request.getAttribute("error");
                            if (err != null) {
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <p style=\"background:url(img/not-available.png) no-repeat;color:red;\"><span style=\"margin-left:21px;\">");
out.print(err); 
      out.write("</span></p>\n");
      out.write("                        </div> \n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                        ");
 String err2 = (String) request.getAttribute("error2");
                            if (err2 != null) {
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <p style=\"background:url(img/not-available.png) no-repeat;color:red;\"><span style=\"margin-left:21px;\">");
out.print(err2); 
      out.write("</span></p>\n");
      out.write("                        </div> \n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                        ");
 String dangky = (String) request.getAttribute("dangky");
                            if (dangky != null) {
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <p style=\"background:url(img/available.png) no-repeat;color:red;\"><span style=\"margin-left:21px;\">");
out.print(dangky); 
      out.write("</span></p>\n");
      out.write("                        </div> \n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                        ");
 String error3 = (String) request.getAttribute("error3");
                            if (error3 != null) {
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <p style=\"background:url(img/not-available.png) no-repeat;color:red;\"><span style=\"margin-left:21px;\">");
out.print(error3); 
      out.write("</span></p>\n");
      out.write("                        </div> \n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <span style=\"color:#000;\">Tên Đăng Nhập </span>\n");
      out.write("                            <input type=\"text\" name=\"username\">\n");
      out.write("                        </div> \t\n");
      out.write("                        <div> \n");
      out.write("                            <span class=\"word\" style=\"color:#000;margin-right:33px;\">Mật Khẩu </span>\n");
      out.write("                            <input type=\"password\" name=\"pass\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"g-recaptcha\"\n");
      out.write("                             data-sitekey=\"6LelZAsTAAAAAAv1ADYDnq8AzbmPmbMvjh-xhfgB\"></div>\n");
      out.write("                        <input type=\"hidden\" value=\"login\" name=\"command\">\n");
      out.write("                        <input id=\"tb\" type=\"submit\" value=\"Đăng Nhập\" style=\"background:rgba(0,0,0,0.4);border:1px solid black;margin-top: 55px;\"> \n");
      out.write("\n");
      out.write("                        <script>\n");
      out.write("                            grecaptcha.ready(function () {\n");
      out.write("                                grecaptcha.execute('6Ldy2YMUAAAAAG2CYNQEAeWH3iVAMPKALvw2enf1', {action: 'action_name'})\n");
      out.write("                                        .then(function (token) {\n");
      out.write("// Verify the token on the server.\n");
      out.write("                                        });\n");
      out.write("                            });\n");
      out.write("                        </script>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
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
