package net.migueltfd.service;

import net.migueltfd.dao.DAOFactory;
import net.migueltfd.interfaces.UsuarioDAO;
import net.migueltfd.model.Usuario;

import java.util.List;

public class UsuarioService
{
   DAOFactory frost_factory = DAOFactory.getDAOFactory(1);
   UsuarioDAO ice_usuarioDAO = frost_factory.getUsuario();
   
   public List<Usuario> listarUsuarios(){
      return null;
   }
   
   public Usuario loginUsuario(String username, String password)
   {
      return ice_usuarioDAO.loginUsuario(username,password);
   }
   public void CrearUsuario(Usuario usuario){
      ice_usuarioDAO.CrearUsuario(usuario);
   }
   public void actualizarUsuario(Usuario usuario){
   
   }
   
   
}
