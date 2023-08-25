<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

    <!-- Sidebar - Brand -->
    <a class="sidebar-brand d-flex align-items-center justify-content-center" href="<c:url value="/"/>">
        <!--        <div class="sidebar-brand-icon rotate-n-15">
                    <i class="fas fa-laugh-wink"></i>
                </div>-->
        <div class="sidebar-brand-text mx-3">Stardust Bus Management<sup></sup></div>
    </a>

    <!-- Divider -->
    <hr class="sidebar-divider my-0">

    <!-- Nav Item - Dashboard -->
    <li class="nav-item active">
        <a class="nav-link" href="<c:url value="/"/>">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>Bảng điều khiển</span></a>
    </li>

    <!-- Divider -->
    <hr class="sidebar-divider">

    <div class="sidebar-heading">
        QUẢN LÝ NGƯỜI DÙNG
    </div>

    <li class="nav-item">
        <a class="nav-link" href="<c:url value="/users"/>">
            <i class="fas fa-ticket-alt"></i>
            <span>Tài khoản</span></a>
    </li>
     <li class="nav-item">
        <a class="nav-link" href="<c:url value="/"/>">
            <i class="fa-solid fa-city"></i>
            <span>Công Ty</span></a>
    </li>
     <li class="nav-item">
        <a class="nav-link" href="<c:url value="/"/>">
            <i class="fa-solid fa-city"></i>
            <span>Khách hàng</span></a>
    </li>
     <!-- Divider -->
    <hr class="sidebar-divider">

    <div class="sidebar-heading">
        QUẢN LÝ NHÀ XE
    </div>
    
     <li class="nav-item">
        <a class="nav-link" href="<c:url value="/"/>">
            <i class="fas fa-home"></i>
            <span>Nhà Xe</span></a>
    </li>
    
     <li class="nav-item">
        <a class="nav-link" href="<c:url value="/"/>">
            <i class="fas fa-bus"></i>
            <span>Xe</span></a>
    </li>
    
    <!-- Divider -->
    <hr class="sidebar-divider">

    <!-- Heading -->
    <div class="sidebar-heading">
        QUẢN LÝ ĐIỂM ĐI
    </div>

    <!-- Nav Item - Pages Collapse Menu -->
    <li class="nav-item">
        <a class="nav-link" href="<c:url value="/bill"/>">
            <i class="fas fa-ticket-alt	"></i>
            <span>Vé xe</span></a>
    </li>
    <!-- Nav Item - Pages Collapse Menu -->

    <li class="nav-item">
        <c:forEach items="${destinations}" var="d">
            <c:url value = "/" var="desAction">
                <c:param name="desId" value="${d.destinationId}" />
            </c:url>
            <a class="nav-link" href="${desAction}">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>${d.destinationCity}</span>
            </a>
        </c:forEach>
    </li>

    <!-- Divider -->
    <hr class="sidebar-divider">

    <!-- Heading -->
    <div class="sidebar-heading">
        THỐNG KÊ
    </div>

    <!-- Nav Item - Pages Collapse Menu -->
    <li class="nav-item">
        <a class="nav-link" href="<c:url value="/stat"/>">
            <i class="fas fa-fw fa-chart-area"></i>
            <span>Thống Kê</span></a>
    </li>

    <!-- Divider -->
    <hr class="sidebar-divider d-none d-md-block">





</ul>