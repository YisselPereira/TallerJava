package com.sofka.yissel;

public class Persona{
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        DNI = generaDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
        this.DNI = this.generaDNI();
    }
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        this.DNI = this.generaDNI();
    }
    public int calcularIMC(){
        double IMC = peso/(Math.pow(altura,2));
        if (IMC < 20){
            return -1;
        }
        if (IMC >= 20 || IMC <= 25){
            return 0;
        }
        return 1;
    }
    public boolean esMayorDeEdad(){
        if (edad > 18){
            return true;
        }
        else {
            return false;
        }
    }

    private char comprobarSexo(char sexo) {
        if (sexo == 'M'){
            return 'M';
        }
        else {
            return 'H';
        }
    }
    public String toString(){
        String texto;
        texto = "Nombre: "+ this.nombre +
                "\n Sexo: "+ this.sexo +
                "\n Edad: "+ this.edad +
                "\n DNI: "+ this.DNI +
                "\n Peso: "+ this.peso +
                "\n Altura:"+ this.altura;
        return texto;
    }
    private String generaDNI(){
        String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        int nro = (int)(Math.random()*100000000);
        int pos = nro % 23;

        return String.valueOf(nro) + String.valueOf(letra.charAt(pos));
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSexo(char sexo){
        this.sexo = this.comprobarSexo(sexo);
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    public String getNombre() {
        return this.nombre;
    }
}

