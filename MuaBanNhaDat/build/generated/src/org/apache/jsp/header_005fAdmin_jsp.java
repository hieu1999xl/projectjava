package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Users;

public final class header_005fAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");


            Users u = (Users) session.getAttribute("admin");
            if (u == null) {
                response.sendRedirect("404.jsp");
            }
        
      out.write("\n");
      out.write("        <!--Header-part-->\n");
      out.write("        <div id=\"header\" style=\"background: rgba(0,0,0,0)\">\n");
      out.write("            <h1><a href=\"index_Admin.jsp\">Admin</a></h1>\n");
      out.write("        </div>\n");
      out.write("        <!--close-Header-part--> \n");
      out.write("        <!--top-Header-menu-->\n");
      out.write("        <div id=\"user-nav\" class=\"navbar navbar-inverse\">\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("                <li  class=\"dropdown\" id=\"profile-messages\" ><a title=\"\" href=\"#\" data-toggle=\"dropdown\" data-target=\"#profile-messages\" class=\"dropdown-toggle\"><i class=\"icon icon-user\"></i>  <span class=\"text\">Welcome,Administrator</span><b class=\"caret\"></b></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"icon-user\"></i>Tài Khoản Của Tôi</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"DangXuat\"><i class=\"icon-key\"></i>Đăng Xuất</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"\"><a title=\"\" href=\"DangXuat\"><i class=\"icon icon-share-alt\"></i> <span class=\"text\">Đăng Xuất</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <!--close-top-Header-menu-->\n");
      out.write("        <!--start-top-serch-->\n");
      out.write("        <div id=\"search\">\n");
      out.write("            <input type=\"text\" placeholder=\"Tìm Kiếm...\" style=\"background: rgba(0,0,0,0.2);\" />\n");
      out.write("            <button type=\"submit\" class=\"tip-bottom\" title=\"Search\"><i class=\"icon-search icon-white\"></i></button>\n");
      out.write("        </div>\n");
      out.write("        <!--close-top-serch-->\n");
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
