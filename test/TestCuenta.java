package com.bytebank.test; //paquete propio
import com.bytebank.modelo.*;

public class TestCuenta {

	public static void main(String[] args) {
		CuentaCorriente cc = null;//new CuentaCorriente(1, 1);
		CuentaAhorros ca = new CuentaAhorros(2, 3);
		cc.deposita(2000);
		cc.transfiere(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
	
}
