package com.sofka.yissel;

public class Ejercicio1 {
    public static void main(String[] args) {
        int var1;
        int var2;
        var1 =100;
        var2 = 100;
        comparacion(var1,var2);
    }
    public static void comparacion(int var1, int var2){
        if (var1 < var2){
            System.out.println("La variable uno es menor a la variable dos");
        }
        else {
            if (var1 > var2){
                System.out.println("La variable uno es mayor a la variable dos");
            }
            else {
                System.out.println("Las variables son del mismo valor");
            }
        }
    }
}

