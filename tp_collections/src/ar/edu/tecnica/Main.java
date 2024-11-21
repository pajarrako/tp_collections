package ar.edu.tecnica;

/**
 * @author Afonso Nicolas
 * 
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ejemploList();
        ejemploSet();
        ejemploMap();
        ejemploQueue();
        ejemploDeque();

        ejemploSort();
        ejemploReverse();
        ejemploShuffle();
        ejemploSwap();
        ejemploFill();
        ejemploMin();
        ejemploMax();
    }

    public static void ejemploList() {
        // ArrayList
        ArrayList<Integer> compras = new ArrayList<Integer>();
        
        // Cargar datos (cosas a comprar)
        compras.add(1);  // Manzanas
        compras.add(2);  // Pan
        compras.add(3);  // Leche
        compras.add(2);  // Pan (duplicado permitido en List)

        // Imprimir el contenido
        System.out.println("Lista de compras:");
        for (Integer item : compras) {
            System.out.println(item);
        }
    }

    public static void ejemploSet() {
        // HashSet
        HashSet<Integer> registroPersonas = new HashSet<Integer>();
        
        // Cargar datos (personas registradas)
        registroPersonas.add(101);  // Persona 1
        registroPersonas.add(102);  // Persona 2
        registroPersonas.add(101);  // Persona 1 (duplicado que no será añadido)

        // Imprimir el contenido
        System.out.println("Registro de personas:");
        for (Integer persona : registroPersonas) {
            System.out.println(persona);
        }
    }

    public static void ejemploQueue() {
        // PriorityQueue
        PriorityQueue<Integer> ordenLlegada = new PriorityQueue<Integer>();
        
        // Cargar datos (números que representan personas en la fila)
        ordenLlegada.add(3);  // Persona 1
        ordenLlegada.add(1);  // Persona 2
        ordenLlegada.add(2);  // Persona 3

        // Imprimir el contenido (en orden de llegada)
        System.out.println("Orden de llegada:");
        while (!ordenLlegada.isEmpty()) {
            System.out.println(ordenLlegada.poll());  // Imprime y elimina el primero
        }
    }

    public static void ejemploDeque() {
        // ArrayDeque
        ArrayDeque<Integer> tareas = new ArrayDeque<Integer>();
        
        // Cargar datos (tareas con diferentes prioridades)
        tareas.addFirst(10);  // Tarea urgente
        tareas.addLast(20);   // Tarea regular
        tareas.addFirst(5);   // Otra tarea urgente

        // Imprimir el contenido
        System.out.println("Tareas por procesar:");
        while (!tareas.isEmpty()) {
            System.out.println(tareas.pollFirst());  // Procesar tareas desde el principio
        }
    }

    public static void ejemploMap() {
        // HashMap
        HashMap<String, Integer> personas = new HashMap<String, Integer>();
        
        // Cargar datos (personas y sus edades)
        personas.put("Juan", 25);
        personas.put("Ana", 30);
        personas.put("Pedro", 22);

        // Imprimir el contenido
        System.out.println("Personas y sus edades:");
        for (String nombre : personas.keySet()) {
            System.out.println(nombre + " - " + personas.get(nombre) + " años");
        }
    }

    public static void loadSortedSet() {
        // TreeSet
        TreeSet<Integer> numeros = new TreeSet<Integer>();
        // numeros.add(0);
    }

    public static void loadSortedMap() {
        // TreeMap
        TreeMap<String, Integer> numeros = new TreeMap<String, Integer>();
        // numeros.put("X", 0);
    }

    public static void ejemploSort() {
        // ArrayList de números
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(3);

        System.out.println("Antes de ordenar: " + numeros);

        // Ordenar la lista
        Collections.sort(numeros);

        System.out.println("Después de ordenar: " + numeros);
    }

    public static void ejemploReverse() {
        // ArrayList de números
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(3);

        System.out.println("Antes de invertir: " + numeros);

        // Invertir la lista
        Collections.reverse(numeros);

        System.out.println("Después de invertir: " + numeros);
    }

    public static void ejemploShuffle() {
        // ArrayList de números
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(3);

        System.out.println("Antes de desordenar: " + numeros);

        // Desordenar aleatoriamente la lista
        Collections.shuffle(numeros);

        System.out.println("Después de desordenar: " + numeros);
    }

    public static void ejemploSwap() {
        // ArrayList de números
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(3);

        System.out.println("Antes de intercambiar: " + numeros);

        // Intercambiar los elementos en las posiciones 1 y 3
        Collections.swap(numeros, 1, 3);

        System.out.println("Después de intercambiar: " + numeros);
    }

    public static void ejemploFill() {
        // ArrayList de números
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(3);

        System.out.println("Antes de llenar: " + numeros);

        // Reemplazar todos los elementos con el valor 0
        Collections.fill(numeros, 0);

        System.out.println("Después de llenar: " + numeros);
    }

    public static void ejemploMin() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(3);
        var min = Collections.min(numeros);

        System.out.println("El mínimo es: " + min);
    }

    public static void ejemploMax() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(3);

        // Encontrar el valor máximo
        Integer max = Collections.max(numeros);

        System.out.println("El valor máximo es: " + max);
    }
}
