<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<section id="gallery" class="container-fluid section-block">
    <div class="container">
        <div class="row">
            <div class="col-md-12 block gallery" style="height: 50%">

                <h1>Perfil del usuario</h1>
                <center>
                    <s:form action="register">
                        <table>
                            <tr>
                                <td>
                                    <s:label value="Apellidos" cssStyle="color:black"/>

                                </td>
                                <td>
                                    <s:textfield name="surname"/>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <s:label value="Nombres" cssStyle="color:black"/>

                                </td>
                                <td>
                                    <s:textfield name="name"/>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <s:label value="Sexo" cssStyle="color:black"/>

                                </td>
                                <td>
                                    <s:textfield name="sex"/>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <s:label value="Phone" cssStyle="color:black"/>

                                </td>
                                <td>
                                    <s:textfield name="phone"/>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <s:label value="Rol" cssStyle="color:black"/>

                                </td>
                                <td>
                                    <s:textfield name="rol"/>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <s:label value="Codigo" cssStyle="color:black"/>

                                </td>
                                <td>
                                    <s:textfield name="skills"/>
                                </td>
                            </tr>
                        </table>
                        <table>
                            <tr>
                                <td>
                                    <s:submit value="Guardar"/>
                                </td>

                            </tr>
                        </table>
                    </s:form>
                </center>
            </div>
        </div>
    </div>
</section>


<jsp:include page="footer.jsp"/>
</body>
</html>
