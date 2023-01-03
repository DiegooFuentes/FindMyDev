<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<!--CSS De NAvbar-->
<!--Boostrap-->
<link rel="stylesheet" href="/assets/css/nav.css" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css" />
<link rel="stylesheet" href="/assets/css/bootstrap.min.css" />
<!-- GoogleFont-->
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Nunito:wght@200;400;700;900&display=swap"
	rel="stylesheet" />

<!-- Cierre Css de Nav------------>
<!-- Inicio clases para main Home -->
<link rel="stylesheet" href="/assets/css/home.css" />

<!------->
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css" />
<link
	href="https://cdn.jsdelivr.net/npm/select2@4.1.0-beta.1/dist/css/select2.min.css"
	rel="stylesheet" />

<title>FindDevs</title>
</head>
<body>
	<div id="body-pd">
		<header class="header" id="header">
			<div class="header_toggle">
				<i class="bx bx-menu" id="header-toggle"></i>
			</div>
			<div class="header_img">
				<svg xmlns="http://www.w3.org/2000/svg" width="25" height="25"
					fill="currentColor" class="bi bi-person" viewBox="0 0 16 16">
            <path
						d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z" />
          </svg>
			</div>
		</header>
		<div class="l-navbar" id="nav-bar"
		style="padding-left: 7px; padding-right: 0px;">
		<nav class="nav navbar-container">
			<div class="row header-nav " id="usuario">

				<div class="col-md-6 foto-avatar">

					<img class="imgg" href="" src="/assets/img/fotos/mujer.png"
						width="5px" alt="img-resposive" />

				</div>


				<div class="col-md-5 container-nav info1">
					<h3 id="bienvenidatext">Hola!</h3>
					<p class="nombre-nav">Maria luz</p>



				</div>
			</div>
			<div class="row item_list">
				<div class="nav_list">
					<a href="/home/miperfil" class="nav_link active"> <i
						class='bx bx-grid-alt nav_icon'></i> <span class="nav_name">Mi
							Perfil</span>
					</a> <a href="#" class="nav_link"> <i class='bx bx-user nav_icon'></i>
						<span class="nav_name">Mis candidatos</span>
					</a> <a href="/home" class="nav_link"> <i
						class='bx bx-bookmark nav_icon'></i> <span class="nav_name">FindDevs</span>
					</a>


				</div>
			</div>
			<a href="#" class="nav_link"> <i class='bx bx-log-out nav_icon'></i>
				<span class="nav_name">Cerrar sesión</span>
			</a>
		</nav>
	</div>
		<!--Container Main start-->
		<div class="bg-light">
			<div class="container-fluid">
				<div class="row main-central">
					<div class="col-12">

						<h2 class="text-buscador ">BUSCADOR ....</h2>

					</div>
				</div>
				<div class="row container-filtros mx-auto">
					<div class="col-md-3">
						<button type="button" class="btn-filtro mr-2 modal-btn"
							data-toggle="modal" title="checkboxes" data-target="#modal-id">
							<i class="mdi mdi-access-point"><span
								class="inverter-btn-sm"> Habilidades Blandas</span></i>
						</button>
					</div>
					<!--btn 2-->
					<div class="col-md-3">
						<button type="button" class="btn-filtro mr-2 modal-btn"
							data-toggle="modal" title="checkboxes" data-target="#modal-id">
							<i class="mdi mdi-access-point"><span
								class="inverter-btn-sm"> Habilidades Tecnicas</span></i>
						</button>
					</div>
					<!--Btn 3-->
					<div class="col-md-3">
						<button type="button" class="btn-filtro mr-2 modal-btn"
							data-toggle="modal" title="checkboxes" data-target="#modal-id">
							<i class="mdi mdi-access-point"><span
								class="inverter-btn-sm"> sexo</span></i>
						</button>
					</div>
					<!--Btn-4-->
					<div class="col-md-3">
						<button type="button" class="btn-filtro mr-2 modal-btn"
							data-toggle="modal" title="checkboxes" data-target="#modal-id">
							<i class="mdi mdi-access-point"><span
								class="inverter-btn-sm"> Valoracion</span></i>
						</button>
					</div>
				</div>
				<!-- Modal ! 1 -->
				<div class="modal fade" id="modal-id" tabindex="-1"
					aria-labelledby="ModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<h5 class="modal-title" id="ModalLabel">Checkboxes</h5>
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
							</div>
							<div class="modal-body">
								<div class="mb-3">
									<label for="select-all-checkbox"><input
										class="" type="checkbox" name="select-all"
										id="select-all-checkbox" /> Select All
									</label>
								</div>
								<div class="row checkboxes-list">
									<div class="col-6">
										<input name="checkbox-input" id="checkbox-id1" type="checkbox" />
										<label for="checkbox-id1"> checkbox 1</label>
									</div>
									<div class="col-6">
										<input name="checkbox-input" id="checkbox-id2" type="checkbox" />
										<label for="checkbox-id2"> checkbox 2</label>
									</div>
									<div class="col-6">
										<input name="checkbox-input" id="checkbox-id3" type="checkbox" />
										<label for="checkbox-id3"> checkbox 3</label>
									</div>
									<div class="col-6">
										<input name="checkbox-input" id="checkbox-id4" type="checkbox" />
										<label for="checkbox-id4"> checkbox 4</label>
									</div>
								</div>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-warning boton-modal-1"
									data-dismiss="modal" onclick="selectedCheckBoxes()">
									Guardar seleccion</button>
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">Cerrar</button>
							</div>
						</div>
					</div>
				</div>
				<!-- End Modal -->

				<!--INICIO SECCION RESULTADOS -->
				<div class="container-fluid p-5" id="resultados-postulantes">
					<h2 class="text-resultados">Mis Resultados</h2>
					<div
						class="row row-cols-1 row-cols-xs-2 row-cols-sm-2 row-cols-lg-4 g-3">
						<div class="col">
							<div class="card h-80 shadow-sm tarjeta-postulante">
								<div class="text-center">
									<div class="img-hover-zoom img-hover-zoom--colorize">
										<img class="shadow"
											src="/assets/img/fotos/4043251-avatar-female-girl-woman_113291.png"
											alt="Another Image zoom-on-hover effect">
									</div>
								</div>
								<div class="card-body">
									<div class="clearfix mb-3"></div>
									<div class="my-2 text-center">
										<h1>Mia Wallace</h1>
									</div>
									<div class="mb-3">
										<h2 class="text-uppercase text-center role">Senior
											Frontend Developer</h2>
									</div>
									<div class="box">
										<div>
											<ul class="list-inline">
												<li class="list-inline-item"><i class="fab fa-github"></i></li>
												<li class="list-inline-item"><i
													class="fab fa-linkedin-in"></i></li>
												<li class="list-inline-item"><i
													class="fab fa-instagram"></i></li>
												<li class="list-inline-item"><i class="fab fa-twitter"></i></li>
											</ul>
										</div>
									</div>
									<button type="button"
										class="btn btn-perfiles btn-outline-warning">Ver
										perfil</button>
								</div>
							</div>
						</div>
						<!---CARDS 2-->
						<div class="col">
							<div class="card h-80 shadow-sm tarjeta-postulante">
								<div class="text-center">
									<div class="img-hover-zoom img-hover-zoom--colorize">
										<img class="shadow"
											src="/assets/img/fotos/4043260-avatar-male-man-portrait_113269.png"
											alt="Another Image zoom-on-hover effect">
									</div>
								</div>
								<div class="card-body">
									<div class="clearfix mb-3"></div>
									<div class="my-2 text-center">
										<h1>Vincent Vega</h1>
									</div>
									<div class="mb-3">
										<h2 class="text-uppercase text-center role">SEO
											Specialist</h2>
									</div>
									<div class="box">
										<div>
											<ul class="list-inline">
												<li class="list-inline-item"><i class="fab fa-github"></i></li>
												<li class="list-inline-item"><i
													class="fab fa-linkedin-in"></i></li>
												<li class="list-inline-item"><i
													class="fab fa-instagram"></i></li>
												<li class="list-inline-item"><i class="fab fa-twitter"></i></li>
											</ul>
										</div>
									</div>

									<button type="button"
										class="btn btn-perfiles btn-outline-warning">Ver
										perfil</button>
								</div>
							</div>
						</div>
						<!-- CARD 3 -->
						<div class="col">
							<div class="card h-80 shadow-sm">
								<div class="text-center">
									<div class="img-hover-zoom img-hover-zoom--colorize">
										<img class="shadow" src="/assets/img/fotos/pngegg (1).png"
											alt="Another Image zoom-on-hover effect">
									</div>
								</div>
								<div class="card-body">
									<div class="clearfix mb-3"></div>
									<div class="my-2 text-center">
										<h1>Mr. Wolf</h1>
									</div>
									<div class="mb-3">
										<h2 class="text-uppercase text-center role">DIGITAL
											MARKETING SPECIALIST</h2>
									</div>
									<div class="box">
										<div>
											<ul class="list-inline">
												<li class="list-inline-item"><i class="fab fa-github"></i></li>
												<li class="list-inline-item"><i
													class="fab fa-linkedin-in"></i></li>
												<li class="list-inline-item"><i
													class="fab fa-instagram"></i></li>
												<li class="list-inline-item"><i class="fab fa-twitter"></i></li>
											</ul>
										</div>
									</div>
									<button type="button"
										class="btn btn-perfiles btn-outline-warning">Ver
										perfil</button>
								</div>
							</div>
						</div>
						<!-- CARDS 4-->
						<div class="col">
							<div class="card h-80 shadow-sm">
								<div class="text-center">
									<div class="img-hover-zoom img-hover-zoom--colorize">
										<img class="shadow" src="/assets/img/fotos/pngegg.png"
											alt="Another Image zoom-on-hover effect">
									</div>
								</div>
								<div class="card-body">
									<div class="clearfix mb-3"></div>
									<div class="my-2 text-center">
										<h1>O-Ren Ishii</h1>
									</div>
									<div class="mb-3">
										<h2 class="text-uppercase text-center role">Web Developer</h2>

									</div>
									<div class="box">
										<div>
											<ul class="list-inline">
												<li class="list-inline-item"><i class="fab fa-github"></i></li>
												<li class="list-inline-item"><i
													class="fab fa-linkedin-in"></i></li>
												<li class="list-inline-item"><i
													class="fab fa-instagram"></i></li>
												<li class="list-inline-item"><i class="fab fa-twitter"></i></li>
											</ul>
										</div>

									</div>
									<button type="button"
										class="btn btn-perfiles btn-outline-warning">Ver
										perfil</button>
								</div>
							</div>
						</div>
					</div>
				</div>



			</div>


		</div>
	</div>
	<!--Container Main end-->
	<!--Scripts NAVBAR No tocar-->
	<script src="./assets/js/nav.js"></script>
	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>

	<!--mi script Home -->
	<link rel="stylesheet" href="/assets/js/home.js" />
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/select2@4.1.0-beta.1/dist/js/select2.min.js"></script>
	</div>
</body>
</html>