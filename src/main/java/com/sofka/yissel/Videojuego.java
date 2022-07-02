package com.sofka.yissel;

public class Videojuego implements Entregable{
    private String titulo;
    private int horas;
    private boolean entregado;
    private String genero;
    private String compania;

    public Videojuego(){
        this.titulo = "";
        this.horas = 10;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    public Videojuego(String titulo, int horas){
        this.titulo = titulo;
        this.horas = horas;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    public Videojuego(String titulo, int horas, String genero, String compania) {
        this.titulo = titulo;
        this.horas = horas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String toString(){
        String texto = "Titulo: "+ this.titulo+"\n"+
                "Horas: "+ this.horas+"\n"+
                "Genero: "+ this.genero+"\n"+
                "Compania: "+ this.compania+"\n"+
                "Entregado: "+ this.entregado;
        return texto;
    }

    public void entregar() {
        this.entregado = true;
    }

    public void devolver() {
        this.entregado = false;
    }

    public boolean isEntregado() {
        return this.entregado;
    }

    public int compareTo(Object a) {
        Videojuego juego = (Videojuego) a;
        if(this.horas < juego.horas){
            return -1;
        }
        if(this.horas == juego.horas){
            return 0;
        }
        return 1;
    }
}