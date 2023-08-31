package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;
import com.bytbank.modelo.Cuenta;
import com.bytbank.modelo.Cliente;
import com.bytbank.modelo.CuentaCorriente;
import com.bytbank.modelo.CuentaAhorros;


public class TestOrdenarLista{
	public static void main(String[] args){
		Cuenta cc1 = new CuentaCorriente(22,33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNombre("Diego");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);
		
		Cuenta cc2 = new CuentaAhorros(12,44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNombre("Renato");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);
		
		Cuenta cc3 = new CuentaCorriente(2,11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNombre("Liam");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);
		
		Cuenta cc4 = new CuentaAhorros(24,22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNombre("Noel");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);
		
		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for(Cuenta cuenta:lista){
			System.out.println(cuenta);
		}
		
		//Ordenar las cuentas
			//por numero de cuentas
		// Comparator<Cuenta> comparatorNum = new OrdenarPorNumCuentas();
		// lista.sort(comparatorNum);
		lista.sort(new Comparator<Cuenta>(){ //Clase anonima
			@Override
			public int compare(Cuenta o1, Cuenta o2){
				return Integer.compare(o1.getNumero(),o2.getNumero());
			}
		});
		
		for(Cuenta cuenta:lista){
			System.out.println(cuenta);
		}
		
		//por titular de cuentas
		//Comparator<Cuenta> comparatorStr = new OrdenarPorNomCuentas();
		// lista.sort(new OrdenarPorNomCuentas());
		
		lista.sort(new Comparator<Cuenta>(){ //Clase anonima
			@Override
			public int compare(Cuenta o1, Cuenta o2){
				return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
			}
		});
		
		for(Cuenta cuenta:lista){
			System.out.println(cuenta);
		}
		
		
		//Formas antiguas
		Collections.sort(lista, new OrdenarPorNumCuentas());
		for(Cuenta cuenta:lista){
			System.out.println(cuenta);
		}
		
		Collections.sort(lista);
		for(Cuenta cuenta:lista){
			System.out.println(cuenta);
		}
	}
}

class OrdenarPorNumCuentas implements Comparator<Cuenta>{
	@Override
	public int compare(Cuenta o1, Cuenta o2){
		//Forma basica
		// if(o1.getNumero() == o2.getNumero()){
			// return 0;
		// } else if(o1.getNumero() > o2.getNumero()){
			// return 1;
		// }else{
			// return -1;
		// }
		
		//Forma intermedia
		//return o1.getNumero() - o2.getNumero();
		
		//Forma wrapper
		return Integer.compare(o1.getNumero(),o2.getNumero());
	}
}

class OrdenarPorNomCuentas implements Comparator<Cuenta>{
	@Override
	public int compare(Cuenta o1, Cuenta o2){
		return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
		
	}
}