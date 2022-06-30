package com.sofka.yissel;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Ingrese un dia de la semana");
        Scanner reader = new Scanner(System.in);
        String dia;
        dia = reader.next();

        switch (dia){
            case "lunes" : {
            System.out.println("Es un dia laboral");
            break;
            }
            case "martes" : {
                System.out.println("Es un dia laboral");
                break;
            }
            case "miercoles" : {
                System.out.println("Es un dia laboral");
                break;
            }
            case "jueves" :{
                System.out.println("Es un dia laboral");
                break;
            }
            case "viernes": {
                System.out.println("Es un dia laboral");
                break;
            }
            case "sabado":{
                System.out.println("No es un dia laboral");
                break;
            }
            case "domingo":{
                System.out.println("No es un dia laboral");
                break;
            }
        }
    }
}
