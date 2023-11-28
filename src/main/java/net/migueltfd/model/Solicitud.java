package net.migueltfd.model;

import java.time.LocalDate;

public class Solicitud
{
   
   private int IdSolicitud;
   private int IdEmpleado;
   private String TipoSolicitud;
   private String DescripcionSolicitud;
   private LocalDate FechaEntrega;
   private String EstadoSolicitud;
   private LocalDate FechaRespuesta;
   
   public Solicitud(int idSolicitud, int idEmpleado, String tipoSolicitud, String descripcionSolicitud, LocalDate fechaEntrega, String estadoSolicitud, LocalDate fechaRespuesta)
   {
      IdSolicitud = idSolicitud;
      IdEmpleado = idEmpleado;
      TipoSolicitud = tipoSolicitud;
      DescripcionSolicitud = descripcionSolicitud;
      FechaEntrega = fechaEntrega;
      EstadoSolicitud = estadoSolicitud;
      FechaRespuesta = fechaRespuesta;
   }
   
   public int getIdSolicitud()
   {
      return IdSolicitud;
   }
   
   public void setIdSolicitud(int idSolicitud)
   {
      IdSolicitud = idSolicitud;
   }
   
   public int getIdEmpleado()
   {
      return IdEmpleado;
   }
   
   public void setIdEmpleado(int idEmpleado)
   {
      IdEmpleado = idEmpleado;
   }
   
   public String getTipoSolicitud()
   {
      return TipoSolicitud;
   }
   
   public void setTipoSolicitud(String tipoSolicitud)
   {
      TipoSolicitud = tipoSolicitud;
   }
   
   public String getDescripcionSolicitud()
   {
      return DescripcionSolicitud;
   }
   
   public void setDescripcionSolicitud(String descripcionSolicitud)
   {
      DescripcionSolicitud = descripcionSolicitud;
   }
   
   public LocalDate getFechaEntrega()
   {
      return FechaEntrega;
   }
   
   public void setFechaEntrega(LocalDate fechaEntrega)
   {
      FechaEntrega = fechaEntrega;
   }
   
   public String getEstadoSolicitud()
   {
      return EstadoSolicitud;
   }
   
   public void setIdEstadoSolicitud(String estadoSolicitud)
   {
      EstadoSolicitud = estadoSolicitud;
   }
   
   public LocalDate getFechaRespuesta()
   {
      return FechaRespuesta;
   }
   
   public void setFechaRespuesta(LocalDate fechaRespuesta)
   {
      FechaRespuesta = fechaRespuesta;
   }
}
