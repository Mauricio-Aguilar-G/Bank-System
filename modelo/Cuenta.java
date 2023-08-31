package com.bytebank.modelo;

public abstract class Cuenta implements Comparable{
	//Modificadores de acceso
	//public
		//accesible desde cualquier parte
	//default
		//accesible dentro del paquete
	//protected
		//default + sub-clases
	//private
		//accesible solo desde su misma clase

    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;

    public Cuenta() {

    }

	/**
	* Constructor para inicializar el objeto Cuenta a partir da agencia y numero
	* @param agencia
	* @param numero
*/
    public Cuenta( int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Cuenta " + this.numero + " " + this.agencia);

        Cuenta.total ++;
    }

    public abstract void deposita(double valor);
	
	/**
	* valor necesita ser menor o igual al saldo
	* @param valor 
	* @throws SaldoInsuficienteException
*/
    public void saca(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor) {
			throw new SaldoInsuficienteException("No tienes saldo");
		}
		this.saldo -= valor;
    }

    public boolean transfiere(double valor, Cuenta destino)  {
        if(this.saldo >= valor) {
            try{
				this.saca(valor);
			}catch(Exception e){
				e.printStackTrace();
			}
			destino.deposita(valor);
			return true
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }
	
	@Override
	public boolean equals(Object obj){
		Cuenta cuenta = (Cuenta) obj;
		return this.agencia == cuenta.getAgencia() &&
				this.numero == cuenta.getNumero();
	}
	
	@Override
	public int compareTo(Cuenta o){
		//Orden natural: numero de agencia
		// return Integer.compare(this.agencia,o.getAgencia());@
		return Double.compare(this.getSaldo(), o.getSaldo();
	}

}
