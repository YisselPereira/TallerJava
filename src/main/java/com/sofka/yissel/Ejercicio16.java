package com.sofka.yissel;

import javax.swing.*;
import java.lang.String;

public class Ejercicio16 {
    public static void main(String[] args) {
        String nombre;
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        int edad;
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        char sexo;
        sexo = JOptionPane.showInputDialog("Ingrese su sexo (H/M)").charAt(0);
        double peso;
        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso"));
        double altura;
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura"));

        Persona p = new Persona(nombre,edad,sexo,peso,altura);
        Persona p2 = new Persona(nombre,edad,sexo);
        Persona p3 = new Persona();
        p3.setNombre(nombre);
        p3.setEdad(edad);
        p3.setSexo(sexo);
        p3.setPeso(peso);
        p3.setAltura(altura);
        mostrarPersona(p);
        mostrarPersona(p2);
        mostrarPersona(p3);

    }
    public static void mostrarPersona(Persona p){
        String nombre = p.getNombre();
        int IMC = p.calcularIMC();
        if (IMC == -1){
            JOptionPane.showMessageDialog(null, nombre+" esta por debajo su peso ideal");
        }
        if (IMC == 0){
            JOptionPane.showMessageDialog(null, nombre+ " esta en su peso ideal");
        }
        if (IMC == 1){
            JOptionPane.showMessageDialog(null, nombre+ " tiene sobrepeso");
        }
        if (p.esMayorDeEdad()){
            JOptionPane.showMessageDialog(null, "Es mayor de edad");
        }
        else {
            JOptionPane.showMessageDialog(null, "Es menor de edad");
        }
        JOptionPane.showMessageDialog(null, p.toString());
    }
}
