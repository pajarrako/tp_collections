package ar.edu.tecnica;

/**
 * @author NOMBRE Y APELLIDO ALUMNO
 * 
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

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
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		// numeros.add(0);
	}

	public static void ejemploSet() {
		// HashSet
		HashSet<Integer> numeros = new HashSet<Integer>();
		// numeros.add(0);
	}

	public static void ejemploQueue() {
		// PriorityQueue
		PriorityQueue<Integer> numeros = new PriorityQueue<Integer>();
		// numeros.add(0);
	}

	public static void ejemploDeque() {
		// ArrayDeque
		ArrayDeque<Integer> numeros = new ArrayDeque<Integer>();
		// numeros.add(0);
	}

	public static void ejemploMap() {
		// HashMap
		HashMap<String, Integer> numeros = new HashMap<String, Integer>();
		// numeros.put("X", 0);
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
		// Collections.sort(null);
	}

	public static void ejemploReverse() {
		// Collections.reverse();
	}

	public static void ejemploShuffle() {
		// Collections.shuffle();
	}

	public static void ejemploSwap() {
		// Collections.swap();
	}

	public static void ejemploFill() {
		// Collections.fill();
	}

	public static void ejemploMin() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(33);
		numeros.add(-32);
		var min = Collections.min(numeros);

		System.out.println("""
				El mínimo es:
				              """ + min);
	}

	public static void ejemploMax() {
		
	}

}
