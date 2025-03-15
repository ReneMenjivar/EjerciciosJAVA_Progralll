
package Main;
import Modelos.*;
import Pagos.*;

public class Notificacion {
    public static void main(String[] args) 
    {
        // --Asignacion de referencias de la clase accionVehiculo
        // para usar en los metodos--.
        ProcesoPagos Efectivo = new PagoConEfectivo();
        double cantidad = 150.75;
        
        ProcesoPagos Targeta = new PagoConTargeta();

        //Llamando los métodos de proceso de pago.
        Efectivo.procesarPago(cantidad);
        Targeta.procesarPago(cantidad);
          
    }
}

