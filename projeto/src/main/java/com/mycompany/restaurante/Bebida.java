/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;

public class Bebida extends Menu {
    private boolean alcoolica;

    public Bebida(int codigo, String nome, String descricao, double preco, boolean alcoolica) {
        super(codigo, nome, descricao, preco);
        this.alcoolica = alcoolica;
    }

    public boolean isAlcoolica() {
        return alcoolica;
    }

    public void setAlcoolica(boolean alcoolica) {
        this.alcoolica = alcoolica;
    }
    
    

    @Override
    public void exibirDetalhes() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço: " + calcularImposto());
        System.out.println("Alcoólica: " + (alcoolica ? "Sim" : "Não"));
    }
    
    @Override
    public double calcularImposto() {
        if (alcoolica) {
            return (this.getPreco() + (0.15 * this.getPreco())); 
        } else {
            return this.getPreco(); 
        }
    }

   
}


