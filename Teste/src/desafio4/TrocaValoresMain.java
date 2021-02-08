package desafio4;

import java.util.Scanner;

public class TrocaValoresMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a palavra World: ");
		String A = sc.next();
		System.out.println("Digite a palavra Hello: ");
		String B = sc.next();
		sc.close();
		
		String aux = A;
		A = B;
		B = aux;
		
		System.out.println("A String A vale: " + A);
		System.out.println("A String B vale: " + B);
		
		
	}

}
