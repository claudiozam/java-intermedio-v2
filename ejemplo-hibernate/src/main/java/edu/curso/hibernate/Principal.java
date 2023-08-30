package edu.curso.hibernate;

import org.hibernate.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession(); //FALTA EL RESTO DEL CODIGO PARA RECUPERAR UN SESSION
		Transaction transaction = session.beginTransaction();
		
		Producto producto1 = new Producto();
		producto1.setNombre("Ejemplo1");
		producto1.setDescripcion("Este es un ejemplo de un producto");
		producto1.setPrecio(5000.0);
		
		session.save(producto1); //ESTO GENERA UN INSER EN LA BASE DE DATOS
		
		System.out.println("El id generado del nuevo producto es: " + producto1.getId());
		
		transaction.commit();
		session.close(); //IMPORTANTE CERRAR EL SESSION
		HibernateUtil.close();

	}

}
