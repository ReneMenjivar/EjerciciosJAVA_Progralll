
package Main;
import Calculadora.*;
import Modelos.*;

public class Main {
    public static void main(String[] args) {
        double precio = 100.0; // Precio original

        // Aplicamos un descuento del 10% con DescuentoPorcentaje
        CalcularDescuento descuentoPorcentaje = new DescuentoPorcentaje(10);
        double descuento1 = descuentoPorcentaje.calcularDescuento(precio);
        System.out.println("Descuento por porcentaje (10%): $" + descuento1);
        
        // Aplicamos un descuento fijo de $15 con DescuentoFijo
        CalcularDescuento descuentoFijo = new DescuentoFijo(15);
        double descuento2 = descuentoFijo.calcularDescuento(precio);
        System.out.println("Descuento fijo de $15: $" + descuento2);
        
        // Calculamos el precio final después de aplicar cada descuento
        System.out.println("Precio final con descuento por porcentaje: $" + (precio - descuento1));
        System.out.println("Precio final con descuento fijo: $" + (precio - descuento2));
    }
}

