package projeto;

public class Bebida extends Alimento {
	private double teorAlcoolico;
	private double volume;

	public Bebida(String nomeDoAlimento, double preco, int quantidadeDoProduto, int codigo, double teorAlcoolico,
			double volume) {
		super(nomeDoAlimento, preco, quantidadeDoProduto, codigo);
		this.teorAlcoolico = teorAlcoolico;
		this.volume = volume;
	}

	public double getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return super.toString() + ", Bebida [teorAlcoolico=" + teorAlcoolico + ", volume=" + volume + "]";
	}

}
