package com.sofka.yissel;

public class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;
    public Electrodomestico(){
        this.precio = Constantes.precio;
        this.color = Constantes.COLOR;
        this.consumo = Constantes.consumo;
        this.peso = Constantes.peso;
    }
    public Electrodomestico(double precio, double peso){
        this.precio = precio;
        this.peso = peso;
        this.consumo = Constantes.consumo;
        this.color = Constantes.COLOR;
    }
    public Electrodomestico(double precio, double peso, String color, char consumo){
        this.precio = precio;
        this.peso = peso;
        this.color = this.comprobarColor(color);
        this.consumo = this.comprobarConsumoEnergetico(consumo);

    }
    public double getPrecio(){
        return precio;
    }
    public double getPeso(){
        return peso;
    }
    public String getColor(){
        return color;
    }
    public char getConsumo(){
        return consumo;
    }
    protected char comprobarConsumoEnergetico(char consumo){
        if (consumo == 'A' || consumo == 'B' || consumo == 'C' || consumo =='D' || consumo == 'E'){
            return consumo;
        }
        return Constantes.consumo;
    }
    protected String comprobarColor(String color){
        if (color == "blanco" || color == "negro" || color == "rojo" || color == "azul" || color == "gris"){
            return color;
        }
        return Constantes.COLOR;
    }
    public double precioFinal(){
        double precioFinal = this.precio;
        switch (consumo){
            case 'A':
                precioFinal = precioFinal+100;
                break;
            case 'B':
                precioFinal = precioFinal+80;
                break;
            case 'C':
                precioFinal = precioFinal+60;
                break;
            case 'D':
                precioFinal = precioFinal+50;
                break;
            case 'E':
                precioFinal = precioFinal+30;
                break;
            case 'F':
                precioFinal = precioFinal+10;
                break;
        }
        if (this.peso >=0 && this.peso <=19){
            precioFinal = precioFinal+10;
        }
        if (this.peso >=20 && this.peso <= 49){
            precioFinal = precioFinal+50;
        }
        if (this.peso >=50 && this.peso <=79){
            precioFinal = precioFinal+80;
        }
        if (this.peso > 80){
            precioFinal = precioFinal+100;
        }
        return precioFinal;
    }
}
