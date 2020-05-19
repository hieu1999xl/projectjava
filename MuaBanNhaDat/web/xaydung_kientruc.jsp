

<%@page import="model.xaydung_kientruc"%>
<%@page import="dao.xaydung_kientrucDAO"%>
<%@page import="model.noi_ngoaithat"%>
<%@page import="dao.noi_ngoaithatDAO"%>
<%@page import="model.phongthuy"%>
<%@page import="dao.PhongThuyDAO"%>
<%@page import="java.sql.Connection"%>
<%@page import="connect.DBConnect"%>
<%@page import="dao.ProductDAO"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Xây Dựng-Kiến Trúc</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <script src="js/jquery.min.js"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <meta name="viewport" content="width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0" >
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
          <link href="https://fonts.googleapis.com/css2?family=Muli:wght@200&display=swap" rel="stylesheet">
       
        <style>
              #bottom-phongthuy {
               font-family: 'Muli', sans-serif;
               line-height: 1.7;
               color: #445A64;
               margin-top: 6em;
               padding-bottom: 4em;
               height: auto;
           }
           /*
*/
           
           .clear {
               clear: both;
           }
           /*
*/
           
           .image {
               float: left;
               margin-bottom: 20px;
           }
           
           .noidung {
               overflow: hidden;
               text-overflow: ellipsis;
               max-width: 653px;
               overflow: hidden;
               display: -webkit-box;
               -webkit-line-clamp: 5;
               -webkit-box-orient: vertical;
           }
           
           p.tieude {
               font-size: 2em;
           }
           
           p.tieude:before {
               position: absolute;
               content: "";
               height: 2px;
               width: 6rem;
               background: #0999D8;
               bottom: 0;
               top: -20.45em;
               left: 8%;
               transform: translateX(-50%);
           }
           
           .btn_new {
               margin-top: 1em;
           }
           
           .topicpath-border {
               border-bottom: 1px solid #D3D9E1;
               margin-bottom: 20px;
           }
           
           .topicpath ul {
               float: left;
               overflow: hidden;
               *zoom: 1;
               width: 100%;
               padding: .6em .5em;
           }
           
           .topicpath ul li {
               float: left;
               color: #636982;
           }
           
           li {
               list-style-type: none;
           }
           
           .topicpath-border ul {
               padding: .6em 0em;
           }
           
           .topicpath ul li a {
               padding: 0 1.5em 0 0em;
           }
           
           img {
               vertical-align: middle;
               max-width: 100%;
           }
        </style>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
                <div class="container">
            <div class="topicpath topicpath-border"><ul><li><a href="/">Trang chủ</a></li><li>Phong thủy</li></ul></div>
        </div>
        <%
            for (xaydung_kientruc x :xaydung_kientrucDAO.getListxaydung_kientruc() ) {
        %>
        <div class="clearfix"></div>
        <div id="bottom-phongthuy">
             <div class="container">
                <div class="row">
                <div class="col-md-6">
                <div class="image">
                    <image  src="<%=x.getXaydung_kientruc_Image() %>"></image>
                </div>
                </div>
                <div class="col-md-6">
                    <a href="single_xaydung_kientruc.jsp?id=<%=x.getiD_xaydung_kientruc() %>"><p class="tieude" style="margin-bottom:10px;"><%=x.getXaydung_kientruc_TieuDe() %></p></a>
                    <div>
                        <p class="noidung">
                            <%=x.getXaydung_kientruc_NoiDung() %>
                        <div><button class="btn btn-success"><a href="single_xaydung_kientruc.jsp?id=<%=x.getiD_xaydung_kientruc()  %> "><span>Đọc Tiếp</span></a></button></div>
                        </p>
                           </div>
                 
                </div>
                </div>
            </div>
        </div>
        <div class="clearfix"></div>
        <%
            }
        %>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
