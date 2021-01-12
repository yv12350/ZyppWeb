<html>
<head>
<title>Student Dashboard</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div>
		<div class="container" style="margin: 50px">
			<div class="row text-center">
				<strong style="font-size: 40px; color:LightSeaGreen;"> Welcome Student</strong>
			</div>
			<br>
			<div class="row text-center">
				<p style="font-size: large;">
					<a href="javascript:hideUnhide();"> <strong>Click
							here</strong></a> to view your attendance.
				</p>
			</div>
			<div id="hiddenForm" hidden="hidden" class="row text-center">
				<div class="row text-center">
				<p style="font-size: large; color:red;">
					Please Select The Date For Which You Want To View The Attendance
				</p>
			</div>
				<form id="searchForm" action="/student/dashboard/viewAttendance"
					method="GET">
				
					<input type="date" id="start" name="searchDate" value="07-22-2018"
						min="07-22-2018"> <input type="submit" id="searchButton"
						value="Search">
						<input type="hidden" id="studentid" name="studentid" value="${studentid}">

				</form>
				
			</div>

		</div>
	</div>
	<script>
		function hideUnhide(){
			$("#hiddenForm").show();
		}
	</script>

</body>
</html>