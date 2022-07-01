package com.sofka.yissel;

import javax.swing.*;

public class Ejercicio15 {
    public static void main(String[] args) {
        int opcion = Integer.parseInt(mostrarMenu());
        while(opcion != 8){
        switch (opcion){
            case 1:
                opcion = Integer.parseInt(mostrarMenu());
                break;
            case 2:
                opcion = Integer.parseInt(mostrarMenu());
                break;
            case 3:
                opcion = Integer.parseInt(mostrarMenu());
                break;
            case 4:
                opcion = Integer.parseInt(mostrarMenu());
                break;
            case 5:
                opcion = Integer.parseInt(mostrarMenu());
                break;
            case 6:
                opcion = Integer.parseInt(mostrarMenu());
                break;
            case 7:
                opcion = Integer.parseInt(mostrarMenu());
                break;
            default:
                JOptionPane.showMessageDialog(null, "OPCION INCORRECTA");
                opcion = Integer.parseInt(mostrarMenu());
        }
        }
    }
    public static String mostrarMenu(){
        return JOptionPane.showInputDialog("****** GESTION CINEMATOGRAFICA ******** "+ "\n 1-NUEVO ACTOR"+
                " \n 2-BUSCAR ACTOR"+
                " \n 3-ELIMINAR ACTOR"+
                " \n 4-MODIFICAR ACTOR"+
                " \n 5-VER TODOS LOS ACTORES"+
                " \n 6- VER PELICULAS DE LOS ACTORES"+
                " \n 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES"+
                " \n 8-SALIR");
    }
}
