package exercicios03_12;
import java.util.Scanner;

public class VertebradosInvertebrados {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String vertebra,familia,alimento;
		
		System.out.println("O animal é vertebrado ou invertebrado?");
		vertebra = ler.nextLine();
		System.out.println("Família do animal?");
		familia = ler.nextLine();
		System.out.println("Hábitos alimentares do animal?");
		alimento = ler.nextLine();
		
		if (vertebra.equalsIgnoreCase("vertebrado")) {
			if (familia.equalsIgnoreCase("ave")) {
				if(alimento.equalsIgnoreCase("carnívoro")) {
					System.out.println("Águia");
				} else if (alimento.equalsIgnoreCase("onívoro")){
					System.out.println("Pomba");
				} else {
					System.out.println("Insira uma opção válida.");
				}
				
			} else if(familia.equalsIgnoreCase("mamífero")) {
				if (alimento.equalsIgnoreCase("onívoro")) {
					System.out.println("Homem");
				} else if (alimento.equalsIgnoreCase("herbívoro")) {
					System.out.println("Vaca");
				} else {
					System.out.println("Insira uma opção válida");
				}
				
			} else {
				System.out.println("Insira uma opção válida.");
			}
			
		} else if (vertebra.equalsIgnoreCase("invertebrado")){
			if (familia.equalsIgnoreCase("inseto")) {
				if(alimento.equalsIgnoreCase("hematófago")) {
					System.out.println("Pulga");
				} else if (alimento.equalsIgnoreCase("herbívoro")){
					System.out.println("Lagarta");
				} else {
					System.out.println("Insira uma opção válida.");
				}
				
			} else if(familia.equalsIgnoreCase("anelídeo")) {
				if (alimento.equalsIgnoreCase("hematófago")) {
					System.out.println("Sanguessuga");
				} else if (alimento.equalsIgnoreCase("onívoro")) {
					System.out.println("Minhoca");
				} else {
					System.out.println("Insira uma opção válida.");
				}
			}
							
		} else {
			System.out.println("Insira uma opção válida.");
		}
			
	}

}

