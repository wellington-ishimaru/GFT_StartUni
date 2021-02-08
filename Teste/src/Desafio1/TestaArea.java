package Desafio1;

public class TestaArea {

	public static void main(String[] args) {
		Quadrado q1 = new Quadrado(2);
		Retangulo r1 = new Retangulo(2,4);
		Circulo c1 = new Circulo(1);
		
		
		//testando calculo da area
		System.out.println(q1.calculaArea());
		System.out.println(r1.calculaArea());
		System.out.println(c1.calculaArea());
	}

}
