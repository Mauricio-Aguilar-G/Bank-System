package com.bytebank.test;

import com.bytebank.modelo.GuardaCuentas;
import com.bytebank.modelo.CuentaCorriente;

public class TestGuardaCuentas{
	public static void main(String[] args){
		GuardaCuenta guardaCuentas = new GuardaCuentas();
		
		Cuenta cc1 = new CuentaCorriente(11, 22);
		guardaCuentas.adicionar(cc1);
		
		Cuenta cc2 = new CuentaCorriente(22, 44);
		guardaCuentas.adicionar(cc2);
		
		int tamCuenta = guardaCuentas.getNumElementos();
		System.out.println(tamCuenta);
		
		Cuenta cuenta1 = guardaCuentas.getCuenta(0);
		System.out.println(cuenta1.getNumero());
	}
}