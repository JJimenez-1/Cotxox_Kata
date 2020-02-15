package org.foobarspam.cotxox.main.carrera;

import org.foobarspam.cotxox.main.tarifa.Tarifa;

public class Carrera {
    private String tarjetaCredito = null;
    private String origen = null;
    private String destino = null;
    private double Distancia = 0d;
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private int costeTotal = 0;

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public double getDistancia() {
        return Distancia;
    }
    public void setDistancia(double distancia) {
        Distancia = distancia;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }


    public int getTiempoEsperado() {
        return tiempoEsperado;
    }

    public double getCosteEsperado(){
        return Tarifa.getCosteTotalEsperado(this);
    }
}
