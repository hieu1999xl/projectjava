package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Product;
import dao.ProductDAO;

public final class single2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Thông Tin Sản Phẩm</title>\n");
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
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            .a1\n");
      out.write("            {\n");
      out.write("                width:100%;\n");
      out.write("                height:auto;\n");
      out.write("                margin-bottom: 50px;\n");
      out.write("            }\n");
      out.write("            .a1 .a2\n");
      out.write("            {\n");
      out.write("                width:80%;\n");
      out.write("                height:auto;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");


            ProductDAO p = new ProductDAO();
            Product p2 = new Product();
            String productID2 = "";
            if (request.getParameter("productID") != null) {
                productID2 = request.getParameter("productID");
                p2 = ProductDAO.getProduct(Long.parseLong(productID2));
            }
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"a1\">\n");
      out.write("                <div class=\"a2\">\n");
      out.write("                    <div class=\"single\">\n");
      out.write("                        <div>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <img class=\"a2-1\" style=\"border: 2px solid #312f2c;float: left;height: 324px;width: 576px;\" src=\"");
      out.print(p2.getProductImage());
      out.write("\" alt=\"\" >\n");
      out.write("                        </a>\n");
      out.write("                    </div>\t\n");
      out.write("                    <div class=\"as\">\n");
      out.write("                        <p style=\"font-size: 28px;color: #f7921d;padding-left:729px;\">Thông Tin Liên Hệ<p>\n");
      out.write("                        <div>\n");
      out.write("                            <div style=\"border: 2px solid #f7921d;border-top-right-radius: 23px;\"><p style=\"padding-left:591px;font-size:18px;\"><strong>Tiêu Đề</strong><span style=\"margin-left:170px;\">");
      out.print(p2.getProductName());
      out.write("</span> </p></div>\n");
      out.write("                            <div style=\"border: 2px solid #f7921d;border-top-right-radius: 23px;\"><p style=\"padding-left:591px;font-size:18px;\"><strong>Giá</strong><span style=\"margin-left:203px;\">");
      out.print(p2.getProductPrice());
      out.write(" Tỷ VNĐ</span></p></div>\n");
      out.write("                            <div style=\"border: 2px solid #f7921d;border-top-right-radius: 23px;\"><p style=\"padding-left:591px;font-size:18px;\"><strong>Diện Tích</strong><span style=\"margin-left:152px;\">");
      out.print(p2.getDientich());
      out.write("m<sup>2</sup></span></p></div>\n");
      out.write("                            <div style=\"border: 2px solid #f7921d;border-top-right-radius: 23px;\"><p style=\"padding-left:591px;font-size:18px;\"><strong>Họ Tên Người Đăng</strong><span style=\"margin-left:72px;\">");
      out.print(p2.getHoten());
      out.write("</span></p></div>\n");
      out.write("                            <div style=\"border: 2px solid #f7921d;border-top-right-radius: 23px;\"><p style=\"padding-left:591px;font-size:18px;\"><strong>Số Điện Thoại</strong><span style=\"margin-left:117px;\">");
      out.print(p2.getSdt());
      out.write("</span></p></div>\n");
      out.write("                            <div style=\"border: 2px solid #f7921d;border-top-right-radius: 23px;height: auto;\"><p style=\"padding-left:591px;font-size:18px;\"><strong>Vị Trí</strong><span style=\"margin-left:185px;\">");
      out.print(p2.getVitri());
      out.write("</span></p></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"as1\" style=\"border: 2px solid #f7921d;height: auto;\" >\n");
      out.write("                    <p style=\"background: #f7921d;color: white;font-size: 25px;padding-left: 486px;padding-top: 10px;padding-bottom: 10px;\">Mô tả chi tiết</p>\n");
      out.write("                    <p style=\"padding-left: 26px;padding-right:26px;font-size:20px;\">");
      out.print(p2.getProductDescription());
      out.write("</p>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                    <img style=\"border:2px solid #312f2c;height:324px;width:737px;margin-left:201px;margin-top:25px;margin-bottom:25px;\" src=\"");
      out.print(p2.getProductImage());
      out.write("\" alt=\"\" >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
