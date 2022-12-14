<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link href="css/bootstrap.min.css" rel="stylesheet"
	crossorigin="anonymous" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<!--ANIMATE CSS-->
<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
<!--iconos fontawesome-->
<script src="https://kit.fontawesome.com/3ad8b80676.js" type="text/css"
	crossorigin="anonymous"></script>
<title>index FindMyDev</title>
</head>
<body>
	<!-- Navbar-->
	<!-- Navbar -->
	<nav class="navbar bg-light ">
		<div class="container-fluid ">
			<img src="/img/logo-removebg-preview.png" alt="Logo"
				width="200" height="60">
		</div>
		<form class="container-fluid justify-content-end">
			<button class="btn btn-sm btn-outline-secondary" type="button">Smaller
				button</button>
			<button class="btn btn-sm btn-outline-secondary" type="button">Smaller
				button</button>
		</form>
	</nav>

	<!-- Navbar -->
	<!-- se realiza diseño de index-->
	<!--container general-->
	<section class="container-fluid">
		<div class="row mt-5 ">
			<div class="col-md-8 dos  mx-auto ">
				<div class="card  mb-3 card-menu">
					<div class="card-header">
						<img src="/img/puntos.png" alt="" width="200px" />
					</div>
					<div class="card-body">
						<h2 class="card-title text-center">
							<strong>BIENVENIDOS A NUESTRA WEB</strong>
						</h2>
						<p class="card-text">En FindMyDev nos preocupamos no solo de
							que puedas darte a conocer si no tambien logramos la diferencia .
							Una aplicacion donde tus habilidades blandas y porsupuesto tus
							habilidades tecnicas se encontraran a la vista del reclutador o
							empresas y de esta manera puedan llegar a ti y conocerte mas
							alla... Demuestra todo de ti en tu perfil de Cv donde podras
							incorporar tus datos y dar muestra de tus proyectos</p>
					</div>
				</div>
			</div>
		</div>
		<!-- inicio de seccion de cartas postulantes y recluter-->
		<div class="row justify-content-around">
			<div class="col-md-4  ">
				<div class="card mb-3 border-info text-center tarjeta2">
					<div class=" card-header-2  ">
						<img src="/img/clipazul-removebg-preview.png" alt=""
							width="50px"> <br>
						<h3>
							<strong>Postulantes</strong>
						</h3>
					</div>
					<div class="card-body">
						<h5 class="card-title">Date a conocer & Demuestra todos tus
							talentos y Habilidades</h5>
					</div>
					<img src="/img/svg/postulantes.svg" alt="" width="100%"
						height="300px">
					<div class="card-body">
						<p class="card-text">quieres tener un espacio donde puedas
							mostrar tus trabajos tus fortalezas y aptitudes y ademas que te
							puedan destacar por estas ... pues estas en el lugar perfecto en
							FindMyDev nos concentramos en darte a conocer de una manera
							ordenada y llamativa donde aparte de tus conocimientos destacaran
							tus habilidades .</p>
					</div>
					<div class="card-body">
						<!--<button href="/account/login" class="btn btn-lg btn-primary btn-2" >INGRESA</button>  -->
						<a href="/account/login" type="submit" role="button" class="btn btn-lg btn-primary btn-2">INGRESA</a>
					</div>
				</div>
			</div>

			<!--segunda card-->
			<div class="col-md-4 text-center  ">
				<div class="card mb-3 cartas tarjeta2 ">
					<div class="card-header-2  ">
						<img src="/img/clipazul-removebg-preview.png" alt=""
							width="50px"> <br>
						<h3>
							<strong>Reclutadores</strong>
						</h3>
					</div>
					<div class="card-body">
						<h5 class="card-title">Encuentra a tu candidato Ideal</h5>
					</div>
					<img src="/img/svg/reclutador3.svg" alt="" width="100%"
						height="300px">
					<div class="card-body">
						<p class="card-text">Eres distinto no solo quieres presentar a
							alguien que tenga el conocimiento si no que te interesan las
							personas y la calidad humana que encuentras detras de eso .... en
							FindMyDev te ayudamos a encontrar el potencial que estas buscando
							para tu equipo de trabajo podras filtrar al candidato ideal
							basando en sus aptitudes y fortalezas donde destacan sus
							habilidades blandas</p>
					</div>
					<div class="card-body">
						<!--<button href="/account/registro" class="btn btn-lg btn-primary btn-2" type="button">INGRESA</button>  -->
						<a href="/account/login" type="submit" role="button" class="btn btn-lg btn-primary btn-2">INGRESA</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- fin de seccion de cartas postulantes y recluter-->

	<!-- Inicio de iconos seccion-->

	<section class="alert alert-dismissible alert-light main ">


		<div class="row d-flex justify-content-center">

			<div class="col-md-3">
				<img src="/img/svg/cvmonitoH.svg" alt="" width="100%">
			</div>
			<div class="col-md-3">
				<figure class="text-center">
					<blockquote class="blockquote">
						<h4 class="mt-4">
							<strong>Tu presentacion en Linea de una forma atractiva
								y modificable en el tiempo donde lo que importa eres Tu .</strong>
						</h4>
					</blockquote>
					<figcaption class="blockquote-footer nota">
						creado con amor <cite title="Source Title">Equipo FindMyDev</cite>
					</figcaption>
				</figure>
			</div>
			<div class="col-md-3">
				<img src="/img/svg/cvmonitoM.svg" alt="" width="100%">
			</div>
		</div>
	</section>

	<!-- Iconos seccion -->
	<div class="container-fluid" id="icon-section">
		<div class="row justify-content-evenly ">
			<div class="col-md-3 text-center">
				<i class="fas fa-thumbs-up fa-10x icon"></i>
				<hr>
				<h4>Califica Tus Habilidades</h4>
			</div>
			<div class="col-md-3 icon text-center">
				<i class="fas fa-user-tie fa-10x"></i>
				<hr>
				<h4>Presentate de Manera Atractiva</h4>
			</div>
			<div class="col-md-3 text-center">
				<i class="fas fa-search fa-10x icon"></i>
				<hr>
				<h4>Encuentra a Tu dev Ideal</h4>
			</div>
		</div>
	</div>

	</div>
	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>