<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Agregar Invitado</title>
</head>
<body>
    <h1>Agregar Invitado</h1>
    <form action="../../Java/Control/ControladorAgregar.java" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required>
        <br><br>
        <input type="submit" value="Agregar Invitado">
    </form>
</body>
</html>
