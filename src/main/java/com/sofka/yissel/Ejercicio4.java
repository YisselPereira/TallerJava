package com.sofka.yissel;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Ingrese el precio");
        Scanner reader = new Scanner(System.in);
        double numero;
        numero = reader.nextInt();
        numero = numero * 1.21;
        System.out.println("El precio del producto mas IVA es "+numero);
    }
}
