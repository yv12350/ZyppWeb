<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
</head>
<body bgcolor="#FFFACD">
<form name="loginForm" method="post" action="login/Teacher">
<table width="20%" align="center">

<tr>
<td colspan=2><center><font size=4><b>Welcome to Teacher Login</b></font></center><br></td>
</tr>

<tr>
<td>Email Id:</td>
<td><input type="text" size=25 name="username"></td>
</tr>

<tr>
<td>Password:</td>
<td><input type="Password" size=25 name="password"></td>
</tr>

<tr>
<td > <br></td>
<td><input type="Reset"> <input type="submit" onclick="return check(this.form)" value="Login"></td>
</tr>

</table>
</form>
<script >
function check(form)
{

if(form.username.value == "" || form.password.value == "")
{

	alert("Please Input Both Username and Password");
	return false;

}}
</script>

</body>
</html>