/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;
import com.example.demo.model.Categoria;
import com.example.demo.services.CategoriaService;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author guilhermywilliamandrade
 */
@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {
     @Autowired
    CategoriaService categoriaService;
    
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity cadastrarCategoria(@RequestBody Categoria cat) {
        
        categoriaService.cadastrarCategoria(cat);
        
        return new ResponseEntity(HttpStatus.CREATED);
        
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    ResponseEntity removerCategoria(@PathVariable Long id) {
        categoriaService.excluirCategoria(id);
        return new ResponseEntity(HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    void editarCategoria(Categoria cat) {
        categoriaService.editarCategoria(cat);
    }
    
    @RequestMapping(method = RequestMethod.GET, value= "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Categoria>mostraCategoria(@PathVariable Long id) {
        categoriaService.buscaCategoria(id);
        Categoria categoria;
        try{
            categoria = categoriaService.buscaCategoria(id);
            
        }catch(NoSuchElementException e){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(categoria, HttpStatus.OK);
    }
}
