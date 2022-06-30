package com.sofka.yissel;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numero2;
        numero2 = 100;
        for (int numero1 = 1; numero1 <= numero2 ; numero1++) {
            if (numero1 % 2 == 0){
                System.out.println("El "+numero1+" es par");
            }
            else{
                System.out.println("El "+numero1+" es impar");
            }
        }
    }
}
