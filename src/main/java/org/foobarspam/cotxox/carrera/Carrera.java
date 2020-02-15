package org.foobarspam.cotxox.carrera;

import org.foobarspam.cotxox.conductores.Conductor;
import org.foobarspam.cotxox.conductores.PoolConductores;
import org.foobarspam.cotxox.tarifa.Tarifa;

public class Carrera {
    private String tarjetaCredito = null;
    private String origen = null;
    private String destino = null;
    private double Distancia = 0d;
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0d;
    private double propina = 0d;
    private Conductor conductor = null;

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

    public void asignarConductor(PoolConductores conductores) {
        setConductor(conductores.asignarConductor());
    }

    public int getTiempoEsperado() {
        return tiempoEsperado;
    }

    public double getCosteEsperado(){
        return Tarifa.getCosteTotalEsperado(this);
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void realizarPago(double pago) {
        this.costeTotal = pago;
    }

    public void recibirPropina(double propina) {
        this.propina = propina;
    }

    public void liberarConductor() {
        getConductor().setOcupado(false);
    }
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public double getPropina() {
        return propina;
    }

    public double getCosteTotal() {
        return costeTotal;
    }
}
