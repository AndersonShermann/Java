package com.cadastroClientes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cadastroClientes.model.Cliente;

@Controller
public class ClienteController {

	//Cria uma lista de clientes
	List<Cliente> clientes = new ArrayList<>();
	
	
	//Rota principal com tela de cadastro
	@GetMapping("/")
	public String cadastro() {	
		return"CadastroCliente";
	}
	
	
	//Rota controller para armazenar as informações
	@PostMapping("/cadastro")
	public String cadastrarCliente(@RequestParam String nome, @RequestParam int cpf, @RequestParam int idade, @RequestParam String email) {
		Cliente cliente = new Cliente();
		
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setIdade(idade);
		cliente.setEmail(email);
		clientes.add(cliente);
		
		return "redirect:/listarClientes";
	}
	
	//Rota para listar clientes
	@GetMapping("/listarClientes")
	public String listarClientes(Model model) {
		model.addAttribute("infoClientes", clientes);
		return "ListagemClientes";
	}
}
