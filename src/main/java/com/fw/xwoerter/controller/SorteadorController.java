package com.fw.xwoerter.controller;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fw.xwoerter.beans.Entrada;

/**
 * SorteadorController
 */
@RestController
public class SorteadorController {
    @RequestMapping("desafio")
    public Entrada getDesafio() {
		List<Entrada> entradas = new ArrayList<>();
		entradas.add(new Entrada("Hund", "das", "perro"));
		entradas.add(new Entrada("Kind", "das", "niño"));
        entradas.add(new Entrada("Garten", "der", "jardín"));
        SecureRandom sRandom = new SecureRandom();
        int siguienteValor = sRandom.nextInt(entradas.size());
        System.out.println(siguienteValor);
        return entradas.get(siguienteValor);
    }
}