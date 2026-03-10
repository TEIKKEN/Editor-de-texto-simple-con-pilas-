/**
 * Clase Nodo
 * Representa cada elemento dentro de la pila.
 * Cada nodo guarda un dato (texto) y una referencia
 * al siguiente nodo en la pila.
 */

public class Nodo {

    String dato;      // texto que guarda el nodo
    Nodo siguiente;   // referencia al siguiente nodo

    /**
     * Constructor del nodo
     * @param dato texto que se almacenará en la pila
     */
    public Nodo(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}