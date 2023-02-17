
<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 style="color: red; text-align: center">Employees Record</h1>
<c:choose>
	<c:when test="${!empty empsData}">
		<table border="1" bgcolor="cyan" align="center">
			<tr>
				<th>EmpNo</th>
				<th>EmpName</th>
				<th>Job</th>
				<th>salary</th>
				<th>Operations</th>
			</tr>

			<c:forEach var="emp" items="${empsData}">
				<tr>
					<td>${emp.eno}</td>
					<td>${emp.ename}</td>
					<td>${emp.job}</td>
					<td>${emp.salary}</td>
					<td><a href="edit?eno=${emp.eno}">edit<img
							src="images/edit1.png" width="50" height="50" /></a>&nbsp;&nbsp;&nbsp;

						 <a  onclick="return confirm('Do You want to delete')" href="delete?eno=${emp.eno}">delete<img src="images/delete.jpg"  width="50" height="50"/></a></td>
				</tr>

			</c:forEach>
		</table>

	</c:when>
	<c:otherwise>
		<h1 style="text-align: center">Records Not Found</h1>
</c:otherwise>
</c:choose>

<c:if test="${!empty resultMsg}">
	<h3 style="color: green; text-align: center">${resultMsg}</h3>
</c:if>

<br>
<br>
<hr>
<h1 style="text-align: center"><a href="./"><img src="images/Home.jpg" />Home</a></h1>
<hr>
<h1 style="text-align: center"><a href="add"><img src="images/add.jfif" width="100" height="70" />
		</a></h1>
		<h1 style="text-align: center"><a href="add">Add Employee</a></h1>
		
		
		
		