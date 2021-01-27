package curso_RD_pt_2;

public class Passaro {

	private String cor;
	private String corPenas;
	private String canta;
	private double altura;
	private double comprimento;
	private double peso;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCorPenas() {
		return corPenas;
	}

	public void setCorPenas(String corPenas) {
		this.corPenas = corPenas;
	}

	public String getCanta() {
		return canta;
	}

	public void setCanta(String canta) {
		this.canta = canta;
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

	public void cantaSimNao(String canta) {
		if (canta.equalsIgnoreCase("SIM")) {
			System.out.println("O pássaro canta");
		} else {
			System.out.println("O não pássaro canta");
		}
	}

	public double voarDistancia(double voa) {
		return voa;
	}

	@Override
	public String toString() {
		return "\nOs dados do Passaro:   \ncor = " + cor + ", \nCor das Penas = " + corPenas + ", \nCanta = " + canta + ", \nAltura = " + String.format("%.2f",altura)
				+ ", \nComprimento = " + String.format("%.2f",comprimento) + ", \nPeso = " + String.format("%.2f",peso) + ", \nCor = " + getCor() + ", \nCor das Penas = "
				+ getCorPenas() + ", \nO Pássaro Canta = " + getCanta() + ", \nAltura = " + getAltura() + ", \nComprimento = "
				+ getComprimento() + ", \nPeso =" + getPeso() + "\n";
	}

}
