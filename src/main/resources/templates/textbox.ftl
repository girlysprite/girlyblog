<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<html>
<head>
    <title>Girlyblog</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<H1>Form</H1>
<form action="#" th:action="@{/textbox}" th:object="${greeting}" method="post">
    <p>Id: <input type="text" th:field="*{id}" /></p>
    <p>Message: <input type="text" th:field="*{content}" /></p>
    <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
</form>
</body>
</html>