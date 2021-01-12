<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body bgcolor="#F0FFFF">
<form action="/register/student" name="StudentRegistration" onsubmit="return validate();" method="POST">

<table cellpadding="2" width="0%"  align="center"
cellspacing="2">

<tr>
<td colspan=2>
<center><font size=4><b>Student Registration Form</b></font></center> <br>
</td>
</tr>

<tr>
<td>Student Name</td>
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
<td><select name="course">
<option value="-1" selected>select..</option>
<option value="B.Tech">B.TECH</option>
<option value="MCA">MCA</option>
<option value="MBA">MBA</option>
<option value="BCA">BCA</option>
</select></td>
</tr>

<tr>
<td>Section</td>
<td><select name="section">
<option value="-1" selected>select..</option>
<option value="A">A</option>
<option value="B">B</option>
<option value="C">C</option>
<option value="D">D</option>
</select></td>

</tr>

<tr>
<td></td>
<td colspan="2"><br><input type="reset"> <input type="submit" value="Submit Form" /></td>
</tr> 
</table>
</form>
<script >
function validate()
{ 
	
  
   if( document.StudentRegistration.name.value == "" )
   {
     alert( "Please provide username!" );
     document.StudentRegistration.name.focus() ;
     return false;
   }
   if( document.StudentRegistration.password.value == "" )
   {
     alert( "Please provide password!" );
     document.StudentRegistration.password.focus() ;
     return false;
   }
  	
  	 
   
   if ( ( StudentRegistration.gender[0].checked == false ) && ( StudentRegistration.gender[1].checked == false ) )
   {
   alert ( "Please choose your Gender: Male or Female" );
   return false;
   }   
     
   if( document.StudentRegistration.course.value == "-1" )
   {
     alert( "Please provide your Course!" );
    
     return false;
   }   
   if( document.StudentRegistration.section.value == "-1" )
   {
     alert( "Please provide your Select Section!" );
    
     return false;
   }   
  
  
 var email = document.StudentRegistration.emailid.value;
  atpos = email.indexOf("@");
  dotpos = email.lastIndexOf(".");
 if (email == "" || atpos < 1 || ( dotpos - atpos < 2 )) 
 {
     alert("Please enter correct email ID")
     document.StudentRegistration.emailid.focus() ;
     return false;
 }
 
  
   return true ;
}
</script> 
</body>
</html>