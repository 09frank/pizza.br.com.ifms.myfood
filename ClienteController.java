/**
 * @author Frank Amorim:
 * Controller da classe ClienteController.
 */
/**
 * @author Frank Amorim:
 * Acesando o pacote controller.
 */
package br.com.testeif.controller;
/**
 * @author Frank Amorim:
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
 * Importa a classe Cliente da model.
 */
import br.com.testeif.model.Cliente;
/**
 * @author Frank Amorim:
 *  Revela quem � o autor do classe programada.
 */
/**
 * @author Frank
 *
 */
/**
 * @author Frank Amorim:
 *  Vai criar uma conex�o de interpreta��o
 *  dos dados do controller para o 
 *  banco de dados.
 */
@ManagedBean(name = "cliente_Bean")
/**
 * @author Frank Amorim:
 * Ele � anota��o que marca 
 * o inicio da sess�o.
 */
@SessionScoped
/**
 * @author Frank Amorim:
 * Cria uma classe publica e que est�
 * implementando uma interface.
 */
public class ClienteController implements Serializable {
	/**
	 * @author Frank Amorim:
	 * Cria um atributo privado que � uma
	 * chave estatica para liberar o
	 * acesso do Serializable 
	 * para o controller.
	 */
	private static final long serialVersionUID = -1933765169603793923L;
	/**
	 * @author Frank Amorim:
	 * Cria um atributo privado cliente
	 * da classe Cliente que recebe
	 * os seus atributos.
	 */
	private Cliente cliente = new Cliente();
	/**
	 * @author Frank Amorim:
	 * Teste de persistencia
	 * da classe controller
	 * com o sistema.
	 */
	// String msg = "Cliente";
	/**
	 * @author Frank Amorim:
	 * Criar um atributo que vai
	 * gerenciar todos os dados
	 * que a controller ir�
	 * resceber que no qual
	 * ir� mandar para o
	 * banco de dados.
	 */
	GenericDAO<Cliente> clienteDAO = new GenericDAO<>();
	/**
	 * @author Frank Amorim:
	 * Ele est� exibindo a a��o
	 * de pegar os dados no atributo cliente.
	 */
	/**
	 * @return the cliente
	 */
	/**
	 * @author Frank Amorim:
	 * Pega o atributo cliente,
	 * torna o publico e pega 
	 * suas informa��es.
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @author Frank Amorim:
	 * Ele est� exibindo a a��o
	 * de inserir os dados no atributo cliente.
	 */
	/**
	 * @param cliente the cliente to set
	 */
	/**
	 * @author Frank Amorim:
	 * Pega o atributo cliente,
	 * torna o publico e insere
	 * suas informa��es.
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * @author Frank Amorim:
	 * O m�todo serve para limpar
	 * os campos que iram receber
	 * os dados novamente.
	 */
		public void limparDados() {
			cliente = new Cliente();
		}
/**
 * @author Frank Amorim:
 * Esse m�todo serve para estar
 * adicionando os dados do cliente ao
 * banco de dados.
 */
	public String addCliente() {
/**
 * @author Frank Amorim:
 * Caso o cliente seja diferente
 * de nulo, ele ira execuar as
 * fun��es a frente.
 */
		if (cliente != null) {
/**
 * @author Frank Amorim:
 * Est� Inserindo dados no banco.
 */
			clienteDAO.novo(cliente);
/**
 * @author Frank Amorim:
 * Exibi��o da mensagem de sucesso.
 */
			FacesContext.getCurrentInstance().addMessage("msg: ok", new FacesMessage("Salvo com sucesso"));
			return "sucesso !";
		}
/**
 * @author Frank Amorim:
 * Caso falhe, mostara a
 * mensegem de erro.
 */
		else {
			FacesContext.getCurrentInstance().addMessage("msg: ok", new FacesMessage(""));
			return "erro";
		}
	}
	/**
	 * @author Frank Amorim:
	 * Esse m�todo serve para
	 * listar o cliente ao
	 * banco de dados.
	 */
	public List<Cliente> listarCliente() {
		return clienteDAO.listarTodos(Cliente.class);
	}
	/**
	 * @author Frank Amorim:
	 * Esse m�todo serve para
	 * deletar o cliente no
	 * banco de dados.
	 */
	public String delCliente() {
/**
 * @author Frank Amorim:
 * Caso o cliente seja diferente
 * de nulo, ele ira execuar 
 * as fun��es a frente.
 */
		if (cliente != null) {
			/**
			 * @author Frank Amorim:
			 * Est� Deletando os dados no banco.
			 */
			clienteDAO.deletar(cliente);
			/**
			 * @author Frank Amorim:
			 * Exibi�ao da mensagem de 
			 * sucesso ao deletar os dados.
			 */
			FacesContext.getCurrentInstance().addMessage("msg: ok", new FacesMessage("Cliente Deletado"));
			return "Deletado !";
		}
		/**
		 * @author Frank Amorim:
		 * Fecha a conex�o com o banco,
		 * para os m�todos n�o
		 * entrarem em conflitos.
		 */
		return "";
	}
}
