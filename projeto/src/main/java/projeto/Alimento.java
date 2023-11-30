package projeto;

public abstract class Alimento implements TipoDeAlimento {
	private String nomeDoAlimento;
	private double preco;
	private int quantidadeDoProduto;
	private String codigo;

	public Alimento(String nomeDoAlimento, double preco, int quantidadeDoProduto, String codigo) {
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String getTipo() {
		return "Alimento";
	}

	@Override
	public double calcularImposto() {
		return 0.05 * preco;
	}

	@Override
	public String toString() {
		return "Alimento [nomeDoAlimento=" + nomeDoAlimento + ", preco=" + preco + ", quantidadeDoProduto="
				+ quantidadeDoProduto + ", codigo=" + codigo + "]";
	}

}
