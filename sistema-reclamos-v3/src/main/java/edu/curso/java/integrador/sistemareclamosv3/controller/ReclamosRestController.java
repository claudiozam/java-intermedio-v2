package edu.curso.java.integrador.sistemareclamosv3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.curso.java.integrador.sistemareclamosv3.bo.Reclamo;
import edu.curso.java.integrador.sistemareclamosv3.controller.dto.ReclamoDTO;
import edu.curso.java.integrador.sistemareclamosv3.service.ReclamoService;

import java.util.*;

@RestController
@RequestMapping("/api/reclamos")
public class ReclamosRestController {
	
	@Autowired
	private ReclamoService reclamoService;

	
	@GetMapping //URL FINAL ES: /api/reclamos
	public List<ReclamoDTO> recuperarTodosLosReclamos() {
		List<ReclamoDTO> reclamosDTO = new ArrayList<ReclamoDTO>();
		
		List<Reclamo> reclamos = reclamoService.recuperarTodosLosReclamos();
		for (Reclamo reclamo : reclamos) {
			reclamosDTO.add(new ReclamoDTO(reclamo));
		}
		
		return reclamosDTO;
	}
	
	@GetMapping(path = "/{id}") //URL FINAL ES: /api/reclamos/123456
	public ReclamoDTO recuperarReclamoPorId(@PathVariable Long id) {
		Reclamo reclamo = reclamoService.buscarReclamoPorId(id);
		ReclamoDTO reclamoDTO = new ReclamoDTO(reclamo);
		return reclamoDTO;
	}
	
	
	
	
}
