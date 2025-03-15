
package Modelos;
import Pagos.ProcesoPagos;

public class PagoConTargeta implements ProcesoPagos{

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Procesando pago de $"+ cantidad + " con targeta...");
        System.out.println();
    }
    
}
