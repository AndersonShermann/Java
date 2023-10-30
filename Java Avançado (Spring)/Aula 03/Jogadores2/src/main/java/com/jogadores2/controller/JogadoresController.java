package com.jogadores2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jogadores2.model.Jogador;

@Controller
public class JogadoresController {
	
	//Cria uma lista de jogadores
	List<Jogador> infos = new ArrayList<>();
	
	
	//Rota principal de cadastro
	@GetMapping("/")
	public String cadastro() {
		return "CadastroJogadores";
	}
	
	//Rota que recebe os dados e cria o objeto
	@PostMapping("/cadastro")
	public String cadastrarJogador(@RequestParam String nome, @RequestParam int camisa, @RequestParam String posicao) {
		Jogador jogador = new Jogador();
		jogador.setNome(nome);
		jogador.setCamisa(camisa);
		jogador.setPosicao(posicao);
		infos.add(jogador);
		
		return "redirect:/listar";
	}
	
	@GetMapping("listar")
	public String listarJogadores(Model model) {
		model.addAttribute("infoJogadores", infos);
		return "ListagemJogadores";
	}

}
