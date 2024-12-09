package exercicios09_12;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class QueueClientes {

	public static void main(String[] args) {

		Queue<String> filaClientes = new LinkedList<String>();
		String nomeCliente = "";
		Scanner ler = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("=======================================");
			System.out.println("\n1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair\n");
			System.out.println("=======================================");

			System.out.print("Entre com a opção desejada: ");
			opcao = ler.nextInt();
			ler.nextLine(); // <- Para fechar o .nextInt()

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome: ");
				nomeCliente = ler.nextLine();
				filaClientes.add(nomeCliente);

				System.out.println("\nCliente Adicionado!\n");
				break;
			case 2:
				if (filaClientes.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				} else {
					System.out.println("\nLista de clientes na fila:");
					for (String mostrar : filaClientes) {
						System.out.println(mostrar);
					}
					System.out.println("");
				}
				break;
			case 3:
				if (filaClientes.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				} else {
					System.out.println("\nCliente " + filaClientes.poll() + " retirado.\n");
					System.out.println("Fila de Clientes:");
					for (String mostrar : filaClientes) {
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
