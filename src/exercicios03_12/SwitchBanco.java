package exercicios03_12;

import java.util.Scanner;

public class SwitchBanco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int operacao;
		float saldo = 1000,deposito,saque;
		
		System.out.println("Operações Bancárias:");
		System.out.println("\nOperação 1: Saldo");
		System.out.println("Operação 2: Saque");
		System.out.println("Operação 3: Depósito");

		
		System.out.print("\nOperação: ");
		operacao = ler.nextInt();
		
		
		switch (operacao) {
		case 1:
			System.out.println("Operação - Saldo");
			System.out.printf("\nSaldo: R$%.2f",saldo);
			break;
		case 2:
			System.out.println("Operação - Saque");
			System.out.print("\nValor: ");
			saque = ler.nextFloat();
			
			if (saque <= saldo) {
				saldo = saldo - saque;
				System.out.printf("\nNovo Saldo: R$%.2f",saldo);
			} else {
				System.out.println("Saldo insuficiente!");
			}
			break;
		case 3:
			System.out.println("Operação - Depósito.");
			System.out.print("\nValor: ");
			deposito = ler.nextFloat();
			saldo = saldo + deposito;
			System.out.printf("\nNovo Saldo: R$%.2f",saldo);

			break;
		default:
			System.out.println("Operação Inválida.");
			
		}
		
	}

}
