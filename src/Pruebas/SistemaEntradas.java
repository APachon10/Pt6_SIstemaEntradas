package Pruebas;

import java.util.Arrays;
import java.util.Random;

public class SistemaEntradas {
	public static void main(String[] args) {
		int entradas [] = new int [100];
		SistemaEntradas c = new SistemaEntradas();
		
		//c.llenaryMostrarVector(entradas);
		//c.generarNumeroAleatorio();
	}
	public void llenaryMostrarVector(int [] vector ) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = 0;
		}
		System.out.println("Vector Entradas--> "+Arrays.toString(vector));
	}
	public int generarNumeroAleatorio() {
		int entradas = 3;
		int num_aleatorio=0;
		Random r = new Random();
		num_aleatorio =  r.nextInt(100)+1;
		
		System.out.println("Numero aleatorio --> " + num_aleatorio);
		return num_aleatorio;
	}
	
}
