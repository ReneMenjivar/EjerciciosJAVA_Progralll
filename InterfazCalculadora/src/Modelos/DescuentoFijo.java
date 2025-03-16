
package Modelos;
import Calculadora.*;

// Clase que aplica un descuento con una cantidad fija
public class DescuentoFijo implements CalcularDescuento {
    private double cantidadFija; // Monto fijo a descontar

    // Constructor para inicializar el descuento fijo
    public DescuentoFijo(double cantidadFija) {
        this.cantidadFija = cantidadFija;
    }

    // Implementación del método calcularDescuento()
    @Override
    public double calcularDescuento(double precio) {
        return (precio >= cantidadFija) ? cantidadFija : precio; // No permite descuento mayor al precio
    }
}
