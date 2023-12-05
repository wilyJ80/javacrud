/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;

public class Prato extends Menu {
    private String tipoCozinha;

    public Prato(int codigo, String nome, String descricao, double preco, String tipoCozinha) {
        super(codigo, nome, descricao, preco);
        this.tipoCozinha = tipoCozinha;
    }

    public String getTipoCozinha() {
        return tipoCozinha;
    }
    public void setTipoCozinha(String tipoCozinha) {
        this.tipoCozinha = tipoCozinha;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço: " + getPreco());
        System.out.println("Tipo de Cozinha: " + getTipoCozinha());
    }
    
    @Override
    public double calcularImposto() {
        if (tipoCozinha.equalsIgnoreCase("Outros")) {
            return getPreco() * 0.1; // Imposto de 10% para tipo de cozinha outros
        } else {
            return 0.0; // Sem imposto para tipo de cozinha brasileira
        }
    }

    
}
