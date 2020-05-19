package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Users;

public final class menu_005fAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Menu</title>\n");
      out.write("        <style>\n");
      out.write("            .stat-boxes li a:hover, .quick-actions li a:hover, .quick-actions-horizontal li a:hover, .stat-boxes li:hover, .quick-actions li:hover, .quick-actions-horizontal li:hover\n");
      out.write("            {\n");
      out.write("                background: rgba(0,0,0,0);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");


            Users u = (Users) session.getAttribute("admin");
            if (u == null) {
                response.sendRedirect("404.jsp");
            }
        
      out.write("\n");
      out.write("        <!--sidebar-menu-->\n");
      out.write("        <div id=\"sidebar\" style=\"margin-top:-654px;\" ><a href=\"#\" class=\"visible-phone\"><i class=\"icon icon-home\"></i> Thống Kê</a>\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"active\"><a href=\"index_Admin.jsp\"><i class=\"icon icon-home\" style=\"color: white;\"></i> <span style=\"color: white;\">Home</span></a> </li>\n");
      out.write("                <li> <a href=\"#\"><i class=\"icon icon-signal\" style=\"color: white;\"></i> <span style=\"color: white;\">Biểu Đồ</span></a> </li>\n");
      out.write("                <li> <a href=\"#\"><i class=\"icon icon-inbox\" style=\"color: white;\"></i> <span style=\"color: white;\">Tiện Ích</span></a> </li>\n");
      out.write("                <li><a href=\"manager_category_Admin.jsp\"><i class=\"icon icon-th\" style=\"color: white;\"></i> <span style=\"color: white;\">Quản Lý Danh Mục Bán</span></a></li>\n");
      out.write("                <li><a href=\"manager_category_chothue_Admin.jsp\"><i class=\"icon icon-th\" style=\"color: white;\"></i> <span style=\"color: white;\">Quản Lý Danh Cho Thuê</span></a></li>\n");
      out.write("                <li><a href=\"manager_product_Admin.jsp\"><i class=\"icon icon-th\" style=\"color: white;\"></i> <span style=\"color: white;\">Quản Lý Đăng Bài Bán</span></a></li>\n");
      out.write("                <li><a href=\"manager_product_chothue.jsp\"><i class=\"icon icon-th\" style=\"color: white;\"></i> <span style=\"color: white;\">Quản Lý Đăng Bài Cho Thuê</span></a></li>\n");
      out.write("                <li><a href=\"manager_thanhvien_Admin.jsp\"><i class=\"icon icon-th\" style=\"color: white;\"></i> <span style=\"color: white;\">Quản Lý Thành Viên</span></a></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"icon icon-fullscreen\" style=\"color: white;\"></i> <span style=\"color: white;\">Mở Rộng Mô Hình</span></a></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"icon icon-tint\" style=\"color: white;\"></i> <span style=\"color: white;\">Ý Tưởng Cho Web</span></a></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"icon icon-pencil\" style=\"color: white;\"></i> <span style=\"color: white;\">Lưu Công Việc</span></a></li>\n");
      out.write("                <li class=\"submenu\"> <a href=\"#\"><i class=\"icon icon-file\" style=\"color: white;\"></i> <span style=\"color: white;\">Mục Tiêu</span> <span class=\"label label-important\"></span></a>\n");
      out.write("                </li>\n");
      out.write("               \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <!--sidebar-menu-->\n");
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
