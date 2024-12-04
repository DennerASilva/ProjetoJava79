package exercicios_04_12;

import java.util.Scanner;

public class WhileIdades {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int idade = 22,jovens = 0,idosos = 0; 
		
		while (idade>=0) {
			
			System.out.print("Digite uma idade: ");
			idade = ler.nextInt();
			
			if (idade > 50 ) {
				idosos = idosos + 1;
			} else if (idade <21 && idade >= 0) {
				jovens = jovens + 1;
			}
			System.out.println("");
		}
		
 		System.out.println("Total de pessoas menores de 21 anos: "+jovens);
 		System.out.println("\nTotal de pessoas maiores de 50 anos: "+idosos);
	}

}
