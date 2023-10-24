package projeto;

import java.util.ArrayList;

public class Restaurante {
	private ArrayList<Alimento> listaDeAlimentos;

	public Restaurante() {
		this.listaDeAlimentos = new ArrayList<>();
	}

	/*
	 * public void adicionarAlimento(Alimento alimento) {
	 * listaDeAlimentos.add(alimento);
	 * }
	 */

	public void adicionarBebida(Bebida bebida) {
		listaDeAlimentos.add(bebida);
	}

	public void listarAlimentos() {
		for (Alimento alimento : listaDeAlimentos) {
			System.out.println(alimento);
		}
	}

	@Override
	public String toString() {
		return "Restaurante []";
	}
}
