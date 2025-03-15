
package Modelos;
import Modelos.AnimalAcciones;

public class Gato implements AnimalAcciones{
    @Override
    public void hacerSonido(){
        System.out.println("El gato maulla: ¡Miu!");
    }
    @Override
    public void mover(){
        System.out.println("El gato salta a todos lados xd");
    }
}
