import java.util.Scanner;

public class ExercicioA {
	public static void main(String args[]) {
		int[][] matriz = new int[5][5];

		Scanner s = new Scanner(System.in);
		System.out.println("Matriz 5x5:\n");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", i + 1, j + 1);
				matriz[i][j] = s.nextInt();
			}
		}

		System.out.println("\nO resultado da Matriz 5x5: \n");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%d \t", matriz[i][j]);
			}
			System.out.println();
		}
	}
}
