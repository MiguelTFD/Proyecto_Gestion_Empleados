package net.migueltfd.dao.impl;

import net.migueltfd.interfaces.UsuarioDAO;
import net.migueltfd.model.Usuario;
import net.migueltfd.util.MySQLConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class UsuarioModelMySQL implements UsuarioDAO
{
   
   
   @Override
   public List<Usuario> listarUsuarios()
   {
      return null;
   }

   @Override
   public int obtenerIdPorUsername(String username){
      Connection cn = null;
      PreparedStatement pstm = null;
      ResultSet rs = null;
      int idUsuario = -1;
      try {
         cn = MySQLConnection.getConexion();
         String query = "SELECT IdUsuario FROM usuarios WHERE username = ?";
         pstm = cn.prepareStatement(query);
         pstm.setString(1, username);
         rs = pstm.executeQuery();

         if (rs.next()) {
            idUsuario = rs.getInt("IdUsuario");
         }
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if (rs != null)
               rs.close();
            if (pstm != null)
               pstm.close();
            if (cn != null)
               cn.close();
         } catch (Exception ex2) {
            ex2.printStackTrace();
         }
      }



      return idUsuario;
   }

   @Override
   public Usuario loginUsuario(String username, String password)
   {
      Connection        cn      = null;
      PreparedStatement pstm    = null;
      ResultSet         rs      = null;
      Usuario           usuario = null;
      
      try
      {
         cn = MySQLConnection.getConexion();
         String query = "SELECT * FROM usuario WHERE username = ? AND password = ?; ";
         pstm = cn.prepareStatement(query);
         pstm.setString(1, username);
         pstm.setString(2,password);
         rs = pstm.executeQuery();
         
         if(rs.next()){
            usuario = new Usuario(
                    rs.getInt("IdUsuario"),
                    rs.getString("NombreUsuario"),
                    rs.getString("ApellidoPaternoUsuario"),
                    rs.getString("ApellidoMaternoUsuario"),
                    rs.getString("Correo"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getInt("IdEmpleado"),
                    rs.getInt("IdPostulante"),
                    rs.getString("TipoUsuario")
                    
            );
         }
        
         
         
      }catch (Exception exc)
      {
         exc.printStackTrace();
      }finally {
         try {
            if (rs != null)
               rs.close();
            if (pstm != null)
               pstm.close();
            if (cn != null)
               cn.close();
         } catch (Exception ex2) {
            ex2.printStackTrace();
         }
      }
      
      return usuario;
   }
   
   @Override
   public void CrearUsuario(Usuario usuario)
   {
      Connection cn =null;
      CallableStatement cstm = null;
      //Definiendo una variable cinculada a la fecha actual
      Date fechaHoy = new Date();
      SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
      
      //intentando la conexion
      try
      {
         cn = MySQLConnection.getConexion();
         String query = "call agregarUsuario(?,?,?,?,?,?)";
         cstm = cn.prepareCall(query);
         
         System.out.println("Estas ejecutando el procedure de" + query);
         
         cstm.setString(1, usuario.getNombreUsuario());
         cstm.setString(2, usuario.getApellidoPaternoUsuario());
         cstm.setString(3, usuario.getApellidoMaternoUsuario());
         cstm.setString(4, usuario.getCorreoUsuario());
         cstm.setString(5, usuario.getUsername());
         cstm.setString(6, usuario.getPassword());
         cstm.executeUpdate();
         
      }
      catch (Exception exc)
      {
         exc.printStackTrace();
      }
      finally
      {
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
   public void actualizarUsuario(Usuario usuario)
   {
   
   }
}
