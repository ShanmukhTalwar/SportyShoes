<%@page import="java.util.ArrayList"%>
<%@page import="com.example.demo.PurchasedList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
table, th, td {
	border: 1px solid;
}

td {
	padding: 5px 30px;
	background-color: activecaption;
}

th {
	background-color: green;
	padding: 9px 15px;
}
</style>
<body>

<h1>Ordered List</h1>
	<table>
		<tr>
			<th>Ordered Date</th>
			<th>Brand</th>
			<th>Name</th>
			<th>Paid Amount</th>
		</tr>
		<%
		List<PurchasedList> purchasedList = new ArrayList<PurchasedList>();
		purchasedList = (List<PurchasedList>) request.getAttribute("purchasedList");

		for (PurchasedList temp : purchasedList) {
		%>
		<tr>
			<td><%=temp.getDate()%></td>
			<td><%=temp.getBrandname()%></td>
			<td><%=temp.getName()%></td>
			<td><%=temp.getPrice()%></td>
		</tr>
		<%}%>
	</table>
</body>
</html>