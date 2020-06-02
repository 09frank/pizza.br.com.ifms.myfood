/**
 * @author Frank Amorim:
 * Model da classe Cliente.
 */
/**
 * @author Frank Amorim: 
 * Acesando o pacote testeif.app.
 */
package br.com.testeif.jpaUtilDAO;
/**
 * @author Frank Amorim:
 * Importa a interface Serializable.
 */
import java.io.Serializable;
/**
 * @author Frank Amorim:
 * Importa o sistema de lista do List.
 */
import java.util.List;
/** 
 * @author Frank Amorim:
 * Importa a persistencia do EntityManager.
 */
import javax.persistence.EntityManager;
/** 
 * @author Frank Amorim:
 * Importa a persistencia do EntityManagerFactory.
 */
import javax.persistence.EntityManagerFactory;
/** 
 * @author Frank Amorim:
 * Importa a persistencia do EntityTransaction.
 */
import javax.persistence.EntityTransaction;
/** 
 * @author Frank Amorim:
 * Importa a persistencia do Persistence.
 */
import javax.persistence.Persistence;
/**
 * @author Frank Amorim:
 * Cria uma classe publica e que está
 * implementando uma interface do IGenericDAO.
 */
public class GenericDAO<E> implements IGenericDAO<E>, Serializable {
	/**
	 * @author Frank Amorim:
	 * Cria um atributo privado que é uma
	 * chave estatica para liberar o
	 * acesso do Serializable 
	 * para o controller.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @author Frank Amorim:
	 * atributo protegido EntityManager (em) 
	 * que sera acessado apenas as classes que 
	 * estão dentro do pacote jpaUtilDAO.
	 */
	protected EntityManager em;
/**
 * @author Frank Amorim:
 * este metodo serve para gerenciar a genericDAO
 */
	public GenericDAO() {
		final EntityManagerFactory factory = Persistence.createEntityManagerFactory("sys_testy_ifms");
		em = factory.createEntityManager();
	}
/**
 * @author Frank Amorim:
 * metódo de inserir generico de inserção 
 * de dados para o banco de dados.
 * No qual a variavel "E" que é uma entidade no 
 * qual recebera a classe do pacote model.
 * Que no qual vai pegar os atributos e os 
 * dados e assim colocando no banco.
 */
	public void novo(final E entidade) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entidade);
		et.commit();
		em.close();
	}
	/**
	 * @author Frank Amorim:
	 * metódo de alterar generico de inserção 
	 * de dados para o banco de dados.
	 * No qual a variavel "E" que é uma entidade no 
	 * qual recebera a classe do pacote model.
	 * Que no qual vai pegar os atributos e os 
	 * dados e assim alterando no banco.
	 */
	public void alterar(final E entidade) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(entidade);
		et.commit();
		em.close();
	}
	/**
	 * @author Frank Amorim:
	 * metódo de deletar generico de inserção 
	 * de dados para o banco de dados.
	 * No qual a variavel "E" que é uma entidade no 
	 * qual recebera a classe do pacote model.
	 * Que no qual vai pegar os atributos e os 
	 * dados e assim apagando no banco.
	 */
	public void deletar(final E entidade) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(entidade);
		et.commit();
		em.close();
	}
	/**
	 * @author Frank Amorim:
	 * Sobreescreve um metodo ja existente em 
	 * list, assim atualizando o resultado
	 */
	@Override
	/**
	 * @author Frank Amorim:
	 * metódo de listar generico de inserção 
	 * de dados para o banco de dados.
	 * No qual a variavel "E" que é uma entidade no 
	 * qual recebera a classe do pacote model.
	 * Que no qual vai pegar os atributos e os 
	 * dados e assim pegando no banco.
	 */
	public List<E> listarTodos(Class<E> entidade) {
		final EntityTransaction et = em.getTransaction();
		et.begin();

		List<E> retorno = em.createQuery("from" + entidade.getName()).getResultList();
		et.commit();
		em.close();

		return retorno;
	}

}
