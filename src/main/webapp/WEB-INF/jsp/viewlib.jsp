<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table {
  border-collapse: collapse;
  width: 100%;
}
th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {background-color: #f2f2f2;}
</style>
</head>
<body align="center">

<h2>Librarian</h2>
<div style="overflow-x:auto;">


	         <table align="center" border="1" cellpadding="5">
            <thead>
               <tr class="text-center">
                  <th> ID</th>
                  <th>Name</th>
                  <th>Password </th>
                  <th>email</th>
                  <th>Address</th>
                  <th>City</th>
                   <th>Contact</th>
                   <th>Type</th>
                 
               </tr>
            </thead>
             <c:forEach items="${lists}" var="list" varStatus="ctr">
           
               <tr>
                  <td>${list.adminid}</td>
                  <td>${list.name}</td>
                  <td>${list.password}</td>
                  <td>${list.email}</td>
                  <td>
                     ${list.address}
                  </td>
                   <td>${list.city}</td>
                  <td>${list.contact}</td>
                  <td>${list.flag}</td>
                 
                 </tr>
            </c:forEach>
         </table>
</div>
   </body>
</html>