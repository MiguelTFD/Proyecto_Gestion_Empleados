package net.migueltfd.model;

public class Postulante
{

   private int IdPostulante;
   private int IdCurriculum;
   private int IdCargo;
   private boolean Aprobado;
   
   public Postulante(int idPostulante, int idCurriculum, int idCargo, boolean Aprobado)
   {
      IdPostulante = idPostulante;
      IdCurriculum = idCurriculum;
      IdCargo = idCargo;
      this.Aprobado = Aprobado;
   }
   
   public int getIdPostulante()
   {
      return IdPostulante;
   }
   
   public void setIdPostulante(int idPostulante)
   {
      IdPostulante = idPostulante;
   }
   
   public int getIdCurriculum()
   {
      return IdCurriculum;
   }
   
   public void setIdCurriculum(int idCurriculum)
   {
      IdCurriculum = idCurriculum;
   }
   
   public int getIdCargo()
   {
      return IdCargo;
   }
   
   public void setIdCargo(int idCargo)
   {
      IdCargo = idCargo;
   }
   
   public boolean getAprobado()
   {
      return Aprobado;
   }
   
   public void setAprobado(boolean Aprobado){
      this.Aprobado = Aprobado;
   }
   
   
}
