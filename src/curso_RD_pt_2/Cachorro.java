package curso_RD_pt_2;

public class Cachorro {

	private String cor;
	private String corOlhos;
	private double altura;
	private double comprimento;
	private double peso;

	public Cachorro() {

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

	public String sentarCachorro(String sentar) {
		if (sentar.equalsIgnoreCase("Sentado")) {
			return sentar = "O cachorro está sentado";
		} else {
			return sentar = "O cachorro não está sentado";
		}
	}

	public String deitarCachorro(String deitar) {
		if (deitar.equalsIgnoreCase("Deitado")) {
			return deitar = "O cachorro está deitado";
		} else {
			return deitar = "O cachorro não está deitado";
		}
	}

	public String mexerCachorro(String mexer) {
		if (mexer.equalsIgnoreCase("Mexendo")) {
			return mexer = "O cachorro está mexendo";
		} else {
			return mexer = "O cachorro não está mexendo";
		}
	}

	public String virCachorro(String vir) {
		if (vir.equalsIgnoreCase("Vem")) {
			return vir = "O cachorro veio até mim";
		} else if (vir.equalsIgnoreCase("Vai")) {
			return vir = "O cachorro foi embora";
		} else {
			return vir = "O cachorro não fez nada ";
		}

	}

	@Override
	public String toString() {
		return "Os dados do Cachorro são: \nCor = " + cor + ", \nCor dos Olhos = " +  corOlhos + ", \nAltura = " + String.format("%.2f",altura)
				+ " cm" + ", \nComprimento = " + String.format("%.2f",comprimento) + " m" + ", \nPeso = " + String.format("%.2f",peso) + " kg";
	}

}
