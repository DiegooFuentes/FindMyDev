<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!--CSS De NAvbar-->
    <!--Boostrap-->
    <link rel="stylesheet" href="css/nav.css" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css" />
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <!-- GoogleFont-->
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link href="https://fonts.googleapis.com/css2?family=Nunito:wght@200;400;700;900&display=swap" rel="stylesheet" />

    <!-- Cierre Css de Nav-->
    <!-- Inicio clases para main Home -->
    <link rel="stylesheet" href="css/home.css" />
    <link rel="stylesheet" href="css/modal.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"">


    <link
    rel=" stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />





    <!------->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet"
        id="bootstrap-css" />
    <link href="https://cdn.jsdelivr.net/npm/select2@4.1.0-beta.1/dist/css/select2.min.css" rel="stylesheet" />

    <title>Document</title>
</head>

<body
    body id="body-pd">
    <header class="header row" id="header">  
      <div class="header_toggle col-md-2" > <i class='bx bx-menu' id="header-toggle"></i> </div>
      <h2 class="text-buscador titulo_form  col-md-8">Mi Perfil</h2>
      
      <div class="dropdown col-1 ">
        <button class="dropdown-toggle boton_editar" type="button" data-bs-toggle="dropdown" aria-expanded="false">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person" viewBox="0 0 16 16">
                <path d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z"/>
              </svg>
        </button>
        <ul class="dropdown-menu opciones_perfil">
          <li><a class="dropdown-item" href="#">Editar Nombre</a></li>
          <li><a class="dropdown-item" href="#">Editar Avatar</a></li>
          <li><a class="dropdown-item" href="#">Editar Contrase�a</a></li>
        </ul>
      </div>

        
      
      
      
      
      <div class="header_img"> 
        
        
        </div>
    </header>
    <div class="l-navbar" id="nav-bar" style="padding-left: 7px;padding-right: 0px;">
      <nav class="nav navbar-container" >
        <div class="row header-nav " id = "usuario">
        
          <div class="col-md-6 foto-avatar">
            
            <img class="imgg"  href="" src="img/fotos/mujer.png" width="5px" alt="img-resposive">
            
          </div>
          
        
          <div class="col-md-5 container-nav info1" >
            <h3 id="bienvenidatext"> Hola!</h3>
            <p class="nombre-nav"> Maria luz</p>



          </div>
        </div>
        <div class="row item_list">
          <div class="nav_list"> <a href="/perfil.html" class="nav_link active"> <i class='bx bx-grid-alt nav_icon'></i>
              <span class="nav_name">Mi Perfil</span>
            </a>
            <a href="#" class="nav_link"> <i class='bx bx-user nav_icon'></i> <span class="nav_name">Mis
                candidatos</span> </a>
            <a href="/home.html" class="nav_link"> <i class='bx bx-bookmark nav_icon'></i> <span class="nav_name">FindDevs</span>
            </a>


          </div>
        </div> <a href="#" class="nav_link"> <i class='bx bx-log-out nav_icon'></i> <span class="nav_name">Cerrar
            sesi�n</span> </a>
      </nav>
    </div>
        <!--Container Main start-->
       







                   
                    </div>
                </div>







                <div class="row contenedorMenu fondo">

                    <div class="col-md-2 menu1">

                        <img class="rounded-circle img1 text-center"
                            src="img/fotos/4043251-avatar-female-girl-woman_113291.png" alt="img-resposive" />


                        <div class="d-flex menu_lista">

                            <div class="lista-item"> <a href="./RegistrosPostulante/habilidadesBlandas.html"><button
                                        type="button" class="btn btn_menu" data-bs-dismiss="modal">Habilidades
                                        Blandas</button> </a></div>
                            <div class="lista-item"> <a href="./RegistrosPostulante/habilidadestTecnicas.html"><button
                                        type="button" class="btn btn_menu" data-bs-dismiss="modal">Habilidades
                                        Tecnicas</button> </a></div>
                            <div class="lista-item"><a href="/miPerfil/datoslaborales"><button type="button" class="btn btn_menu"
                                    data-bs-dismiss="modal">Experiencia Laboral</button></a></div>
                            <div class="lista-item"><a href="./RegistrosPostulante/academica.html"><button type="button" class="btn btn_menu"
                                    data-bs-dismiss="modal">Formaci�n Acad�mica</button></a></div>
                            <div class="lista-item"><a href="./RegistrosPostulante/registropostulanteproyecto.html"><button type="button" class="btn btn_menu"
                                    data-bs-dismiss="modal">Proyecto</button></a></div>
                            <div class="lista-item"><a href="./RegistrosPostulante/registropostulantedatocontacto.html"></a><button type="button" class="btn btn_menu"
                                    data-bs-dismiss="modal">Datos de Contacto</button></div>
                        </div>
                        <div>


                        </div>




                    </div>




                    <div class="col-md-9 menu2">

                        <div>

                            <div class="row ">

                                <div class="col-md-12 info_perfil">
                                    <h2> Maria Luz</h2>
                                    <p>maria@gmail.com</p>


















                                </div>




                            </div>


                        </div>

                    </div>

                </div>

                <!--cierre container fluid-->
            </div>
            <!--main final-->
        </div>
        <!--cierre de contenedor grande-->
    </div>
    <!--Container Main end-->
    <!--Scripts NAVBAR No tocar-->
    <script src="js/nav.js"></script>
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

    <!--mi script Home -->
    <link rel="stylesheet" href="js/home.js" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/select2@4.1.0-beta.1/dist/js/select2.min.js"></script>
    <script src="js/modal.js"></script>

    <!-- scrip modal -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous">
    </script>




    </div>
</body>

</html>