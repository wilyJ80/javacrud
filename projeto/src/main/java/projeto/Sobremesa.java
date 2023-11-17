package projeto;

public class Sobremesa extends Alimento {
	private double teorDeAcucar;

	public Sobremesa(String nomeDoAlimento, double preco, int quantidadeDoProduto, String codigo, double teorDeAcucar) {
		super(nomeDoAlimento, preco, quantidadeDoProduto, codigo);
		this.teorDeAcucar = teorDeAcucar;
	}

	public double getTeorDeAcucar() {
		return teorDeAcucar;
	}

	public void setTeorDeAcucar(double teorDeAcucar) {
		this.teorDeAcucar = teorDeAcucar;
	}

	@Override
	public String toString() {
		return super.toString() + ", [teorDeAcucar=" + teorDeAcucar + "]";
	}

}

