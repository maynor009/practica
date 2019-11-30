<%-- 
    Document   : instorneo
    Created on : 11-29-2019, 01:08:19 PM
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
            <form action="Torneo" method="post">
                <div class="row">
                    <div class="col m12">
                        <div class="card teal darken-4 white-text center-align z-depth-5">
                            <h2>Nuevo Campeonato</h2>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col m4"></div>
                    <div class="col m4">Pais a celebrar el torneo</div>
                    <div class="col m4">
                        <input type="hidden" value="${llena.id_tor}" name="ID"/>
                        <select name="cmbPais">
                            <option value="" ></option>
                            <c:forEach items="${PaisCede}" var="pc">
                                <c:choose>
                                    <c:when test="${pc.id_cede==llena.paisCede.id_cede}">
                                        <option value="${pc.id_cede}" >${pc.cede_pais}</option>
                                    </c:when>
                                    <c:otherwise>
                                        <option value="${pc.id_cede}">${pc.cede_pais}</option>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="col m4"></div>
                    <div class="col m4">Ciudad donde se realizara</div>
                    <div class="col m4">
                        <input type="text" name="txtCiudad"/>
                    </div>
                </div>
                <div class="row">
                    <div class="col m4"></div>
                    <div class="col m4">Fecha del torneo</div>
                    <div class="col m4">
                        <input type="date" name="txtFecha"/>
                    </div>
                </div>
                <div class="row">
                    <div class="col m4"></div>
                    <div class="col m4">Modalidad de juego</div>
                    <div class="col m4">
                        <select name="cmbModalidad">
                            <option value="" ></option>
                            <c:forEach items="${modalidad}" var="md">
                                <option value="${md.id_mod}" >${md.tipo_mod}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="col m2"></div>
                    <div class="col m3"></div>
                    <div class="col m6">
                        <input type="submit" value="Guardar" class="btn teal darken-4 white-text z-depth-4">
                    </div>
                </div>
            </form>
        </div>
        <script src="resources/js/jquery-3.4.1.js" type="text/javascript"></script>
        <script src="resources/js/materialize.js" type="text/javascript"></script>
        <script>
            $(document).ready(function () {
                $('select').formSelect();
            });
        </script>
    </body>
</html>
