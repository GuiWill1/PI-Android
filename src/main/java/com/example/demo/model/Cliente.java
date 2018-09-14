package com.example.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cliente implements Serializable{
    private static final long serialVersionUID = 5684774867755233893L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    private String nome;
    
     @OneToMany(mappedBy = "cliente", orphanRemoval=true, cascade = 
     CascadeType.ALL)
    private List<Telefone> telefones = new ArrayList<Telefone>();
  
    //@JoinColumn(name="telefone_id")
   
    public List<Telefone> getTelefone() {
        return telefones;
    }

    public void setTelefone(List<Telefone> Telefones) {
        this.telefones = telefones;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
