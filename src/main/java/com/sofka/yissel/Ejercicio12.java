package com.sofka.yissel;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String texto = reader.nextLine();
        System.out.println("Ingrese otra palabra");
        String texto2 = reader.nextLine();
        if (texto==texto2){
            System.out.println("Las palabras son iguales");
        }
        else {
            int contador = 0;
            int largo = texto.length();
            int largo2 = texto2.length();
            if (largo != largo2){
                System.out.println("Las palabras tienen distinto largo");
            }
            else {
                for (int x = 0; x < largo; x++) {
                    char letra = texto.charAt(x);
                    char letra2 = texto2.charAt(x);
                    if (letra != letra2) {
                        contador++;
                    }
                }
                System.out.println("Las palabras tienen " + contador + " caracteres de diferencia");
            }
        }
    }
}
