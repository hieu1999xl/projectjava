package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Users;
import model.Cart;
import model.Product;
import dao.ProductDAO;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Thông Tin Sản Phẩm</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0\" >\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.2/css/all.css\" />\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function ($)\n");
      out.write("            {\n");
      out.write("                $(\".scroll\").click(function (event) {\n");
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
      out.write("        <script>$(document).ready(function (c) {\n");
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
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("           .a1 {\n");
      out.write("                    width: 100%;\n");
      out.write("                    top: 5em;\n");
      out.write("                    margin-bottom: 1em;\n");
      out.write("                    margin-bottom: 2em;\n");
      out.write("                    position: relative;\n");
      out.write("                    height: auto;\n");
      out.write("                    margin-bottom: 50px;\n");
      out.write("                }\n");
      out.write("            .a1 .a2\n");
      out.write("            {\n");
      out.write("                width:80%;\n");
      out.write("                height:auto;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("     <body style=\"background-image: linear-gradient(to left bottom, #F2E3C6 0%, #A7A1A5 100%)\" \n");
      out.write("        ");


            ProductDAO p = new ProductDAO();
            Product p2 = new Product();
            String productID2 = "";
            if (request.getParameter("productID") != null) {
                productID2 = request.getParameter("productID");
                p2 = ProductDAO.getProduct(Long.parseLong(productID2));
            }
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"a1\">\n");
      out.write("                <div class=\"a2\">\n");
      out.write("                    <div style=\"float: right;position: relative;margin-top: 23px;margin-right: 6px;font-size: 20px;\">\n");
      out.write("                        <p><i style=\"padding-left: 53px;float: right;color: #000;\" class=\"far fa-calendar-alt\"> Ngày Đăng Bài:");
      out.print(p2.getNgaydang());
      out.write("</i></span></p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"single\">\n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <img class=\"a2-1\" style=\"border: 2px solid #312f2c;float: left;height: 324px;width: 576px;\" src=\"");
      out.print(p2.getProductImage());
      out.write("\" alt=\"\" >\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"as\">\n");
      out.write("\n");
      out.write("                        <p style=\"font-size: 28px;color: #000;padding-left:729px;background-color:rgba(0,0,0,0.4);\"> Thông Tin Liên Hệ<p>\n");
      out.write("                        <div>\n");
      out.write("                            <div style=\"color: #000;\"><p style=\"padding-left:591px;font-size:18px;\"><i class=\"far fa-caret-square-up\"></i><strong>Tiêu Đề</strong><span style=\"margin-left:166px;\">");
      out.print(p2.getProductName());
      out.write("</span> </p></div>\n");
      out.write("                            <div style=\";color: #000;\"><p style=\"padding-left:591px;font-size:18px;\"><i class=\"fab fa-accusoft\"></i><strong> Hình Thức</strong><span style=\"margin-left:145px;\">");
      out.print(p2.getHinhthuc());
      out.write("</span> </p></div>\n");
      out.write("                            <div style=\"color: #000;\"><p style=\"padding-left:591px;font-size:18px;\"><i class=\"fas fa-money-bill\"></i><strong> Giá</strong><span style=\"margin-left:197px;\">");
      out.print(p2.getProductPrice());
      out.write(" Tỷ VNĐ</span></p></div>\n");
      out.write("                            <div style=\"color: #000;\"><p style=\"padding-left:591px;font-size:18px;\"><i class=\"fab fa-laravel\"></i><strong> Diện Tích</strong><span style=\"margin-left:147px;\">");
      out.print(p2.getDientich());
      out.write("m<sup>2</sup></span></p></div>\n");
      out.write("                            <div style=\"color: #000;\"><p style=\"padding-left:591px;font-size:18px;\"><i class=\"fas fa-address-book\"></i><strong> Họ Tên Người Đăng</strong><span style=\"margin-left:72px;\">");
      out.print(p2.getHoten());
      out.write("</span></p></div>\n");
      out.write("                            <div style=\"color: #000;\"><p style=\"padding-left:591px;font-size:18px;\"><i class=\"fas fa-phone-square\"></i><strong> Số Điện Thoại</strong><span style=\"margin-left:117px;\">");
      out.print(p2.getSdt());
      out.write("</span></p></div>\n");
      out.write("                            <div style=\"color: #fff;  height: auto;color: #000;\"><p style=\"padding-left:591px;font-size:18px;\"><i class=\"fas fa-compass\"> </i> <strong> Vị Trí</strong><span style=\"margin-left:185px;\">");
      out.print(p2.getVitri());
      out.write("</span></p></div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"top-content\" style=\"float: right;position: relative;margin-top: -86px;\">\n");
      out.write("                            <div class=\"white\" style=\"line-height: 17px;margin-left: 383px;margin-top: 54px;\">\n");
      out.write("                                ");

                                    Cart cart = (Cart) session.getAttribute("cart");
                                    if (!cart.getCartItems().containsKey(p2.getProductID())) {
                                
      out.write("\n");
      out.write("                                <button class=\"btn btn-danger\"><a  href=\"CartServlet?command=plus&productID=");
      out.print(p2.getProductID());
      out.write("\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2 \">Lưu Thông Tin</a></button>\n");
      out.write("                                ");

                                } else {
                                
      out.write("\n");
      out.write("                                <button class=\"btn btn-primary\"><a href=\"\"   id=\"luuthongtin\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Đã Lưu</a></button>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"as1\" style=\";height: auto;\" >\n");
      out.write("                    <p style=\"background:rgba(0,0,0,0.4);color: white;font-size: 25px;padding-left: 486px;padding-top: 10px;padding-bottom: 10px;\">Mô tả chi tiết</p>\n");
      out.write("                    <p style=\"padding-left: 26px;padding-right:26px;font-size:20px;color:#000;\">");
      out.print(p2.getProductDescription());
      out.write("</p>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                    <img style=\"height:508px;width:737px;margin-left:201px;margin-top:25px;margin-bottom:25px;\" src=\"");
      out.print(p2.getProductImage());
      out.write("\" alt=\"\" >\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("                <div style=\"margin-top: 56px;background: rgba(255,255,255, 0.3);\">\n");
      out.write("                    <div class=\"fb-comments\" data-href=\"http://localhost:24780/MuaBanNha/single.jsp?productID=");
      out.print(request.getParameter("productID"));
      out.write("\" data-width=\"\" data-numposts=\"5\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                 \n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--start cung khoang gia-->    \n");
      out.write("                <div id=\"in-line\" class=\"container\" style=\"margin-top: 60px;\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"content-top\">\n");
      out.write("                            <h3 class=\"future\" style=\"color:#000;\">Bài Đăng Cùng Khoảng Giá</h3>\n");
      out.write("                            <div class=\"content-top-in\">\n");
      out.write("                                ");

                                    request.setCharacterEncoding("UTF-8");
                                    response.setCharacterEncoding("UTF-8");
                                    for (Product pp : ProductDAO.getProductSamePrice(p2.getProductPrice() )) {
                                
      out.write("\n");
      out.write("                                <div class=\"col-md-4 md-col\" style=\"margin-top:30px;\">\n");
      out.write("                                    <div  class=\"col-md\" \">\n");
      out.write("                                        <div><i class=\"fas fa-home\" style=\"color: #000;\"> ");
      out.print(pp.getHinhthuc() );
      out.write("</i><span><i style=\"padding-left: 53px;float: right;color: #000;\" class=\"far fa-calendar-alt\"> ");
      out.print(pp.getNgaydang() );
      out.write("</i></span></div>\n");
      out.write("                                        <div class=\"clearfix\"></div> \n");
      out.write("                                        <a href=\"single.jsp?productID=");
      out.print(pp.getProductID() );
      out.write("\"><img  src=\"");
      out.print(pp.getProductImage());
      out.write("\" style=\"height: 253px;\" alt=\"");
      out.print(pp.getProductName() );
      out.write("\" /></a>\t\n");
      out.write("                                        <div class=\"top-content\">\n");
      out.write("                                            <h5><a style=\"color:#000;\" href=\"single.jsp?productID=");
      out.print(pp.getProductID() );
      out.write('"');
      out.write('>');
      out.print(pp.getProductName());
      out.write("</a></h5>\n");
      out.write("                                            <h5 style=\"padding: 0px;margin-top: -9px;\"><i class=\"fas fa-compass\" style=\"color: #000;\"> ");
      out.print(pp.getVitri() );
      out.write("</i></h5>\n");
      out.write("                                            <h5 style=\"padding: 0px;margin-top: 4px;\"><i class=\"fab fa-laravel\" style=\"color:#000;padding: 0px;margin-top: -9px;\"> ");
      out.print(pp.getProductPrice() );
      out.write("m<sup>2</sup></i></h5>\n");
      out.write("                                            ");

                                                Users users = null;
                                                if (session.getAttribute("user") != null) {
                                                    users = (Users) session.getAttribute("user");
                                                }
                                                if (users != null) {
                                            
      out.write("\n");
      out.write("                                            <div class=\"white\">\n");
      out.write("                                                ");

                                                    if (!cart.getCartItems().containsKey(p2.getProductID())) {
                                                
      out.write("\n");
      out.write("                                                <button class=\"btn btn-danger\"><a href=\"#\" id=\"luuthongtinchothue\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Lưu Thông Tin</a></button>\n");
      out.write("                                                ");

                                                } else {
                                                
      out.write("\n");
      out.write("                                                <button class=\"btn btn-primary\"><a href=\"#\"  id=\"luuthongtin\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Đã Lưu</a></button>\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\n");
      out.write("                                                <p class=\"dollar\"><span>");
      out.print(pp.getProductPrice() );
      out.write("</span><span>Tỷ</span><span class=\"in-dollar\">VNĐ</span></p>\n");
      out.write("                                                <div class=\"clearfix\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\n");
      out.write("                                            <script type=\"text/javascript\">\n");
      out.write("                                                $(function ()\n");
      out.write("                                                {\n");
      out.write("                                                    $(\"#luuthongtinchothue\").click(function ()\n");
      out.write("                                                    {\n");
      out.write("                                                        if (confirm(\"Chức năng Lưu ở mục Cho Thuê này tạm thời khóa\"))\n");
      out.write("                                                        {\n");
      out.write("                                                            window.location.reload(true);\n");
      out.write("                                                        }\n");
      out.write("                                                    });\n");
      out.write("                                                });\n");
      out.write("                                            </script>\n");
      out.write("                                        </div>\t\t\t\t\t\t\t\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!--end-->    \n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("                <!--start cùng loại-->\n");
      out.write("                <div class=\"container\" style=\"margin-top: 60px;\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"content-top\">\n");
      out.write("                            <h3 class=\"future\" style=\"color:#000;\">Bài Đăng Cùng Loại</h3>\n");
      out.write("                            <div class=\"content-top-in\">\n");
      out.write("                                ");

                                    request.setCharacterEncoding("UTF-8");
                                    response.setCharacterEncoding("UTF-8");
                                    for (Product pp : ProductDAO.getProductSameTieuDe(p2.getProductName())) {
                                
      out.write("\n");
      out.write("                                <div class=\"col-md-4 md-col\" style=\"margin-top:30px;\">\n");
      out.write("                                    <div  class=\"col-md\" >\n");
      out.write("                                        <div><i class=\"fas fa-home\" style=\"color: white;\" > ");
      out.print(pp.getHinhthuc() );
      out.write("</i><span><i style=\"padding-left: 53px;float: right;color: white;\" class=\"far fa-calendar-alt\"> ");
      out.print(pp.getNgaydang());
      out.write("</i></span></div>\n");
      out.write("                                        <div class=\"clearfix\"></div> \n");
      out.write("                                        <a href=\"single.jsp?productID=");
      out.print(pp.getProductID() );
      out.write("\"><img  src=\"");
      out.print(pp.getProductImage() );
      out.write("\" style=\"height: 253px;\" alt=\"");
      out.print(pp.getProductName() );
      out.write("\" /></a>\t\n");
      out.write("                                        <div class=\"top-content\">\n");
      out.write("                                            <h5><a style=\"color:#000;\" href=\"single.jsp?productID=");
      out.print(pp.getProductID() );
      out.write("\"\">");
      out.print(pp.getProductName());
      out.write("</a></h5>\n");
      out.write("                                            <h5 style=\"padding: 0px;margin-top: -9px;\"><i class=\"fas fa-compass\" style=\"color: white;\"> ");
      out.print(pp.getVitri() );
      out.write("</i></h5>\n");
      out.write("                                            <h5 style=\"padding: 0px;margin-top: 4px;\"><i class=\"fab fa-laravel\" style=\"color:#000;padding: 0px;margin-top: -9px;\"> ");
      out.print(pp.getDientich() );
      out.write("m<sup>2</sup></i></h5>\n");
      out.write("                                            ");

                                                Users users = null;
                                                if (session.getAttribute("user") != null) {
                                                    users = (Users) session.getAttribute("user");
                                                }
                                                if (users != null) {
                                            
      out.write("\n");
      out.write("                                            <div class=\"white\">\n");
      out.write("                                                ");

                                                    if (!cart.getCartItems().containsKey(p2.getProductID() )) {
                                                
      out.write("\n");
      out.write("                                                <button class=\"btn btn-danger\"><a href=\"#\" id=\"luuthongtinchothue\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Lưu Thông Tin</a></button>\n");
      out.write("                                                ");

                                                } else {
                                                
      out.write("\n");
      out.write("                                                <button class=\"btn btn-primary\"><a href=\"#\"  id=\"luuthongtin\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Đã Lưu</a></button>\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\n");
      out.write("                                                <p class=\"dollar\"><span>");
      out.print(pp.getProductPrice() );
      out.write(" </span><span>Tỷ</span><span class=\"in-dollar\">VNĐ</span></p>\n");
      out.write("                                                <div class=\"clearfix\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\n");
      out.write("                                            <script type=\"text/javascript\">\n");
      out.write("                                                $(function ()\n");
      out.write("                                                {\n");
      out.write("                                                    $(\"#luuthongtinchothue\").click(function ()\n");
      out.write("                                                    {\n");
      out.write("                                                        if (confirm(\"Chức năng Lưu ở mục Cho Thuê này tạm thời khóa\"))\n");
      out.write("                                                        {\n");
      out.write("                                                            window.location.reload(true);\n");
      out.write("                                                        }\n");
      out.write("                                                    });\n");
      out.write("                                                });\n");
      out.write("                                            </script>\n");
      out.write("                                        </div>\t\t\t\t\t\t\t\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!--end--> \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
