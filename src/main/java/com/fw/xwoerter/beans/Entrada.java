package com.fw.xwoerter.beans;

public class Entrada {
	private String palabra;
	private String articulo;
	private String significado;

	public Entrada(String palabra, String articulo, String significado) {
		this.palabra = palabra;
		this.articulo = articulo;
		this.significado = significado;
	}
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public String getSignificado() {
		return significado;
	}
	public void setSignificado(String significado) {
		this.significado = significado;
	}
	
}
