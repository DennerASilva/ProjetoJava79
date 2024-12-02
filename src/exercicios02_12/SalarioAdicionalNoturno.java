package exercicios02_12;
import java.util.Scanner;
	
public class SalarioAdicionalNoturno {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float salBruto, adcNoturno, hrsExtras, descontos, salLiquido;
		
		System.out.print("Salário Bruto: ");
		salBruto = ler.nextFloat();
		System.out.print("Adicional  Noturno: ");
		adcNoturno = ler.nextFloat();
		System.out.print("Horas Extras: ");
		hrsExtras = ler.nextFloat();
		System.out.print("Descontos: ");
		descontos = ler.nextFloat();
		
		salLiquido = salBruto + adcNoturno + hrsExtras*5 - descontos;

		System.out.printf("Salário líquido R$%.2f.",salLiquido);
		
	}

}
