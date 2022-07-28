package entities;

public class ContaPoupanca extends Conta{
	private Double taxaJuro;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numConta, String titular, Double saldo, Double taxaJuro) {
		super(numConta, titular, saldo);
		this.taxaJuro = taxaJuro;
	}

	public Double getTaxaJuro() {
		return taxaJuro;
	}

	public void setTaxaJuro(Double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}
	
	public void updateSaldo() {
		saldo += saldo * taxaJuro;
	}
}
