package curso_RD_pt_2_heranca;

public class Pessoa {

	private String cpf;
	private String nome;
	private String endereco;
	
	public Pessoa(String cpf, String nome, String endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "cpf = " + cpf + ", nome = " + nome + ", endereco = " + endereco + "";
	}
	
	
}
