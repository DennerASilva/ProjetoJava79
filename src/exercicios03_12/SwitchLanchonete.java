package exercicios03_12;

import java.util.Scanner;

public class SwitchLanchonete {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int codigo,qtd;
		float preco = 0,total;
		String prod = "";
		
		System.out.println("======================= MENU ============================");
		System.out.println("\n1 - Cachorro Quente R$10,00");
		System.out.println("2 - X-salada R$ 15,00");
		System.out.println("3 - X-Bacon R$ 18,00");
		System.out.println("4 - Bauru R$12,00");
		System.out.println("5 - Refrigerante R$8,00");
		System.out.println("6 - Suco de Laranja R$13,00");
		
		System.out.print("\nDigite o código do produto desejado: ");
		codigo = ler.nextInt();
		System.out.print("Digite a quantidade desejada:");
		qtd = ler.nextInt();
		
		switch (codigo) {
		case 1:
			prod = "Cachorro Quente";
			preco = 10;
			break;
		case 2:
			prod = "X-Salada";
			preco = 15;
			break;
		case 3:
			prod = "X-Bacon";
			preco = 18;
			break;
		case 4:
			prod = "Bauru";
			preco = 12;
			break;
		case 5:
			prod = "Refrigerante";
			preco = 8;
			break;
		case 6:
			prod = "Suco de Laranja";
			preco = 13;
			break;
		default:
			System.out.println("Insira uma opção válida.");
				
		}
		
		total = preco * qtd;
		
		System.out.println("\nProduto: "+prod);
		System.out.printf("Preço total R$%.2f",total);
		ler.close();
	}

}
