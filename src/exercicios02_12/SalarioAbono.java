package exercicios02_12;
import java.util.Scanner;

public class SalarioAbono {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.print("Digite o salário: ");
		salario = ler.nextFloat();
		System.out.print("Digite o abono: ");
		abono = ler.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("\nO novo salário é "+novoSalario);
	}

}
