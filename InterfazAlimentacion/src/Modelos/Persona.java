
package Modelos;
import AccionAlimentaria.Alimentacion;
/**
 *
 * @author Rene
 */
public class Persona implements Alimentacion{

    @Override
    public void comer() {
        System.out.println("La persona procede a comer su almuerzo.");
    }
    
}
