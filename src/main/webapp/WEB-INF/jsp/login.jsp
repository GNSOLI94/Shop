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
	<script scr="jquery-1.12.2.min.js"></script>
	<!-- Latest compiled JavaScript -->
	<script href="resources/css/bootstrap.min.js"></script>
	<title>Sponge</title>
	
	<script type="text/javascript">
// 		function controlMail() {
// 			var str = document.getElementById("formEmail").value;
// 			if(str.length < 5)
// 				$("#formEmail").css("border-color","red");
// 		}
	
	</script>
	
</head>
<body>
	<div class="container">
		<div class="form-signin">
			<h1 class="titleFormLogin">Welcome</h1>
			<hr>
			<form:form action="/RestServer/loginForm" method="post" id="loginForm">
				<input type="text" class="form-control" placeholder="Username" id="formEmail" autocomplete="on" onchange="controlMail()" name="email"/>
				<input type="password" class="form-control" placeholder="Password" id="formPsw" name="pwd" style="margin-top: 10px"/>
				<button class="btn btn-lg btn-primary btn-block" type="submit" id="btnFormInput">Login</button>
			</form:form>
			<h4 class="titleFormLogin">or</h4>
			<div class="titleFormLogin">
				<h5><a href="/RestServer/register"> Register here </a> </h5>
			</div>
			<hr>
		</div>
	</div>
</body>
</html>
	
	
		
	
