package com.sofka.yissel;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese un texto");
        String texto = reader.nextLine();
        int largo;
        largo = texto.length();
        System.out.println("El texto tiene "+largo+ " caracteres");
        int contador = 0;
        for (int x = 0; x < largo; x++){
            char letra = texto.charAt(x);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        System.out.println("El texto tiene "+contador+ " vocales");
    }
}
