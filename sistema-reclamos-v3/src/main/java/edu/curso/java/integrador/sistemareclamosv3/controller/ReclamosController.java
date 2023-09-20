package edu.curso.java.integrador.sistemareclamosv3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.curso.java.integrador.sistemareclamosv3.bo.Reclamo;
import edu.curso.java.integrador.sistemareclamosv3.service.ReclamoService;

@Controller
@RequestMapping(value = "/reclamos")
public class ReclamosController {
	
	@Autowired
	private ReclamoService reclamoService;
	
	
	@RequestMapping(value = "/listar") //URL FINAL /reclamos/listar
	public String listarReclamos(Model model) {
		List<Reclamo> reclamos = reclamoService.recuperarTodosLosReclamos();
		model.addAttribute("reclamos", reclamos);
		return "/reclamos/listar";
	}
	
	@RequestMapping(value = "/{id}") //URL FINAL /reclamos/1233434543645
	public String verReclamo(Model model,@PathVariable  Long id) {
		Reclamo reclamo = reclamoService.buscarReclamoPorId(id);
		model.addAttribute("reclamo", reclamo);
		return "/reclamos/ver";
	}

}
