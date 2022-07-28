package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import entities.ContaEmpresarial;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta1 = new Conta(1001, "Alex", 1000.0);
		conta1.saque(200.0);
		System.out.println("Conta Normal : " + conta1.getSaldo());

		ContaPoupanca contaP = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
		contaP.saque(200.0);
		System.out.println("Conta Poupança : " + contaP.getSaldo());
		
		ContaEmpresarial contaE = new ContaEmpresarial(1003, "João", 1000.0, 500.0);
		contaE.saque(200.0);
		System.out.println("Conta Empresarial : " + contaE.getSaldo());
	}

}
