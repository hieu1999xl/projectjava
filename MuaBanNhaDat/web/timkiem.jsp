

<%@page import="java.sql.Connection"%>
<%@page import="connect.DBConnect"%>
<%@page import="dao.ProductDAO"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tìm Kiếm Nhà, Đất</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <script src="js/jquery.min.js"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <meta name="viewport" content="width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0" >
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
  
        <!--slider-script-->
        <script src="js/responsiveslides.min.js"></script>

    </head>
    <body style="background-image: linear-gradient(to left bottom, #F2E3C6 0%, #A7A1A5 100%)">
        <jsp:include page="header.jsp"></jsp:include>
            <div class="container">
                <div class="content">
                    <div class="content-top">
                        <h3 class="future">Thông tin tìm kiếm</h3>
                        <div class="content-top-in">
                        <%
                            request.setCharacterEncoding("utf-8");
                            response.setCharacterEncoding("utf-8");
                            String s = request.getParameter("tim");
                        %>
                        <%
                            for (Product p : ProductDAO.getTimKiem(s)) {
                        %>
                        <div class="col-md-4 md-col" style="margin-top:33px;">
                            <div class="col-md">
                                
                                <a href="single.jsp?productID=<%=p.getProductID()%>"><img  src="<%=p.getProductImage()%>"  style="height: 253px;" alt="<%=p.getProductName()%>" /></a>	
                                <div class="top-content">
                                    <h5><a href="single.jsp?productID=<%=p.getProductID()%>"><%=p.getProductName()%></a></h5>
                                    <div class="white">
                                        <button class="btn btn-danger"><a href="CartServlet?command=plus&productID=<%=p.getProductID()%>" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2 ">Lưu Thông Tin</a></button>
                                        <p class="dollar"><span><%=p.getProductPrice()%></span><span>Tỷ</span><span class="in-dollar">VNĐ</span></p>
                                        <div class="clearfix"></div>
                                    </div>
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
<!--        <ul class="start" style="margin-left: 564px;margin-top: 32px;">
            <li ><a href="#"><i></i></a></li>
            <li><span>1</span></li>
            <li ><a href="#"><i  class="next"> </i></a></li>
        </ul>-->
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
