package Modelos;

import InterfazVehiculo.accionVehiculo;

public class Bicicleta implements accionVehiculo{
    @Override
    public void arrancar(){
        System.out.println("Pone el marcha su bicicleta.");
        System.out.println("       _o       ");
        System.out.println("     _< \\_     ");
        System.out.println("    (_)>(_)    ");
    }
    @Override
    public void detener(){
        System.out.println("El senior detiene su bicicleta.");
    }
}
