package com.sofka.yissel;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese un texto");
        String texto = reader.nextLine();
        texto = texto.replace(" ","");
        System.out.println(texto);
    }
}
