package com.sofka.yissel;

public class Serie implements Entregable{
    private String titulo;
    private int numero;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie(){
        this.titulo = "";
        this.numero = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.numero = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = creador;
    }

    public Serie(String titulo, int numero, String genero, String creador) {
        this.titulo = titulo;
        this.numero = numero;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String toString(){
        String texto = "Titulo: "+ this.titulo+"\n"+
                "Temporadas: "+ this.numero+"\n"+
                "Genero: "+ this.genero+"\n"+
                "Creador: "+ this.creador+"\n"+
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
        Serie serie = (Serie) a;
        if(this.numero < serie.numero){
            return -1;
        }
        if(this.numero == serie.numero){
            return 0;
        }
        return 1;
    }
}
