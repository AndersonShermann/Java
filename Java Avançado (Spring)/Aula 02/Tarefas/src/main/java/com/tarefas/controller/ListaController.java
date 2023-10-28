package com.tarefas.controller;
 
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
 
import com.tarefas.model.Tarefa;
 
@Controller
public class ListaController {
	@GetMapping("/")
	public String listar(Model model ) {
		List<Tarefa> dados = new ArrayList<>();
		dados.add(new Tarefa(1, "Cuidar da família"));
		dados.add(new Tarefa(2, "Ficar milionario"));
		dados.add(new Tarefa(3, "Viajar o mundo inteiro"));
		dados.add(new Tarefa(4, "Ir para o espaço"));		
		model.addAttribute("lista", dados);
		return "ViewList";
	}
}
