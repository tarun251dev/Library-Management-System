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

<form action="/deletelibsuccess" method="post">
<h2 align="center">Delete Student</h2>

<label>Enter Student ID:</label><br>

<input type="text"  placeholder="Enter name" name="delid"/><br><br>

 <button type="submit" class="btn btn-primary"value="login">Submit</button><br><br>



<a href="/adminsection">Back</a>

</form>

</body>
</html>