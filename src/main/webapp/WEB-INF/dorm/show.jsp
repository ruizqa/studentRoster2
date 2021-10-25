<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

    <nav class="navbar navbar-expand-lg bg-dark navbar-dark py-3 fixed-top">
      <div class="container">
        <a href="#" class="navbar-brand">Student Roster II</a>

        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navmenu"
        >
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navmenu">
          <ul class="navbar-nav ms-auto">
            <li class="nav-item">
              <a href="/students/new" class="nav-link">New Student</a>
            </li>
            <li class="nav-item">
              <a href="/dorms/new" class="nav-link">New Dormitory</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

<section class="py-5"></section>
<section>
	<div class="container">
		<div class="col-lg-6 offset-lg-3">
			<h1 class="text-center"><c:out value="${dorm.name}"/> Dormitory </h1>
			<form method ="get" action="/dorms/${dorm.id}/add">
				<div class="form-group my-2">
			        <select name="studentID">
					    <c:forEach var="student" items="${students}" >
					        <option value="${student.id}" label="${student.firstName} ${student.lastName}"/>
					    </c:forEach>
					</select>	
			    </div>
			    <div class="form-group my-2">
			    	<input type="submit" value ="Add">
			    </div>
			</form>
			<table class="table table-hover table-striped text-center">
				<thead class="table-dark">
					<tr>
						<td>Name</td>
						<td>Action</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${dorm.students}" var="student">
						<tr>
							<td><c:out value="${student.firstName} ${student.lastName}"/></td>
					        <td><a href="/dorms/${dorm.id}/remove?student=${student.id}">Remove</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</section>
</body>
</html>