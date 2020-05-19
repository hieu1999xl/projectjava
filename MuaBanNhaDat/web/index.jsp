

<%@page import="model.Cart"%>
<%@page import="model.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mua Bán Nhà Đất Bất Động Sản Uy Tín</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
          <link href="https://fonts.googleapis.com/css2?family=Muli:wght@200&display=swap" rel="stylesheet">
        <script src="js/jquery.min.js"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <meta name="viewport" content="width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0" >
<!--        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>-->
<!--        
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>-->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.2/css/all.css" />
        <script type="text/javascript">
            jQuery(document).ready(function ($)
            {
                $(".scroll").click(function (event)
                {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        <!--slider-script-->
        <script src="js/responsiveslides.min.js"></script>
        <script>
            $(function ()
            {
                $("#slider1").responsiveSlides({
                    auto: true,
                    speed: 100,
                    namespace: "callbacks",
                    pager: true,
                });
            });
        </script>
        <!--//slider-script-->
        <script>$(document).ready(function (c)
            {
                $('.alert-close').on('click', function (c) {
                    $('.message').fadeOut('slow', function (c) {
                        $('.message').remove();
                    });
                });
            });
        </script>
        <script>
            $(document).ready(function (c) {
                $('.alert-close1').on('click', function (c) {
                    $('.message1').fadeOut('slow', function (c) {
                        $('.message1').remove();
                    });
                });
            });
        </script>
        <style>
            h3.title-block {
            font-family: "Muli", sans-serif;
            font-size: 200%;
            font-weight: 900;
            text-align: center;
         
            position: relative;
            color: #000;
        }
        a {
            text-decoration: none !important;
        }
        .title-block:before {
            content: "";
            width: 3em;
            background: #0999D8;
            height: 1px;
            position: absolute;
            left: 50%;
            bottom: -1em;
            margin-left: -1.5em;
        }
        </style><!--
    </head>-->
    <body style="background-image: linear-gradient(to left bottom, #F2E3C6 0%, #A7A1A5 100%)" >
        <jsp:include page="header.jsp"></jsp:include>
        <div class="container">
          <div class="search">
                                <form action="timkiem.jsp?page=1" method="get">
                                    <input type="text" value="Tìm Kiếm" name="tim" onfocus="this.value = '';" onblur="if (this.value == '')
                                            {
                                                this.value = 'Tìm Kiếm';
                                            }" >
                                    <input type="submit"  value="">
                                    
                                </form>
                            </div>
           </div> 
        <jsp:include page="banner.jsp"></jsp:include>
        <jsp:include page="content.jsp"></jsp:include>
        <jsp:include page="footer.jsp"></jsp:include>

    </body>
</html>
