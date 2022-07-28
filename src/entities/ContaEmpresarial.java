package entities;

public class ContaEmpresarial extends Conta { //HERDANDO OS ATRIBUTOS E METODOS DA CLASSE CONTA
	
	private Double limiteEmprestimo;
	
	public ContaEmpresarial() {
		super();
	}
	
	public ContaEmpresarial(Integer numConta, String titular, Double saldo, Double limitemEmprestimo) {
		super(numConta, titular, saldo); // FAZENDO O CHAMADO DOS ATRIBUTOS DA CLASSE CONTA
		this.limiteEmprestimo = limitemEmprestimo;	
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void empresstimo(Double quantia) {
		if (quantia <= limiteEmprestimo) {
			saldo += quantia - 10.0;
		}
	}
	
	@Override
	public final void saque(Double quantia) {
		super.saque(quantia); //ESSA PALAVRA "super" REUSA A IMPLEMENTAÇÃO/LÓGICA JÁ EXISTENTE, NESSE CASO O METODO DE SAQUE
		saldo -= 2.0; // AQUI FAZ O OUTRO JEITO DE SOBREPOR O METODO JÁ EXISTENTE
	}
		
}
