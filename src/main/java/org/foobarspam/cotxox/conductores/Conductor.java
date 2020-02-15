package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
    private String nombre = null;
    private String modelo = null;
    private String matricula = null;
    private double valoracionMedia = 0d;
    private ArrayList<Integer> valoraciones = new ArrayList<>();
    private boolean ocupado = false;


    public Conductor() {
    };

    public Conductor(String nombre) {
        this.setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracionMedia() {
        return valoracionMedia;
    }

    public void setValoracion(Integer valoracion) {
        this.valoraciones.add(valoracion);
        this.calcularValoracionMedia();
    }

    private double calcularValoracionMedia() {
        int sumavaloraciones = 0;
        for (Integer valoracion : this.valoraciones) {
            sumavaloraciones += valoracion;
        }
        this.valoracionMedia = (double) sumavaloraciones / this.valoraciones.size();
        return this.valoracionMedia;
    }
    public double getNumeroValoraciones(){
        return this.valoraciones.size();
    }
    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}