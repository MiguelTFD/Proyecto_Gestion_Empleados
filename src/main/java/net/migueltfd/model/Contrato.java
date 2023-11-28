package net.migueltfd.model;

import java.time.LocalDate;
public class Contrato
{
   
   private int IdContrato;
   private int IdEmpleado;
   private int IdCargo;
   private LocalDate FechaInicio;
   private LocalDate FechaFin;
   private String EstadoContrato;
   
   public Contrato(int idContrato, int idEmpleado, int idCargo, LocalDate fechaInicio, LocalDate fechaFin, String EstadoContrato)
   {
      IdContrato = idContrato;
      IdEmpleado = idEmpleado;
      IdCargo = idCargo;
      FechaInicio = fechaInicio;
      FechaFin = fechaFin;
      this.EstadoContrato = EstadoContrato;
   }
   
   public int getIdContrato()
   {
      return IdContrato;
   }
   
   public void setIdContrato(int idContrato)
   {
      IdContrato = idContrato;
   }
   
   public int getIdEmpleado()
   {
      return IdEmpleado;
   }
   
   public void setIdEmpleado(int idEmpleado)
   {
      IdEmpleado = idEmpleado;
   }
   
   public int getIdCargo()
   {
      return IdCargo;
   }
   
   public void setIdCargo(int idCargo)
   {
      IdCargo = idCargo;
   }
   
   public LocalDate getFechaInicio()
   {
      return FechaInicio;
   }
   
   public void setFechaInicio(LocalDate fechaInicio)
   {
      FechaInicio = fechaInicio;
   }
   
   public LocalDate getFechaFin()
   {
      return FechaFin;
   }
   
   public void setFechaFin(LocalDate fechaFin)
   {
      FechaFin = fechaFin;
   }
   
  public String getEstadoContrato(){
      return EstadoContrato;
  }
  public void setEstadoContrato(String EstadoContrato){
      this.EstadoContrato = EstadoContrato;
  }
}
