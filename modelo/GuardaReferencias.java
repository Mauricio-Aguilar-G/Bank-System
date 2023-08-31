package com.bytebank.modelo;

public class GuardaReferencias{
	// Crear un objeto para guardar muchas cuentas
	// Permitirnos agregar cuentas con un metodo
	// guardaCuentas.adiciona(cuenta);
	// obtener, remover, etc
	private Object[] referencias;
	private index = 0;
	
	public GuardaReferencias(){
		this.referencias = new Object[10];
	}
	
	public void adicionar(Object cc){
		referencias[index] = cc;
		this.index++;
	}
	
	public Object Obtener(int index){
		return this.referencias[index];
	}
	
	public int getNumElementos(){
		return this.index;
	}
}