package org.foobarspam.cotxox.tarifa;
import org.foobarspam.cotxox.carrera.Carrera;

public class Tarifa {
    private static double costeMilla = 1.35;
    private static double costeMinuto = 0.35;
    private static double costeMinimo = 5.0;
    private static int porcentajeComision = 20;


    public static double getCosteDistancia(double distancia) {
        return distancia * costeMilla;
    }
    public static double getCosteTiempo(int minutos) {
        return minutos * costeMinuto;
    }

    public static double getCosteTotalEsperado(Carrera carrera) {
        double costeTotal = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
        return costeTotal > costeMinimo ? costeTotal : costeMinimo;
    }

}
