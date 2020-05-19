package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lienhe_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Liên Hệ</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0\" >\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.2/css/all.css\" />\n");
      out.write("        <style>\n");
      out.write("            span{\n");
      out.write("                color: #000;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"contact\">\n");
      out.write("                <h2 class=\" contact-in\" >Liên Hệ</h2>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-6 contact-top\">\n");
      out.write("                   \n");
      out.write("                    <div class=\"map\" >\n");
      out.write("                        <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3723.9209918883516!2d105.79913921476344!3d21.035847085994572!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3135ab3f57fc23d1%3A0xf813dfd05dfa4078!2zVHLGsOG7nW5nIMSQ4bqhaSBo4buNYyBUaOG7pyDEkcO0IEjDoCBO4buZaQ!5e0!3m2!1svi!2s!4v1585898446521!5m2!1svi!2s\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\" aria-hidden=\"false\" tabindex=\"0\"></iframe>\n");
      out.write("                    </div>\n");
      out.write("                    <p>Sử dụng thông tin được cung cấp để liên hệ với chúng tôi HOẶC để lại tin nhắn cho chúng tôi bằng cách sử dụng biểu mẫu liên hệ </p>\n");
      out.write("                    <p>Cám ơn đã sử dụng dịch vụ của chúng tôi </p>\t\t\t\t\n");
      out.write("                    <ul class=\"social \">\n");
      out.write("                        <li><span><i > </i>Số 98 Dương Quảng Hàm, quận Cầu Giấy, thành phố Hà Nội </span></li>\n");
      out.write("                        <li><span><i class=\"down\"> </i>03665254026</span></li>\n");
      out.write("                        <li><a href=\"hiu99xl@gmail.com\"><i class=\"mes\"> </i>cskh@batdongsan.com.vn</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 contact-top\">\n");
      out.write("                    <div>\n");
      out.write("                        <span \">Tên Của Bạn </span>\t\t\n");
      out.write("                        <input type=\"text\" value=\"\" >\t\t\t\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <span >Email:</span>\t\t\n");
      out.write("                        <input type=\"text\" value=\"\" >\t\t\t\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <span \">Tiêu Đề:</span>\t\t\n");
      out.write("                        <input type=\"text\" value=\"\" >\t\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <span \">Nội Dung:</span>\t\t\n");
      out.write("                        <textarea> </textarea>\t\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"submit\" value=\"Gửi\" >\t\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
