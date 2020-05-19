package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.UsersDAO;
import model.Users;

public final class manager_005fthanhvien_005fAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Quản Lý Thành Viên</title>\n");
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
      out.write("            #baidang {\n");
      out.write("                font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #baidang td, #customers th {\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                padding: 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #baidang trtd:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("            #baidang tr:hover {background-color: rgba(0,0,0,0.5);}\n");
      out.write("\n");
      out.write("            #baidang th\n");
      out.write("            {   \n");
      out.write("                padding-top: 12px;\n");
      out.write("                padding-bottom: 12px;\n");
      out.write("                text-align: left;\n");
      out.write("                background-color: rgba(0, 0, 0, 0.34);\n");
      out.write("                color:  white;\n");
      out.write("                border-right: 1px solid white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background:url(video/bann.jpg) fixed\">\n");
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
      out.write("        <div id=\"content\" style=\"background:rgba(0,0,0,0)\">\n");
      out.write("            <!--breadcrumbs-->\n");
      out.write("            <div id=\"content-header\">\n");
      out.write("                <div id=\"breadcrumb\"> <a href=\"index.html\" title=\"Go to Home\" class=\"tip-bottom\"><i class=\"icon-home\"></i> Home</a></div>\n");
      out.write("            </div>\n");
      out.write("            <div >\n");
      out.write("                <div >\n");
      out.write("                    ");

                        Users user = null;
                        String xoa = (String) request.getAttribute("delete");
                        if (session.getAttribute("user") != null) {
                            user = (Users) session.getAttribute("users");
                        }
                    
      out.write("\n");
      out.write("                    ");
if (user != null) {
      out.write("\n");
      out.write("                    <span style=\"color:red;\">Đã Thêm Tài Khoản Của ");
      out.print( user.getHovaten());
      out.write("</span>\n");
      out.write("                    ");
  }
      out.write("\n");
      out.write("                    ");

                        if (xoa != null) {
                    
      out.write("\n");
      out.write("                    <span style=\"color:red;\">");
out.println(xoa); 
      out.write("</span>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                    <h3 style=\"color:white;\">Quản Lý Thành Viên</h3>\n");
      out.write("                    <a href=\"insert_thanhvien_Admin.jsp\" style=\"color:#2E363F\">Thêm Thành Viên</a>\n");
      out.write("\n");
      out.write("                    <table id=\"baidang\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>STT</th>\n");
      out.write("                            <th>Họ Và Tên</th>\n");
      out.write("                            <th>Loại Thành Viên</th>\n");
      out.write("                            <th>UserName</th>\n");
      out.write("                            <th>UserPassWord</th>\n");
      out.write("                            <th>Email</th>\n");
      out.write("                            <th>Công Cụ</th>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            int countt = 0;
                            for (Users u1 : UsersDAO.getListUsers()) {
                                countt++;
                        
      out.write("\n");
      out.write("                        <tr style=\"color:white;\">\n");
      out.write("\n");
      out.write("                            <td>");
      out.print(countt);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(u1.getHovaten());
      out.write("<span><a href=\"update_thanhvien_ten_Admin.jsp?lenhsql=suaten&userID=");
      out.print(u1.getStt());
      out.write("\"><i class=\"far fa-edit\"></i></a></span></td>\n");
      out.write("                            ");

                                if(u1.getUser_role() ==1 )
                                {
                            
      out.write("\n");
      out.write("                            <td>Admin<span><a href=\"\"><i class=\"fas fa-male\"></i></a></span></td>\n");
      out.write("                            ");

                                }else{
                            
      out.write("\n");
      out.write("                            <td>Member<span><a href=\"\"><i class=\"fas fa-male\"></i></a></span></td>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                            <td>");
      out.print(u1.getUserName());
      out.write("<span><a href=\"update_thanhvien_username_Admin.jsp?lenhsql=suausername&userID=");
      out.print(u1.getStt());
      out.write("\"><i class=\"far fa-edit\"></i></a></span></td>\n");
      out.write("                            <td>");
      out.print(u1.getUserPass());
      out.write("<span><a href=\"update_thanhvien_userpass_Admin.jsp?lenhsql=suauserpass&userID=");
      out.print(u1.getStt());
      out.write("\"><i class=\"far fa-edit\"></i></a></span></td>\n");
      out.write("                            <td>");
      out.print(u1.getUserEmail());
      out.write("<span><a href=\"update_thanhvien_email_Admin.jsp?lenhsql=suaemail&userID=");
      out.print(u1.getStt());
      out.write("\"><i class=\"far fa-edit\"></i></a></span></td>\n");
      out.write("                            <td><span><a href=\"QuanLyThanhVien?lenhsql=delete&userID=");
      out.print(u1.getStt());
      out.write("\"><i class=\"fas fa-trash-alt\"></i></a></span></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu_Admin.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
