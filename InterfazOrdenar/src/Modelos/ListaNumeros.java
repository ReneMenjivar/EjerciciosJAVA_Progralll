package Modelos;

//Importaciones para las listas de numeros
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Clase que implementa la interfaz Ordenador
public class ListaNumeros implements Ordenador{
    private List<Integer> numeros;
    
    public ListaNumeros(){ //Constructor que inicia la lista
        this.numeros = new ArrayList<>();
    }
    
    public void agregarNumero(int numero) 
    {
        numeros.add(numero);
    }
    
    // Implementación del método ordenar() de la interfaz Ordenable
    @Override
    public void ordenar() {
        Collections.sort(numeros); // Ordena la lista en orden ascendente
    }
    //Implementacion del metodo Ordenar() de la interfaz Ordenador
    public void Ordenar(){
        Collections.sort(numeros);}
    
    //Metodo para mostrar la lista en consola
    public void mostrarLista(){
    System.out.println(numeros);
    }
    
}
