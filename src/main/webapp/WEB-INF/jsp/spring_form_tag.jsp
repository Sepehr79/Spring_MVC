<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring_Form</title>
</head>
<body>
    <%--@elvariable id="personModel" type="beans.Person"--%>
    <div style="text-align: center; margin: 20px auto;">
    <form:form action="sign_up" modelAttribute="personModel">
        Enter name: <form:input path="name"></form:input><br>
        Enter lastname: <form:input path="lastName"></form:input><br>
        Enter age: <form:input path="age"></form:input><br>
        Enter email: <form:input path="email"></form:input><br>
        Enter password: <form:password path="password"></form:password><br>
        Confirm password: <input type="password" name="pass"><br>
        Select gender:
        male: <form:radiobutton path="gender" value="MALE"></form:radiobutton><br>
        Female <form:radiobutton path="gender" value="FEMALE"></form:radiobutton>

        <input type="submit" value="Send">
    </form:form>
    </div>
</body>
</html>
