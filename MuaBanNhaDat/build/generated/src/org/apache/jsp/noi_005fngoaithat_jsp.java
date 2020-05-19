package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.noi_ngoaithat;
import dao.noi_ngoaithatDAO;
import model.phongthuy;
import dao.PhongThuyDAO;
import java.sql.Connection;
import connect.DBConnect;
import dao.ProductDAO;
import model.Product;

public final class noi_005fngoaithat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Nội-Ngoại Thất</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!--<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />-->\n");
      out.write("         <link href='https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0\" >\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("         <link href=\"https://fonts.googleapis.com/css2?family=Muli:wght@200&display=swap\" rel=\"stylesheet\">\n");
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
      out.write("        </script>  \n");
      out.write("        <style>\n");
      out.write("       \n");
      out.write("            #bottom-phongthuy {\n");
      out.write("               font-family: 'Muli', sans-serif;\n");
      out.write("               line-height: 1.7;\n");
      out.write("               color: #445A64;\n");
      out.write("               margin-top: 6em;\n");
      out.write("               padding-bottom: 4em;\n");
      out.write("               height: auto;\n");
      out.write("           }\n");
      out.write("           /*\n");
      out.write("*/\n");
      out.write("           \n");
      out.write("           .clear {\n");
      out.write("               clear: both;\n");
      out.write("           }\n");
      out.write("           /*\n");
      out.write("*/\n");
      out.write("           \n");
      out.write("           .image {\n");
      out.write("               float: left;\n");
      out.write("               margin-bottom: 20px;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           .noidung {\n");
      out.write("               overflow: hidden;\n");
      out.write("               text-overflow: ellipsis;\n");
      out.write("               max-width: 653px;\n");
      out.write("               overflow: hidden;\n");
      out.write("               display: -webkit-box;\n");
      out.write("               -webkit-line-clamp: 5;\n");
      out.write("               -webkit-box-orient: vertical;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           p.tieude {\n");
      out.write("               font-size: 2em;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           p.tieude:before {\n");
      out.write("               position: absolute;\n");
      out.write("               content: \"\";\n");
      out.write("               height: 2px;\n");
      out.write("               width: 6rem;\n");
      out.write("               background: #0999D8;\n");
      out.write("               bottom: 0;\n");
      out.write("               top: -19.23em;\n");
      out.write("               left: 8%;\n");
      out.write("               transform: translateX(-50%);\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           .btn_new {\n");
      out.write("               margin-top: 1em;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           .topicpath-border {\n");
      out.write("               border-bottom: 1px solid #D3D9E1;\n");
      out.write("               margin-bottom: 20px;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           .topicpath ul {\n");
      out.write("               float: left;\n");
      out.write("               overflow: hidden;\n");
      out.write("               *zoom: 1;\n");
      out.write("               width: 100%;\n");
      out.write("               padding: .6em .5em;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           .topicpath ul li {\n");
      out.write("               float: left;\n");
      out.write("               color: #636982;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           li {\n");
      out.write("               list-style-type: none;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           .topicpath-border ul {\n");
      out.write("               padding: .6em 0em;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           .topicpath ul li a {\n");
      out.write("               padding: 0 1.5em 0 0em;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           img {\n");
      out.write("               vertical-align: middle;\n");
      out.write("               max-width: 100%;\n");
      out.write("           }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"topicpath topicpath-border\"><ul><li><a href=\"/\">Trang chủ</a></li><li>Nôi-Ngoại thất</li></ul></div>\n");
      out.write("        </div>\n");
      out.write("        ");

            for (noi_ngoaithat n :noi_ngoaithatDAO.getListnoingoai() ) {
        
      out.write("\n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("        <div id=\"bottom-phongthuy\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                  \n");
      out.write("                <div class=\"col-md-6 col-xs-12 col-sm-12 ima\">\n");
      out.write("                    <image  src=\"");
      out.print(n.getNoiNgoaiThat_Image() );
      out.write("\"></image>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <a href=\"single_noi_ngoaithat.jsp?id=");
      out.print(n.getId_NoiNgoaiThat() );
      out.write("\"><p class=\"tieude\" style=\"margin-bottom:10px;\">");
      out.print(n.getNoiNgoaiThat_TieuDe() );
      out.write("</p></a>\n");
      out.write("                    <div>\n");
      out.write("                        <p class=\"noidung\">\n");
      out.write("                            ");
      out.print(n.getNoiNgoaiThat_NoiDung() );
      out.write("\n");
      out.write("                        <div class=\"btn_new\">\n");
      out.write("                            <button class=\"btn btn-success\"><a href=\"single_noi_ngoaithat.jsp?id=");
      out.print(n.getId_NoiNgoaiThat() );
      out.write(" \"><span>Đọc Tiếp</span></a></button>\n");
      out.write("                        </div>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("        ");

            }
        
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
