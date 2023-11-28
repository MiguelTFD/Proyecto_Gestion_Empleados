package net.migueltfd.dao.impl;

import net.migueltfd.interfaces.EmpleadoDAO;
import net.migueltfd.model.Empleado;
import net.migueltfd.util.MySQLConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpleadoModelMySQL implements EmpleadoDAO
{
   
   
   @Override
   public List<Empleado> listarEmpleado()
   {
      Connection        cn           = null;
      PreparedStatement pstm         = null;
      ResultSet         rs           = null;
      List<Empleado>    listEmpleado = null;
      
      try
      {
         
         cn = MySQLConnection.getConexion();
         String query = "SELECT * FROM empleado";
         pstm = cn.prepareStatement(query);
         rs = pstm.executeQuery();
         listEmpleado = new ArrayList<Empleado>();
         
         while (rs.next())
         {
            Empleado empleado = new Empleado(
                    rs.getInt("IdEmpleado"),
                    rs.getString("NombreEmpleado"),
                    rs.getString("ApellidoPaternoEmpleado"),
                    rs.getString("ApellidoMaternoEmpleado"),
                    rs.getString("TelefonoEmpleado"),
                    rs.getString("DireccionEmpleado"),
                    rs.getDate("FechaNacimiento").toLocalDate(),
                    rs.getString("Sexo"),
                    rs.getString("Distrito"),
                    rs.getString("TipoDocIdentidad"),
                    rs.getString("NumDocIdentidad"),
                    rs.getDate("FechaRegistro").toLocalDate()
            );
            listEmpleado.add(empleado);
         }
      } catch (Exception exc)
      {
         exc.printStackTrace();
      } finally
      {
         try
         {
            if (pstm != null)
               pstm.close();
            if (cn != null)
               cn.close();
         } catch (Exception ex2)
         {
            ex2.printStackTrace();
         }
      }
      return listEmpleado;
   }
   
   @Override
   public void actualizarEmpleado(Empleado empleado)
   {
      Connection        cn   = null;
      PreparedStatement pstm = null;
      
      try
      {
         cn = MySQLConnection.getConexion();
         String query = "UPDATE empleado SET NombreEmpleado =? , ApellidoPaternoEmpleado = ?, ApellidoMaternoEmpleado = ?, TelefonoEmpleado = ?, DireccionEmpleado = ?, FechaNacimiento = ?, Sexo = ?, Distrito = ?, TipoDocIdentidad = ?, NumDocIdentidad  = ? WHERE IdEmpleado = ?";
         pstm = cn.prepareStatement(query);
         
         pstm.setString(1, empleado.getNombreEmpleado());
         pstm.setString(2, empleado.getApellidoPaternoEmpleado());
         pstm.setString(3, empleado.getApellidoMaternoEmpleado());
         pstm.setString(4, empleado.getTelefononEmpleado());
         pstm.setString(5, empleado.getDireccionEmpleado());
         pstm.setObject(6, empleado.getFechaNacimiento());
         pstm.setString(7, empleado.getSexo());
         pstm.setString(8, empleado.getDistrito());
         pstm.setString(9, empleado.getTipoDocIdentidad());
         pstm.setString(10, empleado.getNumDocIdentidad());
         //
         pstm.executeUpdate();
         
      } catch (Exception exc)
      {
         exc.printStackTrace();
      } finally
      {
         try
         {
            if (pstm != null)
               pstm.close();
            if (cn != null)
               cn.close();
         } catch (Exception ex2)
         {
            ex2.printStackTrace();
         }
      }
   }
   
   @Override
   public void eliminarEmpleado(int EmpleadoID)
   {
      Connection        cn   = null;
      PreparedStatement pstm = null;
      try
      {
         cn = MySQLConnection.getConexion();
         String query = "DELETE FROM empleado WHERE IdEmpleado = ?";
         pstm = cn.prepareStatement(query);
         pstm.setInt(1, EmpleadoID);
         pstm.executeUpdate();
         
      } catch (Exception exc)
      {
         exc.printStackTrace();
      } finally
      {
         try
         {
            if (pstm != null)
               pstm.close();
            if (cn != null)
               cn.close();
         } catch (Exception ex2)
         {
            ex2.printStackTrace();
         }
      }
   }
   
   @Override
   public void crearEmpleado(Empleado empleado)
   {
      
      Connection        cn   = null;
      CallableStatement cstm = null;
      Date fechaActual = new Date();
      SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
      
      try {
         cn = MySQLConnection.getConexion();
         String query = "call agregarEmpleado(?,?,?,?,?,?,?,?,?,?,?,?)";
         cstm = cn.prepareCall(query);
         
         System.out.println("Ejecución del Store Procedure: " + query);
         
         cstm.setString(1, empleado.getNombreEmpleado());
         cstm.setString(2, empleado.getApellidoPaternoEmpleado());
         cstm.setString(3, empleado.getApellidoMaternoEmpleado());
         cstm.setString(4, empleado.getSexo());
         cstm.setString(5, empleado.getNumDocIdentidad());
         cstm.setObject(6, empleado.getFechaNacimiento());
         cstm.setString(7, empleado.getTelefononEmpleado());
         cstm.setString(8, empleado.getDireccionEmpleado());
         cstm.setString(9, empleado.getDistrito());
         cstm.setString(10, empleado.getTipoDocIdentidad());
         cstm.setInt(11, empleado.getIdEmpleado());
         cstm.setObject(12, dateFormat.format(fechaActual));
         cstm.executeUpdate();
         
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if (cstm != null)
               cstm.close();
            if (cn != null)
               cn.close();
         } catch (Exception ex2) {
            ex2.printStackTrace();
         }
      }
      
   }
   
   @Override
   public Empleado obternerEmpleado(int IdEmpleado)
   {
      return null;
   }
   
   @Override
   public List<Empleado> listarEmpleadoPorTipo(int cargo)
   {
      return null;
   }
}
