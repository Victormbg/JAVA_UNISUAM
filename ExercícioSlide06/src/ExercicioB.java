import java.util.Scanner;

public class ExercicioB {
	public static void main(String[] args) {

		int tamanho, maior = 0, menor = Integer.MAX_VALUE;;
		float soma = 0, media = 0;

		Scanner s = new Scanner(System.in);

		System.out.print("Digite o tamanho do vetor: ");
		tamanho = s.nextInt();

		int vetor[] = new int[tamanho];

		for (int i = 0; i <= vetor.length - 1; i++) {
			System.out.print("Digite valor para " + (i+1) + " : ");
			vetor[i] = s.nextInt();
		}

		for (int i = 0; i <= vetor.length - 1; i++) {
			soma = soma + vetor[i];
			media = soma / vetor.length;

			if (vetor[i] > maior) {
				maior = vetor[i];
			}

			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}

		System.out.println("O menor valor no vetor é : " + menor);
		System.out.println("O maior valor no vetor é : " + maior);
		System.out.println("A media no vetor é : " + media);
	}
}
