package Desafio1;

public class Circulo implements AreaCalculavel{
	
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return (3.14 * Math.pow(raio, 2));
	}

}
