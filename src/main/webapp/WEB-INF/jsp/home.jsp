<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@ include file="importVari.jsp"%>
</head>
<body>
	<div class="container">
	
		<nav class="navbar navbar-default">
			<div class="container-fluid">
			  <div class="navbar-header">
			    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
			      <span class="sr-only">Toggle navigation</span>
			      <span class="icon-bar"></span>
			      <span class="icon-bar"></span>
			      <span class="icon-bar"></span>
			    </button>
			    <a class="navbar-brand" href="#">Sponge</a>
			  </div>
			  <div id="navbar" class="navbar-collapse collapse">
			    <ul class="nav navbar-nav">
			      <li class="active"><a href="#">Home</a></li>
			      <li><a href="#">About</a></li>
			      <li><a href="#">Contact</a></li>
			    </ul>
			    <ul class="nav navbar-nav navbar-right">
			      <li>
			      	<a href="logout">Log out</a>
			      </li>
			    </ul>
			  </div><!--/.nav-collapse -->
		    </div><!--/.container-fluid -->
		</nav>
	
		<div class="row">
			<div class="col-md-6">
				<form action="/RestServer/caricafoto" enctype="multipart/form-data" method="POST">
					<div class="form-group">
						<input type="text" class="form-control" name="descrizioneFoto"/>
					</div>
					<div class="form-group">
						<input type="file" accept="image/jpeg" class="form-control" name="photoToUpload"/>
					</div>
					<button class="btn btn-lg btn-primary btn-block" type="submit" id="btnFormInput">Save</button>		
				</form>
			</div>
		</div>
	
	</div>
</body>
</html>