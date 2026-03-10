# Editor de Texto Simple con Pilas (Undo / Redo)

## Objetivo del proyecto

El objetivo de este proyecto es comprender el funcionamiento de la estructura de datos **pila (Stack)** y aplicarla en un programa práctico.

Se desarrolló un **editor de texto simple en consola en Java** que permite:

1. Escribir líneas de texto
2. Deshacer la última acción (Undo)
3. Rehacer una acción deshecha (Redo)
4. Mostrar el texto actual

### Funcionamiento con Pilas

Para lograr esto se utilizan **dos pilas**:

- **Pila principal**: almacena las acciones realizadas por el usuario.
- **Pila secundaria**: almacena las acciones deshechas para permitir rehacerlas.

La pila fue implementada **manualmente utilizando nodos**, sin utilizar `java.util.Stack`, con el fin de comprender mejor su funcionamiento interno.

### Operaciones fundamentales implementadas

- `push()` → insertar un elemento en la pila
- `pop()` → eliminar el elemento superior
- `peek()` → consultar el elemento superior
- `isEmpty()` → verificar si la pila está vacía

## Estructura del proyecto

El programa está compuesto por **tres clases**:

- **Nodo.java**: Representa cada elemento dentro de la pila.
- **Pila.java**: Implementa la estructura de datos pila.
- **EditorTexto.java**: Contiene el menú del programa y la lógica del editor de texto.

## Instrucciones de ejecución

1. Abrir el proyecto en cualquier IDE compatible con Java.
2. Compilar los archivos del proyecto.
3. Ejecutar la clase principal: `EditorTexto.java`

### Menú del programa

Al ejecutar el programa aparecerá el siguiente menú en consola:

```
EDITOR DE TEXTO
1. Escribir texto
2. Deshacer (Undo)
3. Rehacer (Redo)
4. Mostrar texto actual
5. Salir
```

Seleccionar la opción deseada escribiendo el número correspondiente.

## Ejemplo de uso del programa

```
1. Escribir texto
   → Hola

1. Escribir texto
   → Aprendiendo pilas en Java

4. Mostrar texto actual
   → Última línea escrita: Aprendiendo pilas en Java

2. Deshacer (Undo)
   → Se deshizo: Aprendiendo pilas en Java

3. Rehacer (Redo)
   → Se rehizo: Aprendiendo pilas en Java
```

## Capturas de pantalla de la ejecución del programa

### Editor de texto
![Captura 1](./Captura%20de%20pantalla%202026-03-09%20190946.png)

### Deshacer (Undo)
![Captura 2](./Captura%20de%20pantalla%202026-03-09%20191038.png)

### Rehacer (Redo)
![Captura 3](./Captura%20de%20pantalla%202026-03-09%20191103.png)

### Mostrar texto actual
![Captura 4](./Captura%20de%20pantalla%202026-03-09%20191122.png)

### Salir del programa
![Captura 5](./Captura%20de%20pantalla%202026-03-09%20191139.png)

## Conclusión

Este proyecto permitió comprender cómo funciona la estructura de datos **pila (Stack)** y cómo puede aplicarse en situaciones reales como la implementación de **Deshacer (Undo)** y **Rehacer (Redo)** en editores de texto.
