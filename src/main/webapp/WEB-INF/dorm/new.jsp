<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dormitory</title>
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
          </ul>
        </div>
      </div>
    </nav>
    <section class="py-5"></section>
<section>
	<div class="container">
		<div class="col-lg-6 offset-lg-3">
		<h1 class="text-center">Dormitories</h1>
			<form action="/dorms/create" method="get" class="col">
			    
			    <div class="form-group my-2">
			        <label for="name" class="form-label">Name</label>
			    </div>
			
				<div class="form-group my-2">
			        <input type="text" name="name" class="form-control"/>
			    </div>
			    
			    <div class="text-center">    
			    	<input class="btn btn-primary text-center my-2" type="submit" value="Submit"/>
			    </div>
			</form>
		</div>
	</div>
</section>
</body>
</html>