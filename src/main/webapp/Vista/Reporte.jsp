<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="Modelo.Invitado" %>
<%@ page import="Modelo.Servicio" %>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Reporte de Invitados</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <style>
        table {
            width: 100%;
            margin: 20px 0;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
        }
        th {
            background-color: #f4f4f4;
            text-align: left;
        }
        tbody tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        tbody tr:hover {
            background-color: #ddd;
        }
    </style>
</head>
<body>
	<h1>Reporte de Invitados</h1>
    <% Servicio servicio = new Servicio(); %>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Apellido</th>
            </tr>
        </thead>
        <tbody>
            <% 
            	response.setContentType("application/vnd.ms-excel");
            	response.setHeader("Content-Disposition", "inline; filename=invitados.xls");
            	List<Invitado> listaInvitados = (List<Invitado>)session.getAttribute("invitado");
            	for (Invitado inv : listaInvitados) 
            	{ 
            %>
                <tr>
                    <td><%= inv.getId() %></td>
                    <td><%= inv.getNombre() %></td>
                    <td><%= inv.getApellido() %></td>
                </tr>
            <% 
            	}	
            %>
        </tbody>
    </table>
</body>
</html>
