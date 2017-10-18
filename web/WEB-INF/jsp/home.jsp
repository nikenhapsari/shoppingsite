<%-- 
    Document   : home
    Created on : Oct 17, 2017, 11:51:25 AM
    Author     : nikenhapsari
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${msg}</h1>
        <a href="keranjang" ><h2>Jumlah belanjaan: ${keranjang.size()}</h2></a>
    <c:forEach items="${daftar}" var="p">
        <p>
        ${p.namaBarang}<br/>
        ${p.harga}<br/>
        <a href="detail/${p.id}">Lihat Detail</a>
        </p>
    </c:forEach>
</body>
</html>
