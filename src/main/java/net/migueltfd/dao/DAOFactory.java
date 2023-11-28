package net.migueltfd.dao;

import net.migueltfd.interfaces.*;
import net.migueltfd.model.Empleado;

//=========================OKAY===================//


public abstract class DAOFactory
{
   
   public static final int MYSQL      = 1;
   public static final int SQL_SERVER = 2;
   public static final int ORACLE     = 3;
   public static final int POSTGRESQL = 4;
   
   public static DAOFactory getDAOFactory(int tipo)
   {
      switch (tipo)
      {
         case MYSQL:
            return new MySQLDAOFactory();
         case SQL_SERVER:
            return new SQLServerDAOFactory();
         case ORACLE:
            return null; //MISSING
         case POSTGRESQL:
            return null; //MISSIN
         default:
            return null;
      }
   }
   //OKEY
   public abstract EmpleadoDAO getEmpleado();
   public abstract CargoDAO getCargo();
   public abstract ContratoDAO getContrato();
   public abstract CurriculumDAO getCurriculum();
   public abstract PostulanteDAO getPostulante();
   public abstract SolicitudDAO getSolicitud();
   public abstract UsuarioDAO getUsuario();
}
