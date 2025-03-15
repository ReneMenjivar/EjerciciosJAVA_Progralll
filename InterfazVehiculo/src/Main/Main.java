
package Main;
import InterfazVehiculo.accionVehiculo;
import Modelos.Bicicleta;
import Modelos.CocheToyota;


public class Main {
     public static void main(String[] args) 
    {
        // --Asignacion de referencias de la clase accionVehiculo
        // para usar en los metodos--.
        accionVehiculo Toyota = new CocheToyota();
        accionVehiculo bicicleta = new Bicicleta();
        
        //Acciones para el Toyota.
        Toyota.arrancar();
        Toyota.detener();
        
        //Acciones para la Bici.
        bicicleta.arrancar();
        bicicleta.detener();
    }
}
