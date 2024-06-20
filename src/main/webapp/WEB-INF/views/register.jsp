<%--
  Created by IntelliJ IDEA.
  User: kundan
  Date: 20/06/24
  Time: 8:51 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>
<center>
    <h1>Implementer Registration Application</h1>
    <form method="post">
    <table>
        <tr>
            <th>Implementers ID</th>
            <td><input type="text" name="id"></td>
        </tr>

        <tr>
            <th>Implementers Name</th>
            <td><input type="text" name="name"></td>
        </tr>

        <tr>
            <th>Implementers City</th>
            <td><input type="text" name="city"></td>
        </tr>

        <tr>
            <th>Implementers Salary</th>
            <td><input type="text" name="salary"></td>
        </tr>
    </table>
        <button type="submit">Submit</button>
    </form>
</center>
</body>
</html>
