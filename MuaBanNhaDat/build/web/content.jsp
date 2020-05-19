

<%@page import="dao.ChoThueDAO"%>
<%@page import="model.ChoThue"%>
<%@page import="java.util.HashMap"%>
<%@page import="model.Item"%>
<%@page import="java.util.Map"%>
<%@page import="model.Users"%>
<%@page import="model.Cart"%>
<%@page import="dao.PostMuaDAO"%>
<%@page import="model.PostMua"%>
<%@page import="model.Product"%>
<%@page import="dao.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <title>content</title>
        <script src="js/jquery.min.js"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <script type="text/javascript" src="js/jquery.flexisel.js"></script>
        <style>
        </style>

        <script type="text/javascript">
            $(document).ready(function ()
            {
                $("#luuthongtin").click(function ()
                {

                    $("#luuthongtin").html("Đã Lưu");
                    $("#luuthongtin").css('cursor', 'unset');
                });
            });
        </script>
        <style>
            .grid {
                width: 1350px;
                max-width: 100%;
                margin: 0 auto;
            }
           
            .container {
                width: 1350px;
            }
            .content-top_for {
                margin-top: 5em;
            }
        </style>
    </head>
    <body>


        <!---->
        <%
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
        %>
    <div class="top_content" style="margin-top: 60px;">

   <div class="grid">
               <div class="container">
      <div class="content"  >
         <div class="content-top">
            <h3 class="title-block"><a  rel="nofollow">Mua bán <br> Nhà tại Hà Nội</a></h3>
            <div class="content-top-in">
               <%
                  request.setCharacterEncoding("UTF-8");
                  response.setCharacterEncoding("UTF-8");
                  for (Product p : ProductDAO.getListProduct()) {
                  %>
               <div class="col-md-4" style="margin-top:30px">
                   
                  <div  class="col-md">
                     <div><i class="fas fa-home" style="color: #000;"> <%=p.getHinhthuc()%></i><span><i style="float: right;color: #000;" class="far fa-calendar-alt"> <%=p.getNgaydang()%></i></span></div>
                     <div class="clearfix">
                     </div>
                     <div class="col-md_img">
                        <a href="single.jsp?productID=<%=p.getProductID()%>">
                        <img  src="<%=p.getProductImage()%>" style="height: 253px;" alt="<%=p.getProductName()%>" />
                        </a>
                     </div>
                     <div class="top-content">
                        <h5><a  href="single.jsp?productID=<%=p.getProductID()%>"><%=p.getProductName()%></a></h5>
                        <h5 style="padding: 0px;margin-top: -9px;"><i class="fas fa-compass" style="color: #000;"> <%=p.getVitri()%></i></h5>
                        <h5 style="padding: 0px;margin-top: 4px;"><i class="fab fa-laravel" style="color:#000;padding: 0px;margin-top: -9px;"> <%=p.getDientich()%>m<sup>2</sup></i></h5>
                        <%
                           Users users = null;
                           if (session.getAttribute("user") != null) {
                               users = (Users) session.getAttribute("user");
                           }
                           if (users != null) {
                           %>
                        <div class="white">
                           <%
                              if (!cart.getCartItems().containsKey(p.getProductID())) {
                              %>
                           <button class="btn btn-danger"> <a href="CartServlet?command=plus&productID=<%=p.getProductID()%>" id="luuthongtin" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">Lưu Thông Tin</a></button>
                           <%
                              } else {
                              %>
                           <a href="" style="cursor:unset;background:black;" id="luuthongtin" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">Đã Lưu</a>
                           <%
                              }
                              %>
                           <p class="dollar"><span><%=p.getProductPrice()%></span><span>Tỷ</span><span class="in-dollar">VNĐ</span></p>
                           <div class="clearfix"></div>
                        </div>
                        <%
                           }
                           %>
                     </div>
                  </div>
               </div>
               <%
                  }
                  %>
            </div>
         </div>
      </div>
   </div>
</div>
    </div>
            
<!--        <ul class="start" style="margin-left: 564px;margin-top: 32px;">
   <li ><a href="#"><i></i></a></li>
   <li><span>1</span></li>
   <li ><a href="#"><i  class="next"> </i></a></li>
   </ul>-->
<!--Nơi Nhà ,Đất Cho Thuê-->

<!--        <ul class="start" style="margin-left: 564px;margin-top: 32px;">
   <li ><a href="#"><i></i></a></li>
   <li><span>1</span></li>
   <li ><a href="#"><i  class="next"> </i></a></li>
   </ul>-->
<div class="late_content">

   <div class="grid">
       <div class="container">
      
      <div class="content" >
         <div class="content-top_for">
            <h3  class="title-block">Thông tin các căn hộ  <strong>cho thuê</strong></h3>       
            <div class="content-top-in">
               <%
                  request.setCharacterEncoding("UTF-8");
                  response.setCharacterEncoding("UTF-8");
                  for (ChoThue c : ChoThueDAO.getListChoThueByChapNhan()) {
                  %>
               <div class="col-md-4" style="margin-top:30px;">
                  <div  class="col-md" ">
                     <div><i class="fas fa-home" style="color: #000;" >  <%=c.getChothue_loainhadat()%></i><span><i style="padding-left: 53px;float: right;color: #000;" class="far fa-calendar-alt"> <%=c.getChothue_ngaydang()%></i></span></div>
                     <div class="clearfix"></div>
                     <a href="singleChoThue.jsp?ChoThueID=<%=c.getChothue_id()%>"><img  src="<%=c.getChothue_hinhanh()%>" style="height: 253px;" alt="<%=c.getChothue_tieude()%>" /></a>	
                     <div class="top-content">
                        <h5><a href="single.jsp?ChoThueID=<%=c.getChothue_id()%>"><%=c.getChothue_tieude()%></a></h5>
                        <h5 style="padding: 0px;margin-top: -9px;"><i class="fas fa-compass" style="color: #000;">  <%=c.getChothue_diadiem()%></i></h5>
                        <h5 style="padding: 0px;margin-top: 4px;"><i class="fab fa-laravel" style="color:#000;padding: 0px;margin-top: -9px;"> <%=c.getChothue_dientich()%>m<sup>2</sup></i></h5>
                        <%
                           Users users = null;
                           if (session.getAttribute("user") != null) {
                               users = (Users) session.getAttribute("user");
                           }
                           if (users != null) {
                           %>
                        <div class="white">
                           <%
                              if (!cart.getCartItems().containsKey(c.getChothue_id())) {
                              %>
                           <button class="btn btn-danger"><a href="#" id="luuthongtinchothue" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">Lưu Thông Tin</a></button>
                           <%
                              } else {
                              %>
                           <a href="#" style="cursor:unset;background:black;" id="luuthongtin" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">Đã Lưu</a>
                           <%
                              }
                              %>
                           <p class="dollar"><span><%=c.getChothue_gia()%></span><span>Tỷ</span><span class="in-dollar">VNĐ</span></p>
                           <div class="clearfix"></div>
                        </div>
                        <%
                           }
                           %>
                        <script type="text/javascript">
                           $(function ()
                           {
                               $("#luuthongtinchothue").click(function ()
                               {
                                   if (confirm("Chức năng Lưu ở mục Cho Thuê này tạm thời khóa"))
                                   {
                                       window.location.reload(true);
                                   }
                               });
                           });
                        </script>
                     </div>
                  </div>
               </div>
               <%
                  }
                  %>
               <div class="clearfix"></div>
            </div>
         </div>
      </div>
   </div>
</div>

    </body>
</html>
