public class Principal {
	public static void main(String args[]) {
		Faculdade f = new Faculdade();
		f.nome = "UNISUAM";
		//ANTIGO: f.endereco = "Av. Paris, 84 - Bonsucesso, Rio de Janeiro - RJ";
		f.cnpj = "34.008.227/0001-03";
		Endereco e = new Endereco();
		f.endereco = e;
		f.endereco.cep = "21041-020";
		f.endereco.cidade = "Rio de Janeiro";
		f.endereco.estado = "RJ";
		f.endereco.numero = 84;
		f.endereco.complemento = "284";
		f.endereco.rua = "Av. Paris";
		Aluno a = new Aluno();
		a.nome = "Victor M.";
		a.idade = 20;
		System.out.print("A Faculdade é " + f.nome + "\n" +
		"O endereço da " + f.nome + " é Rua " + f.endereco.rua +  " numero " +  f.endereco.numero +  " complemento " +f.endereco.complemento + "\n" +
		"O CNPJ da " + f.nome + " é " + f.cnpj + "\n" +
		"O aluno da " + f.nome + " é " + a.nome + " com idade de " + a.idade + " anos.");
	}
}
