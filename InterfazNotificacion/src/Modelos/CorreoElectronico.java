
package Modelos;
import InterfazNotificar.*;

public class CorreoElectronico implements Notificar{

    @Override
    public void enviarNotificacion() {
        System.out.println("Ha recibido un email nuevo");
        System.out.println("Google: Alerta de seguridad | Nuevo inicio de sesion.");
        System.out.println();
    }
    
}
