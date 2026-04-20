
/**
 * Ejercicio 3: Concrecion y Polimorfismo 
 */
public class DronTransporte extends Vehiculo implements IConectable {

    public DronTransporte(String id) {
        super(id);
    }

    @Override
    public void patronMovimiento() {
        System.out.println("Dron " + getId() + " moviendose: Volando en linea recta por el espacio aereo");
    }

    @Override
    public void sincronizarGPS() {
        System.out.println("Dron " + getId() + ": Sincronizando coordenadas satelitales en tiempo real...");
    }
}