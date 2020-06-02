/**
 * @author Frank Amorim:
 * Model da classe Cliente.
 */
/**
 * @author Frank Amorim: 
 * Acesando o pacote testeif.app.
 */
package br.com.testeif.app;
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
 * Importa a persistencia do Persistence.
 */
import javax.persistence.Persistence;
/** 
 * @author Frank Amorim:
 * Importa a classe GenericDAO da jpaUtilDAO.
 */
import br.com.testeif.jpaUtilDAO.GenericDAO;
/** 
 * @author Frank Amorim:
 * Importa a classe Mesa da model.
 */
import br.com.testeif.model.Mesa;
/**
 *  @author Frank Amorim:
 *  Revela quem é o autor do classe programada.
 */
/**
 * @author Frank
 *
 */
/**
 * @author Frank Amorim:
 * Cria uma classe publica 
 */
public class Mainapp {
	/**
	 * @author Frank Amorim:
	 * Argumentação da criação da main.
	 */
	
	/**
	 * @param args
	 */
	
	/**
	 * @author Frank Amorim:
	 * cria um atributo publico estatito 
	 * vazio que vai permitir iniciar
	 * "rodar" a argumentação String
	 */
	public static void main(String[] args) {
		/**
		 * @author Frank Amorim:
		 * teste do metodo auto generate
		 */
		// TODO Auto-generated method stub
		/**
		 * @author Frank Amorim:
		 * permite enviar os dados do banco 
		 */
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sys_pizza_ifms");
		/**
		 * @author Frank Amorim:
		 * permite obter os dados do banco
		 */
		EntityManager manager = factory.createEntityManager();

	}
/**
 * @author Frank Amorim:
 * teste do sistema mesa
 */
	// --------------
	// Mesa
	// --------------
/**
 * @author Frank Amorim:
 * cria um atributo publico tipo vazio
 */
	public void setM() {
		/**
		 * @author Frank Amorim:
		 * dados de teste para ser inseridos no banco
		 */
		/**
		 * @author Frank Amorim:
		 * chama a classe mesa e inicia.
		 */
		Mesa mesa = new Mesa();
		/**
		 * @author Frank Amorim:
		 * envia os dados da mesa para DAO
		 */
		GenericDAO<Mesa> mdao = new GenericDAO<Mesa>();
		/**
		 * @author Frank Amorim:
		 * insere o valor Num de mesa
		 */
		mesa.setNum(10);
		/**
		 * @author Frank Amorim:
		 * insere o Status da mesa
		 */
		mesa.setStatus(true);
		/**
		 * @author Frank Amorim:
		 * insere uma novo id da mesa
		 */
		mdao.novo(mesa);
	}

}
