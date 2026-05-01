<%
String name = request.getParameter("name");
String age = request.getParameter("age");
%>

<html>
<body>

<h2>JSP Output</h2>

Name: <%= name %><br><br>
Age: <%= age %>

</body>
</html>