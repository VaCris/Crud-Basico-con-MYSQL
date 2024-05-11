<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="Clases.Invitado" %>

<%@ page import="Clases.Servicio" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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