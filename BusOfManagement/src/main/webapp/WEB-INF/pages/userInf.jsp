<%-- 
    Document   : user
    Created on : Aug 18, 2023, 9:33:13 PM
    Author     : bthta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>Tài Khoản</h1>
<c:url value="/userInf" var="addUser"/>

<form:form modelAttribute="user" method="post" action="${addUser}" enctype="multipart/form-data">
    <div class="container mt-3">
        <form:hidden path="id" />
        
            <div class="form-floating mb-3 mt-3">
                <form:input path="username" type="text" class="form-control" id="username" 
                            placeholder="Nhập Username" name="username" />
                <label for="username">Username</label>
            </div>
            <div class="form-floating mt-3 mb-3">
                <form:input path="password" type="text" class="form-control" id="password"
                            placeholder="Nhập Password" name="password" />
                <label for="pwd">Password</label>
            </div>
            <div class="form-floating">
                <form:select  path="role" class="form-select" id="role" name="rolelist">
                <option>Admin</option>
                <option>Khách hàng</option>
                <option>Nhà xe</option>
                </form:select>
                <label for="role" class="form-label">Chức vụ:</label>
            </div>

            <div class="form-floating mt-3 mb-3">
                <input type="text" class="form-control" id="name" placeholder="Họ và Tên" name="name">
                <label for="pwd">Họ và Tên</label>
            </div>
            <div class="form-floating mt-3 mb-3">
                <input type="text" class="form-control" id="name" placeholder="Số điện thoại" name="phone">
                <label for="pwd">Số điện thoại</label>
            </div>
            <button type="submit" class="btn btn-primary">Lưu</button>
            <button class="btn btn-primary">Xóa</button>
    </div>
</form:form>
