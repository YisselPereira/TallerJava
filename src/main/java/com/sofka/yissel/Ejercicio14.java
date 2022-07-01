package com.sofka.yissel;

import javax.swing.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        numero = numero +2;
        for (numero = numero; numero <=1000; numero++){
        if (numero <=1000) {
            System.out.println("Los numero son "+numero);
        }
        numero++;
        }
    }
}
