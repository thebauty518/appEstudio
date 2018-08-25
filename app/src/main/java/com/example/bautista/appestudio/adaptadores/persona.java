package com.example.bautista.appestudio.adaptadores;

public class persona {

    private String nombre;
    private String apellido;
    private int foto;


    public persona() {
    }

    public persona(String nombre, String apellido, int foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
