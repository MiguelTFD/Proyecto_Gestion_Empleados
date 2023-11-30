package net.migueltfd.interfaces;

import net.migueltfd.model.Usuario;

import java.util.List;


public interface UsuarioDAO
{

   //=========okay======//
   
   List<Usuario> listarUsuarios();



   int obtenerIdPorUsername(String username);////aca es la implementacion de usernamexid


   Usuario loginUsuario(String username, String password);
   void CrearUsuario(Usuario usuario);
   void actualizarUsuario(Usuario usuario);

}
