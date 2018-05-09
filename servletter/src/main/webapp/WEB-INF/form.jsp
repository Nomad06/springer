<%--
  Created by IntelliJ IDEA.
  User: bogatyrev
  Date: 16.10.2017
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Distributor</title>
</head>
<body>

<h3>Distributor settings page</h3>
<p style="color: red;">${errorString}</p>


<form method="POST"  enctype="multipart/form-data" action="${pageContext.request.contextPath}/go">
    <table border="0">
        <tr>
            <td>Username</td>
            <td><input type="text" name="userName"  /> </td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password"  /> </td>
        </tr>
        <tr>
            <td>Distributor settings file</td>
            <td><input type="file" name = "file" id="file"  /> </td>
        </tr>
        <tr>
            <td colspan ="1">
                <input type="submit" value= "Submit" />
            </td>
        </tr>
    </table>
</form>

</body>
</html>
