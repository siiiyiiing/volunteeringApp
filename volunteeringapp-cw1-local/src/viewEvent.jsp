<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<header>
<nav class="navbar navbar-expand-md navbar-dark" style="background-color: AliceBlue">
<div>
<a style="color:blue" href="http://localhost:8085/VolunteeringApp/viewEvent.jsp" class="navbar-brand">Home</a>
<h1 style=";font-size:30px;font-family:Arial">Welcome to Volunteering App</h1>
<a href="http://localhost:8085/VolunteeringApp/viewProfile.jsp" class="nav-link">View My Profile</a>
<a href="http://localhost:8085/VolunteeringApp/addEvent.jsp" class="nav-link">Add Event</a>
<a href="http://localhost:8085/VolunteeringApp/editEvent.jsp" class="nav-link">Edit Event</a>
<a href="http://localhost:8085/VolunteeringApp/logOut.jsp" class="nav-link">Log Out</a>
</div>

<ul class="navbar-nav">
</ul>
</nav>
</header>
	<br>
	
	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}} </div> -->
		
		<div class="container">
			<h3 class="text-center">List of Events</h3>
			<hr>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Date</th>
						<th>Location</th>
						<th>Event Description</th>
						<th>Commitment</th>
						<th>Recruitment End Date</th>
					</tr>
				</thead>
			<tbody>
				<!-- for (Todo todo: todos) { -->
				<c:forEach var="events" items="${listEvent}">
				<script>
				console.log("${events.name}");
				console.log("comes here");
				</script>
0.
					<tr>
						<td>
							<c:out value="${events.date}" />
						</td>
						
						<td>
							<c:out value="${events.location}" />
						</td>
						
						<td>
							<c:out value="${events.eventDescription}" />
						</td>
						
						<td>
							<c:out value="${events.commitment}" />
						</td>
						
						<td>
							<c:out value="${events.recruitmentDate}" />
						</td>
							
						<td><a href="edit?id=<c:out value='${events.date}' />">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=<c:out value='${events.date}' />">Delete</a></td>
					</tr>
				</c:forEach>
				<!-- } -->
			</tbody>
		</table>
	</div>
</div>
</body>
</html>