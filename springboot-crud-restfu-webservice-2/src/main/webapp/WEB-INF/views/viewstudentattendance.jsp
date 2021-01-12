
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
</head>
<h2>Attendance Table</h2>

table {
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
	
	
	<table style="margin-left:auto;margin-right:auto;">
		<tr>
			<th>Student Name</th>
			<th>Math</th>
			<th>Computer</th>
			<th>Chemistry</th>
			<th>Physics</th>
		</tr>


		
			<tr>
				<td>${studentName}</td>
				<td>${attendance.math} </td>
				<td>${attendance.computer}</td>
				<td>${attendance.chemistry}</td>
				<td>${attendance.physics}</td>
			</tr>
		
	</table>

</body>
</html>