package Desafio1;

public class Retangulo implements AreaCalculavel{
	
	private double largura;
	private double altura;
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
		
	}

	@Override
	public double calculaArea() {
		return  largura * altura;
	}

}
