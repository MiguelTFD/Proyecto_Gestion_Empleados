package net.migueltfd.interfaces;

import net.migueltfd.model.Solicitud;

import java.util.List;

public interface SolicitudDAO {
   
   List<Solicitud> listarSolicitud();
   
   void eliminarSolicitud();
   
   Solicitud obternerSolicitud(int IdSolicitud);
   
   //solicitud por empleado
   
   List<Solicitud> listarSolicitudxEmpleados();
   
}
