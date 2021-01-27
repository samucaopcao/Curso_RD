package curso_RD_pt_2;

public class Gato {

	private String cor;
	private String corOlhos;
	private double altura;
	private double comprimento;
	private double peso;

	public Gato() {

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCorOlhos() {
		return corOlhos;
	}

	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String sentarGato(String sentar) {
		if (sentar.equalsIgnoreCase("Sentado")) {
			return sentar = "O gato est� sentado";
		} else {
			return sentar = "O gato n�o est� sentado";
		}
	}

	public String deitarGato(String deitar) {
		if (deitar.equalsIgnoreCase("Deitado")) {
			return deitar = "O gato est� deitado";
		} else {
			return deitar = "O gato n�o est� deitado";
		}
	}

	public String mexerGato(String mexer) {
		if (mexer.equalsIgnoreCase("Mexendo")) {
			return mexer = "O gato est� mexendo";
		} else {
			return mexer = "O gato n�o est� mexendo";
		}
	}

	public String virGato(String vir) {
		if (vir.equalsIgnoreCase("Vem")) {
			return vir = "O gato veio at� mim";
		} else if (vir.equalsIgnoreCase("Vai")) {
			return vir = "O gato foi embora";
		} else {
			return vir = "O gato n�o fez nada ";
		}

	}

	@Override
	public String toString() {
		return "Os dados do gato s�o: \nCor = " + cor + ", \nCor dos Olhos = " + corOlhos + ", \nAltura = " + altura
				+ " cm" + ", \nComprimento = " + comprimento + " m" + ", \nPeso = " + peso + " kg";
	}

}
