/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;
import com.example.demo.model.Venda;
import com.example.demo.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author guilhermywilliamandrade
 */
@Service
public class VendaService {

    @Autowired
    VendaRepository vendaRepository;

    public void cadastrarVenda(Venda vend) {
        vendaRepository.save(vend);
    }

    public void editarVenda(Venda vend) {
        vendaRepository.save(vend);
    }

   public void excluirVenda(Long id) {
        vendaRepository.deleteById(id);
    }

   public Venda buscaVenda(Long id) {
        return vendaRepository.findById(id).get();
    }
}
