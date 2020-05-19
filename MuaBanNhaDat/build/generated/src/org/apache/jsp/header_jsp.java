package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Item;
import java.util.Map;
import model.Cart;
import dao.PostMuaDAO;
import model.PostMua;
import model.Users;
import model.Category;
import dao.CategoryDAO;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Header</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.2/css/all.css\" />\n");
      out.write("        <link href='https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css' rel='stylesheet' type='text/css'>\n");
      out.write("        <script src='https://www.google.com/recaptcha/api.js?render=6Ldy2YMUAAAAAG2CYNQEAeWH3iVAMPKALvw2enf1'></script>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0\" >\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("         <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap&subset=vietnamese\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script>(function (d, s, id) {\n");
      out.write("                var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("                if (d.getElementById(id))\n");
      out.write("                    return;\n");
      out.write("                js = d.createElement(s);\n");
      out.write("                js.id = id;\n");
      out.write("                js.src = 'https://connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v3.2&appId=271903206793496&autoLogAppEvents=1';\n");
      out.write("                fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("            }(document, 'script', 'facebook-jssdk'));\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            window.fbAsyncInit = function () {\n");
      out.write("                FB.init({\n");
      out.write("                    appId: '{your-app-id}',\n");
      out.write("                    cookie: true,\n");
      out.write("                    xfbml: true,\n");
      out.write("                    version: '{api-version}'\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                FB.AppEvents.logPageView();\n");
      out.write("\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            (function (d, s, id) {\n");
      out.write("                var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("                if (d.getElementById(id)) {\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("                js = d.createElement(s);\n");
      out.write("                js.id = id;\n");
      out.write("                js.src = \"https://connect.facebook.net/en_US/sdk.js\";\n");
      out.write("                fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("            }(document, 'script', 'facebook-jssdk'));\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("<!--        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("            jQuery(document).ready(function ($)\n");
      out.write("            {\n");
      out.write("                $(\".scroll\").click(function (event)\n");
      out.write("                {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>-->\n");
      out.write("<!--        <script>\n");
      out.write("            $(function ()\n");
      out.write("            {\n");
      out.write("                $(\"#slider1\").responsiveSlides\n");
      out.write("                        ({\n");
      out.write("                            auto: true,\n");
      out.write("                            speed: 100,\n");
      out.write("                            namespace: \"callbacks\",\n");
      out.write("                            pager: true,\n");
      out.write("                        });\n");
      out.write("            });\n");
      out.write("        </script>-->\n");
      out.write("<!--        <script>\n");
      out.write("            $(document).ready(function (c)\n");
      out.write("            {\n");
      out.write("                $('.alert-close').on('click', function (c)\n");
      out.write("                {\n");
      out.write("                    $('.message').fadeOut('slow', function (c)\n");
      out.write("                    {\n");
      out.write("                        $('.message').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function (c)\n");
      out.write("            {\n");
      out.write("                $('.alert-close1').on('click', function (c)\n");
      out.write("                {\n");
      out.write("                    $('.message1').fadeOut('slow', function (c)\n");
      out.write("                    {\n");
      out.write("                        $('.message1').remove();\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>-->\n");
      out.write("        <style>\n");
      out.write("/*            #menu\n");
      out.write("            {\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            #s:hover\n");
      out.write("            {\n");
      out.write("                border : 1px solid #00c6d7;\n");
      out.write("                box-shadow: 0 10px 6px -6px #777;\n");
      out.write("                color: #00c6d7;\n");
      out.write("                background:#00c6d7;\n");
      out.write("            }*/\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        ");

            CategoryDAO CategoryDAO = new CategoryDAO();
            Users users = null;
            if (session.getAttribute("user") != null) {
                users = (Users) session.getAttribute("user");
            }
            Cart cart = (Cart) session.getAttribute("cart");

            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"header-top\" style=\"    background: rgb(241,241,241) !important;\">\n");
      out.write("                <div class=\"container\">\t\n");
      out.write("                    <div class=\"header-top-in\">\t\t\t\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"header-in\">\n");
      out.write("                            <ul class=\"icon1 sub-icon1\">\n");
      out.write("                                ");

                                    if (users != null) {
                                
      out.write("\n");
      out.write("                                <li ><a href=\"index.jsp\">Xin Chào,Bạn ");
      out.print(users.getHovaten());
      out.write("</a> </li>\n");
      out.write("\n");
      out.write("                                <li ><a href=\"#\">Tài Khoản Của Tôi</a></li>\n");
      out.write("                                <li  > <a href=\"ThongTinNhaDaLuu.jsp\" >Thông Tin Nhà Đã Lưu</a></li>\n");
      out.write("                                <li ><div class=\"cart\">\n");
      out.write("                                        <a href=\"#\" class=\"cart-in\"></a>\n");
      out.write("                                        <span>");
 cart.countItem(); 
      out.write("</span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <ul class=\"sub-icon1 list\" style=\"width:319px;top:46px;background:rgba(0,0,0,0.4)\">\n");
      out.write("                                    \n");
      out.write("                                        <div class=\"shopping_cart\">\n");
      out.write("                                            ");

                                                for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {
                                            
      out.write("\n");
      out.write("                                            <div class=\"cart_box\">\n");
      out.write("                                                <div class=\"message\">\n");
      out.write("                                                    <div class=\"alert-close\"> </div> \n");
      out.write("                                                    <div class=\"list_img\" style=\"width: 98px;height:81px;\"><img style=\"width:100%;height:100%;\" src=\"");
      out.print(list.getValue().getProduct().getProductImage());
      out.write("\" class=\"img-responsive\" alt=\"\"></div>\n");
      out.write("                                                    <div class=\"list_desc\"><h4><a href=\"single.jsp?productID=");
      out.print(list.getValue().getProduct().getProductID());
      out.write("\" style=\"border-bottom: 2px solid white\"><label style=\"color:white\">");
      out.print(list.getValue().getProduct().getProductName());
      out.write("</label></a></h4>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"list_desc\"><h4><a style=\"color:red;\" href=\"CartServlet?command=remove&productID=");
      out.print(list.getValue().getProduct().getProductID());
      out.write("\"><label style=\"color:white;cursor:pointer\">Xóa</label></a></h4></div>\n");
      out.write("                                                    <div class=\"clearfix\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"login_buttons\">\n");
      out.write("                                            ");
      out.write("\n");
      out.write("                                            <div class=\"clearfix\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("                                <li><a href=\"PostBan.jsp\">Đăng Tin Bán</a></li>\n");
      out.write("                                <li><a href=\"chothue.jsp\">Đăng Tin Thuê</a></li>\n");
      out.write("                                   ");

                                    if (users == null) {
                                    
      out.write("\n");
      out.write("                                <button class=\"btn btn-info\"><a href=\"login.jsp\">Đăng nhập</a></button>\n");
      out.write("                                <button class=\"btn btn-danger\"><a href=\"register.jsp\">Đăng ký</a></button>\n");
      out.write("                                \n");
      out.write("                                   ");

                                      }
                                   
      out.write(" \n");
      out.write("                                ");
 if (users != null) { 
      out.write("<li><a href=\"DangXuat\">Thoát Tài Khoản</a></li>");
 }
      out.write("\n");
      out.write("                                <ul class=\"sub-icon1 list\">\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </ul>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"header-bottom\"  style=\"background: #1D2C4C !important;\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"h_menu4\">\n");
      out.write("                        <a  class=\"toggleMenu\" href=\"#\" >Menu</a>\n");
      out.write("                        <ul class=\"nav\">\n");
      out.write("                            <li id=\"s\" class=\"active\"  ><a href=\"index.jsp\"><i class=\"fas fa-home\"></i> Home</a></li>\n");
      out.write("                            <li id=\"s\" ><a id=\"menu\" href=\"#\" >NHÀ ĐẤT BÁN</a>\n");
      out.write("                                <ul class=\"drop\">\n");
      out.write("                                    ");

                                        for (Category c : CategoryDAO.getListCategory()) {
                                    
      out.write("\n");
      out.write("                                    <li id=\"s\" ><a id=\"menu\" href=\"product.jsp?category=");
      out.print(c.getCategoryID());
      out.write("&pages=1\">");
      out.print(c.getCategoryName());
      out.write("</a></li>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("            \n");
      out.write("                                </ul>\n");
      out.write("                            </li> \t\t\t\t\t\t\n");
      out.write("                            <li id=\"s\" ><a id=\"menu\" href=\"#\"  >Nhà Đất Cho Thuê</a>\n");
      out.write("                                <ul class=\"drop\" >\n");
      out.write("                                    ");

                                        for (Category c : CategoryDAO.getListCategoryChoThue()) {
                                    
      out.write("\n");
      out.write("                                    <li id=\"s\"><a id=\"menu\" href=\"product_chothue.jsp?category=");
      out.print(c.getCategoryID());
      out.write('"');
      out.write('>');
      out.print(c.getCategoryName());
      out.write("</a></li>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("            \n");
      out.write("                                </ul>\n");
      out.write("                            </li> \t\t\t\t\t\t  \t\t\t\t \n");
      out.write("                            <li id=\"s\" ><a id=\"menu\" href=\"#\" >Tin Tức</a></li>\n");
      out.write("                            <li id=\"s\" ><a id=\"menu\" href=\"xaydung_kientruc.jsp\"  >Xây Dựng Kiến Trúc </a></li>\n");
      out.write("                            <li id=\"s\" ><a id=\"menu\" href=\"noi_ngoaithat.jsp\" >Nội-Ngoại Thất</a></li>\n");
      out.write("                            <li id=\"s\"><a id=\"menu\" href=\"phongthuy.jsp\" >Phong Thủy</a></li>\n");
      out.write("                            <li id=\"s\" ><a  id=\"menu\" href=\"lienhe.jsp\">Liên Hệ</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <script type=\"text/javascript\" src=\"js/nav.js\"></script>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"header-bottom-in\" >\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    ");

                        if (users == null) {
                    
      out.write("\n");
      out.write("                    <div class=\"header-bottom-on\">\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                        <div class=\"header-can\">\n");
      out.write("                      \n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                          \n");
      out.write("                            <div class=\"clearfix\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"header-bottom-on\">\n");
      out.write("                        ");
 String err = (String) request.getAttribute("dangbaiban");
                            if (err != null) {
                        
      out.write("\n");
      out.write("                        <p class=\"on\" style=\"margin:6px auto;margin-left:450px;background:url(images/back1.png) no-repeat;\" >");
out.print(err); 
      out.write("</p>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                        ");
 String chothue = (String) request.getAttribute("chothue");
                            if (chothue != null) {
                        
      out.write("\n");
      out.write("                        <p class=\"on\" style=\"margin:6px auto;margin-left:450px;background:rgba(0,0,0,0);\" ><i class=\"fas fa-male\" style=\"color:white;\"></i>");
out.print(chothue); 
      out.write("</p>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        <style>\n");
      out.write("                            @-webkit-keyframes my {\n");
      out.write("                                0% { color: red;  } \n");
      out.write("                                50% { color: white;  }\n");
      out.write("                                100% { color: red;  }  \n");
      out.write("                            }\n");
      out.write("                            @-moz-keyframes my { \n");
      out.write("                                0% { color: red;  } \n");
      out.write("                                50% { color: white;  }\n");
      out.write("                                100% { color: red;  }  \n");
      out.write("                            }\n");
      out.write("                            @-o-keyframes my { \n");
      out.write("                                0% { color: red;  } \n");
      out.write("                                50% { color: white;  }\n");
      out.write("                                100% { color: red;  }  \n");
      out.write("                            }\n");
      out.write("                            @keyframes my { \n");
      out.write("                                0% { color: red;  } \n");
      out.write("                                50% { color: white;  }\n");
      out.write("                                100% { color: red;  } \n");
      out.write("                            } \n");
      out.write("                            .on\n");
      out.write("                            {\n");
      out.write("                                -webkit-animation: my 1000ms infinite;\n");
      out.write("                                -moz-animation: my 1000ms infinite; \n");
      out.write("                                -o-animation: my 1000ms infinite; \n");
      out.write("                                animation: my 1000ms infinite;\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                        </style>\n");
      out.write("                    </div>    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
