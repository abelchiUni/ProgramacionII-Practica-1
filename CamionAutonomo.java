
/**
 * Ejercicio 3: Concrecion y Polimorfismo
 */
public class CamionAutonomo extends Vehiculo {

    public CamionAutonomo(String id) {
        super(id);
    }

    @Override
    public void patronMovimiento() {
        System.out.println("Camion " + getId() + " moviendose: Conduciendo por rutas terrestres");
    }
}