package net.migueltfd.service;

import net.migueltfd.dao.DAOFactory;
import net.migueltfd.interfaces.EmpleadoDAO;
import net.migueltfd.model.Empleado;

import java.util.List;

public class EmpleadoService
{
   DAOFactory factory = DAOFactory.getDAOFactory(1);
   EmpleadoDAO ice_empleadoDAO = factory.getEmpleado();
   
   public List<Empleado> listarEmpleado(){
      return ice_empleadoDAO.listarEmpleado(); //OKAY
   }
   
   public void actualizarEmpleado(Empleado empleado){
   
   }
   
   public void eliminarEmpleado(int IdEmpleado)
   {
   
   }
   
   public void crearEmpleado(Empleado empleado)
   {
   
   }
   
   public  Empleado obternerEmpleado(int IdEmpleado)
   {
      return null;
   }
   
   public  List<Empleado> listarEmpleadoPorTipo(int cargo){
      return null;
   }
   
   
   
}
