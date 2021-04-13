package com.suam.teste;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		Universidade universidade = new Universidade();
		String opcao;

		do {
			opcao = JOptionPane.showInputDialog(MontaMenu());
			if (opcao.equals("1")) {

				endereco.rua = JOptionPane.showInputDialog("Digite o nome da rua: ");
				endereco.num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do endereco: "));
				endereco.complemento = JOptionPane.showInputDialog("Digite o complemento da rua: ");

				universidade.nome = JOptionPane.showInputDialog("Digite o nome da Universidade: ");
				universidade.cnpj = JOptionPane.showInputDialog("Digite o CNPJ da Universidade: ");
				universidade.telefone = Integer
						.parseInt(JOptionPane.showInputDialog("Digite o telefone da Universidade: "));
			}
			if (opcao.equals("2")) {
				JOptionPane.showMessageDialog(null, "Universidade " + universidade.nome + " com CNPJ: "
						+ universidade.cnpj + " com o telefone " + universidade.cnpj);
			}
			if (opcao.equals("3")) {

			}
		} while (opcao != "1");
	}

	public static String MontaMenu() {
		String menu = "1 - Criar Universidade" + "\n" + "2 - Exibir dados da Universidade" + "\n"
				+ "3 - Sair do programa";
		return menu;
	}
}
