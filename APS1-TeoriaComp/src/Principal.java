import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		String alfabeto = JOptionPane.showInputDialog("Digite aqui seu alfabeto");

		String arrayAlfabeto[] = new String[100];

		arrayAlfabeto = alfabeto.split(",");

		String palavra = JOptionPane.showInputDialog("Digite uma palavra");

		boolean situacao = VerificarAlfabeto(palavra, arrayAlfabeto);

		if (situacao == true) {
			JOptionPane.showMessageDialog(null, montaExibicao(palavra, alfabeto));
		}else {
			JOptionPane.showMessageDialog(null, montaExibicaoErro(palavra, alfabeto));
		}
	}

	public static boolean VerificarAlfabeto(String palavra, String[] arrayAlfabeto) {
		boolean status = false;
		for (int i = 0; i < arrayAlfabeto.length; i++) {
			if (palavra.contains(arrayAlfabeto[i])) {
				status = true;
			}
		}
		return status;
	}

	public static String montaExibicao(String ch, String str) {
		String exibicao = "";
		exibicao += " ===================================================\n";
		exibicao += "A palavra " + ch + " pertence a conjunto de palavras do alfabeto ∑ " + str;
		exibicao += "\n ===================================================";
		return exibicao;
	}

	public static String montaExibicaoErro(CharSequence ch, String string) {
		String exibicao = "";
		exibicao += " =====================================================\n";
		exibicao += "A palavra " + ch + " não pertence a conjunto de palavras do alfabeto ∑ " + string;
		exibicao += "\n =====================================================";
		return exibicao;
	}
}
