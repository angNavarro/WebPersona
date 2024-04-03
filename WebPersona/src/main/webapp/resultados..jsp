<%-- 
    Document   : resultados.
    Created on : 3 abr 2024, 20:00:09
    Author     : angel
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!<!-- LO PRIMERO CREAR VARIABLE CON LOS DATOS QUE NOS LLEGAN.  -->
<%
    //como devuelve un object hay que hacer un cast. 
    String apellido = (String)request.getAttribute("apellido");
    ArrayList<Persona> resultado = (ArrayList<Persona>) request.getAttribute("lista");
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        <h1>Personas que contienen en el apellido: "<%= apellido%>"</h1>
        <table border="1">
            <tr><td>Codigo</td><td>Nombre</td><td>Apellidos</td><td>Edad</td></tr>
            <!<!-- Creamos una expresion for para que me cree tr (html), por eso esta la apertura y cierre entre <%%> -->
            <% for(Persona p: resultado){%>
            <tr>
                <td><%=p.getCodigo() %></td>
                <td><%=p.getNombre() %></td>
                <td><%=p.getApellidos() %></td>
                <td><%=p.getEdad() %></td>
            </tr>
            <%}%>
        </table>
        <p> Se han encontrado <%= resultado.size()%> personas que coinciden<p>
        <p><a href="index.html">Volver al indice</p>
    </body>
</html>
