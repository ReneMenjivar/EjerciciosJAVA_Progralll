
package Modelos;
import Modelos.AnimalAcciones;

public class Perro implements AnimalAcciones {
    @Override
    public void hacerSonido(){
        System.out.println("El chucho ladra: ¡Guau!");
    }
    @Override
    public void mover(){
        System.out.println("El chucho corre rapido");
    }
}
