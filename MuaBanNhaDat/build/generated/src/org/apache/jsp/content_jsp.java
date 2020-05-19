package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ChoThueDAO;
import model.ChoThue;
import java.util.HashMap;
import model.Item;
import java.util.Map;
import model.Users;
import model.Cart;
import dao.PostMuaDAO;
import model.PostMua;
import model.Product;
import dao.ProductDAO;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <title>content</title>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\n");
      out.write("        <style>\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function ()\n");
      out.write("            {\n");
      out.write("                $(\"#luuthongtin\").click(function ()\n");
      out.write("                {\n");
      out.write("\n");
      out.write("                    $(\"#luuthongtin\").html(\"Đã Lưu\");\n");
      out.write("                    $(\"#luuthongtin\").css('cursor', 'unset');\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            .grid {\n");
      out.write("                width: 1350px;\n");
      out.write("                max-width: 100%;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            .container {\n");
      out.write("                width: 1350px;\n");
      out.write("            }\n");
      out.write("            .content-top_for {\n");
      out.write("                margin-top: 5em;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!---->\n");
      out.write("        ");

            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
        
      out.write("\n");
      out.write("    <div class=\"top_content\" style=\"margin-top: 60px;\">\n");
      out.write("\n");
      out.write("   <div class=\"grid\">\n");
      out.write("               <div class=\"container\">\n");
      out.write("      <div class=\"content\"  >\n");
      out.write("         <div class=\"content-top\">\n");
      out.write("            <h3 class=\"title-block\"><a  rel=\"nofollow\">Mua bán <br> Nhà tại Hà Nội</a></h3>\n");
      out.write("            <div class=\"content-top-in\">\n");
      out.write("               ");

                  request.setCharacterEncoding("UTF-8");
                  response.setCharacterEncoding("UTF-8");
                  for (Product p : ProductDAO.getListProduct()) {
                  
      out.write("\n");
      out.write("               <div class=\"col-md-4\" style=\"margin-top:30px\">\n");
      out.write("                   \n");
      out.write("                  <div  class=\"col-md\">\n");
      out.write("                     <div><i class=\"fas fa-home\" style=\"color: #000;\"> ");
      out.print(p.getHinhthuc());
      out.write("</i><span><i style=\"float: right;color: #000;\" class=\"far fa-calendar-alt\"> ");
      out.print(p.getNgaydang());
      out.write("</i></span></div>\n");
      out.write("                     <div class=\"clearfix\">\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"col-md_img\">\n");
      out.write("                        <a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\">\n");
      out.write("                        <img  src=\"");
      out.print(p.getProductImage());
      out.write("\" style=\"height: 253px;\" alt=\"");
      out.print(p.getProductName());
      out.write("\" />\n");
      out.write("                        </a>\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"top-content\">\n");
      out.write("                        <h5><a  href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write('"');
      out.write('>');
      out.print(p.getProductName());
      out.write("</a></h5>\n");
      out.write("                        <h5 style=\"padding: 0px;margin-top: -9px;\"><i class=\"fas fa-compass\" style=\"color: #000;\"> ");
      out.print(p.getVitri());
      out.write("</i></h5>\n");
      out.write("                        <h5 style=\"padding: 0px;margin-top: 4px;\"><i class=\"fab fa-laravel\" style=\"color:#000;padding: 0px;margin-top: -9px;\"> ");
      out.print(p.getDientich());
      out.write("m<sup>2</sup></i></h5>\n");
      out.write("                        ");

                           Users users = null;
                           if (session.getAttribute("user") != null) {
                               users = (Users) session.getAttribute("user");
                           }
                           if (users != null) {
                           
      out.write("\n");
      out.write("                        <div class=\"white\">\n");
      out.write("                           ");

                              if (!cart.getCartItems().containsKey(p.getProductID())) {
                              
      out.write("\n");
      out.write("                           <button class=\"btn btn-danger\"> <a href=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("\" id=\"luuthongtin\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Lưu Thông Tin</a></button>\n");
      out.write("                           ");

                              } else {
                              
      out.write("\n");
      out.write("                           <a href=\"\" style=\"cursor:unset;background:black;\" id=\"luuthongtin\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Đã Lưu</a>\n");
      out.write("                           ");

                              }
                              
      out.write("\n");
      out.write("                           <p class=\"dollar\"><span>");
      out.print(p.getProductPrice());
      out.write("</span><span>Tỷ</span><span class=\"in-dollar\">VNĐ</span></p>\n");
      out.write("                           <div class=\"clearfix\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                           }
                           
      out.write("\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("               ");

                  }
                  
      out.write("\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("<!--        <ul class=\"start\" style=\"margin-left: 564px;margin-top: 32px;\">\n");
      out.write("   <li ><a href=\"#\"><i></i></a></li>\n");
      out.write("   <li><span>1</span></li>\n");
      out.write("   <li ><a href=\"#\"><i  class=\"next\"> </i></a></li>\n");
      out.write("   </ul>-->\n");
      out.write("<!--Nơi Nhà ,Đất Cho Thuê-->\n");
      out.write("\n");
      out.write("<!--        <ul class=\"start\" style=\"margin-left: 564px;margin-top: 32px;\">\n");
      out.write("   <li ><a href=\"#\"><i></i></a></li>\n");
      out.write("   <li><span>1</span></li>\n");
      out.write("   <li ><a href=\"#\"><i  class=\"next\"> </i></a></li>\n");
      out.write("   </ul>-->\n");
      out.write("<div class=\"late_content\">\n");
      out.write("\n");
      out.write("   <div class=\"grid\">\n");
      out.write("       <div class=\"container\">\n");
      out.write("      \n");
      out.write("      <div class=\"content\" >\n");
      out.write("         <div class=\"content-top_for\">\n");
      out.write("            <h3  class=\"title-block\">Thông tin các căn hộ  <strong>cho thuê</strong></h3>       \n");
      out.write("            <div class=\"content-top-in\">\n");
      out.write("               ");

                  request.setCharacterEncoding("UTF-8");
                  response.setCharacterEncoding("UTF-8");
                  for (ChoThue c : ChoThueDAO.getListChoThueByChapNhan()) {
                  
      out.write("\n");
      out.write("               <div class=\"col-md-4\" style=\"margin-top:30px;\">\n");
      out.write("                  <div  class=\"col-md\" \">\n");
      out.write("                     <div><i class=\"fas fa-home\" style=\"color: #000;\" >  ");
      out.print(c.getChothue_loainhadat());
      out.write("</i><span><i style=\"padding-left: 53px;float: right;color: #000;\" class=\"far fa-calendar-alt\"> ");
      out.print(c.getChothue_ngaydang());
      out.write("</i></span></div>\n");
      out.write("                     <div class=\"clearfix\"></div>\n");
      out.write("                     <a href=\"singleChoThue.jsp?ChoThueID=");
      out.print(c.getChothue_id());
      out.write("\"><img  src=\"");
      out.print(c.getChothue_hinhanh());
      out.write("\" style=\"height: 253px;\" alt=\"");
      out.print(c.getChothue_tieude());
      out.write("\" /></a>\t\n");
      out.write("                     <div class=\"top-content\">\n");
      out.write("                        <h5><a href=\"single.jsp?ChoThueID=");
      out.print(c.getChothue_id());
      out.write('"');
      out.write('>');
      out.print(c.getChothue_tieude());
      out.write("</a></h5>\n");
      out.write("                        <h5 style=\"padding: 0px;margin-top: -9px;\"><i class=\"fas fa-compass\" style=\"color: #000;\">  ");
      out.print(c.getChothue_diadiem());
      out.write("</i></h5>\n");
      out.write("                        <h5 style=\"padding: 0px;margin-top: 4px;\"><i class=\"fab fa-laravel\" style=\"color:#000;padding: 0px;margin-top: -9px;\"> ");
      out.print(c.getChothue_dientich());
      out.write("m<sup>2</sup></i></h5>\n");
      out.write("                        ");

                           Users users = null;
                           if (session.getAttribute("user") != null) {
                               users = (Users) session.getAttribute("user");
                           }
                           if (users != null) {
                           
      out.write("\n");
      out.write("                        <div class=\"white\">\n");
      out.write("                           ");

                              if (!cart.getCartItems().containsKey(c.getChothue_id())) {
                              
      out.write("\n");
      out.write("                           <button class=\"btn btn-danger\"><a href=\"#\" id=\"luuthongtinchothue\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Lưu Thông Tin</a></button>\n");
      out.write("                           ");

                              } else {
                              
      out.write("\n");
      out.write("                           <a href=\"#\" style=\"cursor:unset;background:black;\" id=\"luuthongtin\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Đã Lưu</a>\n");
      out.write("                           ");

                              }
                              
      out.write("\n");
      out.write("                           <p class=\"dollar\"><span>");
      out.print(c.getChothue_gia());
      out.write("</span><span>Tỷ</span><span class=\"in-dollar\">VNĐ</span></p>\n");
      out.write("                           <div class=\"clearfix\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                           }
                           
      out.write("\n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("                           $(function ()\n");
      out.write("                           {\n");
      out.write("                               $(\"#luuthongtinchothue\").click(function ()\n");
      out.write("                               {\n");
      out.write("                                   if (confirm(\"Chức năng Lưu ở mục Cho Thuê này tạm thời khóa\"))\n");
      out.write("                                   {\n");
      out.write("                                       window.location.reload(true);\n");
      out.write("                                   }\n");
      out.write("                               });\n");
      out.write("                           });\n");
      out.write("                        </script>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("               ");

                  }
                  
      out.write("\n");
      out.write("               <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("</div>\n");
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
