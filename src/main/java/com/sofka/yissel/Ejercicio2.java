package com.sofka.yissel;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner reader = new Scanner(System.in);
        int var1;
        int var2;
        var1 = reader.nextInt();
        System.out.println("Ingrese otro numero");
        var2 = reader.nextInt();
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
