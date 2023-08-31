package com.bytebank.test;

import java.util.List;
import java.util.ArrayList;

public class TestRepasoArray{
	public static void main(String[] args){
		int[] numeros = new int[10];
		
		int numero = 40;
		//Wrapper
		//Integer numObject = new Integer(40);
		Integer numObject = Integer.valueOf(40);
		
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(numero); //autoboxing
		lista.add(numObject);
		lista.add(Integer.valueOf(40));
		
		//Unboxing
		//int valorPrimitivo = numObject;  
		//->Extrae el valor numerico del objeto, de manera automatica
		int valorPrimitivo = numObject.intValue(); //Forma desarrollada

		
		
	}
}