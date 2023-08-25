<%-- 
    Document   : base
    Created on : Aug 18, 2023, 11:08:49 AM
    Author     : bthta
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <title>Stardust Management</title>

        <!-- Custom fonts for this template-->
        <link href="<c:url value="/resources/vendor/fontawesome-free/css/all.min.css"/>"  rel="stylesheet" type="text/css" />
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="<c:url value="/resources/css/sb-admin-2.css" />" rel="stylesheet"/>

    </head>

    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper">

            <!-- Sidebar -->
            <tiles:insertAttribute name="sidebar" />
            <!-- End of Sidebar -->

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <!-- Topbar -->
                    <tiles:insertAttribute name="topbar" />
                    <!-- End of Topbar -->

                    <!-- Begin Page Content -->
                    <div class="container-fluid">

                        <div class="container">
                            <tiles:insertAttribute name="content" />
                        </div>
                    </div>
                    <!-- /.container-fluid -->

                </div>
                <!-- End of Main Content -->

                <!-- Footer -->
                <tiles:insertAttribute name="footer" />
                <!-- End of Footer -->

            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>

        <!-- Logout Modal-->


        <!-- Bootstrap core JavaScript-->
<script src="<c:url value="resources/vendor/jquery/jquery.min.js"/>"></script>
        <script src="<c:url value="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"/>></script>

                <!-- Core plugin JavaScript-->
        <script src="<c:url value="resources/vendor/jquery-easing/jquery.easing.min.js"/>></script>

        <!-- Custom scripts for all pages-->
        <script src="<c:url value="resources/js/sb-admin-2.min.js"/>></script>

                <!-- Page level plugins -->
        <script src="<c:url value="resources/vendor/chart.js/Chart.min.js" />"></script>

        <!-- Page level custom scripts -->
        <script src="<c:url value="resources/js/demo/chart-area-demo.js"/>></script>
        <script src="<c:url value="resources/js/demo/chart-pie-demo.js"/>></script>

    </body>

</html>



<!--<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Stardust Bus Management</title>
          <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
    </head>
    <body>
        <%--<tiles:insertAttribute name="header"/>--%>
        <div class="container">
             <%--<tiles:insertAttribute name="content"/>--%>
        </div>
        <%--<tiles:insertAttribute name="footer"/>--%>
    </body>
</html>-->
