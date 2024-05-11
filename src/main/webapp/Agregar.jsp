<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">	

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agregar Invitado</title>
</head>
<body>
	<div class="container">
	<h1 class="d-flex justify-content-center">Agregar Invitado</h1>
		<div class="card">
			<div class="card-body">
	<form action="Agregar" method="POST">
	<div class="form-group row">
	
		<label for="nombre"  class="col-sm-2 col-form-label">Nombre:</label>
		
		<div class="col-sm-7">
		
		 <input class="form-control"  type="text" id="nombre" name="nombre" placeholder="Ingrese su nombre" required>
		
		</div>
	</div>
	
	<div class="form-group row">
	
		<label  class="col-sm-2 col-form-label" for="apellido">Apellido:</label> 
		
		<div class="col-sm-7">
		
		<input class="form-control" type="text" id="apellido" name="apellido" placeholder="Ingrese su apellido" required> 
		
		</div>	
	</div>	
		
		 <button type="submit" class="btn btn-primary ">Agregar Invitado</button>
	
	</form>
			</div>
		</div>
	</div>	
</body>
</html>
