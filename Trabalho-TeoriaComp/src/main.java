import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class main {
	public static void main(String args[]) {
		int valor, tamanhoA, tamanhoB;
		ArrayList<Integer> listaA = new ArrayList<Integer>();
		ArrayList<Integer> listaB = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		
        // CONJUNTO A
        System.out.print("\nEntre com a quantidade do conjunto A: ");
        tamanhoA = s.nextInt();
		
		for(int i = 1; i <= tamanhoA; ++i){
	        System.out.print("\nEntre com o número da posição "+ i +" no conjunto A: ");
	        valor = s.nextInt();
	        listaA.add(valor);
        }
		// CONJUNTO B
        System.out.print("\nEntre com a quantidade do conjunto B: ");
        tamanhoB = s.nextInt();
		
		for(int i = 1; i <= tamanhoB; ++i){
	        System.out.print("\nEntre com o número da posição "+ i +" no conjunto B: ");
	        valor = s.nextInt();
	        listaB.add(valor);
        }
		
		Set<Integer> uniao = new TreeSet<Integer>(listaA);
	    uniao.addAll(listaB);
	    
	    Set<Integer> intersecao = new TreeSet<Integer>(listaA);
	    intersecao.retainAll(listaB);
	    
	    Set<Integer> diferenca  = new TreeSet<Integer>(listaA);
	    diferenca.removeAll(listaB);
	    
	    System.out.println("Conjunto A: " + listaA);
        System.out.println("Conjunto B: " + listaB);
        System.out.println("União: " + uniao);
        System.out.println("Interseção: " + intersecao);
        System.out.println("Diferença: " + diferenca); 
	}
}
