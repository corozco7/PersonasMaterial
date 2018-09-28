package com.movil.clase.personasmaterial;

public class Persona {
    private int foto;
    private String cedula;
    private String nombre;
    private String apelllido;
    private int sexo;

    public Persona(int foto, String cedula, String nombre, String apelllido, int sexo) {
        this.foto = foto;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apelllido = apelllido;
        this.sexo = sexo;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelllido() {
        return apelllido;
    }

    public void setApelllido(String apelllido) {
        this.apelllido = apelllido;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
}
