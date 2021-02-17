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
  .center {
  margin: auto;
  width: 60%;
  padding: 10px;
   text-align: center;
  border: 3px solid green;
  }
  . center a{ background-color: black;
  color: white;
  }

</style>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>  

<div class="center">
<h1>Admin Section</h1>
<a href="/viewLibrarian" class="a">View Librarian</a><br><br>
<a href="/deletelib" class="a">Delete Librarian</a><br><br>
<a href="/welcome" class="a">Logout</a>
</div>
</body>
</html>