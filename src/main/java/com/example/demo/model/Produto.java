/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Rafaella
 */
@Entity
@Table(name = "produto")
public class Produto {
    private Long id;
    private String nome;
    private double preco;
    private double custo;
    private Categoria categoria;
    private int quantidade;
    private Collection<Imagem> imagens;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "custo", nullable = false)
    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    @Column(name = "nome", nullable = false)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Column(name = "preco", nullable = false)
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

   @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="categoria")
    public Categoria getCategoria() {
        return categoria;
    }
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name="imagem")
    public Collection<Imagem> getImagens() {
        return imagens;
    }

    public void setImagens(Collection<Imagem> imagens) {
        this.imagens = imagens;
    }


    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    @Column(name = "quantidade", nullable = false)
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

  
}
