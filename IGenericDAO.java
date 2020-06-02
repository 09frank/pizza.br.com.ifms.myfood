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
 * Importa o sistema de lista do List.
 */
import java.util.List;
/**
 * @author Frank Amorim:
 *Cria uma interface publica.
 */
public interface IGenericDAO<E> {
/**
 * @author Frank Amorim:
 * cria uma classe publica vazia que vai 
 * resceber os dados da entidade novo
 */
	public void novo(E entidade);
	/**
	 * @author Frank Amorim:
	 * cria uma classe publica vazia que 
	 * vai resceber os dados da entidade alterar
	 */
	public void alterar(E entidade);
	/**
	 * @author Frank Amorim:
	 * cria uma classe publica vazia que vai 
	 * resceber os dados da entidade deletar
	 */
	public void deletar(E entidade);
	/**
	 * @author Frank Amorim:
	 * cria uma classe publica que 
	 * vai listar os dados rescebidos
	 */
	public List<E> listarTodos(Class<E> entidade);
}