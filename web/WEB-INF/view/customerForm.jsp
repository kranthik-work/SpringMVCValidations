<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer</title>
    <style>
        .error {color:red}
    </style>
</head>
<body>

<form:form action="processForm" modelAttribute="customer">
    First Name <form:input path="firstName"/>
    <br><br>
    Last Name(*) <form:input path="lastName"/><br>
    <form:errors path="lastName" cssClass="error"/>
    <br><br>
    Free Passes <form:input path="freePass"/><br>
    <form:errors path="freePass" cssClass="error"/>
    <br><br>
    Postal Code <form:input path="postalCode"/><br>
    <form:errors path="postalCode" cssClass="error"/>
    <br><br>
    Course Code <form:input path="courseCode"/><br>
    <form:errors path="courseCode" cssClass="error"/>
    <br><br>
    <input type="submit" value="Submit">

</form:form>
</body>
</html>
