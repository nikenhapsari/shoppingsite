<%-- 
    Document   : detail
    Created on : Oct 17, 2017, 1:11:47 PM
    Author     : nikenhapsari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>DETAIL BARANG</h1>
        <b>Nama Barang: ${detailproduk.namaBarang}</b><br/>
        <b>Detail Barang: ${detailproduk.tentang}</b><br/>
        <b>Harga Barang: ${detailproduk.harga}</b><br/>
        <a href="tambahkan"><button name="tambah" value="submit">Tambah ke Keranjang</button></a>
        <button name="tambah" >Kembali</button>
    </body>
</html>
