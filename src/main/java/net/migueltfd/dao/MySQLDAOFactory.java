package net.migueltfd.dao;

import net.migueltfd.dao.impl.EmpleadoModelMySQL;
import net.migueltfd.dao.impl.UsuarioModelMySQL;
import net.migueltfd.interfaces.*;

public class MySQLDAOFactory extends DAOFactory
{
   
   
   //===============OKAY================//
   @Override
   public EmpleadoDAO getEmpleado()
   {
      return new EmpleadoModelMySQL();
   }
   
   
   @Override
   public CargoDAO getCargo()
   {
      return null;
   }
   
   
   @Override
   public ContratoDAO getContrato()
   {
      return null;
   }
   
   
   @Override
   public CurriculumDAO getCurriculum()
   {
      return null;
   }
   
   
   @Override
   public PostulanteDAO getPostulante()
   {
      return null;
   }
   
   
   @Override
   public SolicitudDAO getSolicitud()
   {
      return null;
   }
   
   @Override
   public UsuarioDAO getUsuario()
   {
      return new UsuarioModelMySQL();
   }
   
}

