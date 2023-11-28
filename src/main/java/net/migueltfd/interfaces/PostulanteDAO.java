package net.migueltfd.interfaces;

import net.migueltfd.model.Empleado;
import net.migueltfd.model.Postulante;

import java.util.List;

public interface PostulanteDAO {
   
   
   List<Postulante> listarPostulante();
   
   void eliminarPostulante();
   
   Empleado obternerPostulante(int IdPostulante);

}
