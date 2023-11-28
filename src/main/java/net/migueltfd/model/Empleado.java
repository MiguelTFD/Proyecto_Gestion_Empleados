package net.migueltfd.model;

import java.time.LocalDate;

public class Empleado
{
   private int IdEmpleado;
   private String NombreEmpleado;
   private String ApellidoPaternoEmpleado;
   private String ApellidoMaternoEmpleado;
   private String TelefononEmpleado;
   private String DireccionEmpleado;
   private LocalDate FechaNacimiento; //ojito
   private String Sexo;
   private String Distrito;
   private String TipoDocIdentidad;
   private String NumDocIdentidad;
   private LocalDate FechaRegistro;
   
   public Empleado(int idEmpleado, String nombreEmpleado, String apellidoPaternoEmpleado, String apellidoMaternoEmpleado, String telefononEmpleado, String direccionEmpleado, LocalDate fechaNacimiento, String sexo, String distrito, String tipoDocIdentidad, String numDocIdentidad, LocalDate fechaRegistro)
   {
      IdEmpleado = idEmpleado;
      NombreEmpleado = nombreEmpleado;
      ApellidoPaternoEmpleado = apellidoPaternoEmpleado;
      ApellidoMaternoEmpleado = apellidoMaternoEmpleado;
      TelefononEmpleado = telefononEmpleado;
      DireccionEmpleado = direccionEmpleado;
      FechaNacimiento = fechaNacimiento;
      Sexo = sexo;
      Distrito = distrito;
      TipoDocIdentidad = tipoDocIdentidad;
      NumDocIdentidad = numDocIdentidad;
      FechaRegistro = fechaRegistro;
   }
   
   public int getIdEmpleado()
   {
      return IdEmpleado;
   }
   
   public void setIdEmpleado(int idEmpleado)
   {
      IdEmpleado = idEmpleado;
   }
   
   public String getNombreEmpleado()
   {
      return NombreEmpleado;
   }
   
   public void setNombreEmpleado(String nombreEmpleado)
   {
      NombreEmpleado = nombreEmpleado;
   }
   
   public String getApellidoPaternoEmpleado()
   {
      return ApellidoPaternoEmpleado;
   }
   
   public void setApellidoPaternoEmpleado(String apellidoPaternoEmpleado)
   {
      ApellidoPaternoEmpleado = apellidoPaternoEmpleado;
   }
   
   public String getApellidoMaternoEmpleado()
   {
      return ApellidoMaternoEmpleado;
   }
   
   public void setApellidoMaternoEmpleado(String apellidoMaternoEmpleado)
   {
      ApellidoMaternoEmpleado = apellidoMaternoEmpleado;
   }
   
   public String getTelefononEmpleado()
   {
      return TelefononEmpleado;
   }
   
   public void setTelefononEmpleado(String telefononEmpleado)
   {
      TelefononEmpleado = telefononEmpleado;
   }
   
   public String getDireccionEmpleado()
   {
      return DireccionEmpleado;
   }
   
   public void setDireccionEmpleado(String direccionEmpleado)
   {
      DireccionEmpleado = direccionEmpleado;
   }
   
   public LocalDate getFechaNacimiento()
   {
      return FechaNacimiento;
   }
   
   public void setFechaNacimiento(LocalDate fechaNacimiento)
   {
      FechaNacimiento = fechaNacimiento;
   }
   
   public String getSexo()
   {
      return Sexo;
   }
   
   public void setSexo(String sexo)
   {
      Sexo = sexo;
   }
   
   public String getDistrito()
   {
      return Distrito;
   }
   
   public void setDistrito(String distrito)
   {
      Distrito = distrito;
   }
   
   public String getTipoDocIdentidad()
   {
      return TipoDocIdentidad;
   }
   
   public void setTipoDocIdentidad(String tipoDocIdentidad)
   {
      TipoDocIdentidad = tipoDocIdentidad;
   }
   
   public String getNumDocIdentidad()
   {
      return NumDocIdentidad;
   }
   
   public void setNumDocIdentidad(String numDocIdentidad)
   {
      NumDocIdentidad = numDocIdentidad;
   }
   
   public LocalDate getFechaRegistro()
   {
      return FechaRegistro;
   }
   
   public void setFechaRegistro(LocalDate fechaRegistro)
   {
      FechaRegistro = fechaRegistro;
   }
}
