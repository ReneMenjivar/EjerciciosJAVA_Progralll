
package Modelos;
import InterfazGeometrica.*;

// Implementación de la interfaz FiguraGeometrica en la clase Rectangulo
public class Rectangulo implements FiguraGeometrica{
     private double base;
    private double altura;

    // Constructor para inicializar base y altura
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método area()
    @Override
    public double area() {
        return base * altura;
    }

    // Implementación del método perimetro()
    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }
}
