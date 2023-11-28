package net.migueltfd.interfaces;

import net.migueltfd.model.Empleado;

import java.util.List;

//======================OKAY=======================//
public interface EmpleadoDAO {
   
   public List <Empleado> listarEmpleado();
   
   public void actualizarEmpleado(Empleado empleado);
   
   public void eliminarEmpleado(int IdEmpleado);
   
   public void crearEmpleado(Empleado empleado);
   
   public Empleado obternerEmpleado(int IdEmpleado);
   
   public List<Empleado> listarEmpleadoPorTipo(int cargo);
   
   
}
