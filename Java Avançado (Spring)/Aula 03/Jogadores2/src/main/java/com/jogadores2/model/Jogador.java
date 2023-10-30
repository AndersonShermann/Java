package com.jogadores2.model;

public class Jogador {

	//Atributos
	private int camisa;
	private String nome;
	private String posicao;
	
	//Métodos construtores
	public Jogador(int camisa, String nome, String posicao) {
		super();
		this.camisa = camisa;
		this.nome = nome;
		this.posicao = posicao;
	}
	
	public Jogador() {
		
	}
	
	//Métodos acessores
	public int getCamisa() {
		return camisa;
	}

	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
}
