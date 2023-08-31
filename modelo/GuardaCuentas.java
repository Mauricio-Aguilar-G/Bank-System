package com.bytebank.modelo;

public class GuardaCuentas{
	// Crear un objeto para guardar muchas cuentas
	// Permitirnos agregar cuentas con un metodo
	// guardaCuentas.adiciona(cuenta);
	// obtener, remover, etc
	private Object[] cuenta;
	private index = 0;
	
	public GuardaCuentas(){
		this.cuenta = new Object[10];
	}
	
	public void adicionar(Object cc){
		if (index > cuenta.length){
			System.out.println("Array is out of space.");
		} else{
			cuenta[index] = cc;
			index++;
		}
	}
	
	public Object getCuenta(int index){
		return this.cuenta[index];
	}
	
	public int getNumElementos(){
		return this.index;
	}
}