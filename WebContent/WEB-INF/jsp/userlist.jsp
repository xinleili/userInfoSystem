<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>ssm</title>
<style type="text/css">
td{
   text-align: center;
   width: 100px;
}
</style>
</head>
<body>
  <div align="right">
      Welcome,[<font color=red>${sessionScope.user.username}</font>] | 
      <a href="loginout">Exit</a>
  </div>
  <br>
    <center>
      <table border="1">
        <tbody>
          <tr>
              <th>id</th>
              <th>username</th>
              <th>password</th>
              <th>sex</th>
              <th>age</th>
              <th colspan="2" style="">Options</th>
          </tr>
          <c:if test="${!empty listUser }">
            <c:forEach items="${listUser}" var="user">
              <tr>   
                 <td>${user.id}</td>
                 <td>${user.username}</td>
                 <td>${user.password}</td>
                 <td>${user.sex}</td>
                 <td>${user.age}</td>
                 <td>${user.id}</td>
                 <td><a href="toupdateuser?id=${user.id}">modify</a></td>
                 <td><a href="deleteuser?id=${user.id}">delete</a></td>
              </tr>
             </c:forEach>
           </c:if>
           </tbody>
           </table>
           <br>
            <a href="toadduser">Add a new user</a>
         </center>         
</body>
</html>