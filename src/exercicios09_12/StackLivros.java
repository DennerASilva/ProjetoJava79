package exercicios09_12;

import java.util.Stack;
import java.util.Scanner;

public class StackLivros {

	public static void main(String[] args) {
		Stack<String> pilhaLivros = new Stack<String>();
		String nomeLivro = "";
		Scanner ler = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("=======================================");
			System.out.println("\n1 - Adicionar Livro na Pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da Pilha");
			System.out.println("0 - Sair\n");
			System.out.println("=======================================");

			System.out.print("Entre com a opção desejada: ");
			opcao = ler.nextInt();
			ler.nextLine(); // <- Para fechar o .nextInt()

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome: ");
				nomeLivro = ler.nextLine();
				pilhaLivros.push(nomeLivro);

				System.out.println("\nLivro Adicionado!\n");
				break;
			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				} else {
					System.out.println("\nLista de livros na pilha:");
					for (String mostrar : pilhaLivros) {
						System.out.println(mostrar);
					}
					System.out.println("");
				}
				break;
			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				} else {
					System.out.println("\nLivro " + pilhaLivros.pop() + " retirado.\n");
					System.out.println("Pilha:");
					for (String mostrar : pilhaLivros) {
						System.out.println(mostrar);
					}
				}
				break;
			case 0:
				System.out.println("\nPrograma finalizado!");
				break;
			default:
				System.out.println("\nSelecione uma opção válida.\n");
				break;
			}
		} while (opcao != 0);
	}
}
