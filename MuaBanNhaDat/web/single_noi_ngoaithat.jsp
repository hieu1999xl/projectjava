

<%@page import="dao.noi_ngoaithatDAO"%>
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
        <title>Chi Tiết Phong Thủy</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <script src="js/jquery.min.js"></script>
<!--        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />-->
        <meta name="viewport" content="width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0" >
<!--        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>-->
        <link href="https://fonts.googleapis.com/css2?family=Muli:wght@200&display=swap" rel="stylesheet">
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>

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
               top: -19.23em;
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
              position: absolute;
        
            left: 50%;
            transform: translate(-50%);
           
           }
           img{
           position: relative;
           }
           .img_mid {
                        margin: 3em 0;
                    }
            div#bottom-phongthuy-chitiet {
                            margin-bottom: 5em;
                        }
           .content_img {
                            text-align: center;
                        }
                       
        </style>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <%
            String s = request.getParameter("id");
            int i = Integer.parseInt(s);
        %>
         <div class="container">
            <div class="topicpath topicpath-border"><ul><li><a href="index.jsp">Trang chủ</a></li><li>Nội-Ngoại thất <span> > <%out.print(noi_ngoaithatDAO.getChitiet(i).getNoiNgoaiThat_TieuDe() ); %></span></li></ul></div>
      

            <div class="img_mid">
              <image  src="<%out.print(noi_ngoaithatDAO.getChitiet(i).getNoiNgoaiThat_Image() ); %>"></image>
              <div class="content_img">
                  <p>Ảnh:  <%out.print(noi_ngoaithatDAO.getChitiet(i).getNoiNgoaiThat_TieuDe() ); %></p>
              </div>
             </div> 
        
        <div id="bottom-phongthuy-chitiet">
            
            <div>
              
                <% 
                    out.print(noi_ngoaithatDAO.getChitiet(i).getNoiNgoaiThat_NoiDung() );
                %>
            </div>
        </div>
              </div>
        <div class="clearfix"></div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
