package net.migueltfd.servlets;


import net.migueltfd.model.Usuario;
import net.migueltfd.service.UsuarioService;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.http.HTTPException;
import java.io.IOException;

@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet
{
   //configuraciones iniciales
   private static final long           serialVersionUID = 1L;
   private final        UsuarioService usuarioService;
   //private final EmpleadoService empleadoService;
   
   public UsuarioServlet()
   {
      super();
      usuarioService = new UsuarioService();
      //empleadoService = new EmpleadoService();
   }
   //======================
   
   protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
   {
      String accion = req.getParameter("txt_accion");
      System.out.println("ga nomas");
      
      if (accion == null)
      {
         res.sendRedirect("login.jsp");
         System.out.println(accion);
      }
      else if (accion.equals("INICIAR_SESION"))
      {
         iniciarSesion(req, res);
         System.out.println(accion);
      }
      else if(accion.equals("REGISTRAR_USUARIO"))
      {
         System.out.println(accion);
         crearUsuario(req,res);
      }else if (accion.equals("CREAR")){
         crear(req, res);
      }else {
         System.out.println("xd final");
      }
   }
   
   //============================METODOS GENERALES=======================
   public void crearUsuario(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
   {
      String ice_nombre          = req.getParameter("txt_nombre");
      String ice_apellidoPaterno = req.getParameter("txt_apellido_paterno");
      String ice_apellidoMaterno = req.getParameter("txt_apellido_materno)");
      String ice_correo          = req.getParameter("txt_correo");
      String ice_username        = req.getParameter("txt_user");
      String ice_password        = req.getParameter("txt_password");
      
      Usuario frost_usuario = new Usuario();
      frost_usuario.setNombreUsuario(ice_nombre);
      frost_usuario.setApellidoPaternoUsuario(ice_apellidoPaterno);
      frost_usuario.setApellidoMaternoUsuario(ice_apellidoMaterno);
      frost_usuario.setCorreoUsuario(ice_correo);
      frost_usuario.setUsername(ice_username);
      frost_usuario.setPassword(ice_password);
      
      usuarioService.CrearUsuario(frost_usuario);
      req.getRequestDispatcher("/registro.jsp").forward(req, res);
      
   }
   
   
   public void iniciarSesion(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
   {
      //Inicio de la validacion de logeo
      String username = req.getParameter("username");
      String password = req.getParameter("password");
      
      //vinculamos la var frost_usuario de tipo usuario, al logeo
      Usuario frost_usuario = usuarioService.loginUsuario(username, password);
      
      if (frost_usuario == null)
      {
        
         req.getRequestDispatcher("/login.jsp").forward(req, res);
      } else
      {
         System.out.println(frost_usuario.toString());
         HttpSession session = req.getSession();
         System.out.println("Id de session: " + session.getId());
         System.out.println("Fecha de creacion: " + session.getCreationTime());
         System.out.println("Tiempo max. de inactividad" + session.getMaxInactiveInterval());
         session.setAttribute("Usuariologeado", frost_usuario);
         System.out.println(session.getAttribute("NombreUsuario"));
         
         req.getRequestDispatcher("/index.jsp").forward(req, res);
         
      }
   }
   
  public void crear(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
  {
     req.getRequestDispatcher("/registro.jsp").forward(req, res);
  }
   
}
