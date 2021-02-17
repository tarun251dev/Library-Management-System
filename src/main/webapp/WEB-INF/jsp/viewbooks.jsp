<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Book</h2>


	         <table  border="1" cellpadding="5">
            <thead>
               <tr class="text-center">
                  <th> Book ID</th>
                  <th>Name</th>
                  <th>Author </th>
                  <th>Publisher</th>
                  <th>Quantity</th>
                  
               </tr>
            </thead>
             <c:forEach items="${lists}" var="list" varStatus="ctr">
           
               <tr>
                  <td>${list.book_id}</td>
                  <td>${list.name}</td>
                  <td>${list.author}</td>
                  <td>${list.publisher}</td>
                  <td>
                     ${list.quantity}
                  </td>
                  
                                </tr>
            </c:forEach>
         </table>

</body>
</html>