/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;

public class Sobremesa extends Menu {
    private boolean isGourmet;

    public Sobremesa(int codigo, String nome, String descricao, double preco, boolean isGourmet) {
        super(codigo, nome, descricao, preco);
        this.isGourmet = isGourmet;
    }

    public boolean isGourmet() {
        return isGourmet;
    }

    public void setIsGourmet(boolean isGourmet) {
        this.isGourmet = isGourmet;
    }
    
    public void setGourmet(boolean isGourmet) {
    this.isGourmet = isGourmet;
}
    

    @Override
    public void exibirDetalhes() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço: " + getPreco());
        System.out.println("Gourmet: " + (isGourmet ? "Sim" : "Não"));
        System.out.println("Imposto: " + (isGourmet ? "5%" : "0%"));
    }
    
    @Override
    public double calcularImposto() {
        if (isGourmet) {
            return getPreco() * 0.05; // Imposto de 5% para sobremesas gourmet
        } else {
            return 0.0; // Sem imposto para sobremesas não gourmet
        }
    }

    

    
}

