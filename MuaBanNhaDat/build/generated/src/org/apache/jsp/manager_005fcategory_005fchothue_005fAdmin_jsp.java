package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Users;
import model.Category;
import java.util.ArrayList;
import dao.CategoryDAO;

public final class manager_005fcategory_005fchothue_005fAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Quản Lý Danh Mục</title>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-responsive.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fullcalendar.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/matrix-style.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/matrix-media.css\" />\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.gritter.css\" />\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.2/css/all.css\" />\n");
      out.write("        <style>\n");
      out.write("            #danhmuc {\n");
      out.write("                font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #danhmuc td, #danhmuc th {\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                padding: 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #danhmuc tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("            #danhmuc tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("            #danhmuc th {\n");
      out.write("                padding-top: 12px;\n");
      out.write("                padding-bottom: 12px;\n");
      out.write("                text-align: left;\n");
      out.write("                background-color: #2E363F;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .fas\n");
      out.write("            {\n");
      out.write("                font-size:20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background:url(video/bann.jpg) fixed\">\n");
      out.write("        ");

            CategoryDAO categoryDAO = new CategoryDAO();
            ArrayList<Category> listCategory = categoryDAO.getListCategory();
        
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header_Admin.jsp", out, false);
      out.write("\n");
      out.write("        ");

            Users u = (Users) session.getAttribute("admin");
            if (u == null) {
                response.sendRedirect("404.jsp");
            }
        
      out.write("\n");
      out.write("        <!--main-container-part-->\n");
      out.write("        <div id=\"content\" style=\"background:rgba(0,0,0,0)\">\n");
      out.write("            <!--breadcrumbs-->\n");
      out.write("            <div id=\"content-header\">\n");
      out.write("                <div id=\"breadcrumb\"> <a href=\"index_Admin.jsp\" title=\"Go to Home\" class=\"tip-bottom\"><i class=\"icon-home\"></i> Home</a></div>\n");
      out.write("            </div>\n");
      out.write("            <!--End-breadcrumbs-->\n");
      out.write("            <!--Start-->\n");
      out.write("            <div>\n");
      out.write("                <h3>Danh Mục Nhà, Đất Cho Thuê</h3>\n");
      out.write("                <table id=\"danhmuc\">\n");
      out.write("                    <a href=\"insert_category.jsp\"><i class=\"fas fa-plus-square\">Thêm Danh Mục</i></a>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Số Thứ Tự</th>\n");
      out.write("                        <th>Tên Danh Mục</th>\n");
      out.write("                        <th>Công Cụ</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        int demchothue = 0;
                        for (Category cd : categoryDAO.getListCategoryChoThue()) {
                            demchothue++;
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(demchothue);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(cd.getCategoryName());
      out.write("</td>\n");
      out.write("                        <td><span><a href=\"update_category_Admin.jsp?command=update&category_id=");
      out.print(cd.getCategoryID());
      out.write("\"><i class=\"far fa-edit\"></i></a></span>|||<span><a href=\"ManagerCategoryServlet?command=delete&category_id=");
      out.print(cd.getCategoryID());
      out.write("\"><i class=\"fas fa-trash-alt\"></i></a></span></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("            <!--End-->\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu_Admin.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
