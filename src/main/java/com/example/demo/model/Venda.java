/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author Guilhermy
 */
@Entity
//@Table(name = "venda")
public class Venda {
    private long id;
    private List<ItemVenda> itensVenda;
    private Cliente cliente;
    private Date data;
    private double valor;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
   @OneToOne
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    @Temporal(TemporalType.TIMESTAMP)
    public Date getData() {
        return data;
    }
    @OneToMany(cascade = {CascadeType.MERGE,
        CascadeType.PERSIST,
        CascadeType.REMOVE},
            mappedBy = "venda")
    public List<ItemVenda> getProdutos() {
        return itensVenda;
    }

    public void setProdutos(List<ItemVenda> itens) {
        this.itensVenda = itens;
    }

    public void setData(Date data) {
        this.data = data;
    }
    //@Column(name = "valor", nullable = false)
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
   
}
