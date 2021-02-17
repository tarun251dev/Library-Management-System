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
<body>

<h2 align="center">Issue Book List</h2>
<div style="overflow-x:auto;">


	         <table align="center" border="1" cellpadding="5">
            <thead>
               <tr class="text-center">
                  <th> Book ID</th>
                  <th>Student Id</th>
                  <th>Student Name </th>
                  <th>Contact</th>
                 <th>Issue Date</th>
                <th>Return Date</th>
                 <th>Period</th>
                  
               </tr>
            </thead>
             <c:forEach items="${lists}" var="list" varStatus="ctr">
           
               <tr>
                  <td>${list.book_id}</td>
                  <td>${list.student_id}</td>
                  <td>${list.student_name}</td>
                  <td>${list.contact}</td>
                   <td>${list.issue_date}</td>
                   <td>${list.return_date}</td>
                  <td>${list.period}</td>
                  
                                </tr>
            </c:forEach>
         </table>

</div>
</body>
</html>