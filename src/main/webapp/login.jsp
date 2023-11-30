<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Iniciar Sesion</title>
    <link rel="stylesheet" href="resources/css/tundra.css">



    <script type="text/javascript" src="resources/js/jquery.min.js"></script>
    <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="resources/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="resources/js/bootstrapValidator.js"></script>



</head>
<body>
<!-- Login Form -->
<div class="layout images-background">

    <div class="form-box-container">
        <h1 class="Welcome">
            Inicio de Sesion
        </h1>
        <div class="main-form-box">
            <form method="post" action="usuarioServlet" id="frmUsuario">
                <input type="hidden" name="txt_accion" id="txt_accion" value=""/>
                <div class="form-input">
                    <input type="text" id="username" autocomplete="off" class="form-control" name="username"
                           placeholder="Usuario"/>
                </div>
                <div class="form-input">

                    <input type="password" id="password" class="form-control" name="password" placeholder="Contraseña"/>
                </div>
                <div class="btn-success-frost">
                    <button type="button" class="btn-key" name="Ingresar" onclick="iniciarSesion()">Iniciar Sesion
                    </button>
                    <button type="button" class="btn-key second" name="Crear" onclick="crear()">Crear
                        Cuenta Nueva
                    </button>
                </div>
                <a href="#" class="alzas">Olvide mi contraseña</a>
            </form>
        </div>
    </div>
    <img class="log-float" src="resources/images/logo%20maria.png" alt="logo Jesus Maria"/>
</div>
<script type="text/javascript">
    function crear() {
        $("#txt_accion").val("CREAR")
        $("#frmUsuario").submit()
    }

    function iniciarSesion(){
        $("#txt_accion").val("INICIAR_SESION")
        $("#frmUsuario").submit()
    }


</script>
</body>

</html>
