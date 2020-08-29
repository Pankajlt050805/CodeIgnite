<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<style>
body {
	margin: 0;
	padding: 0;
	background-color: #17a2b8;
	height: 100vh;
}

#login .container #login-row #login-column #login-box {
	margin-top: 120px;
	max-width: 600px;
	height: 320px;
	border: 1px solid #9C9C9C;
	background-color: #EAEAEA;
}

#login .container #login-row #login-column #login-box #login-form {
	padding: 20px;
}

#login .container #login-row #login-column #login-box #login-form #register-link
	{
	margin-top: -85px;
}
</style>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div align="center">
		<h1>
			<a href="home">Pyramid WSR Tracker</a> - Project List
		</h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>Project Name</th>
			<th>Client Name</th>
			<th>Start Date</th>
			<th>End Date</th>
			<th>Priority</th>
			<th>Comments</th>
		</tr>
		<c:forEach var="emp" items="${projects}">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.projectName}</td>
				<td>${emp.clientName}</td>
				<td>${emp.startDate}</td>
				<td>${emp.endDate}</td>
				<td>${emp.priority}</td>
				<td>${emp.comment}</td>
			</tr>
		</c:forEach>
	</table>
	<br /> <a href="addProject">Add New Project</a>
</div>
