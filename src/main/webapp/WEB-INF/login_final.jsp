<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--Bootstrap-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<!--ruta estilo css-->
<link rel="stylesheet" type="text/css" href="/css/styleLogin.css">
<title>Login</title>
</head>

<body>
	<div class="container-fluid">
		<div class="row">
			
			<div class="col uno">
				<div class="form">
					<img src="/img/logo-removebg-preview.png" alt="" width=270px>
					<c:if test="${msgError!=null}">
				<div class="alert alert-danger" role="alert">
					<c:out value="${msgError}"></c:out>
				</div>
			</c:if>

					<form action="/account/login" method="post">
						<input type="email" id="correo" name="correo" placeholder="Email"
							class="form-control" required="required"> <input
							type="password" id="password" name="password"
							placeholder="Contraseña" class="form-control" required="required">

						<button type="submit" style="font-weight: bold;">Inicia
							Sesión</button>
						<p class="message">
							¿No tienes cuenta? <a href="/account/registro" type="submit"
								role="button">Registrate aqui</a>
						</p>
						<br>
					</form>
				</div>

			</div>

			<div class="col dos">
				<div class="form2">
					<img src="/img/color1.png" alt="" width=300px">
				</div>

			</div>

		</div>

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
		crossorigin="anonymous"></script>
</body>

</html>