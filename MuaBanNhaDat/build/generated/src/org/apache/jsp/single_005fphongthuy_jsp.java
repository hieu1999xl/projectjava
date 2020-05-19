package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.PhongThuyDAO;
import java.sql.Connection;
import connect.DBConnect;
import dao.ProductDAO;
import model.Product;

public final class single_005fphongthuy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Chi Tiết Phong Thủy</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.2/css/all.css\" />\n");
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
      out.write("        </script>  \n");
      out.write("        <style>\n");
      out.write("           #bottom-phongthuy {\n");
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
      out.write("              position: absolute;\n");
      out.write("        \n");
      out.write("            left: 50%;\n");
      out.write("            transform: translate(-50%);\n");
      out.write("           \n");
      out.write("           }\n");
      out.write("           img{\n");
      out.write("           position: relative;\n");
      out.write("           height: 370.04px;\n");
      out.write("           width: 555px;\n");
      out.write("           }\n");
      out.write("           .img_mid {\n");
      out.write("                        margin: 3em 0;\n");
      out.write("                    }\n");
      out.write("            div#bottom-phongthuy-chitiet {\n");
      out.write("                            margin-bottom: 5em;\n");
      out.write("                        }\n");
      out.write("           .content_img {\n");
      out.write("                            text-align: center;\n");
      out.write("                        }\n");
      out.write("                    \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");

            String s = request.getParameter("id");
            int i = Integer.parseInt(s);
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div id=\"top-phongthuy\">\n");
      out.write("                \n");
      out.write("                <div class=\"topicpath topicpath-border\"><ul><li><a href=\"index.jsp\">Trang chủ</a></li><li>Nội-Ngoại thất <span> > ");
out.print(PhongThuyDAO.getChiTiet(i).getPhongThuy_TieuDe() ); 
      out.write("</span></li></ul></div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("          <div class=\"img_mid\">\n");
      out.write("              <image src=\"");
out.print(PhongThuyDAO.getChiTiet(i).getPhongThuy_Image()); 
      out.write("\"></image>\n");
      out.write("              <div class=\"content_img\">\n");
      out.write("                  <p>Ảnh:  ");
out.print(PhongThuyDAO.getChiTiet(i).getPhongThuy_TieuDe()); 
      out.write("</p>\n");
      out.write("              </div>\n");
      out.write("             </div> \n");
      out.write("        \n");
      out.write("        <div id=\"bottom-phongthuy-chitiet\">\n");
      out.write("            \n");
      out.write("            <div>\n");
      out.write("                ");
 
                    out.print(PhongThuyDAO.getChiTiet(i).getPhongThuy_NoiDung());
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clearfix\"></div>\n");
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
