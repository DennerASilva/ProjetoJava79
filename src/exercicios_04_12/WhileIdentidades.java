package exercicios_04_12;

import java.util.Scanner;

public class WhileIdentidades {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, identGenero, desenvolv,numMFront=0,numH40=0,numBack=0,numNB30=0,pesquisados = 0;
		float media,somaIdades = 0;
		String  resp ="S";
		
		
		while (resp.equalsIgnoreCase("S")) {
			System.out.print("Idade: ");
			idade = ler.nextInt();
					
			System.out.println("\n1 – Mulher Cis");
			System.out.println("2 – Homem Cis");
			System.out.println("3 – Não Binário");
			System.out.println("4 – Mulher Trans");
			System.out.println("5 – Homem Trans");
			System.out.println("6 – Outros");
			System.out.print("Identidade de Gênero: ");
			identGenero = ler.nextInt();
			
			System.out.println("\n1 – Backend");
			System.out.println("2 – Frontend");
			System.out.println("3 – Mobile");
			System.out.println("4 – FullStack");
			System.out.print("Pessoa Desenvolvedora: ");
			desenvolv = ler.nextInt();
			
			System.out.print("\nDeseja continuar? (S/N)   ");
			resp = ler.next();
			
			System.out.println("=====================================================================================");
			
			pesquisados++;			
			somaIdades = somaIdades + idade;
			
			if (desenvolv==1) {
				numBack++;
			} else if (desenvolv == 2 && (identGenero == 1 || identGenero == 4)) {
				numMFront++;
			} else if (desenvolv == 3 && (identGenero == 2 || identGenero == 5) && idade>40) {
				numH40++;
			} else if (desenvolv == 4 && identGenero == 3 && idade>30) {
				numNB30++;
			}
		}
			media = somaIdades/pesquisados;
		
			System.out.println("Total de pessoas desenvolvedoras Backend:"+numBack);
			System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend:"+numMFront);
			System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+numH40);
			System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "+numNB30);
			System.out.println("O número total de pessoas que responderam à pesquisa: "+pesquisados);
			System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f",media);
			
	}
}
