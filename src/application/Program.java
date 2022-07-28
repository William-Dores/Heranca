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
		
		Conta conta = new Conta(1001, "Alex", 0.00);
		
		ContaEmpresarial contaEmp = new ContaEmpresarial(1002, "Jose", 0.0, 500.0);
		
		// UPCASTING PERMITE ATRIBUIR UMA SUBCLASSE EM UMA VARIAVEL DA SUPER CLASSE
		
		Conta conta1 = contaEmp;
		Conta conta2 = new ContaEmpresarial(1003, "Bob", 0.0, 200.0);
		Conta conta3 = new ContaPoupanca(1004, "Ana", 0.0, 0.01);
		
		
		//DOWNCASTING CONVERTE UM OBJETO DA SUPER CLASSE PARA UMA SUB CLASSE, ENTRETANTO NÃO CONVERTE DE UMA SUBCLASSE PARA OUTRA SUBCLASSE
		
		ContaEmpresarial conta4 = (ContaEmpresarial)conta2; // FORÇA A CONVERSÃO
		conta4.empresstimo(100.0);
		
		//ContaEmpresarial conta5 = (ContaEmpresarial)conta3; <- RETORNA ERRO!!
		
		if (conta3 instanceof ContaEmpresarial) { // PERMITE A CONVERSÃO SEM ERRO
			ContaEmpresarial conta5 = (ContaEmpresarial)conta3;
			conta5.empresstimo(200.0);
			System.out.println("Limite!");
		}
		
		//IF ACIMA FALHOU POIS CONTA3 NÃO É UMA INSTANCIA DE CONTA EMPRESARIAL
		
		if (conta3 instanceof ContaPoupanca) {
			ContaPoupanca conta5 = (ContaPoupanca)conta3;
			conta5.updateSaldo();
			System.out.println("Update saldo");
		}
		

	}

}
