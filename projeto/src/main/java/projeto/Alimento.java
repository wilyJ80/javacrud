package projeto;

public abstract class Alimento {
	private String nomeDoAlimento;
	private double preco;
	private int quantidadeDoProduto;
	private int codigo;
	// especificas: quantidade (quilo/litro)

	public Alimento(String nomeDoAlimento, double preco, int quantidadeDoProduto, int codigo) {
		this.nomeDoAlimento = nomeDoAlimento;
		this.preco = preco;
		this.quantidadeDoProduto = quantidadeDoProduto;
		this.codigo = codigo;
	}

	public String getNomeDoAlimento() {
		return nomeDoAlimento;
	}

	public void setNomeDoAlimento(String nomeDoAlimento) {
		this.nomeDoAlimento = nomeDoAlimento;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeDoProduto() {
		return quantidadeDoProduto;
	}

	public void setQuantidadeDoProduto(int quantidadeDoProduto) {
		this.quantidadeDoProduto = quantidadeDoProduto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Alimento [nomeDoAlimento=" + nomeDoAlimento + ", preco=" + preco + ", quantidadeDoProduto="
				+ quantidadeDoProduto + ", codigo=" + codigo + "]";
	}

}
