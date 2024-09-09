package br.com.senaibrasilia.projetofinal.test;
import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.senaibrasilia.projetofinal.model.Categoria;
import br.com.senaibrasilia.projetofinal.model.Produto;

public class Principal {

	public static void main(String[] args) {
		
		// estado new
		 Produto p = new Produto("Mouse", "Mouse Doll Optico", new BigDecimal("100"));
		 
		 Categoria c = new Categoria();
		 c.setNome("Eletrônico");
		 
		 // configura com o persistence.xml - ligação <persistence.unit
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
		 
		 EntityManager em = factory.createEntityManager();
		 
		 em.getTransaction().begin();
		 // entra no estado gerenciado 
		 em.persist(p);
		 em.persist(c);
		 // salva no banco
		 em.getTransaction().commit();
		 // fecha
		 em.close();

	}

}
