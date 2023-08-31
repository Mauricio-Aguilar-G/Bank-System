package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;
import com.bytbank.modelo.Cuenta;
import com.bytbank.modelo.Cliente;
import com.bytbank.modelo.CuentaCorriente;
import com.bytbank.modelo.CuentaAhorros;


public class TestLambda{
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
		//Usando lambda
		lista.sort((Cuenta o1, Cuenta o2) ->
				Integer.compare(o1.getNumero(),o2.getNumero())
		});
		
		for(Cuenta cuenta:lista){
			System.out.println(cuenta);
		}
		
		//por titular de cuentas
		
		lista.sort((Cuenta o1, Cuenta o2) -> {
				return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
			}
		});
		
		for(Cuenta cuenta:lista){
			System.out.println(cuenta);
		}
		
		
		//Formas antiguas
		Collections.sort(lista, (o1, o2) ->
				return Integer.compare(o1.getNumero(),o2.getNumero())
		));
		for(Cuenta cuenta:lista){
			System.out.println(cuenta);
		}
		
		Collections.sort(lista, (c1,c2) ->
			return c1.getTitular().getNombre()
					.compareTo(c2.getTitular().getNombre())
		);
		
		lista.forEach(cuenta -> System.out.println(cuenta));
	}
}