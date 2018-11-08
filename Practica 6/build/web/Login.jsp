<%-- 
    Document   : Login
    Created on : 6/11/2018, 09:56:00 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="FormularioControl" method="post" > 
        <h2>usuario: <input type="text" name="user"><br></h2>
        <h2>password: <input type="password" name="pass"><br></h2>
        <input type="hidden" name="pista" value="2">
        <input type="submit" value="Ingresar">
       </form>
    </body>
</html>
