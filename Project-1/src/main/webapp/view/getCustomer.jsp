<%@page import="java.util.ArrayList"%>
<%@page import="com.example.demo.Customer"%>
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
  th{
  background-color:green;
  padding : 0 15px;
  }
  

</style>

<body>

<h1>Customer List</h1>
<table>
		<tr>
			<th>Customer Id</th>
			<th>Name</th>
			<th>Phone Number</th>
		</tr>
		<%
		List<Customer> customer = new ArrayList<Customer>();
		customer = (List<Customer>) request.getAttribute("customer");
		for (Customer c : customer) {
		%>
		<tr>
			<td><%=c.getId()%></td>
			<td><%=c.getName()%></td>
			<td><%=c.getPhoneNumber()%></td>		
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>