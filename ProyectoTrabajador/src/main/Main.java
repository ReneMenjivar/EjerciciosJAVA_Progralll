package main;

import modelos.Trabajador;
import modelos.Diseñador;
import modelos.Desarrollador;

public class Main {
    public static void main(String[] args){
        Trabajador dev = new Desarrollador();
        Trabajador dis = new Diseñador();
        
        dev.trabajar();
        dis.trabajar();
        
    }
}
