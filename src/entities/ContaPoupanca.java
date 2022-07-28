package entities;

public final class ContaPoupanca extends Conta{ // A PALAVRA "final" NÃO PERMITE CRIAR UMA SUBCLASSE DA CLASSE JÁ CRIADA E NEM PERMITE REUSAR UM METODO CASO TENHA A PALAVRA "final"
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
	
	@Override // SOBREPOSIÇÃO DO METODO DE SAQUE QUE TEM NA CLASSE CONTA, ESSE NÃO DESCONTO UMA TAXA AO SER SACADO;
	public void saque(Double quantia ) {
		saldo-= quantia;
	}
}
