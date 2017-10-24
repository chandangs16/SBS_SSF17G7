<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="adminmenu.jsp" %>
<title>Systems Log</title>
</head>
<body>

<div class="container">

		<h1>All employee - ${msg} </h1>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>TimeStamp</th>
					<th>FirstName</th>
					<th>LastName</th>
					<th>Action</th>
				</tr>
			</thead>

			<c:forEach var="systemLog" items="${systemLogList}">
				<tr>
					<td>
						${systemLog.logTime}
					</td>
					<td>${systemLog.firstName}</td>
					<td>${systemLog.lastName}</td>
					<td>${systemLog.action}</td>
				</tr>
			</c:forEach>
		</table>

	</div>
</body>
</html>