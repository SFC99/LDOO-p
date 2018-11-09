<%-- 
    Document   : Registro
    Created on : 9/11/2018, 01:12:33 AM
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
        <h1>Registra tus datos :)</h1>
         Nombre:<br>
         <input type="text" name="nombre">
          <br>
         Primer Apellido:<br>
         <input type="text" name="primap">
         <br>
        Segundo Apellido:<br>
         <input type="text" name="segap">
         <br>
         Fecha de Nacimiento:<br>
          <input type="date" name="cumple">
         <br>
         Correo:<br>
         <input type="email" name="mail">
         <br>
         Contraseña:<br>
          <input type="password" name="pass">
          <input type="hidden" name="pista" value="holi">
          <br>
          <br>
          <input type="submit" value="Registrar" >  
        </form>
    </body>
</html>
