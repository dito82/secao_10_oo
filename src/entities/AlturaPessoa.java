package entities;

public class AlturaPessoa {

	private String nome;
	private double altura;

	public AlturaPessoa(String nome, double altura) {
		this.nome = nome;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
