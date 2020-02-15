package org.foobarspam.cotxox.test;
import org.junit.Test;
import static org.junit.Assert.*;

import org.foobarspam.cotxox.conductores.Conductor;
public class ConductorTtest {

    @Test
    public void getConductorTest() {
        String nombre = "Jose";
        Conductor conductor = new Conductor(nombre);
        assertEquals(nombre, conductor.getNombre());
    }

    @Test
    public void ValoracionMediaTest() {
        String nombre = "Samantha";
        Conductor conductor = new Conductor(nombre);
        conductor.setValoracion((Integer) 5);
        assertEquals(1, conductor.getNumeroValoraciones(), 0);
        assertEquals(5, conductor.getValoracionMedia(), 0.1);

        int numeroValoraciones = 0;
        for (int valoracion = 0; valoracion <= 5; valoracion++) {
            conductor.setValoracion((Integer) valoracion);
            numeroValoraciones++;
        }
        assertEquals(numeroValoraciones + 1, conductor.getNumeroValoraciones(), 0);
        assertEquals(2.875, conductor.getValoracionMedia(), 0.1);
    }
}
