package curso_RD_pt_2_heranca;

public class Tecnico extends Pessoa {

	private String formacao;

	public Tecnico(String cpf, String nome, String endereco, String formacao) {
		super(cpf, nome, endereco);
		this.formacao = formacao;

	}

	@Override
	public String toString() {
		return "formacao = " + formacao + super.toString() + "";
	}

}
