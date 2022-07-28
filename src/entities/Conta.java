package entities;

public class Conta {
	private Integer numConta;
	private String titular;
	protected Double saldo;
	
	public Conta() {
		
	}

	public Conta(Integer numConta, String titular, Double saldo) {
		this.numConta = numConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void saque(Double quantia) {
		saldo -= quantia;
	}
	
	public void deposito(Double quantia) {
		saldo += quantia;
	}
	

}
