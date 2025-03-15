package modelos;

import modelos.Trabajador;

public class Desarrollador implements Trabajador{
    @Override
    public void trabajar() 
    {
        System.out.println("El desarrollador está escribiendo código.");
    }
}
