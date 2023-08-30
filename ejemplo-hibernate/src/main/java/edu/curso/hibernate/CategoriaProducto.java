package edu.curso.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CategoriaProducto {

	@Id
	@GeneratedValue
	private Long id;
	private String nonbre;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNonbre() {
		return nonbre;
	}
	public void setNonbre(String nonbre) {
		this.nonbre = nonbre;
	}
	
}
