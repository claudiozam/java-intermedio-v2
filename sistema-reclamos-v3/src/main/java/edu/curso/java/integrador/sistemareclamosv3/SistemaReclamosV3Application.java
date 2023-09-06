package edu.curso.java.integrador.sistemareclamosv3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.curso.java.integrador.sistemareclamosv3.bo.CategoriaReclamo;
import edu.curso.java.integrador.sistemareclamosv3.repository.CategoriaReclamoRepository;

@SpringBootApplication
public class SistemaReclamosV3Application implements CommandLineRunner {
	
	@Autowired
	private CategoriaReclamoRepository categoriaReclamoRepository;

	public static void main(String[] args) {
		SpringApplication.run(SistemaReclamosV3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//CategoriaReclamo categoriaReclamo1 = new CategoriaReclamo();
		//categoriaReclamo1.setNombre("nuevo");
		
		//categoriaReclamoRepository.save(categoriaReclamo1);
		//System.out.println("ID generado: " + categoriaReclamo1.getId());
		
		System.out.println("Cantidad de categorias: " + categoriaReclamoRepository.count());
		Long idBuscar = 1l;
		CategoriaReclamo categoriaReclamo = categoriaReclamoRepository.findById(idBuscar).get();
		System.out.println("Nombre: " + categoriaReclamo.getNombre());
		
	}

	

}
