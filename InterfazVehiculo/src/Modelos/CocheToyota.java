
package Modelos;
import InterfazVehiculo.accionVehiculo;

public class CocheToyota implements accionVehiculo{
    @Override
    public void arrancar(){
        System.out.println("El vehiculo va en marcha.");
         System.out.println("       ______");
        System.out.println("  _____|__|__\\___");
        System.out.println(" |  _          _  |");
        System.out.println(" '-(o)------(o)--'");
    }
    @Override
    public void detener(){
        System.out.println("La Tacoma se detiene en la gasolinera.");
        
    }
}
