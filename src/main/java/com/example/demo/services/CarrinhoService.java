/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;

import com.example.demo.model.Carrinho;
import com.example.demo.model.Cliente;
import com.example.demo.repository.CarrinhoRepository;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author guilhermywilliamandrade
 */
@Service
public class CarrinhoService {
    @Autowired
    CarrinhoRepository carrinhoRepository;
    private final long TEMPOEXPIRACAO = TimeUnit.DAYS.toMillis(10);
 
    public Carrinho buscaPorCliente(Cliente cli){
        
       Carrinho car = carrinhoRepository.findByCliente(cli);
            if(car==null){
                car = new Carrinho();
                car.setCliente(cli);
             return   carrinhoRepository.save(car);
            }  else{
                if(car.getExpireTime().before(new Date(System.currentTimeMillis()))){
                    //car. metodo que vai limpar ele
                }
                return car;
            }
            
    }
}
