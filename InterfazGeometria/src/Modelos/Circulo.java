
package Modelos;
import InterfazGeometrica.*;

public class Circulo implements FiguraGeometrica{
    private double radio; //variable que almacena el radio del circulo
    
    //Constructor para inicializar el radio
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return 2*Math.PI * radio;
    }
    
    
}
