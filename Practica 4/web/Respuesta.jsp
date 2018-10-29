<%-- 
    Document   : Respuesta
    Created on : 28/10/2018, 05:48:20 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica 4: Respuesta</title>
        <%      String nombre = request.getParameter("nombre");
                String primap = request.getParameter("primap");
                String segap = request.getParameter("segap");
                String cumple = request.getParameter("cumple");
                String correo = request.getParameter("mail");
                String pass = request.getParameter("pass");      %>
    </head>
    <body>
      <fieldset>
       <h1>Su nombre completo: <%= nombre %> <%= primap %> <%= segap %> </h1>
       <h1>Su fecha de nacimiento: <%= cumple %></h1>
       <h1>Su correo: <%= correo %></h1>
       <h1>Su contraseña: <%= pass %></h1>
      </fieldset>
    </body>
</html>