
package Modelos;
import Calculadora.*;
        
public class DescuentoPorcentaje implements CalcularDescuento{
    private double porcentaje; //Porcentaje de descuento
    
    // Constructor para inicializar el porcentaje
    public DescuentoPorcentaje(double porcentaje){
        this.porcentaje = porcentaje;
    }
    
    // Implementación del método calcularDescuento()
    @Override
    public double calcularDescuento(double precio) {
       return precio * (porcentaje / 100);// Descuento en base al porcentaje
    }
    
}
