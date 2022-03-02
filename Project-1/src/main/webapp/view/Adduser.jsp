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
form{
  border: 3px solid;
  width: 60%;
}
</style>
<body>
	<form action="/signUpUser" method="post">
	<h1>SignUp Form</h1>
		<pre>
user id 	:<input type="text" name="id"> <br>

Name   		:<input type="text" name="name"> <br>

Password	:<input type="text" name="password"> <br>

Phone number	:<input type="text" name="phoneNumber"> <br> <input
			type="submit">
			
			</pre>
	</form>

</body>
</html>