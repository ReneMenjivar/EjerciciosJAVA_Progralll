
package Main;

//Importaciones para usar las clases y metodos foraneos
import InterfazNotificar.*;
import Modelos.*;


public class Main {
     public static void main(String[] args){
        Notificar dev = new CorreoElectronico();
        Notificar dis = new SMS();
        
        dev.enviarNotificacion();
        dis.enviarNotificacion();
        
    }
}
