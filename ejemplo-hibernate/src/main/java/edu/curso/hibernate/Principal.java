package edu.curso.hibernate;

import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession(); //FALTA EL RESTO DEL CODIGO PARA RECUPERAR UN SESSION
		Transaction transaction = session.beginTransaction();
		
		/*Producto producto1 = new Producto();
		producto1.setNombre("Ejemplo4");
		producto1.setDescripcion("Este es un ejemplo de un producto 4");
		producto1.setPrecio(31000.0);
		
		session.save(producto1); //ESTO GENERA UN INSER EN LA BASE DE DATOS
		
		System.out.println("El id generado del nuevo producto es: " + producto1.getId()); */
		

		/*
		Long idBuscar = 1L; //EJEMPLO DE COMO RECUPERAR!!!!
		Producto productoBuscar = session.load(Producto.class, idBuscar);
		System.out.println("Nombre: " + productoBuscar.getNombre());
		System.out.println("Desc: " + productoBuscar.getDescripcion());
		System.out.println("Precio: " + productoBuscar.getPrecio());
		
		
		//EJEMPLO DE UPDATE
		productoBuscar.setDescripcion("Ejemplo de update....");
		session.update(productoBuscar);
		
		//EJEPLO DE DELETE
		session.delete(productoBuscar);
		*/
		
		
		Query<Producto> queryProductos = session.createQuery("from Producto as p where p.precio > :precio order by p.nombre", Producto.class);
		queryProductos.setParameter("precio", 10000.0);
		
		List<Producto> productos = queryProductos.list();
		for (Producto p : productos) {
			System.out.println("Id: " + p.getId());
			System.out.println("Nombre: " + p.getNombre());
			System.out.println("Desc: " + p.getDescripcion());
			System.out.println("Precio: " + p.getPrecio());
			System.out.println("****************************");
		}
		
		transaction.commit();
		session.close(); //IMPORTANTE CERRAR EL SESSION
		HibernateUtil.close();

	}

}
