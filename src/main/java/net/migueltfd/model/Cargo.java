package net.migueltfd.model;

public class Cargo {

    private int IdCargo;
    private String NombreCargo;
    private double Sueldo;
    private String Permisos;
    
    public Cargo(int idCargo, String nombreCargo, double sueldo, String Permisos)
    {
        IdCargo = idCargo;
        NombreCargo = nombreCargo;
        Sueldo = sueldo;
        this.Permisos = Permisos;
    }
    
    public int getIdCargo()
    {
        return IdCargo;
    }
    
    public void setIdCargo(int idCargo)
    {
        IdCargo = idCargo;
    }
    
    public String getNombreCargo()
    {
        return NombreCargo;
    }
    
    public void setNombreCargo(String nombreCargo)
    {
        NombreCargo = nombreCargo;
    }
    
    public double getSueldo()
    {
        return Sueldo;
    }
    
    public void setSueldo(double sueldo)
    {
        Sueldo = sueldo;
    }
    
    public String getPermisos()
    {
        return Permisos;
    }
    
    public void setPermisos(String Permisos)
    {
        this.Permisos = Permisos;
    }
    
    
}
