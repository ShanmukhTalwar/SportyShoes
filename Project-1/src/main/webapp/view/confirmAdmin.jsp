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
	<form action="getOrders">
	<h1>Search By Brand Name And Date</h1>
		<pre>
		Brand Name : <input type="text" name="brandname"> <br>
		Date 	   : <input type="date" name="date"> <br> <input
			type="submit">
			
			</pre>
	</form>
	

	<form action="addshoes" method="post">
		<h1>Add Shoes</h1>
	<pre>

		Shoes Id  : <input type="text" name="shoesId"> <br> 
		Category: <input type="text" name="brandName"> <br> 
		Price     : <input type="text" name="price"> <br> 
		Stock     : <input type="text" name="stock"> <br> <input type="submit">
		<a href="getCustomer">Get Customers</a>
	</pre>
	
	</form>
	
	
</body>
</html>