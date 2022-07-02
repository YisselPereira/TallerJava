package com.sofka.yissel;

public class Ejercicio17 {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        electrodomesticos[0] = new Lavadora();
        electrodomesticos[1] = new Lavadora(50,2000,5,"blanco",'A');
        electrodomesticos[2] = new Television();
        electrodomesticos[3] = new Television(1000,5);
        electrodomesticos[4] = new Lavadora(150,25);
        electrodomesticos[5] = new Television(1450,15);
        electrodomesticos[6] = new Lavadora(1520,20);
        electrodomesticos[7] = new Lavadora(2000,25);
        electrodomesticos[8] = new Television(4500,54);
        electrodomesticos[9] = new Lavadora(7000,50);

        double precioTelevisores = 0;
        double precioLavadoras = 0;
        double sumaElectrodomesticos = 0;

        for (int x = 0; x < 10; x++){
            double precioFinal = electrodomesticos[x].precioFinal();
            if (electrodomesticos[x] instanceof Television){
                precioTelevisores = precioTelevisores+ precioFinal;
            }
            if (electrodomesticos[x] instanceof Lavadora){
                precioLavadoras = precioLavadoras + precioFinal;
            }
            sumaElectrodomesticos = sumaElectrodomesticos + precioFinal;
        }
        System.out.println("El precio final de los televisores es "+precioTelevisores);
        System.out.println("El precio final de las lavadoras es "+precioLavadoras);
        System.out.println("El precio final de los electrodomesticos es "+sumaElectrodomesticos);
    }
}
