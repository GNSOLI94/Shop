<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link href="resources/MyCustomCSS.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<h1>Ciao!!!</h1>
	<form:form action="loginForm" method="post" id="loginForm" commandName="nick">
		<input type="text"  class="loginEditText" name="nick"/>
		<input type="submit" class="loginButton" value="CIAO" />
	</form:form>
</body>
</html>
