<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Student</title>
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
			<h1>New Student</h1>
			<form action="/students/create" method="get" class="col">
			    <div class="form-group my-2">
			        <label for="firstName" class="form-label">First Name</label>
			    </div>
			    <div class="form-group my-2">    
			        <input type= "text" name="firstName" class="form-control"/>
			    </div>
			    <div class="form-group my-2">
			        <label for="lastName" class="form-label">Last Name</label>
			    </div>
			    
			    <div class="form-group my-2">
			        <input type="text" name="lastName" class="form-control"/>
			    </div>
			    
			    <div class="form-group my-2">
			        <label for="age" class="form-label">Age</label>
			    </div>
			    
			    <div class="form-group my-2">
			        <input type="number" name="age" class="form-control"/>
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