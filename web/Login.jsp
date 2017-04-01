<%--
  Created by IntelliJ IDEA.
  User: GUILLERMO
  Date: 22/03/2017
  Time: 12:10 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:include page="header.jsp"/>


<div class="container">


    <div class="row">


        <h2 style="color: #d58512">Login</h2>
        <center>
            <s:form action="validate">
                <table>
                    <tr>
                        <td>
                            <s:label value="user" cssStyle="color:black"/>

                        </td>
                        <td>
                            <s:textfield name="userName" cssStyle="color:red"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <s:label value="Password" cssStyle="color:black"/>

                        </td>
                        <td>
                            <s:password name="password" label="Password"/>
                        </td>
                    </tr>
                </table>
                <table>
                    <tr>
                        <td>
                            <s:submit value="login"/>
                        </td>
                        <td>
                            <a href="registro.jsp">Registrarse</a>
                        </td>
                    </tr>
                </table>
            </s:form>
        </center>

    </div>
</div>


<jsp:include page="footer.jsp"/>
</body>
</html>
