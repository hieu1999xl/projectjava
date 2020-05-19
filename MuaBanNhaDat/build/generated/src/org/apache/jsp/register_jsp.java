package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("        <title>Đăng Ký</title>\n");
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
      out.write("      \n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\"  >\n");
      out.write("            ");
request.setCharacterEncoding("UTF-8");
      out.write("\n");
      out.write("            ");
response.setContentType("text/html; charset=UTF-8"); 
      out.write("\n");
      out.write("                <div class=\"container\" >\n");
      out.write("                    <div class=\"account\">\n");
      out.write("                        <h2 class=\"account-in\" style=\"color:#000;\">Đăng Ký Tài Khoản</h2>\n");
      out.write("                        <form action=\"UsersServlet\" method=\"POST\">\n");
      out.write("                        ");

                            String err = (String) request.getAttribute("error");
                            if (err != null) {
                        
      out.write("<p style=\"background:url(img/not-available.png) no-repeat;color:red;\"><span style=\"margin-left:21px;\">");
out.print(err); 
      out.write("</span></p>");
}
      out.write("\n");
      out.write("                            ");

                                String err2 = (String) request.getAttribute("error2");
                                if (err2 != null) {
                            
      out.write("<p style=\"background:url(img/not-available.png) no-repeat;color:red;\"><span style=\"margin-left:21px;\">");
out.print(err2); 
      out.write("</span></p>");
}
      out.write("\n");
      out.write("                            ");

                                String err3 = (String) request.getAttribute("error3");
                                if (err3 != null) {
                            
      out.write("<p style=\"background:url(img/not-available.png) no-repeat;color:red;\"><span style=\"margin-left:21px;\">");
out.print(err3); 
      out.write("</span></p>");
 }
      out.write("\n");
      out.write("                            ");

                                String err4 = (String) request.getAttribute("error4");
                                if (err4 != null) {
                            
      out.write("<p style=\"background:url(img/not-available.png) no-repeat;color:red;\"><span style=\"margin-left:21px;\">");
out.print(err4); 
      out.write("</span></p>");
 }
      out.write("\n");
      out.write("                            ");

                                String err5 = (String) request.getAttribute("error5");
                                if (err5 != null) {
                            
      out.write("<p style=\"background:url(img/not-available.png) no-repeat;color:red;\"><span style=\"margin-left:21px;\">");
out.print(err5); 
      out.write("</span></p>");
 }
      out.write("\n");
      out.write("                        ");

                                String err6 = (String) request.getAttribute("error6");
                                if (err6 != null) {
                            
      out.write("<p style=\"background:url(img/not-available.png) no-repeat;color:red;\"><span style=\"margin-left:21px;\">");
out.print(err6); 
      out.write("</span></p>");
 }
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <span class=\"mail\" style=\"color:#000;\">Họ Và Tên:*</span>\n");
      out.write("                            <span><input id=\"tb\" style=\"margin-left: 34px;padding-left: 23px;\" style=\"margin-left: -33px;\" type=\"text\" name=\"hovaten\" placeholder=\"Điền họ và tên...\" required=\"\"  />\n");
      out.write("                                   <span class=\"error_form\" id=\"ho_ten\"></span></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div> \t\n");
      out.write("                            <span class=\"mail\" style=\"color:#000;\">Email/Gmail*</span>\n");
      out.write("                            <span><input id=\"tb\" style=\"margin-left: 22px;padding-left: 23px;\" type=\"text\" name=\"email\" placeholder=\"Điền email...\" required=\"\" /> \n");
      out.write("                                    <span class=\"error_form\" id=\"Email\"></span>\n");
      out.write("                        </div>    \n");
      out.write("                        <div>\n");
      out.write("                            <span style=\"color:#000;\">Username *</span>\n");
      out.write("                            <span><input id=\"tb\" style=\"margin-left: 68px;padding-left: 23px;\" type=\"text\" name=\"username\" placeholder=\"Điền tên đăng nhập...\" required=\"\" />\n");
      out.write("                                <span class=\"error_form\" id=\"user_name\"></span>\n");
      out.write("                        </div> \t\n");
      out.write("                        <div> \n");
      out.write("                            <span class=\"word\" style=\"color:#000;\">Password *</span>\n");
      out.write("                            <span><input id=\"tb\" style=\"margin-left: 68px;padding-left: 23px;\" type=\"password\" name=\"pass\" placeholder=\"password...\" required=\"\" />\n");
      out.write("                                <span class=\"error_form\" id=\"pass\"><span>\n");
      out.write("                        </div>\n");
      out.write("                        <div> \n");
      out.write("                            <span class=\"word\" style=\"color:#000;\">Nhập Lại Password *</span>\n");
      out.write("                            <span><input style=\"padding-left: 23px;\" id=\"tb\" type=\"password\" name=\"repass\" placeholder=\"nhập lại password...\" required=\"\" />\n");
      out.write("                                <span class=\"error_form\" id=\"repass\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div> \n");
      out.write("                            <span class=\"word\" style=\"color:#000;\">Địa Chỉ</span>\n");
      out.write("                            <span><input id=\"tb\" style=\"margin-left: 97px;padding-left: 23px;\" type=\"text\" name=\"diachi\" placeholder=\"địa chỉ...\" required=\"\"  />\n");
      out.write("                                <span class=\"error_form\" id=\"diachi\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div> \n");
      out.write("                            <span class=\"word\" style=\"color:#000;\">Số Điện Thoại</span>\n");
      out.write("                            <span><input id=\"tb\" style=\"margin-left: 49px;padding-left: 23px;\" type=\"text\" name=\"phone\" placeholder=\"số diện thoại...\" required=\"\"  />\n");
      out.write("                                <span class=\"error_form\" id=\"sdt\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"hidden\" value=\"them\" name=\"command\">\n");
      out.write("                        <input id=\"tb\" style=\"background:rgba(0,0,0,0.4);border:1px solid black;\" type=\"submit\" value=\"Đăng Ký\"> \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
