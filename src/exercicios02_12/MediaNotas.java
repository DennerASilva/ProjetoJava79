package exercicios02_12;
import java.util.Scanner;

public class MediaNotas {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float n1,n2,n3,n4,media;
		
		System.out.print("Nota 1: ");
		n1 = ler.nextFloat();
		System.out.print("Nota 2: ");
		n2 = ler.nextFloat();
		System.out.print("Nota 3: ");
		n3 = ler.nextFloat();
		System.out.print("Nota 4: ");
		n4 = ler.nextFloat();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.printf("Média final: %.2f",media);

	}

}
