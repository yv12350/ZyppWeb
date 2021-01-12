<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Spring Boot Example</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<style>
</
head> <h2>Attendance Table </h2>table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 150%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
<body>


	<form action="/teacher/dashboard/updateAttendance" Method="POST">





		<table style="margin-left: auto; margin-right: auto;">
			<tr>
				<th>Student Name</th>
				<th>Math</th>
				<th>Computer</th>
				<th>Chemistry</th>
				<th>Physics</th>
			</tr>




			<c:forEach var="students" items="${studentDetails}">


				<c:forEach var="attendance" items="${students.attendance}">
					<tr>

						<td>${students.name}</td>


						<td><select name="${attendance.math}" id="${attendance.math}">
								<option value="${attendance.math}" selected>${attendance.math}</option>
								<c:if test="${attendance.math=='P'}">
									<option value="A">A</option>
								</c:if>
								<c:if test="${attendance.math=='A'}">
									<option value="P">P</option>
								</c:if>



						</select></td>
						<td><select name="${attendance.computer}"
							id="${attendance.computer}">
								<option value="${attendance.computer}" selected>${attendance.computer}</option>
								<c:if test="${attendance.computer=='P'}">
									<option value="A">A</option>
								</c:if>
								<c:if test="${attendance.computer=='A'}">
									<option value="P">P</option>
								</c:if>


						</select></td>
						<td><select name="${attendance.chemistry}"
							id="${attendance.chemistry}">
								<option value="${attendance.chemistry}" selected>${attendance.chemistry}</option>
								<c:if test="${attendance.chemistry=='P'}">
									<option value="A">A</option>
								</c:if>
								<c:if test="${attendance.chemistry=='A'}">
									<option value="P">P</option>
								</c:if>

						</select></td>
						<td><select name="${attendance.physics}"
							id="${attendance.physics}">
								<option value="${attendance.physics}" selected>${attendance.physics}</option>
								<c:if test="${attendance.physics=='P'}">
									<option value="A">A</option>
								</c:if>
								<c:if test="${attendance.physics=='A'}">
									<option value="P">P</option>
								</c:if>


						</select></td>

					</tr>
				</c:forEach>
			</c:forEach>

		</table>
		<input type="submit" value="Update Attendance">
	</form>

</body>
</html>