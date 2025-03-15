
package Modelos;
import Pagos.ProcesoPagos;

public class PagoConEfectivo implements ProcesoPagos{

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Procesando pago de $"+ cantidad + " con efectivo...");
        System.out.println();
    }
    
}
