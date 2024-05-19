<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="Modelo.Invitado" %>
<%@ page import="Modelo.Servicio" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<!DOCTYPE html>
<html>
<head>
    <title>Consultar Invitados</title>
</head>
<body>
    <div class="container">
        <h1 class="d-flex justify-content-center">Lista de Invitados</h1>
        <% 
            Servicio servicio = new Servicio(); 
            List<Invitado> listaInvitados = servicio.consultarInvitados(); 
        %>
        <a href="Reporte.jsp" class="btn btn-primary">Generar Reporte</a> 
        <br> <br>
        <table class="table table-striped">
            <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                 
                </tr>
            </thead>
            <tbody>
                <% 
                    for (Invitado inv : listaInvitados) { 
                %>
                    <tr>
                        <td><%= inv.getId() %></td>
                        <td><%= inv.getNombre() %></td>
                        <td><%= inv.getApellido() %></td>
                    </tr>
                <%
              
                } 
                session.setAttribute("invitado", listaInvitados);
                %>
            </tbody>
            
        </table>
    </div>
</body>
</html>
