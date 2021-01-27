package curso_RD_pt_2_heranca;

public class Principal_Heranca {

	public static void main(String[] args) {
		Pessoa cliente = new Pessoa ("12345","Samuel","Rua");
		Pessoa tecnico = new Tecnico ("12345","Samuel","Rua","Informatica");

		System.out.println(cliente);
		System.out.println(tecnico);
		
		System.out.println("");
	}
	
}
