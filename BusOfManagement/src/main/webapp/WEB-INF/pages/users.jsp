<%-- 
    Document   : users
    Created on : Aug 19, 2023, 9:21:15 AM
    Author     : bthta
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<h1>Danh sách tài khoản</h1>
<section>
    <table class="table">
        <thead>
            <tr>
                <th>Id</th>
                <th>Username</th>
                <th>Password</th>
                <th>Vai Trò</th>
                <th>Tùy Chỉnh</th>
            </tr>
        </thead>

        <div>
            <a href="<c:url value="/userInf"/>" class="btn btn-info ">Thêm Tài Khoản</a>
             
        </div>
            </br>
        <div class="input-group">
            <input type="text" class="form-control bg-light border-1 small" name = "kw" placeholder="Tìm Kiếm..."
                   aria-label="Search" aria-describedby="basic-addon2">
            <div class="input-group-append">
                <button class="btn btn-primary" type="submit">
                    <i class="fas fa-search fa-sm"></i>
                </button>
            </div>
        </div>
       
        </br>
        <tbody>
            <c:forEach items="${users}" var="u">
                <tr>
                    <td>${u.id}</td>
                    <td>${u.username}</td>
                    <td>${u.password}</td>
                    <td>${u.role}</td>
                    <td>
                        <a href="#" class="btn btn-info">Cập Nhật</a>
                        <button class="btn btn-danger">Xóa</button>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</section>

