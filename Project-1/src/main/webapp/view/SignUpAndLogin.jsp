<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>
input[type=text] {
  width: 40%;
  padding: 12px 15px;
  margin: 8px 0;
  box-sizing: border-box;
}

</style>
<body>
	<h1>Login Page</h1>
	<form action="order">
		<%
		int shoesId = (int) request.getAttribute("shoesId");
		%>
		<p>
		<pre>
User id : <input type="text" name="id">
<br>

Password : <input type="text" name="password">
<br>
</pre>
		<input type="hidden" value="<%=shoesId%>" name="shoesId"> <input
			type="submit">
	</form>
	<br>
	<form action="signUp">

		<input type="submit" value="SignUp">
	</form>
</body>
</html>