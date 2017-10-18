<%-- 
    Document   : keranjang
    Created on : Oct 17, 2017, 5:07:18 PM
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
        <c:forEach items="${keranjang}" var="c">
            <p>
                ${c.namaBarang}
            </p>
            <a href="keranjang/hapus/${c.id}">Hapus</a>
        </c:forEach>
    </body>
</html>
