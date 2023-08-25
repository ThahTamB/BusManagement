<%-- 
    Document   : header
    Created on : Aug 18, 2023, 11:08:58 AM
    Author     : bthta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav>
    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Logo</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="collapsibleNavbar">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>
                    <c:url value="/" var="action"/>
                    <form class="d-flex" action="${action}">
                        <input class="form-control me-2" type="text" name="kw" placeholder="Search">
                        <button class="btn btn-primary" type="button">Search</button>
                    </form>
                </ul>
            </div>
        </div>
    </nav>
</nav>
