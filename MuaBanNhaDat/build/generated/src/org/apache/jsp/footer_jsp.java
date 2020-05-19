package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Footer</title>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0\" >\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
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
      out.write("        <script>\n");
      out.write("            $(function ()\n");
      out.write("            {\n");
      out.write("                $(\"#slider1\").responsiveSlides\n");
      out.write("                        ({\n");
      out.write("                            auto: true,\n");
      out.write("                            speed: 100,\n");
      out.write("                            namespace: \"callbacks\",\n");
      out.write("                            pager: true,\n");
      out.write("                        });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function (c)\n");
      out.write("            {\n");
      out.write("                $('.alert-close').on('click', function (c)\n");
      out.write("                {\n");
      out.write("                    $('.message').fadeOut('slow', function (c)\n");
      out.write("                    {\n");
      out.write("                        $('.message').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function (c)\n");
      out.write("            {\n");
      out.write("                $('.alert-close1').on('click', function (c)\n");
      out.write("                {\n");
      out.write("                    $('.message1').fadeOut('slow', function (c)\n");
      out.write("                    {\n");
      out.write("                        $('.message1').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"footer\" style=\"background: #1D2C4C;\">\n");
      out.write("            <div class=\"footer-middle\" style=\"background: rgba(0,0,0,0.4);\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"footer-middle-in\">\n");
      out.write("                        <h6>Trụ Sở</h6>\n");
      out.write("                        <p>\n");
      out.write("                            Số 98 Dương Quảng Hàm, Quận Cầu Giấy, Thành Phố Hà Nội.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-middle-in\">\n");
      out.write("                        <h6>Thông Tin Chúng Tôi</h6>\n");
      out.write("                        <p>\n");
      out.write("                            Giấy ĐKKD số: 0104630479 Do Sở Kế hoạch và Đầu tư Thành phố Hà Nội cấp lần đầu ngày 12/09/2019 \n");
      out.write("                            Giấy phép ICP số 3399/GP-STTTT do Sở Thông tin và Truyền thông Hà Nội cấp ngày 4 tháng 9 năm 2019. \n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-middle-in\">\n");
      out.write("                        <h6>Dịch Vụ CSKH</h6>\n");
      out.write("                        <p>\n");
      out.write("                            Tổng đài CSKH: 1900 100\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("<!--                            Email: hotro@batdongsandanang.com.vn | cskh@batdongsandanang.com.vn-->\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-middle-in\">\n");
      out.write("                        <h6>Chịu trách nhiệm nội dung: </h6>\n");
      out.write("                        <p>\n");
      out.write("                            Nguyễn Đăng Hiếu\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <p class=\"footer-class\" style=\"background: rgba(0,0,0,0.4);\"><a href=\"index.jsp\" target=\"_blank\"></a>Doanh Nghiệp Bất Động Sản <strong>HNMU</strong></p>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                $(document).ready(function ()\n");
      out.write("                {\n");
      out.write("                    $().UItoTop({easingType: 'easeOutQuart'});\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("            <a href=\"#\" id=\"toTop\" style=\"display: block;background:url(images/up.png) no-repeat\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\n");
      out.write("\n");
      out.write("        </div>\n");
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
