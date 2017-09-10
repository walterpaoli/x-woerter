package com.fw.xwoerter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fw.xwoerter.beans.Entrada;

@RestController
public class EntradaController {
	@RequestMapping("entradas") 
	public List<Entrada> getEntradas(){
		List<Entrada> entradas = new ArrayList<>();
		entradas.add(new Entrada("Hund", "das", "perro"));
		entradas.add(new Entrada("Kind", "das", "niño"));
		entradas.add(new Entrada("Garten", "der", "jardín"));
		return entradas;
	}
}

