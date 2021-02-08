package desafio2;

public class Funcionario extends Pessoa {

	
	private double salario_inicial;
	private double percentual;
	private double salario_total;
	
	public Funcionario(String nome, String rg, double salari_ini, double percentual) {
		super(nome, rg);
		this.salario_inicial = salari_ini;
		this.percentual = percentual;
		
	}

	public double calculaSalarioTotal(int ano) {
		int anosTrabalhados = ano - 2017;
		double primeiroAumento = this.salario_inicial * percentual;
		double[] aumentoCumulativo;
		aumentoCumulativo = new double[anosTrabalhados];
		for(int i = 0; i > anosTrabalhados; i++){
			primeiroAumento *= 2;
			aumentoCumulativo [i] = primeiroAumento;
		}
		return aumentoCumulativo[aumentoCumulativo.length - 1]  + salario_inicial;
	}
	
	public double getSalario_inicial() {
		return salario_inicial;
	}
	public void setSalario_inicial(double salario_inicial) {
		this.salario_inicial = salario_inicial;
	}
	public double getPercentual() {
		return percentual;
	}
	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}
	public double getSalario_total() {
		return salario_total;
	}
	public void setSalario_total(double salario_total) {
		this.salario_total = salario_total;
	}
	
}
