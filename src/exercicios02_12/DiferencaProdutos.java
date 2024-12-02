package exercicios02_12;
import java.util.Scanner;
	
public class DiferencaProdutos {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float num1,num2,num3,num4,dif;
		
		System.out.print("Número 1: ");
		num1 = ler.nextFloat();
		System.out.print("Número 2: ");
		num2 = ler.nextFloat();
		System.out.print("Número 3: ");
		num3 = ler.nextFloat();
		System.out.print("Número 4: ");
		num4 = ler.nextFloat();
		
		dif = num1*num2 - num3*num4;

		System.out.println("Diferença: "+dif);
		
	}

}
