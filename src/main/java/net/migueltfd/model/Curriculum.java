package net.migueltfd.model;

import java.time.LocalDate;

public class Curriculum
{
   
   private int IdCurriculum;
   private String NombrePostulante;
   private String ApellidoPaternoPostulante;
   private String ApellidoMaternoPostulante;
   private String TelefonoPostulante;
   private String DireccionPostulante;
   private String NivelAcademico;
   private LocalDate FechaNacimiento;
   private String Sexo;
   private String Distrito;
   private String TipoDocIdentidad;
   private String NumDocIdentidad;
   
   public Curriculum(int idCurriculum, String nombrePostulante, String apellidoPaternoPostulante, String apellidoMaternoPostulante, String telefonoPostulante, String direccionPostulante, String nivelAcademico, LocalDate fechaNacimiento, String sexo, String distrito, String tipoDocIdentidad, String numDocIdentidad)
   {
      IdCurriculum = idCurriculum;
      NombrePostulante = nombrePostulante;
      ApellidoPaternoPostulante = apellidoPaternoPostulante;
      ApellidoMaternoPostulante = apellidoMaternoPostulante;
      TelefonoPostulante = telefonoPostulante;
      DireccionPostulante = direccionPostulante;
      NivelAcademico = nivelAcademico;
      FechaNacimiento = fechaNacimiento;
      Sexo = sexo;
      Distrito = distrito;
      TipoDocIdentidad = tipoDocIdentidad;
      NumDocIdentidad = numDocIdentidad;
   }
   
   public int getIdCurriculum()
   {
      return IdCurriculum;
   }
   
   public void setIdCurriculum(int idCurriculum)
   {
      IdCurriculum = idCurriculum;
   }
   
   public String getNombrePostulante()
   {
      return NombrePostulante;
   }
   
   public void setNombrePostulante(String nombrePostulante)
   {
      NombrePostulante = nombrePostulante;
   }
   
   public String getApellidoPaternoPostulante()
   {
      return ApellidoPaternoPostulante;
   }
   
   public void setApellidoPaternoPostulante(String apellidoPaternoPostulante)
   {
      ApellidoPaternoPostulante = apellidoPaternoPostulante;
   }
   
   public String getApellidoMaternoPostulante()
   {
      return ApellidoMaternoPostulante;
   }
   
   public void setApellidoMaternoPostulante(String apellidoMaternoPostulante)
   {
      ApellidoMaternoPostulante = apellidoMaternoPostulante;
   }
   
   public String getTelefonoPostulante()
   {
      return TelefonoPostulante;
   }
   
   public void setTelefonoPostulante(String telefonoPostulante)
   {
      TelefonoPostulante = telefonoPostulante;
   }
   
   public String getDireccionPostulante()
   {
      return DireccionPostulante;
   }
   
   public void setDireccionPostulante(String direccionPostulante)
   {
      DireccionPostulante = direccionPostulante;
   }
   
   public String getNivelAcademico()
   {
      return NivelAcademico;
   }
   
   public void setNivelAcademico(String nivelAcademico)
   {
      NivelAcademico = nivelAcademico;
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
}
