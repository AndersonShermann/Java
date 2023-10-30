package com.jogadores.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jogadores.model.Jogador;

@Controller
public class ListaJogadores {
	@GetMapping("/TableView")
	public String listar(Model model) {
		List<Jogador> infos = new ArrayList<>();
		infos.add(new Jogador(25, "Matheus Cunha", "Goleiro"));
		infos.add(new Jogador(1, "Santos", "Goleiro"));
		infos.add(new Jogador(17, "Rossi", "Goleiro"));
		infos.add(new Jogador(3, "Rodrigo Caio", "Zagueiro"));
		infos.add(new Jogador(4, "Léo Pereira", "Zagueiro"));
		infos.add(new Jogador(23, "David Luiz", "Zagueiro"));
		infos.add(new Jogador(15, "Fabricio Bruno", "Zagueiro"));
		infos.add(new Jogador(30, "Pablo", "Zagueiro"));
		infos.add(new Jogador(34, "Matheuzinho", "Lateral Direito"));
		infos.add(new Jogador(2, "Varela", "Lateral Direito"));
		infos.add(new Jogador(43, "Wesley", "Lateral Direito"));
		infos.add(new Jogador(16, "Filipe Luíz", "Lateral Esquerdo"));
		infos.add(new Jogador(6, "Ayrton Lucas", "Lateral Esquerdo"));
		infos.add(new Jogador(8, "Thiago Maia", "Volante"));
		infos.add(new Jogador(5, "Erick", "Volante"));
		infos.add(new Jogador(20, "Gerson", "Volante"));
		infos.add(new Jogador(21, "Allan", "Volante"));
		infos.add(new Jogador(7, "Everton Ribeiro", "Meia"));
		infos.add(new Jogador(14, "De Arrascaeta", "Meia"));
		infos.add(new Jogador(29, "Victor Hugo", "Meia"));
		infos.add(new Jogador(10, "Gabi Gol", "Atacante"));
		infos.add(new Jogador(27, "Bruno Henrique", "Atacante"));
		infos.add(new Jogador(9, "Pedro", "Atacante"));
		infos.add(new Jogador(11, "Everton", "Atacante"));
		infos.add(new Jogador(22, "Luíz Araújo", "Atacante"));
		
		model.addAttribute("infoJogadores", infos);
				
		return "TableView";
	}
}
