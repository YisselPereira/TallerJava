package com.sofka.yissel;

import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        double radio;
        double area;
        String r = JOptionPane.showInputDialog("Ingrese el radio");
        radio = Double.parseDouble(r);
        area = Math.PI * Math.pow(radio,2);
        JOptionPane.showMessageDialog(null,"El area del circulo es "+area);
    }
}
