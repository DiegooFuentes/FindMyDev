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
<link rel="stylesheet" type="text/css" href="/css/styleRegistro.css">
<title>Registro</title>
</head>

<body>
	<div class="container-fluid">
		<div class="row">

			<div class="col uno">
			
				<div class="form">
					<img src="/img/logo-removebg-preview.png" alt="" width=100px>

					<form action="/account/registro" method="post">
						<input type="email" id="correo" name="correo" placeholder="Email"
							class="form-control" required="required"> <input
							type="password" id="password" name="password"
							placeholder="Contraseña" class="form-control" required="required">

						<input type="password" class="form-control" id="password2"
							name="password2" placeholder="Confirma tu contraseña"
							required="required">

						<!--Radio button -->

						<aside class="checkbox-list">
							<!-- label -->
							<label class="check-item"> <input value="1" type="radio" name="rol" />
								<span>Postulante</span>
							</label>

							<!-- label -->
							<label class="check-item"> <input value="2" type="radio" name="rol" />
								<span>Reclutador</span>
							</label>
						</aside>

						<button type="submit" style="font-weight: bold;">Registrate</button>
						<p class="message">
							¿Ya tienes cuenta? <a href="/account/login" type="submit"
								role="button">Ingresa aqui</a>
						</p>
						<br>
					</form>
				</div>

			</div>

			<div class="col dos">
				<div class="form2">
				
				<c:if test="${msgError!=null}">
				<div class="alert alert-danger" role="alert">
					<!-- c:out imprime el contenido de la variable -->
					<c:out value="${msgError}"></c:out>
				</div>
			</c:if>
					<img src="/img/color1.png" alt="" width=300px>

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