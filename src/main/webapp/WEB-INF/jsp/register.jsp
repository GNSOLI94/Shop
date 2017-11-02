<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="resources/css/bootstrap.min.css">
	<link href="resources/css/MyCustomCSS.css" rel="stylesheet" type="text/css" />
	<!-- jQuery library -->
	<script href="resources/css/jquery.min.js"></script>
	<!-- Latest compiled JavaScript -->
	<script href="resources/css/bootstrap.min.js"></script>
	<title>Sponge</title>
</head>
<body>
	<div class="container">
		<div class="form-register">
			<h1 class="titleFormLogin">Sign in</h1>
			<hr>
			<div>
				<h5 style="font-style: oblique;">All the field are obligatory *</h5>
			</div>
			<form:form action="/RestServer/registerUser" method="post" id="loginForm">
				<div>
					<h5>Email: *</h5>
					<input type="text" class="form-control" placeholder="Email" id="formInput" autocomplete="on" name="email"/>
				</div>
				<div class="blockRegister">
					<h5>Password: *</h5>
					<input type="password" class="form-control" placeholder="Password" id="formInput" name="pwd" style="margin-top: 10px"/>
				</div>
				<div class="blockRegister">
					<h5>Name: *</h5>
					<input type="text" class="form-control" placeholder="Name" id="formInput" autocomplete="on" name="nome"/>
				</div>
				<div class="blockRegister">
					<h5>Surname: *</h5>
					<input type="text" class="form-control" placeholder="Surname" id="formInput" autocomplete="on" name="cognome"/>
				</div>
				<button class="btn btn-lg btn-primary btn-block" type="submit" id="btnFormInput">register</button>
			</form:form>
			<div class="titleFormLogin">
				<h5><a href="/RestServer/login"> Go to login </a> </h5>
			</div>
			<hr>
		</div>
	</div>
</body>
</html>
	
	
		
	
