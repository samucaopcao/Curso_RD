package curso_RD_pt_2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Cachorro cao = new Cachorro();
		Gato gato = new Gato();

		/*		
		//Inserindo os valores dos atributos do Objeto cao
		String corCao = JOptionPane.showInputDialog(null, "Digite a cor do Cachorro:");
		cao.setCor(corCao);
		String corOlhosCao = JOptionPane.showInputDialog(null, "Digite a cor dos olhos do Cachorro:");
		cao.setCorOlhos(corOlhosCao);
		double alturaCao = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do Cachorro:"));
		cao.setAltura(alturaCao);
		double comprimentoCao = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o comprimento do Cachorro:"));
		cao.setComprimento(comprimentoCao);
		double pesoCao = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso do Cachorro:"));
		cao.setPeso(pesoCao);
		System.out.println("");

		System.out.println(cao);
		System.out.println("");
		System.out.println(cao.deitarCachorro("Deitado"));
		System.out.println("");
		System.out.println(cao.sentarCachorro("Sentado"));
		System.out.println("");
		System.out.println(cao.mexerCachorro("Mexendo"));
		System.out.println("");
		System.out.println(cao.virCachorro("Vem"));
	
		//Inserindo os valores dos atributos do Objeto gato
		String corGato = JOptionPane.showInputDialog(null, "Digite a cor do Gato:");
		gato.setCor(corGato);
		String corOlhosGato = JOptionPane.showInputDialog(null, "Digite a cor dos olhos do Gato:");
		gato.setCorOlhos(corOlhosGato);
		double alturaGato = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do Gato:"));
		gato.setAltura(alturaGato);
		double comprimentoGato = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o comprimento do Gato:"));
		gato.setComprimento(comprimentoGato);
		double pesoGato = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso do Gato:"));
		gato.setPeso(pesoGato);
		System.out.println("");

		System.out.println(gato);
		System.out.println("");
		System.out.println(gato.deitarGato("Oi"));
		System.out.println("");
		System.out.println(gato.sentarGato("Em pé"));
		System.out.println("");
		System.out.println(gato.mexerGato("Mexendo"));
		System.out.println("");
		System.out.println(gato.virGato("Vai"));
		 */
		
		Passaro passarinho = new Passaro();
		
		//Inserindo os valores dos atributos do Objeto cao
		String corPassaro = JOptionPane.showInputDialog(null, "Digite a cor do Pássaro:");
		passarinho.setCor(corPassaro);
		
		String corPenas = JOptionPane.showInputDialog(null, "Digite a cor das penas do Pássaro:");
		passarinho.setCorPenas(corPenas);
		
		String cantaPassaro = JOptionPane.showInputDialog(null, "Digite se o Pássaro canta:");
		passarinho.setCanta(cantaPassaro);
		
		double alturaPassaro = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do Pássaro:"));
		passarinho.setAltura(alturaPassaro);
		
		double comprimentoPassaro = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o comprimento do Pássaro:"));
		passarinho.setComprimento(comprimentoPassaro);
		
		double pesoPassaro = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso do Pássaro:"));
		passarinho.setPeso(pesoPassaro);
		
		System.out.println(passarinho);
	}

}
