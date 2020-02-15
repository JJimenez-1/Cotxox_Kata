package org.foobarspam.cotxox.test;

import org.foobarspam.cotxox.carrera.Carrera;
import org.foobarspam.cotxox.tarifa.Tarifa;
import org.junit.Test;
import static org.junit.Assert.*;

public class TarifaTest {

    Carrera carrera = new Carrera("12315563415");

    @Test
    public void getCosteDistanciaTest() {
        double distancia = Tarifa.getCosteDistancia(10);
        assertEquals(13.5, distancia,0);
    }

    @Test
    public void getCosteTiempoTest() {
        double tiempo = Tarifa.getCosteTiempo(10);
        assertEquals(13.5, tiempo,0);
    }

    @Test
    public void getCosteTotalEsperado() {
        carrera.setDistancia(7.75);
        carrera.setTiempoEsperado(10);
        double costeTotal = 7.75 * 1.35 + 0.35 * 10;
        double delta = 0.01;
        assertEquals(costeTotal, Tarifa.getCosteTotalEsperado(carrera), delta);
    }
}
