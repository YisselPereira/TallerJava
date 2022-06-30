package com.sofka.yissel;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        String texto = "La sonrisa sera la mejor arma contra la tristeza. ";
        texto.replace('a','e');
        texto = texto.replace('a','e');
        System.out.println(texto);
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese un texto");
        String texto2 = reader.nextLine();
        System.out.println(texto + texto2);
    }
}
