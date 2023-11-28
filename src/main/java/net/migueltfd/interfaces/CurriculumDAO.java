package net.migueltfd.interfaces;

import net.migueltfd.model.Curriculum;

import java.util.List;

public interface CurriculumDAO {
   
   List<Curriculum> listarCurriculum();
   
   void eliminarCurriculum(int IdCurriculum);
   
   Curriculum verDetallesCurriculum(int IdCurriculum);
   
   void archivarCurriculum(int IdCurriculum); //agregar en la bd un campo de archivado y que el registro sea de true o false
   
   
}
