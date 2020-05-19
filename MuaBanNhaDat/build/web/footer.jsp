

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Footer</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <meta name="viewport" content="width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0" >
        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
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
        <script>
            $(function ()
            {
                $("#slider1").responsiveSlides
                        ({
                            auto: true,
                            speed: 100,
                            namespace: "callbacks",
                            pager: true,
                        });
            });
        </script>
        <script>
            $(document).ready(function (c)
            {
                $('.alert-close').on('click', function (c)
                {
                    $('.message').fadeOut('slow', function (c)
                    {
                        $('.message').remove();
                    });
                });
            });
        </script>
        <script>
            $(document).ready(function (c)
            {
                $('.alert-close1').on('click', function (c)
                {
                    $('.message1').fadeOut('slow', function (c)
                    {
                        $('.message1').remove();
                    });
                });
            });
        </script>
    </head>
    <body>
        <div class="footer" style="background: #1D2C4C;">
            <div class="footer-middle" style="background: rgba(0,0,0,0.4);">
                <div class="container">
                    <div class="footer-middle-in">
                        <h6>Trụ Sở</h6>
                        <p>
                            Số 98 Dương Quảng Hàm, Quận Cầu Giấy, Thành Phố Hà Nội.
                        </p>
                    </div>
                    <div class="footer-middle-in">
                        <h6>Thông Tin Chúng Tôi</h6>
                        <p>
                            Giấy ĐKKD số: 0104630479 Do Sở Kế hoạch và Đầu tư Thành phố Hà Nội cấp lần đầu ngày 12/09/2019 
                            Giấy phép ICP số 3399/GP-STTTT do Sở Thông tin và Truyền thông Hà Nội cấp ngày 4 tháng 9 năm 2019. 
                        </p>
                    </div>
                    <div class="footer-middle-in">
                        <h6>Dịch Vụ CSKH</h6>
                        <p>
                            Tổng đài CSKH: 1900 100
                        </p>
                        <p>
<!--                            Email: hotro@batdongsandanang.com.vn | cskh@batdongsandanang.com.vn-->
                        </p>
                    </div>
                    <div class="footer-middle-in">
                        <h6>Chịu trách nhiệm nội dung: </h6>
                        <p>
                            Nguyễn Đăng Hiếu
                        </p>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
            <p class="footer-class" style="background: rgba(0,0,0,0.4);"><a href="index.jsp" target="_blank"></a>Doanh Nghiệp Bất Động Sản <strong>HNMU</strong></p>
            <script type="text/javascript">
                $(document).ready(function ()
                {
                    $().UItoTop({easingType: 'easeOutQuart'});
                });
            </script>
            <a href="#" id="toTop" style="display: block;background:url(images/up.png) no-repeat"> <span id="toTopHover" style="opacity: 1;"> </span></a>

        </div>
    </body>
</html>
