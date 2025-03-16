
package Main;
import Modelos.ListaNumeros;
/**
 *
 * @author Rene
 */
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de ListaNumeros
        ListaNumeros lista = new ListaNumeros();

        // Agregar números a la lista
        lista.agregarNumero(5);
        lista.agregarNumero(2);
        lista.agregarNumero(9);
        lista.agregarNumero(1);

        // Mostrar la lista antes de ordenar
        System.out.println("Lista antes de ordenar:");
        lista.mostrarLista();

        // Ordenar la lista
        lista.ordenar();

        // Mostrar la lista después de ordenar
        System.out.println("Lista despues de ordenar:");
        lista.mostrarLista();
    }
}

