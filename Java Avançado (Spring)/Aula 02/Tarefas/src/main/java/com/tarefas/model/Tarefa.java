package com.tarefas.model;
 
 
public class Tarefa {
	
	// Atributos
	
	private int id;
	private String descricao;
	
	
	// Método Construtor
	public Tarefa(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}
	
	public Tarefa() {
		
	}	
	
	// Métodos acessores
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
 
}