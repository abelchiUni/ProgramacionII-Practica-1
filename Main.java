
/**
 * Clase de Prueba
 * 
 * @author Nestor Fessler
 */
public class Main {
    public static void main(String[] args) {
        // 1. Instanciar el centro de control
        CentroControl centro = new CentroControl();

        // 2. Crear las unidades concretas
        DronTransporte dron1 = new DronTransporte("DRN-ALPHA-01");
        CamionAutonomo camion1 = new CamionAutonomo("CAM-TERRA-21");

        // 3. Agregacion
        centro.registrarUnidad(dron1);
        centro.registrarUnidad(camion1);

        // 4. Interfaz
        System.out.println("\n--- ESTADO DE CONEXION ---");
        dron1.sincronizarGPS(); 

        // 5. Polimorfismo
        centro.monitorearFlota();
    }
}