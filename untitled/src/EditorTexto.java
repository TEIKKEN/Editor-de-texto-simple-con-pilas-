import java.util.Scanner;

/**
 * Programa principal
 * Simula un editor de texto simple utilizando dos pilas
 *
 * pilaPrincipal → guarda las acciones realizadas
 * pilaRedo → guarda las acciones deshechas para poder rehacerlas
 *
 * Este programa demuestra el uso de pilas para implementar
 * la funcionalidad de Deshacer (Undo) y Rehacer (Redo).
 */

public class EditorTexto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // pila donde se almacenan las líneas escritas
        Pila pilaPrincipal = new Pila();

        // pila que almacena las acciones deshechas
        Pila pilaRedo = new Pila();

        int opcion;

        // ciclo principal del programa
        do {

            // menú del editor
            System.out.println("\n--- EDITOR DE TEXTO ---");
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer (Undo)");
            System.out.println("3. Rehacer (Redo)");
            System.out.println("4. Mostrar texto actual");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:

                    // escribir una nueva línea de texto
                    System.out.print("Escriba una linea de texto: ");
                    String texto = scanner.nextLine();

                    // se guarda en la pila principal
                    pilaPrincipal.push(texto);

                    // cuando se escribe algo nuevo
                    // la pila redo se reinicia
                    pilaRedo = new Pila();

                    break;

                case 2:

                    // DESHACER
                    if (!pilaPrincipal.isEmpty()) {

                        // se elimina la última acción
                        String deshecho = pilaPrincipal.pop();

                        // se guarda en la pila redo
                        pilaRedo.push(deshecho);

                        System.out.println("Se deshizo: " + deshecho);

                    } else {
                        System.out.println("No hay acciones para deshacer.");
                    }

                    break;

                case 3:

                    // REHACER
                    if (!pilaRedo.isEmpty()) {

                        // se recupera la acción deshecha
                        String rehacer = pilaRedo.pop();

                        // vuelve a la pila principal
                        pilaPrincipal.push(rehacer);

                        System.out.println("Se rehizo: " + rehacer);

                    } else {
                        System.out.println("No hay acciones para rehacer.");
                    }

                    break;

                case 4:

                    // mostrar texto actual
                    if (pilaPrincipal.isEmpty()) {

                        System.out.println("No hay texto.");

                    } else {

                        // se muestra la última línea escrita
                        System.out.println("Ultima linea escrita: " + pilaPrincipal.peek());
                    }

                    break;

                case 5:

                    System.out.println("Saliendo del programa...");
                    break;

                default:

                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}