package com.sofka.yissel;

public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora(){
        super();
        this.carga = Constantes.carga;
    }
    public Lavadora(double precio, double peso){
        super(precio,peso);
        this.carga = Constantes.carga;
    }
    public Lavadora(int carga, double precio, double peso, String color, char consumo){
        super(precio,peso,color,consumo);
        this.carga = carga;
    }
    public int getCarga(){
        return carga;
    }
    public double precioFinal(){
        double precioFinal = super.precioFinal();
        if (carga >30){
            precioFinal = precioFinal+50;
        }
        return precioFinal;
    }
}
