<%-- 
    Document   : home.jsp
    Created on : 7-Oct-2022, 7:58:31 AM
    Author     : kalra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Hello ${username}</h1>
        <a href="home?action=logout">logout</a>
    </body>
</html>
