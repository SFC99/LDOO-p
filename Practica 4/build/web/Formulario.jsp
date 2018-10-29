<%-- 
    Document   : Formulario
    Created on : 28/10/2018, 05:46:02 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body>
        <form action="Respuesta.jsp">
        <h1>Registra tus datos</h1>
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
                <br>
                <br>
                <input type="submit" value="Registrar" >
              </form>        
    </body>
</html>
