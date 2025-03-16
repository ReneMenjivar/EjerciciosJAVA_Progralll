package Main;
import Interfazcomparable.*;
import Modelos.*;


public class Main {
    public static void main(String[] args) {
        // Creamos dos productos con diferentes precios
        Producto p1 = new Producto(20.50);
        Producto p2 = new Producto(15.75);

        // Comparamos los productos
        int resultado = p1.comparar(p2);

        // Mostramos el resultado de la comparación
        if (resultado == 0) {
            System.out.println("Ambos productos tienen el mismo precio.");
        } else if (resultado > 0) {
            System.out.println("El primer producto es más caro que el segundo.");
        } else {
            System.out.println("El primer producto es más barato que el segundo.");
        }
    }
}
