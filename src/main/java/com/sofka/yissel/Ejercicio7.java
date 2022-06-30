package com.sofka.yissel;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numero = 0;
        do {
            System.out.println("Ingrese un numero mayor o igual a cero");
            Scanner reader = new Scanner(System.in);
            numero = reader.nextInt();
        } while (numero < 0);
    }
}
