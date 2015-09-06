<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Assignment Project</title>

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-theme.min.css">

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>

<link rel="stylesheet" href="css/modal.css">

</head>
<body>

	<div class="container">
		<form action="submit" method="post" id="submitForm">
			<div class="form-group">
				<label for="first_name">First Name</label> <input type="text"
					class="form-control" id="firstName" name="firstName"
					placeholder="First Name">
			</div>
			<div class="form-group">
				<label for="last_name">Last Name</label> <input type="text"
					class="form-control" id="lastName" name="lastName"
					placeholder="Last Name">
			</div>
			<div class="form-group">
				<label for="phone_number">Phone Number</label> <input type="text"
					class="form-control" id="phoneNumber" name="phoneNumber"
					placeholder="9876543210">
			</div>
			<div class="form-group">
				<label for="address">Address</label> <input type="text"
					class="form-control" id="address" name="address"
					placeholder="Address">
			</div>
			<div>
				<button type="submit" class="btn btn-primary" id="submitBtn"
					name="submitBtn" value="submit">Submit</button>
			</div>
		</form>
	</div>

	<!-- modal dialog for recognized users -->
	<div id="recognized" class="modalDialog">
		<div>
			<h1>Welcome</h1>
			<hr>
			<a href="#close" title="Close" class="close">x</a> <br />
			<p style="font-size: 20px">
				Welcome to the site! <br />
			</p>
		</div>
	</div>

	<!-- modal dialog for not-recognized users -->
	<div id="not-recognized" class="modalDialog">
		<div>
			<h1>Not Recognized</h1>
			<hr>
			<a href="#close" title="Close" class="close">x</a> <br />
			<p style="font-size: 20px">
				Sorry, we don't recognize you! <br />
			</p>
		</div>
	</div>

</body>
</html>