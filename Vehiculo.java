
/**
 * Ejercicio 1: Clase Abstracta
 * 
 * @author Nestor Abel Fessler Sanchez
 * @version (a version number or a date)
 */
public abstract class Vehiculo {
    private String id; // Atributo privado

    // Constructor
    public Vehiculo(String id) {
        this.id = id;
    }

    // Metodo concreto para reutilizar codigo
    public String getId() {
        return id;
    }

    // Metodo abstracto (anotacion obligatoria para las subclases)
    public abstract void patronMovimiento();
}