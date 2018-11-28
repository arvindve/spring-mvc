<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>

    <form:form action="processForm" modelAttribute="student" >
        First Name : <form:input path="firstName"/>
        <br><br>
        Last Name :  <form:input path="lastName"/>
        <br><br>
        <form:select path="country">
            <form:options items="${student.countyOptions}"/>
        </form:select>
        <br><br>
        Favourite Language :
        Java <form:radiobutton path="favouriteLanguage" value="Java"/>
        PHP <form:radiobutton path="favouriteLanguage" value="PHP"/>
        Python <form:radiobutton path="favouriteLanguage" value="Python"/>
        Ruby <form:radiobutton path="favouriteLanguage" value="Ruby"/>
        <br><br>
        Operating Systems :
        Linux <form:checkbox path="operatingSystems" value="Linux"/>
        Windows <form:checkbox path="operatingSystems" value="Windows"/>
        MacOS <form:checkbox path="operatingSystems" value="MacOS"/>

        <br><br>
        <input type="submit" value="Submit">
    </form:form>

</body>
</html>
