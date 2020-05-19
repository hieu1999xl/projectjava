package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ChoThueDAO;
import model.ChoThue;
import model.Users;
import model.Category;
import java.util.ArrayList;
import dao.CategoryDAO;

public final class manager_005fproduct_005fchothue_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.7.2.min.js\" ></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.min.js\" ></script>\n");
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
      out.write("            #danhmuc tr:nth-child(even){background: rgba(255,255,255,0.2)}\n");
      out.write("\n");
      out.write("            #danhmuc tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("            #danhmuc th {\n");
      out.write("                padding-top: 12px;\n");
      out.write("                padding-bottom: 12px;\n");
      out.write("                text-align: left;\n");
      out.write("                background-color: rgba(0,0,0,0.8);\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .fas\n");
      out.write("            {\n");
      out.write("                font-size:20px;\n");
      out.write("            }\n");
      out.write("            .dlg-container\n");
      out.write("            {\n");
      out.write("                position:absolute;\n");
      out.write("                left:50%;\n");
      out.write("                top:30%;\n");
      out.write("                transform: translateX(-50%) translateY(-50%);\n");
      out.write("                width:400px;\n");
      out.write("                background:#fff;\n");
      out.write("                padding:10px;\n");
      out.write("                border:2px solid #ddd;\n");
      out.write("                box-shadow:1px 1px 5px 1px #ccc;\n");
      out.write("                border-radius:10px;\n");
      out.write("                opacity:1;\n");
      out.write("                transition:all 0.3 linear 0s;\n");
      out.write("                z-index: 2;\n");
      out.write("                display:none;\n");
      out.write("                background: rgba(0,0,0,0.2);\n");
      out.write("            }\n");
      out.write("            .dlg-container:hover\n");
      out.write("            {\n");
      out.write("                border:1px solid #00a0df;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dlg-header\n");
      out.write("            {\n");
      out.write("                padding: 10px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                background: rgba(0,0,0,0.5);\n");
      out.write("                color: #f6f7f8;\n");
      out.write("                border: 1px solid white;\n");
      out.write("                border-radius: 10px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .dlg-body\n");
      out.write("            {\n");
      out.write("                padding:10px;\n");
      out.write("                line-height:30px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .dlg-footer\n");
      out.write("            {\n");
      out.write("                text-align:center;\n");
      out.write("                padding : 3px 0;\n");
      out.write("            }\n");
      out.write("            .dlg-footer a\n");
      out.write("            {\n");
      out.write("                display:inline-block;\n");
      out.write("                width:100px;\n");
      out.write("                padding:5px 0;\n");
      out.write("                border-radius:10px;\n");
      out.write("                background: rgba(0,0,0,0.3);\n");
      out.write("                cursor : pointer;\n");
      out.write("                border: 1px solid;\n");
      out.write("                color: white;\n");
      out.write("                transition: 0.9s ease;\n");
      out.write("            }\n");
      out.write("            .dlg-footer a:active\n");
      out.write("            {\n");
      out.write("                box-shadow: inset 2px 2px 4px 0 #ccc;\n");
      out.write("                color:#666;\n");
      out.write("            }\n");
      out.write("            .freeze-layer\n");
      out.write("            {\n");
      out.write("                position: fixed;\n");
      out.write("                top: 0;\n");
      out.write("                left:0;\n");
      out.write("                width:100%;\n");
      out.write("                height:100%;\n");
      out.write("                background:rgba(0,0,0,0.9);\n");
      out.write("                z-index:1;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background:url(video/bann.jpg) fixed;color:white;\">\n");
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
      out.write("            <div>   \n");
      out.write("                <center>\n");
      out.write("                    <h4 style=\"color:red;\">\n");
      out.write("                        Hướng Dẫn: Các bài chưa được duyệt sẽ không được hiển thị trên trang website ;\n");
      out.write("                        Bấm vào [Đi Duyệt] để đi đến dạng Demo của bài đăng chưa được duyệt.\n");
      out.write("                        Ở đó , bấm vào <span style=\"color:aqua;\">duyệt</span> nếu đăng lên website,\n");
      out.write("                        Và <span style=\"color:aqua\">Hủy Bỏ</span> bài đăng để hủy bỏ bài .\n");
      out.write("                    </h4>\n");
      out.write("                    \n");
      out.write("                    ");

                        String daduyet = (String)request.getAttribute("daduyet");
                        if(daduyet != null )
                        {
                    
      out.write("\n");
      out.write("                    <center style=\"width: 296px;color: aqua;\"><span><img style=\"float:left;margin-top: 11px;\" src=\"img/available.png\" /></span><span><h3>");
out.print(daduyet); 
      out.write("</h3></span></center>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                    ");

                        String xoa = (String)request.getAttribute("xoa");
                        if(xoa != null )
                        {
                    
      out.write("\n");
      out.write("                    <h3 style=\"background:url(img/not-available.png) no-repeat;color:red;\">");
out.print(xoa); 
      out.write("</h3>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                </center>\n");
      out.write("                <h3 style=\"color:white;\">Danh Sách Bài Đăng Cho Thuê Của Thành Viên</h3>\n");
      out.write("                <table id=\"danhmuc\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Số Thứ Tự</th>\n");
      out.write("                        <th>Bài Đăng</th>\n");
      out.write("                        <th>Người Đăng</th>\n");
      out.write("                        <th>Loại</th>\n");
      out.write("                        <th>Tình Trạng</th>\n");
      out.write("                        <th>Công Cụ</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        int countt = 0;
                        for (ChoThue ct : ChoThueDAO.GetALlList()) {
                            countt++;
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(countt);
      out.write("</td>\n");
      out.write("                        <td><img style=\"width:100px;height:50px;\" src=\"");
      out.print(ct.getChothue_hinhanh());
      out.write("\" >\n");
      out.write("                            <span>");
      out.print(ct.getChothue_tieude());
      out.write("</span>\n");
      out.write("                        </td>\n");
      out.write("                        <td>");
      out.print(ct.getChothue_hoten());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(ct.getChothue_loainhadat());
      out.write("</td>\n");
      out.write("                        ");

                            if (ct.getChothue_status() == 0) {
                        
      out.write("\n");
      out.write("                        <td><a  ><span  style=\"border:1px solid red;border-radius: 5px;font-size: 15px;color: red;cursor: no-drop;\"><i class=\"far fa-times-circle\"></i>Chưa Duyệt</span></a> \n");
      out.write("                        </td>\n");
      out.write("                        ");

                        } else {
                        
      out.write("\n");
      out.write("                        <td><span style=\"border:1px solid aqua;border-radius: 5px;font-size: 15px;color: aqua;\"><i class=\"fas fa-check\"></i>Đã Duyệt</span></td>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        <td>");

                            if (ct.getChothue_status() == 0) {
                            
      out.write("\n");
      out.write("                            <span style=\"border: 2px dashed red;\"><a style=\"color: rgba(122,231,0,0.8);font-size:15px;\" href=\"MoHinh.jsp?ChoThueID=");
      out.print(ct.getChothue_id());
      out.write("\"><i class=\"fas fa-unlock-alt\"></i>Đi Duyệt</a></span>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                            <span><a href=\"DuyetBai?command=xoa&ChoThueID=");
      out.print(ct.getChothue_id());
      out.write("\"><i class=\"fas fa-trash-alt\">Xóa</i></a></span></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("\n");
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
