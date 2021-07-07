/**
 * @author Frank
 * Controller da classe MesaController.
 */
/**
 * @author Frank 
 * Acesando o pacote controller.
 */
package br.com.testeif.controller;
/**
 * @author Frank
 * Importa a interface Serializable.
 */
import java.io.Serializable;
/**
 * @author Frank
 * Importa o sistema de lista do List.
 */
import java.util.List;
/** 
 * @author Frank
 * Importa o sistema do FacesMessage.
 */
import javax.faces.application.FacesMessage;
/**
 * @author Frank
 * Importa o sistema do ManagedBean.
 */
import javax.faces.bean.ManagedBean;
/**
 * @author Frank
 * Importa o sistema do SessionScoped.
 */
import javax.faces.bean.SessionScoped;
/**
 * @author Frank
 * Importa o sistema do FacesContext.
 */
import javax.faces.context.FacesContext;
/**
 * @author Frank
 * Importa a classe GenericDAO da jpaUtilDAO.
 */
import br.com.testeif.jpaUtilDAO.GenericDAO;
/**
 * @author Frank
 * Importa a classe Mesa da model.
 */
import br.com.testeif.model.Mesa;
/**
 *  @author Frank
 *  Revela quem é o autor do classe programada.
 */
/**
 * @author Frank
 *
 */
/**
 *  @author Frank
 *  Vai criar uma conexão de interpretação
 *  dos dados do controller para o 
 *  banco de dados.
 */
@ManagedBean(name = "mesa_Bean")
/**
 * @author Frank
 * Ele é anotação que marca 
 * o inicio da sessão.
 */
@SessionScoped
/**
 * @author Frank
 * Cria uma classe publica e que está
 * implementando uma interface.
 */
public class MesaController implements Serializable {
	/**
	 * @author Frank
	 * Cria um atributo privado que é uma
	 * chave estatica para liberar o
	 * acesso do Serializable 
	 * para o controller.
	 */
	private static final long serialVersionUID = 1097838812534271215L;
	/**
	 * @author Frank
	 * Cria um atributo privado mesa
	 * da classe Mesa que recebe
	 * os seus atributos.
	 */
	private Mesa mesa = new Mesa();
	/**
	 * @author Frank
	 * Teste de percistencia
	 * da classe controller
	 * com o sistema.
	 */
	// String msg = "Mesa";
	/**
	 * @author Frank
	 * Criar um atributo que vai
	 * gerenciar todos os dados
	 * que a controller irá
	 * resceber que no qual
	 * irá mandar para o
	 * banco de dados.
	 */
	GenericDAO<Mesa> mesaDAO = new GenericDAO<>();
	/**
	 * @author Frank 
	 * Ele está exibindo a ação
	 * de pegar os dados no atributo mesa.
	 */
	/**
	 * @return the mesa
	 */
	/**
	 * @author Frank
	 * Pega o atributo mesa,
	 * torna o publico e pega 
	 * suas informações.
	 */
	public Mesa getMesa() {
		return mesa;
	}
	/**
	 * @author Frank 
	 * Ele está exibindo a ação
	 * de inserir os dados no atributo mesa.
	 */
	/**
	 * @param mesa the mesa to set
	 */
	/**
	 * @author Frank
	 * Pega o atributo mesa,
	 * torna o publico e insere
	 * suas informações.
	 */
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	/**
	 * @author Frank
	 * O método serve para limpar
	 * os campos que iram receber
	 * os dados novamente.
	 */
	public void limparDados() {
		mesa = new Mesa();
	}
	/**
	 * @author Frank
	 * Esse método serve para estar
	 * adicionando os dados do cliente ao
	 * banco de dados.
	 */
	public String addMesa() {
		/**
		 * @author Frank
		 * Caso o mesa seja diferente
		 * de nulo, ele ira execuar as
		 * funções a frente.
		 */
		if (mesa != null) {
			/**
			 * @author Frank
			 * Insere no banco.
			 */
			mesaDAO.novo(mesa);
			/**
			 * @author Frank 
			 * Exibiçao da mensagem de sucesso.
			 */
			FacesContext.getCurrentInstance().addMessage("msg: ok", new FacesMessage("Salvo com sucesso"));
			return "sucesso !";
		}
		/**
		 * @author Frank
		 * Caso falhe,mostara a
		 * mensegem de erro.
		 */else {
			FacesContext.getCurrentInstance().addMessage("msg: ok", new FacesMessage(""));
			return "erro";
		}
	}
	/**
	 * @author Frank
	 * Esse metodo serve para
	 * listar o mesa ao
	 * banco de dados.
	 */
	public List<Mesa> listarMesa() {
		return mesaDAO.listarTodos(Mesa.class);
	}
	/**
	 * @author Frank
	 * Esse metodo serve para
	 * deletar o mesa ao
	 * banco de dados.
	 */

	public String delMesa() {
		/**
		 * @author Frank
		 * Caso o mesa seja diferente
		 * de nulo, ele ira execuar 
		 * as funções a frente.
		 */
		if (mesa != null) {
			/**
			 * @author Frank
			 * Deletando no banco.
			 */
			mesaDAO.deletar(mesa);
			/**
			 * @author Frank
			 * Exibiçao da mensagem de sucesso ao deletar o registro.
			 */
			FacesContext.getCurrentInstance().addMessage("msg: ok", new FacesMessage("Mesa Deletado"));
			return "Deletado !";
		}
		/**
		 * @author Frank
		 * Checa a conexão com o banco,
		 * para os metodos não
		 * entrarem em conflitos.
		 */
		return "";
	}

}
