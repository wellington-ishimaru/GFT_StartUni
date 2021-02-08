package desafio3;

import java.util.Scanner;

public class ElefanteMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor inteiro: ");
		int numero = sc.nextInt();
		sc.close();

		for (int i= 0; i < numero; i++) {
			System.out.print("Incomoda ");
		}
		System.out.print("muito mais");
		
	}
}
