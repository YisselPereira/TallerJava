package com.sofka.yissel;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        numero1 = 1;
        numero2 = 100;
        while(numero1 <= numero2){
           if (numero1 % 2 == 0){
            System.out.println("El "+numero1 + " es par");
           }
           else {
               System.out.println("El "+numero1 + " es impar");
           }
           numero1++;
        }
    }
}
