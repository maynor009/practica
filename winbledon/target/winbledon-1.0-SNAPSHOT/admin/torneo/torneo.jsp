<%-- 
    Document   : torneo
    Created on : 11-28-2019, 03:27:05 PM
    Author     : maynor.menjivarusam
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="resources/css/materialize.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col m12">
                    <div class="card deep-purple darken-4 white-text center-align z-depth-5">
                        <h2>Fechas de torneos</h2>
                    </div>
                </div>
            </div>
            <div class="row">
                <a href="Torneo?action=insertar" class="btn lime accent-4 black-text z-depth-4">
                    入口 Insertar
                </a>
            </div>
            <div class="row">
                <table border="1">
                    <thead>
                        <tr>
                            <th>Numero torneo</th>
                            <th>Fecha de celebracion</th>
                            <th>Ciudad de cede</th>
                            <th>Pais de cede</th>
                            <th>Modalidad del torneo</th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <c:forEach items="${lista}" var="t">
                         <tbody>
                        <tr>
                            <td>${t.id_tor}</td>
                            <td>${t.anio}</td>
                            <td>${t.ciudad}</td>
                            <td>${t.paisCede.cede_pais}</td>
                            <td>${t.modalidad.tipo_mod}</td>
                            <td>
                                <a href="Torneo?action=eliminar&id=${t.id_tor}" 
                                   class="btn lime accent-4 black-text z-depth-4">Eliminar</a>
                            </td>
                            <td>
                                <a href="Torneo?action=actualizar&id=${t.id_tor}" 
                                   class="btn pink accent-4 black-text z-depth-4">Actualizar</a>
                            </td>
                        </tr>
                    </tbody>
                    </c:forEach>
                   
                </table>

            </div>
        </div>
    </body>
</html>
