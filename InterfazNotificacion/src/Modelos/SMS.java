
package Modelos;
import InterfazNotificar.*;

//Clase para implementar la clase Notificar y usar su metodo.
public class SMS implements Notificar{

    @Override
    public void enviarNotificacion() {
        System.out.println("Has recibido un nuevo mensaje");
        System.out.println("CLARO: Solo por hoy, 20GB de navegacion por solo $2, aprovecha esta promocion de timepo limitado.");
    }
    
}
