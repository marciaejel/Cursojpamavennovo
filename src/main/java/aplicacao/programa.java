package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.pessoa;

public class programa {

	public static void main(String[] args) {
		pessoa p1 = new pessoa(null, "Marcia Teresinha da Silva Macedo", "marciaejel@gmail.com", "Rua Versalhes Mesquita RJ");
		pessoa p2 = new pessoa(null, "Camila da Silva", "mila@gmail.com", "Rua Versalhes Mesquita RJ");
		pessoa p3 = new pessoa(null, "Isabella da Silva Macedo", "bella@gmail.com", "Rua Versalhes Mesquita RJ");
		pessoa p4 = new pessoa(null, "Jeliton Dutra Macedo", "jeliton@gmail.com", "Rua Versalhes Mesquita RJ");
		pessoa p5 = new pessoa (null,"Fulano da Silva", "fulano@gmail.com", "Rua Versalhes Mesquita RJ");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.persist(p5);
		em.getTransaction().commit();
		System.out.println("pronto!");
		
	}
}