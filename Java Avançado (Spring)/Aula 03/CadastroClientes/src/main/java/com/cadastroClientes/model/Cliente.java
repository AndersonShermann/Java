package com.cadastroClientes.model;

public class Cliente {
	
	//Atributos
	private String nome;
	private int cpf;
	private int idade;
	private String email;
	
	//Método construtor
	public Cliente(String nome, int cpf, int idade, String email, String senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.email = email;
	}
	

	public Cliente() {

	}
	
	//Métodos acessores
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	

}
