<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>


<title>registration</title>
</head>
	<body>

		<form action = "addNewUser" method="POST">
		  <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Name</label>
		    <input type="text" name="name" class="form-control" id="examplename" aria-describedby="emailHelp">
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputPassword1" class="form-label">City</label>
		    <input type="text" name="city" class="form-control" id="examplecity">
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputPassword1" class="form-label">Mobile No.</label>
		    <input type="text" name="mobNo" class="form-control" id="examplecity">
		  </div>
		  
		  <button type="submit"  class="btn btn-primary">Submit</button>
		</form>

	</body>
</html>