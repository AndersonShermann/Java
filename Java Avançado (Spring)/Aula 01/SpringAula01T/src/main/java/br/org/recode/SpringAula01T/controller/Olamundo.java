package br.org.recode.SpringAula01T.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Olamundo {
	
	@GetMapping("/")
	public String olaMundo() {
		return "olaMundo";
	}
	
}
