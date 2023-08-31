package com.bytebank.test;

public class TestMain{
	public static void main(String[] args){
		
		for (int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
		
		int edad1 = 20;
		int edad2 = 15;
		int edad3 = 67;
		
		//Agruparlas en una sola referencia
		//ARRAYS
		int[] edades = new int[5]; //Se inician todas las casillas con cero
		edades[2] = 30;
		System.out.println(edades[2]);
		
		int tamArray = edades.length;
		System.out.println(tamArray);
		
		for (int i=0; i<edades.length; i++){
			System.out.println(edades[i]);
		}
		
		//OPERACIONES
			//posiciones ocupadas
		
	}
}