package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import connect.DBConnect;
import dao.ProductDAO;
import model.Product;

public final class timkiem_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Tìm Kiếm Nhà, Đất</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0\" >\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("  \n");
      out.write("        <!--slider-script-->\n");
      out.write("        <script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: linear-gradient(to left bottom, #F2E3C6 0%, #A7A1A5 100%)\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"content-top\">\n");
      out.write("                        <h3 class=\"future\">Thông tin tìm kiếm</h3>\n");
      out.write("                        <div class=\"content-top-in\">\n");
      out.write("                        ");

                            request.setCharacterEncoding("utf-8");
                            response.setCharacterEncoding("utf-8");
                            String s = request.getParameter("tim");
                        
      out.write("\n");
      out.write("                        ");

                            for (Product p : ProductDAO.getTimKiem(s)) {
                        
      out.write("\n");
      out.write("                        <div class=\"col-md-4 md-col\" style=\"margin-top:33px;\">\n");
      out.write("                            <div class=\"col-md\">\n");
      out.write("                                \n");
      out.write("                                <a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\"><img  src=\"");
      out.print(p.getProductImage());
      out.write("\"  style=\"height: 253px;\" alt=\"");
      out.print(p.getProductName());
      out.write("\" /></a>\t\n");
      out.write("                                <div class=\"top-content\">\n");
      out.write("                                    <h5><a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write('"');
      out.write('>');
      out.print(p.getProductName());
      out.write("</a></h5>\n");
      out.write("                                    <div class=\"white\">\n");
      out.write("                                        <button class=\"btn btn-danger\"><a href=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2 \">Lưu Thông Tin</a></button>\n");
      out.write("                                        <p class=\"dollar\"><span>");
      out.print(p.getProductPrice());
      out.write("</span><span>Tỷ</span><span class=\"in-dollar\">VNĐ</span></p>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("<!--        <ul class=\"start\" style=\"margin-left: 564px;margin-top: 32px;\">\n");
      out.write("            <li ><a href=\"#\"><i></i></a></li>\n");
      out.write("            <li><span>1</span></li>\n");
      out.write("            <li ><a href=\"#\"><i  class=\"next\"> </i></a></li>\n");
      out.write("        </ul>-->\n");
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
