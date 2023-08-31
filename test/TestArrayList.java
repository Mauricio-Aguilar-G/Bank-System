package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;
import com.bytbank.modelo.Cuenta;
import com.bytbank.modelo.CuentaCorriente;

public class TestArrayList{
	public static void main(String[] args){
		
		//List<Cuenta> lista = new LinkedList<Cuenta>();
		//List<Cuenta> lista = new Vector<Cuenta>();
		ArrayList<Cuenta> lista = new ArrayList();
		
		Cuenta cc1 = new CuentaCorriente(11,22);
		Cuenta cc2 = new CuentaCorriente(22,44);
		Cuenta cc3 = new CuentaCorriente(11,22);
		Cuenta cc4 = new CuentaCorriente(33,322);
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		Cuenta obtenerCuenta = (Cuenta) lista.get(0);
		System.out.println(obtenerCuenta);
		
		
		for (int i=0; i<lista.size();i++){
			Object ref = lista.get(i)
			System.out.println(ref);
		}
		
		//for each
		for (Cuenta cuenta:lista){
			System.out.println(cuenta);
		}
		
		boolean contiene = lista.contains(cc3);
		System.out.println(contiene);
		
	}
}