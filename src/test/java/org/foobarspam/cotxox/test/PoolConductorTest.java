package org.foobarspam.cotxox.test;

import java.util.ArrayList;

import org.foobarspam.cotxox.conductores.Conductor;
import org.foobarspam.cotxox.conductores.PoolConductores;
import org.junit.Test;

public class PoolConductoresTest {

    @Test
    public void ConstructorTest() {
        // Construccion del pool de conductores

        ArrayList<Conductor> poolConductores = new ArrayList<>();
        Conductor conductor = null;

        String[] nombres = { "Samantha", "Fox" };
        for (String nombre : nombres) {
            conductor = new Conductor(nombre);
            poolConductores.add(conductor);
        }

        String[] matricula = { "4ABC123", "5DHJ234" };
        String[] modelos = { "Chevy Malibu", "Toyota Prius" };

        int index = 0;
        // conductora.getClass().getFields();
        for (Conductor conductora : poolConductores) {
            conductora.setMatricula(matricula[index]);
            conductora.setModelo(modelos[index]);
            conductora.setValoracion((Integer) 0);
            index++;
        }

        PoolConductores conductores = new PoolConductores(poolConductores);

        for (Conductor conductora : conductores.getPoolConductores()) {
            System.out.println(conductora.getNombre());
            System.out.println(conductora.getModelo());
            System.out.println(conductora.getMatricula());
            System.out.println(conductora.getValoracionMedia());
        }
    }

}