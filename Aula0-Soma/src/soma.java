import java.util.Scanner;

public class soma {
	public static void main(String args[]) {
		int num1 = 0, num2 = 0, soma;

		Scanner s = new Scanner(System.in);

		System.out.println("Insira o primeiro numero: ");
		num1 = s.nextInt();

		System.out.println("Insira o segundo numero: ");
		num2 = s.nextInt();

		soma = num1 + num2;

		System.out.println("A soma é: " + soma);
	}
}
