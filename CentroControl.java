/**
 * Ejercicio 4: Gestion de Datos y Estructura
 */
import java.util.ArrayList;

public class CentroControl {
    // Composicion
    private ArrayList<Vehiculo> flota;

    public CentroControl() {
        this.flota = new ArrayList<>();
    }

    // Agregacion
    public void registrarUnidad(Vehiculo v) {
        flota.add(v);
        System.out.println("-> Vehiculo [" + v.getId() + "] registrado exitosamente en el sistema.");
    }

    // Polimorfismo
    public void monitorearFlota() {
        System.out.println("\n-=- INICIANDO MONITOREO DE FLOTA -=-");
        for (Vehiculo v : flota) {
            v.patronMovimiento();
        }
        System.out.println("=--=---==------------------==---=--=");
    }
}