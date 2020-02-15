package org.foobarspam.cotxox.test;

import org.foobarspam.cotxox.carrera.Carrera;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarreraTest {

    @Test
    public void gettarjetaCreditoTest() {
        Carrera tarjetaCredito = new Carrera("123456789T");
        assertEquals("123456789T", tarjetaCredito.getTarjetaCredito());
    }

    @Test
    public void getOrigenTest() {
        Carrera tarjetaCredito = new Carrera("123456789T");
        tarjetaCredito.setOrigen("Manacor");
        assertEquals("Manacor", tarjetaCredito.getOrigen());
    }

    @Test
    public void getDestinoTest() {
        Carrera tarjetaCredito = new Carrera("123456789T");
        tarjetaCredito.setDestino("Palma");
        assertEquals("Palma", tarjetaCredito.getDestino());
    }
}
