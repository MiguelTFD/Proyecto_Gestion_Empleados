
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Registrar Usuario</title>
    <link rel="stylesheet" href="resources/css/tundra.css">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

    <script type="text/javascript" src="resources/js/jquery.min.js"></script>
    <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="resources/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="resources/js/bootstrapValidator.js"></script>

</head>
<body>
<!-- Login Form -->
<div  class="layoutv2 images-background">


    <div class="form-box-containerv2">
        <h1 class="Welcome">
            Registro
        </h1>
        <div class="main-form-boxv2">
            <form style="display: grid; grid-template-columns: 1fr 1fr; grid-template-rows: 1fr 1fr 1fr; grid-column-gap: 20px;padding: 15px" method="post" action="usuarioServlet" id="frmUsuario">

                <input type="hidden" name="txt_accion" id="txt_accion" value=""/> <!--NO TOCAR-->

                <div class="mb-3">
                    <label for="InputUsuario" class="form-label">Crea un Usuario</label>
                    <input type="text" class="form-control" id="InputUsuario"  name="txt_user" autocomplete="off">
                </div>


                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Crea una Contrasenia</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" name="txt_password" autocomplete="off">
                </div>

                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Correo electronico</label>
                    <input type="email"  class="form-control" id="exampleInputEmail1" name="txt_correo" autocomplete="off">

                </div>

                <div class="mb-3">
                    <label for="InputNombre" class="form-label">Nombre</label>
                    <input type="text"  class="form-control" id="InputNombre" name="txt_nombre" autocomplete="off">
                </div>




                <div class="mb-3">
                    <label for="InputApePat" class="form-label">Apellido Paterno</label>
                    <input type="text"  class="form-control" id="InputApePat" name="txt_apellido_paterno" autocomplete="off">
                </div>


                <div class="mb-3">
                    <label for="InputApeMat" class="form-label">Apellido Materno</label>
                    <input type="text" class="form-control" id="InputApeMat" name="txt_apellido_materno" autocomplete="off">
                </div>



                <button type="button" class='btn btn-primary' onclick="registrarUsuario()">Registrarme</button>
                <button type="reset" class='btn btn-secondary'>Limpiar</button>
            </form>

        </div>
    </div>
    <!-- <img class="log-float" src="resources/images/logo%20maria.png" alt="logo Jesus Maria"/>-->
</div>

<script type="text/javascript">
    function registrarUsuario() {
        $("#txt_accion").val("REGISTRAR_USUARIO")
        $("#frmUsuario").submit()
    }

</script>
</body>

</html>
