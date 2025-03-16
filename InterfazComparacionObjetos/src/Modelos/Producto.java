package Modelos;
import InterfazComparable.*;

//Se implementa la interfaz compararObjeto en la clase Producto
public class Producto implements compararObjeto{
    private double precio; //Atributo precio
    
    //Consytructor
    public Producto(double precio){
        this.precio = precio;
    }
    
    // Getter para obtener el precio
    public double getPrecio(){
        return precio;
    }
    
    //Implementacion del metodo comparar()
    @Override
    public int comparar(Object o) {
        if (o instanceof Producto) {
        Producto otroproducto = (Producto) o; //Se convierte "o" a producto
        return Double.compare(this.precio, otroproducto.getPrecio());
        }
        
        throw new IllegalArgumentException("El objeto no es un producto");
    }
    
}
