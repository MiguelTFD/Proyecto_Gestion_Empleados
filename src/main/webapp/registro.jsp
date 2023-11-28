
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Registrar Usuario</title>
    <link rel="stylesheet" href="resources/css/tundra.css">
</head>
<body>
<!-- Login Form -->
<div  class="layout">

    <div class="form-box-container">
        <h1 class="Welcome">
            Registro
        </h1>
        <div class="main-form-box">
            <form method="post" action="UsuarioServlet" id="frmUsuario">
                <input type="hidden" name="accion" value="REGISTRAR_USUARIO"
                       id="accion" />
                <table class="table">
                    <tr>
                        <td class="text-right">Nombre</td>
                        <td><input type="text" name="txt_nombre" /></td>
                    </tr>
                    <tr>
                        <td class="text-right">Apellido Paterno</td>
                        <td><input type="text" name="txt_apellido_paterno" /></td>
                    </tr>
                    <tr>
                        <td class="text-right">Apellido Materno</td>
                        <td><input type="text" name="txt_apellido_materno" /></td>
                    </tr>
                    <tr>
                        <td class="text-right">Correo</td>
                        <td><input type="email" name="txt_correo" /></td>
                    </tr>
                    <tr>
                        <td class="text-right">Usuario</td>
                        <td><input type="text" name="txt_user" /></td>
                    </tr>
                    <tr>
                        <td class="text-right">Contraseña</td>
                        <td><input type="password" name="txt_password" /></td>
                    </tr>
                </table>
                <button type="submit" class='btn btn-success'>Registrarme</button>
                <button type="reset" class='btn btn-warning'>Limpiar</button>
            </form>
        </div>
    </div>
    <img class="log-float" src="resources/images/logo%20maria.png" alt="logo Jesus Maria"/>
</div>


</body>

</html>
