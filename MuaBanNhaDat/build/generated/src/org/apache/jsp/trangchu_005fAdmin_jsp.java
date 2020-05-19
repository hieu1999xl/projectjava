package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Users;
import dao.ProductDAO;
import dao.UsersDAO;

public final class trangchu_005fAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin's Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-responsive.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fullcalendar.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/matrix-style.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/matrix-media.css\" />\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.gritter.css\" />\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");


            Users u = (Users) session.getAttribute("admin");
            if (u == null) {
                response.sendRedirect("404.jsp");
            }
        
      out.write("\n");
      out.write("        <!--main-container-part-->\n");
      out.write("        <div id=\"content\" style=\"background: rgba(0,0,0,0);\">\n");
      out.write("            <!--breadcrumbs-->\n");
      out.write("            <div id=\"content-header\">\n");
      out.write("                <div id=\"breadcrumb\" style=\"background: rgba(0,0,0,0.4);\"> <a href=\"index_Admin.jsp\" title=\"Go to Home\" class=\"tip-bottom\"><i class=\"icon-home\"></i> Home</a></div>\n");
      out.write("            </div>\n");
      out.write("            <!--End-breadcrumbs-->\n");
      out.write("\n");
      out.write("            <!--Action boxes-->\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"quick-actions_homepage\">\n");
      out.write("                    <ul class=\"quick-actions\">\n");
      out.write("                        <li class=\"bg_lb\"> <a href=\"#\"> <i class=\"icon-dashboard\"></i> <span class=\"label label-important\">20</span>Thống Kê </a> </li>\n");
      out.write("                        <li class=\"bg_lg span3\"> <a href=\"#\"> <i class=\"icon-signal\"></i>Biểu Đồ</a> </li>\n");
      out.write("                        <li class=\"bg_ly\"> <a href=\"#\"> <i class=\"icon-inbox\"></i><span class=\"label label-success\">101</span> Tiện Ích </a> </li>\n");
      out.write("                        <li class=\"bg_lo\"> <a href=\"#\"> <i class=\"icon-th\"></i> Bảng Báo Cáo</a> </li>\n");
      out.write("                        <li class=\"bg_ls\"> <a href=\"#\"> <i class=\"icon-fullscreen\"></i>Mở Rộng Mô Hình</a> </li>\n");
      out.write("                        <li class=\"bg_lo span3\"> <a href=\"#\"> <i class=\"icon-th-list\"></i>Mục Quản Lý Nhà Đất</a> </li>\n");
      out.write("                        <li class=\"bg_ls\"> <a href=\"#\"> <i class=\"icon-tint\"></i>Ý Tưởng Cho Web</a> </li>\n");
      out.write("                        <li class=\"bg_lb\"> <a href=\"#\"> <i class=\"icon-pencil\"></i>Lưu Công Việc</a> </li>\n");
      out.write("                        <li class=\"bg_lg\"> <a href=\"#\"> <i class=\"icon-calendar\"></i>Lịch Làm Việc </a> </li>\n");
      out.write("                        <li class=\"bg_lr\"> <a href=\"#\"> <i class=\"icon-info-sign\"></i> Error</a> </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!--End-Action boxes-->    \n");
      out.write("\n");
      out.write("                <!--Chart-box-->    \n");
      out.write("                <div class=\"row-fluid\">\n");
      out.write("                    <div class=\"widget-box\" style=\"background: rgba(0,0,0,0);\" >\n");
      out.write("                        <div class=\"widget-title bg_lg\"><span class=\"icon\"><i class=\"icon-signal\"></i></span>\n");
      out.write("                            <h5>Biểu Đồ</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"widget-content\" >\n");
      out.write("                            <div class=\"row-fluid\">\n");
      out.write("                                <div class=\"span9\">\n");
      out.write("                                    <div class=\"chart\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"span3\">\n");
      out.write("                                    <ul class=\"site-stats\">\n");
      out.write("                                        <li class=\"bg_lh\" style=\"background: rgba(0,0,0,0.2);\"><i class=\"icon-user\"></i><small>Tổng Cộng<strong>");
      out.print(UsersDAO.countuser());
      out.write("</strong> User</small> </li>\n");
      out.write("                                        <a href=\"insert_thanhvien_Admin.jsp\"><li class=\"bg_lh\" style=\"background: rgba(0,0,0,0.2);\"><i class=\"icon-plus\" ></i> <strong>1</strong> <small>Thêm User</small></li></a>\n");
      out.write("                                        <li class=\"bg_lh\" style=\"background: rgba(0,0,0,0.2);\"><i class=\"icon-shopping-cart\"></i> <strong>");
 out.print(ProductDAO.countbaidangmua() + ProductDAO.countbaidangban());
      out.write("</strong> <small>Tổng Cộng Bài Đăng</small></li>\n");
      out.write("                                        <li class=\"bg_lh\" style=\"background: rgba(0,0,0,0.2);\"><i class=\"icon-tag\"></i> <strong>");
      out.print(ProductDAO.countbaidangmua());
      out.write(" </strong> <small>Lượng Bài Đăng Mua</small></li>\n");
      out.write("                                        <li class=\"bg_lh\" style=\"background: rgba(0,0,0,0.2);\"><i class=\"icon-repeat\"></i> <strong>");
      out.print(ProductDAO.countbaidangban());
      out.write("</strong> <small>Lượng Bài Đăng Bán</small></li>\n");
      out.write("                                        <li class=\"bg_lh\" style=\"background: rgba(0,0,0,0.2);\"><i class=\"icon-globe\"></i> <strong>0</strong> <small>Online Users</small></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!--End-Chart-box--> \n");
      out.write("                <hr/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/excanvas.min.js\"></script> \n");
      out.write("        <script src=\"js/jquery.min.js\"></script> \n");
      out.write("        <script src=\"js/jquery.ui.custom.js\"></script> \n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script> \n");
      out.write("        <script src=\"js/jquery.flot.min.js\"></script> \n");
      out.write("        <script src=\"js/jquery.flot.resize.min.js\"></script> \n");
      out.write("        <script src=\"js/jquery.peity.min.js\"></script> \n");
      out.write("        <script src=\"js/fullcalendar.min.js\"></script> \n");
      out.write("        <script src=\"js/matrix.js\"></script> \n");
      out.write("        <script src=\"js/matrix.dashboard.js\"></script> \n");
      out.write("        <script src=\"js/jquery.gritter.min.js\"></script> \n");
      out.write("        <script src=\"js/matrix.interface.js\"></script> \n");
      out.write("        <script src=\"js/matrix.chat.js\"></script> \n");
      out.write("        <script src=\"js/jquery.validate.js\"></script> \n");
      out.write("        <script src=\"js/matrix.form_validation.js\"></script> \n");
      out.write("        <script src=\"js/jquery.wizard.js\"></script> \n");
      out.write("        <script src=\"js/jquery.uniform.js\"></script> \n");
      out.write("        <script src=\"js/select2.min.js\"></script> \n");
      out.write("        <script src=\"js/matrix.popover.js\"></script> \n");
      out.write("        <script src=\"js/jquery.dataTables.min.js\"></script> \n");
      out.write("        <script src=\"js/matrix.tables.js\"></script> \n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            // This function is called from the pop-up menus to transfer to\n");
      out.write("            // a different page. Ignore if the value returned is a null string:\n");
      out.write("            function goPage(newURL) {\n");
      out.write("\n");
      out.write("                // if url is empty, skip the menu dividers and reset the menu selection to default\n");
      out.write("                if (newURL != \"\") {\n");
      out.write("\n");
      out.write("                    // if url is \"-\", it is this page -- reset the menu:\n");
      out.write("                    if (newURL == \"-\") {\n");
      out.write("                        resetMenu();\n");
      out.write("                    }\n");
      out.write("                    // else, send page to designated URL            \n");
      out.write("                    else {\n");
      out.write("                        document.location.href = newURL;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // resets the menu selection upon entry to this page:\n");
      out.write("            function resetMenu() {\n");
      out.write("                document.gomenu.selector.selectedIndex = 2;\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
