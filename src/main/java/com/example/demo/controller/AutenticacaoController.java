/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author guilhermywilliamandrade
 */
@RestController
@RequestMapping(value="/login")
public class AutenticacaoController {
    public static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
}
