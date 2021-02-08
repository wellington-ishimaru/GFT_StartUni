package Desafio1;

public class Quadrado implements AreaCalculavel {
	
	public double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return Math.pow(this.lado, 2);
	}

}
