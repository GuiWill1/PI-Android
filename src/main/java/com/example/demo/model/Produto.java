/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import javax.persistence.Entity;

/**
 *
 * @author Rafaella
 */
@Entity
public class Produto {
    private String nome;
    private double preco;
    private Categoria categoria;
    private int quantidade;
    private Imagem imagens;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Imagem getImagens() {
        return imagens;
    }

    public void setImagens(Imagem imagens) {
        this.imagens = imagens;
    }
}
