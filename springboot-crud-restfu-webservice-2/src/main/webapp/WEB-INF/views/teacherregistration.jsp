<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body  bgcolor="#F0FFFF">
<form action="/register/teacher" name="TeacherRegistration" onsubmit="return validate();" method="POST">

<table cellpadding="2" width="20%" align="center"
cellspacing="2">

<tr>
<td colspan=2>
<center><font size=4><b>Teacher Registration Form</b></font></center> <br>
</td>

</tr>

<tr>
<td>Teacher Name</td>
<td><input type=text name="name" id="name" size="30"></td>
</tr>
<tr>
<td>EmailId</td>
<td><input type="text" name="emailid" id="emailid" size="30"></td>
</tr>
<tr>
<td>Password</td>
<td><input type=password name="password" id="password" size="30"></td>
</tr>
<tr>
<td>Gender</td>
<td><input type="radio" name="gender" value="male" size="10">Male
<input type="radio" name="gender" value="Female" size="10">Female</td>
</tr>

<tr>
<td>Course</td>
<td><select name="Course">
<option value="-1" selected>select..</option>
<option value="B.Tech">B.TECH</option>
<option value="MCA">MCA</option>
<option value="MBA">MBA</option>
<option value="BCA">BCA</option>
</select></td>
</tr>

<td><br></td>
<td colspan="2"> <input type="reset"> <input type="submit" value="Submit Form" /></td>
</tr>
</table>
</form>
<script >
function validate()
{ 
   
   if( document.TeacherRegistration.name.value == "" )
   {
     alert( "Please provide username!" );
     document.TeacherRegistration.name.focus() ;
     return false;
   }
   if( document.TeacherRegistration.password.value == "" )
   {
     alert( "Please provide password!" );
     document.StudentRegistration.password.focus() ;
     return false;
   }
  	
  
   
   if ( ( TeacherRegistration.gender[0].checked == false ) && ( TeacherRegistration.gender[1].checked == false ) )
   {
   alert ( "Please choose your Gender: Male or Female" );
   return false;
   }   
 
   if( document.TeacherRegistration.course.value == "-1" )
   {
     alert( "Please provide your Course!" );
    
     return false;
   }   
  
 
 var email = document.TeacherRegistration.emailid.value;
  atpos = email.indexOf("@");
  dotpos = email.lastIndexOf(".");
 if (email == "" || atpos < 1 || ( dotpos - atpos < 2 )) 
 {
     alert("Please enter correct email ID")
     document.TeacherRegistration.emailid.focus() ;
     return false;
 }
 
 

   return( true );
}
</script> 
</body>
</html>