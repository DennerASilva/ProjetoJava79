package exercicios03_12;
import java.util.Scanner;

public class DoacaoSangue {

	public static void main(String[] args) {
		
		//Scanner
		Scanner ler = new Scanner(System.in);
		
		//Variaveis
		boolean priDoacao;
		String nome;
		int idade;
		
		//Entrada de dados
		System.out.println("Digite o nome do doador:");
		nome = ler.nextLine();
		System.out.println("Digite a idade do doador:");
		idade = ler.nextInt();
		System.out.println("Primeira doação de sangue?");
		priDoacao = ler.nextBoolean();
		
		// Processamento
		
		if ((idade >= 18 && idade <60) || ((idade >= 60  && idade <= 69) && priDoacao == false)) {
			System.out.println(nome+ " está apte para doar sangue");
		} else {
			System.out.println(nome+ " não está apte para doar sangue");
		}
		
	}

}
