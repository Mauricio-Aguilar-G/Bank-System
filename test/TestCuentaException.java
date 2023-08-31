package com.bytebank.test; //paquete propio
import com.bytebank.modelo.*;

public class TestCuentaException{
	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorros(123,456);
		cuenta.deposita(200);
		try{
			cuenta.saca(210); //triggers SaldoInsuficiente exception
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}