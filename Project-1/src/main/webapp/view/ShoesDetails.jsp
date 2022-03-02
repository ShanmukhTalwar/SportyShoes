<%@page import="java.util.ArrayList"%>
<%@page import="com.example.demo.ShoesDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shoes Details</title>

</head>
<style>
table, th, td {
  border: 1px solid;
}
 td {
    padding: 5px 30px;
    background-color: activecaption;
  }
  th{
  background-color:green;
  padding : 0 15px;
  }
  

</style>

<body >

	<h1>SportyShoes.com</h1>
	<table>
		<tr>
			<th>ShoesId</th>
			<th>Category</th>
			<th>Price</th>
			<th>Stock</th>
			<th>Buy</th>
		</tr>
		<%
		List<ShoesDetails> shoes = new ArrayList<ShoesDetails>();
		shoes = (List<ShoesDetails>) request.getAttribute("shoesDetails");
		for (ShoesDetails s : shoes) {
		%>
		<tr>
			<td><%=s.getShoesId()%></td>
			<td><%=s.getBrandName()%></td>
			<td><%=s.getPrice()%></td>
			<td><%=s.getStock()%></td>
			<td>
				<form action="SignUpAndLogin" method="post">
					<input type="hidden" value="<%=s.getShoesId()%>" name="shoesId">
					<input type="submit" value="Buy">
				</form>
			</td>
		</tr>
		<%
		}
		%>
	</table>
	<br>
	<form action="/AdminLogin" method="post">
	<input type="submit" value="Admin Login">
	</form>
</body>
</html>