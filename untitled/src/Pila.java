/**
 * Clase Pila
 * Implementa la estructura de datos Pila manualmente
 * utilizando nodos enlazados.
 *
 * Una pila funciona con el principio LIFO
 * (Last In, First Out) → el último en entrar es el primero en salir.
 */
// Clase pública para crear instancias desde otras clases
public class Pila {

    private Nodo cima; // referencia al nodo que está en la parte superior de la pila

    /**
     * Constructor de la pila
     * Inicializa la pila vacía
     */
    public Pila() {
        cima = null;
    }

    /**
     * Método push
     * Agrega un nuevo elemento a la cima de la pila
     * @param dato texto que se agregará
     */
    public void push(String dato) {

        Nodo nuevo = new Nodo(dato); // se crea un nuevo nodo

        // el nuevo nodo apunta al que era la cima
        nuevo.siguiente = cima;

        // ahora el nuevo nodo se convierte en la cima
        cima = nuevo;
    }

    /**
     * Método pop
     * Elimina el elemento de la cima de la pila
     * y devuelve su valor
     */
    public String pop() {

        // si la pila está vacía no se puede eliminar nada
        if (isEmpty()) {
            return null;
        }

        // se guarda el dato de la cima
        String dato = cima.dato;

        // la cima pasa a ser el siguiente nodo
        cima = cima.siguiente;

        return dato;
    }

    /**
     * Método peek
     * Permite ver el elemento superior de la pila
     * sin eliminarlo
     */
    public String peek() {

        if (isEmpty()) {
            return null;
        }

        return cima.dato;
    }

    /**
     * Método isEmpty
     * Verifica si la pila está vacía
     */
    public boolean isEmpty() {
        return cima == null;
    }
}