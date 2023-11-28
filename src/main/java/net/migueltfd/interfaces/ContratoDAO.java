package net.migueltfd.interfaces;

import net.migueltfd.model.Contrato;

import java.util.List;

public interface ContratoDAO {

// listar, crear, actualizar, eliminar, obtenerObjeto
    
    List<Contrato> listarContrato();
    
    void actualizarContrato(Contrato contrato);
    
    void crearContrato(Contrato contrato);
    
    Contrato obtenerContrato(int IdContrato);
    
    List<Contrato> listarContratoPorCargo(int IdCargo);
    
    List<Contrato> listarContratoPorEstado(int IdEstadoContrato);

}
