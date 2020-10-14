package com.example.atividade.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controlador {
		
	@RequestMapping("/")
	public String inicio() {
		return "pag1";
	}
	
	@RequestMapping("/pagina2")
	public String pg2() {
		return "pag2";
	}
	
}
