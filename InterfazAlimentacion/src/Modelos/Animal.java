
package Modelos;
import AccionAlimentaria.Alimentacion;
/**
 *
 * @author Rene
 */
public class Animal implements Alimentacion{

    @Override
    public void comer() {
        System.out.println("La vaca come el pasto verde y fresco");
    }
    
}
