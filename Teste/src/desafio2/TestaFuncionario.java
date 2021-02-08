package desafio2;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Wellington","123456", 1000, 0.015);
		
		System.out.println("O funcionario " + f1.getNome() + "Rg " 
		+ f1.getRg() +  "recebe em 2020: " + f1.calculaSalarioTotal(2020) + ".");
		
	}

}
