package entities;

public class ContaEmpresarialPlus extends ContaEmpresarial{

	@Override
	public final void saque(Double quantia) { // NÇAO PERMITE REUTILIZAR O METODO POIS O MESMO ESTÁ COM A PALAVRA "final"
		super.saque(quantia);
		saldo -= 2.0; 
	}
}
