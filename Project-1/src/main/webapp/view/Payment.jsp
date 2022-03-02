<%@page import="com.example.demo.PurchasedList"%>
<%@page import="com.example.demo.Customer"%>
<%@page import="com.example.demo.ShoesDetails"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payment</title>
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
	<%
	ShoesDetails shoesDetails = (ShoesDetails) request.getAttribute("shoesDetails");
	Customer customer = (Customer) request.getAttribute("customer");
	String brandName = shoesDetails.getBrandName();
	%>

	<form action="AddToPurchaseList" method="get">
	<h1> Payment Page</h1>
	<pre>
		Amount	:<input type="text" name="amount"> 
		<input type="hidden" value="<%=(long) shoesDetails.getPrice()%>" name="price">
		<input type="hidden" value="<%=brandName%>" name="brandname">
		<input type="hidden" value="<%=customer.getName()%>" name="name">
		Date	:<input type="date" name="date"><br> <input type="submit"
			value="Pay">
			</pre>
	</form>
</body>
</html>