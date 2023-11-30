package projeto;

public class Bebida extends Alimento {
	private double teorAlcoolico;

	public Bebida(String nomeDoAlimento, double preco, int quantidadeDoProduto, String codigo, double teorAlcoolico) {
		super(nomeDoAlimento, preco, quantidadeDoProduto, codigo);
		this.teorAlcoolico = teorAlcoolico;
	}

	public double getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	@Override
	public String toString() {
		return super.toString() + ", [teorAlcoolico=" + teorAlcoolico + "], [imposto=" + this.calcularImposto();
	}

	@Override
	public String getTipo() {
		return "Bebida";
	}

	@Override
	public double calcularImposto() {
		return 0.25 * this.getPreco();
	}
}
