<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>AHORROPERU</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <style>
        body {
            padding-top: 20px;
        }
        header {
            margin-bottom: 20px;
        }
        nav ul {
            list-style-type: none;
            padding: 0;
        }
        nav ul li {
            display: inline;
            margin-right: 10px;
        }
        nav ul li a {
            text-decoration: none;
            color: #007bff;
        }
        nav ul li a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <header class="container">
        <h1 class="text-center">Bienvenido a AHORROPERU</h1>
        <nav class="text-center">
            <ul>
                <li><a href="Consultar.jsp">Consultar Invitados</a></li>
                <li><a href="Agregar.jsp">Agregar Invitado</a></li>
                <li><a href="Eliminar.jsp">Eliminar Invitado</a></li>
                <li><a href="Editar.jsp">Editar Invitado</a></li>					
            </ul>
        </nav>
    </header>
</body>
</html>
