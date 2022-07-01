package com.sofka.yissel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio13 {
    public static void main(String[] args) {
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("La fecha y hora actual es " + fecha.format(LocalDateTime.now()));
    }
}