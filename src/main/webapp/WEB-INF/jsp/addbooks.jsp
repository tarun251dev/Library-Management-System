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
</style>

</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>  


<form action="/addbookdata" method="post">
<div class="container">
  <h1>Add Book</h1>
    <p>Please fill in this form to add book.</p>
    <hr>

 <label><b> Name:</b></label>
 <input type="text" placeholder="Enter Name" name="name"/><br/>
 
  <label><b> Book ID:</b></label>
 <input type="text" placeholder="Enter Book ID" name="book_id"/><br/>
  
  <label><b> Author:</b></label>
 <input type="text" placeholder="Enter Author Name" name="author"/><br/>
 
 <label><b>Publisher:</b></label>
<input type="text" placeholder="Enter Publisher Name" name="publisher"/><br/>

 <label><b>Quantity:</b></label>
<input type="text" placeholder="How many books?" name="quantity"/><br/> 
 
     <button type="submit" class="registerbtn">Register</button>
 </div>
 
 </form>
</body>
</html>