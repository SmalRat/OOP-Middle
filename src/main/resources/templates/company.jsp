<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<h2>Welcome to GeeksforGeeks!!</h2>

<form:form action="submit" method="post" modelAttribute="company">
    <table>
        <tr>
            <td><form:label path="companyDomain">First Name: </form:label></td>
            <td><form:input path="companyDomain" id="companyDomain"/></td>
        </tr>
        <tr>
            <td><form:button>Submit</form:button></td>
        </tr>
    </table>
</form:form>

</body>
</html>
