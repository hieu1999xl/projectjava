
<%@page import="model.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <head>
        <title>Admin</title>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="css/bootstrap.min.css" />
        <link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="css/fullcalendar.css" />
        <link rel="stylesheet" href="css/matrix-style.css" />
        <link rel="stylesheet" href="css/matrix-media.css" />
        <link rel="stylesheet" href="css/css1.css" />
        <link rel="stylesheet" href="css/style_1.css" />
        <link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
        <link rel="stylesheet" href="css/jquery.gritter.css" />
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
    </head>
</head>
<body style="background-image: linear-gradient(to left bottom, #F2E3C6 0%, #A7A1A5 100%)"

    <jsp:include page="header_Admin.jsp" ></jsp:include>
    <%

        Users u = (Users) session.getAttribute("admin");
        if (u == null) {
            response.sendRedirect("404.jsp");
        }
    %>
    <jsp:include page="trangchu_Admin.jsp"></jsp:include>
    <jsp:include page="menu_Admin.jsp" ></jsp:include>



    <script src="js/excanvas.min.js"></script> 
    <script src="js/jquery.min.js"></script> 
    <script src="js/jquery.ui.custom.js"></script> 
    <script src="js/bootstrap.min.js"></script> 
    <script src="js/jquery.flot.min.js"></script> 
    <script src="js/jquery.flot.resize.min.js"></script> 
    <script src="js/jquery.peity.min.js"></script> 
    <script src="js/fullcalendar.min.js"></script> 
    <script src="js/matrix.js"></script> 
    <script src="js/matrix.dashboard.js"></script> 
    <script src="js/jquery.gritter.min.js"></script> 
    <script src="js/matrix.interface.js"></script> 
    <script src="js/matrix.chat.js"></script> 
    <script src="js/jquery.validate.js"></script> 
    <script src="js/matrix.form_validation.js"></script> 
    <script src="js/jquery.wizard.js"></script> 
    <script src="js/jquery.uniform.js"></script> 
    <script src="js/select2.min.js"></script> 
    <script src="js/matrix.popover.js"></script> 
    <script src="js/jquery.dataTables.min.js"></script> 
    <script src="js/matrix.tables.js"></script> 

    <script type="text/javascript">
        // This function is called from the pop-up menus to transfer to
        // a different page. Ignore if the value returned is a null string:
        function goPage(newURL) {

            // if url is empty, skip the menu dividers and reset the menu selection to default
            if (newURL != "") {

                // if url is "-", it is this page -- reset the menu:
                if (newURL == "-") {
                    resetMenu();
                }
                // else, send page to designated URL            
                else {
                    document.location.href = newURL;
                }
            }
        }

        // resets the menu selection upon entry to this page:
        function resetMenu() {
            document.gomenu.selector.selectedIndex = 2;
        }
    </script>
</body>
</html>
