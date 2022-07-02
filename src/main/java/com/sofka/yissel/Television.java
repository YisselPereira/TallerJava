package com.sofka.yissel;

public class Television extends Electrodomestico{
    private int resolucion;
    private boolean sintonizador;

    public Television(){
        super();
        this.resolucion = 20;
        this.sintonizador = false;
    }
    public Television(double precio, double peso){
        super(precio,peso);
        this.resolucion = 20;
        this.sintonizador = false;
    }
    public Television(int resolucion, boolean sintonizador, double precio, double peso, String color, char consumo){
        super(precio,peso,color,consumo);
        this.sintonizador = sintonizador;
        this.resolucion = resolucion;
    }
    public boolean isSintonizador(){
        return sintonizador;
    }
    public int getResolucion(){
        return resolucion;
    }
    public double precioFinal(){
        double precioFinal = super.precioFinal();
        if (this.resolucion >30){
            precioFinal = precioFinal*1.30;
        }
        if (this.sintonizador){
            precioFinal = precioFinal+50;
        }
        return precioFinal;
    }
}
