
package Main;
import InterfazGeometrica.*;
import Modelos.*;

public class main {
    public static void main(String[] args) {
        // Crear un círculo de radio 5
        FiguraGeometrica circulo = new Circulo(5);
        System.out.println("Circulo - Area: " + circulo.area());
        System.out.println("Circulo - Perimetro: " + circulo.perimetro());

        // Crear un rectángulo de base 4 y altura 6
        FiguraGeometrica rectangulo = new Rectangulo(4, 6);
        System.out.println("Rectangulo - Area: " + rectangulo.area());
        System.out.println("Rectangulo - Perimetro: " + rectangulo.perimetro());
    }
}
