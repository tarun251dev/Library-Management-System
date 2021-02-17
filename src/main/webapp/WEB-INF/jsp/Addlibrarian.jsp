<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>

body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: black;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password], input[type=email] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>

</head>
<body>

<jsp:include page="navbar.jsp"></jsp:include>  

<form action="/Addlibdata" method="post">
<div class="container">
  <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
    
 <label><b>Name</b></label>
 <input type="text" placeholder="Enter Name" name="name"/>
 
  <label><b>Password</b></label>
 <input type="password" placeholder="Enter Password" name="password"/>
 
  
   <label><b>Email</b></label>
  <input type="email" placeholder="Enter Email" name="email"/>
  
   <label><b>Address</b></label>
 <input type="text" placeholder="Address" name="address"/>
 
   <label><b>City</b></label>
 <input type="text" placeholder="Enter City" name="city"/>
 
  <label><b>Contact No.</b></label>
 <input type="text" placeholder="Enter mobile number" name="contact"/>
 
  <label ><b>Select:</b></label><br>
  <input type="radio"  name="flag" value="admin">
<label for="male">Admin</label><br>
<input type="radio" name="flag" value="user">
 <label for="male">User</label>
 
     <button type="submit" class="registerbtn">Register</button>
   </div>
   
   <div class="container signin">
    <p>Already have an account? <a href="/welcome">Sign in</a>.</p>
  </div>
   


</form>  

</body>
</html>