<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style type="text/css">
body {
    margin:50px 0px; padding:0px;
    text-align:center;
    align:center;
}


form {
    display: inline-block;
    padding : 5px;
      border-style: solid;
    
}

    </style>
</head>
<body align="center">
<jsp:include page="navbar.jsp"></jsp:include>  

<h2> Login Form</h2>

<form action="/login" method="post">  


    <label >Enter Name:</label>
    <input type="text" class="form-control" name="uname" placeholder="Enter name">
        <small class="form-text text-muted">We'll never share your email with anyone else.</small><br>
    
    
  
    <label >Password</label>
    <input type="password" class="form-control" name="password" placeholder="Password">
  
  

      <label >Select:</label><br>
  <input type="radio" id="admin" name="flag" value="admin">
<label for="male">Admin</label><br>
<input type="radio" id="user" name="flag" value="user">
<label for="female"> Librarian</label><br>
  
 
    
  <button type="submit" class="btn btn-primary"value="login">Submit</button>
</form>

</body>
</html>