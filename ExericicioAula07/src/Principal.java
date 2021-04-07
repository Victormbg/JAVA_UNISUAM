public class Principal {
	public static void main(String[] args) {
		Clube clube = new Clube();
		clube.nome = "Atletico Mineiro";
		clube.cnpj = "11223344556677";

		Presidente presidente = new Presidente();
		presidente.nome = "Alexandre Calil";

		Endereco endereco = new Endereco();
		endereco.rua = "Rua Tiradentes";
		endereco.bairro = "Pampulha";
		endereco.cidade = "Belo Horizonte";
		endereco.estado = "MG";
		endereco.numero = 341;

		clube.presidente = presidente;
		clube.enderecoClube = endereco;
		
		System.out.println(clube.presidente.nome + " é presidente do " + clube.nome + ", cujo CNPJ é " + clube.cnpj + "\n"
				+ "e está localizado no seguinte endereço: " + clube.enderecoClube.rua + ", " + "num " + clube.enderecoClube.numero
				+ ", bairro " + "\n" + clube.enderecoClube.bairro + ", " + clube.enderecoClube.cidade + ", " + clube.enderecoClube.estado + "." + "\n"
				);

		presidente.getChapa();
	}
}