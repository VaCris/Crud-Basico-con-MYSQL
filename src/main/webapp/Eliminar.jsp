<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.mysql.cj.jdbc.Driver"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<!DOCTYPE html>
<html>
<head>
<title>Eliminar Invitado</title>
</head>
<body>
	<div  class="container">
	<h1 class="d-flex justify-content-center">Eliminar Invitado</h1>
	<div class="card">
			<div class="card-body">
	<form action="eliminar" method="POST">
		<div class="form-group row">
		<!-- Elimino al indio -->
		<label class="col-sm-2 col-form-label" for="nombre">Nombre:</label> 
		</div>
		<div class="col-sm-7">
		<input class="form-control" type="text" id="nombre" name="nombre" required> <br> 
		<br>
		
		</div>
		<button type="submit" class="btn btn-primary " value="Eliminar Invitado">Eliminar Invitado</button>
	</form>
			</div>
		</div>
	</div>
</body>
</html>
