package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PostBan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Đăng Tin Mua</title>\n");
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
      out.write("        <script>$(document).ready(function (c) {\n");
      out.write("                $('.alert-close1').on('click', function (c) {\n");
      out.write("                    $('.message1').fadeOut('slow', function (c) {\n");
      out.write("                        $('.message1').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script> \n");
      out.write("        <style>\n");
      out.write("            .a1\n");
      out.write("            {\n");
      out.write("                border: 2px solid #f7921d;\n");
      out.write("                background-color:#f7921d;\n");
      out.write("            }\n");
      out.write("            .a1 .a2\n");
      out.write("            {\n");
      out.write("                margin: 0px auto;\n");
      out.write("                padding-left: 64px;\n");
      out.write("                padding-right: 71px;\n");
      out.write("            }\n");
      out.write("            input[type=number]\n");
      out.write("            {\n");
      out.write("                padding: 0.7em;\n");
      out.write("                width: 60%;\n");
      out.write("                background: none;\n");
      out.write("                border: 1px solid #D1D1D1;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                -webkit-border-radius: 10px;\n");
      out.write("                -o-border-radius: 10px;\n");
      out.write("                -moz-border-radius: 10px;\n");
      out.write("                -ms-border-radius: 10px;\n");
      out.write("                outline: none;\n");
      out.write("                color: #464646;\n");
      out.write("                font-size: 1em;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: linear-gradient(to left bottom, #F2E3C6 0%, #A7A1A5 100%)\" >\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"account\">\n");
      out.write("                        <h2 class=\"account-in\">Đăng Tin Bán</h2>\n");
      out.write("                        <div class=\"a1\">\n");
      out.write("                            <div class=\"a2\">\n");
      out.write("                                <p>\n");
      out.write("                                <p style=\"color:white;\">[+] Làm thế nào để tin đăng bán đạt hiệu quả cao nhất?</p>\n");
      out.write("                                <p style=\"color:white;\">– Để tin đăng bán đất, nhà của bạn đạt hiệu quả cao nhất, được người mua quan tâm nhất thì thông tin mô tả về mảnh đất, ngôi nhà của bạn càng chi tiết càng tốt và đặc biệt nên có ảnh thật về nhà, đất của bạn.- Theo thống kê của Bất Động Sản Hòn Đá với các tin đăng bán có ảnh thật, người mua sẽ quan tâm hơn rất nhiều so với bđs không có ảnh.- Hơn nữa, trong kết quả tìm kiếm nhà, đất,Bất Động Sản Cái Bang sẽ ưu tiên thứ tự cho những tin có ảnh thật và đầy đủ thông tin hơn những tin không có ảnh và ít thông tin về giao dịch.\n");
      out.write("                                    – Vì vậy, bạn không nên vội vàng đăng tin khi thông tin về nhà đất của bạn chưa đầy đủ.</p>\n");
      out.write("                              \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <form action=\"DangBaiBan3\" method=\"post\" enctype=\"multipart/form-data\" >\n");
      out.write("                            <div>\n");
      out.write("                                <p>Tiêu Đề (*)</p>\n");
      out.write("                                <input style=\"border: 2px solid #000;\" type=\"text\" name=\"tieude\" required />\n");
      out.write("                            </div>\n");
      out.write("                            <div> \n");
      out.write("                                <p class=\"word\">Giá: </p>\n");
      out.write("                                <input style=\"border: 2px solid #000;\" type=\"number\" name=\"gia\" required />\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <p class=\"word\">Loại Nhà:</p>\n");
      out.write("                                <select name=\"category_id\" style=\"border: 2px solid #000;width: 665px;height: 47px;border-radius: 10px;margin-top: 3px;padding-top: 3px;padding-left: 13px;\">\n");
      out.write("                                    <option value=\"1\">Nhà Cấp 4</option>\n");
      out.write("                                    <option value=\"2\">Nhà Cấp 3</option>\n");
      out.write("                                    <option value=\"3\">Nhà Cấp 2</option>\n");
      out.write("                                    <option value=\"4\">Nhà Cấp 1</option>\n");
      out.write("                                    <option value=\"5\">Biệt Thự</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <p class=\"word\">Hình Thức:</p>\n");
      out.write("                                <select name=\"hinhthuc\" style=\"border: 2px solid #000;width: 665px;height: 47px;border-radius: 10px;margin-top: 3px;padding-top: 3px;padding-left: 13px;\">\n");
      out.write("                                    <option value=\"6\">Nhà Bán</option>\n");
      out.write("                                    <option value=\"7\">Đất Bán</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <p class=\"word\">Họ Và Tên: </p>\n");
      out.write("                                <input style=\"border: 2px solid #000;\" type=\"text\" name=\"ht\" required />\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <p class=\"word\">Số Điện Thoại: </p>\n");
      out.write("                                <input style=\"border: 2px solid #000;\" type=\"number\" name=\"sdt\" required />\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <p class=\"word\">Diện Tích(Nhập Số): </p>\n");
      out.write("                                <input style=\"border: 2px solid #000;\" type=\"number\" name=\"dt\" required />\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <p class=\"word\">Vị Trí: </p>\n");
      out.write("                                <input style=\"border: 2px solid #000;\" type=\"text\" name=\"vt\" required />\n");
      out.write("                            </div>\n");
      out.write("                            <div> \n");
      out.write("                                <p class=\"word\">Hình Ảnh(*)</p>\n");
      out.write("                                <input required=\"required\" style=\"border: 2px solid #000;width: 665px;height: 47px;border-radius: 10px;margin-top: 3px;padding-top: 10px;padding-left: 13px;\" type=\"file\" name=\"file\" multiple>\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <p class=\"word\">Mô Tả:</p>\n");
      out.write("                                <textarea style=\"border: 2px solid #000;\" class=\"textarea\" rows=\"160\" cols=\"30\" name=\"mota\" required ></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"hidden\" value=\"postbai\" name=\"command\">\n");
      out.write("                            <input type=\"submit\" value=\"Đăng Bài\"> \n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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