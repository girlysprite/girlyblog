<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Girlyblog Textbox</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h1>Result</h1>
    <p th:text="'id: ' + ${textBoxForm.id}" />
    <p th:text="'content: ' + ${textBoxForm.content}" />
    <a href="/textbox">Submit another message</a>
</body>
</html>