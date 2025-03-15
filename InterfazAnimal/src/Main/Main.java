package Main;
import Modelos.AnimalAcciones;
import Modelos.Gato;
import Modelos.Perro;

public class Main {
    public static void main(String[] args) 
    {
        // --Asignacion de referencias de la clase AnimalAcciones
        // para usar en los metodos--.
        AnimalAcciones kaiser = new Perro();
        AnimalAcciones gatoLoco = new Gato();
        
        //Acciones para el perro.
        kaiser.hacerSonido();
        kaiser.mover();
        
        //Acciones para el gato.
        gatoLoco.hacerSonido();
        gatoLoco.mover();
    }
}
