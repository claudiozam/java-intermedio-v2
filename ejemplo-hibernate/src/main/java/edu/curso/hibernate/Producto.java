package edu.curso.hibernate;

import javax.persistence.*;



@Entity
@Table(name = "productos") //ESTO ES OPCIONAL
public class Producto {

	@Id // PK DE LA TABLA PRODUCTOS
	@GeneratedValue // VALOR DEL ID AUTO GENERADO
	private Long id;
	private String nombre;
	private Double precio;
	
	@Column(name = "descripcionCompleta")
	private String descripcion;
	
	@ManyToOne
	private CategoriaProducto categoriaProducto;
	
	
	public CategoriaProducto getCategoriaProducto() {
		return categoriaProducto;
	}
	
	public void setCategoriaProducto(CategoriaProducto categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
}
