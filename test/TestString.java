package com.bytebank.test;

public class TestString{
	public static void main(String[] args){
		String nombre = "Alura";
		System.out.println(nombre);
			//java.lang.String nombre = "Alura";
			//String es un objeto inmutable desde su creacion
			//para ser alterado puede ser instanciado de nuevo
			//String nombre2 = new String("Alura");
		nombre = nombre.replace("A","a");
		nombre = nombre.concat(" Cursos Online");
		System.out.println(nombre);
	}
}