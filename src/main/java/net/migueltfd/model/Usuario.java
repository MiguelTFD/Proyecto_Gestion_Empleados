package net.migueltfd.model;

import javax.security.enterprise.credential.Password;

public class Usuario
{
   private int IdUsuario;
   private String NombreUsuario;
   private String ApellidoPaternoUsuario;
   private String ApellidoMaternoUsuario;
   private String CorreoUsuario;
   private String username;
   private String password;
   private int IdEmpleadoxUsuario;
   private int IdPostulantexUsuario;
   private String TipoEmpleado;
   
   
   public Usuario(int idUsuario, String nombreUsuario, String apellidoPaternoUsuario, String apellidoMaternoUsuario, String correoUsuario, String username, String password, int idEmpleadoxUsuario, int idPostulantexUsuario, String tipoEmpleado)
   {
      IdUsuario = idUsuario;
      NombreUsuario = nombreUsuario;
      ApellidoPaternoUsuario = apellidoPaternoUsuario;
      ApellidoMaternoUsuario = apellidoMaternoUsuario;
      CorreoUsuario = correoUsuario;
      this.username = username;
      this.password = password;
      IdEmpleadoxUsuario = idEmpleadoxUsuario;
      IdPostulantexUsuario = idPostulantexUsuario;
      TipoEmpleado = tipoEmpleado;
   }
   
   public Usuario()
   {
   
   }
   
   public int getIdUsuario()
   {
      return IdUsuario;
   }
   
   public void setIdUsuario(int idUsuario)
   {
      IdUsuario = idUsuario;
   }
   
   public String getNombreUsuario()
   {
      return NombreUsuario;
   }
   
   public void setNombreUsuario(String nombreUsuario)
   {
      NombreUsuario = nombreUsuario;
   }
   
   public String getApellidoPaternoUsuario()
   {
      return ApellidoPaternoUsuario;
   }
   
   public void setApellidoPaternoUsuario(String apellidoPaternoUsuario)
   {
      ApellidoPaternoUsuario = apellidoPaternoUsuario;
   }
   
   public String getApellidoMaternoUsuario()
   {
      return ApellidoMaternoUsuario;
   }
   
   public void setApellidoMaternoUsuario(String apellidoMaternoUsuario)
   {
      ApellidoMaternoUsuario = apellidoMaternoUsuario;
   }
   
   public String getCorreoUsuario()
   {
      return CorreoUsuario;
   }
   
   public void setCorreoUsuario(String correoUsuario)
   {
      CorreoUsuario = correoUsuario;
   }
   
   public String getUsername()
   {
      return username;
   }
   
   public void setUsername(String username)
   {
      this.username = username;
   }
   
   public String getPassword()
   {
      return password;
   }
   
   public void setPassword(String password)
   {
      this.password = password;
   }
   
   public int getIdEmpleadoxUsuario()
   {
      return IdEmpleadoxUsuario;
   }
   
   public void setIdEmpleadoxUsuario(int idEmpleadoxUsuario)
   {
      IdEmpleadoxUsuario = idEmpleadoxUsuario;
   }
   
   public int getIdPostulantexUsuario()
   {
      return IdPostulantexUsuario;
   }
   
   public void setIdPostulantexUsuario(int idPostulantexUsuario)
   {
      IdPostulantexUsuario = idPostulantexUsuario;
   }
   
   public String getTipoEmpleado()
   {
      return TipoEmpleado;
   }
   
   public void setTipoEmpleado(String tipoEmpleado)
   {
      TipoEmpleado = tipoEmpleado;
   }
}
