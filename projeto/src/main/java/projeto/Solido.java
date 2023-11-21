package projeto;

public class Solido extends Alimento {
	private double porcao;
	private double temperatura;

	public Solido(String nomeDoAlimento, double preco, int quantidadeDoProduto, String codigo, double porcao, double temperatura) {
		super(nomeDoAlimento, preco, quantidadeDoProduto, codigo);
		this.porcao = porcao;
		this.temperatura = temperatura;
	}

	public double getPorcao() {
		return porcao;
	}

	public void setPorcao(double porcao) {
		this.porcao = porcao;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return super.toString() + ", [porcao=" + porcao + ", temperatura=" + temperatura + "]";
	}

}
