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
 *  Revela quem é o autor do classe programada.
 */
/**
 * @author Frank
 *
 */
/**
 * @author Frank Amorim:
 *  Vai criar uma conexão de interpretação
 *  dos dados do controller para o 
 *  banco de dados.
 */
@ManagedBean(name = "cliente_Bean")
/**
 * @author Frank Amorim:
 * Ele é anotação que marca 
 * o inicio da sessão.
 */
@SessionScoped
/**
 * @author Frank Amorim:
 * Cria uma classe publica e que está
 * implementando uma interface.
 */
public class ClienteController implements Serializable {
	/**
	 * @author Frank Amorim:
	 * Cria um atributo privado que é uma
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
	 * que a controller irá
	 * resceber que no qual
	 * irá mandar para o
	 * banco de dados.
	 */
	GenericDAO<Cliente> clienteDAO = new GenericDAO<>();
	/**
	 * @author Frank Amorim:
	 * Ele está exibindo a ação
	 * de pegar os dados no atributo cliente.
	 */
	/**
	 * @return the cliente
	 */
	/**
	 * @author Frank Amorim:
	 * Pega o atributo cliente,
	 * torna o publico e pega 
	 * suas informações.
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @author Frank Amorim:
	 * Ele está exibindo a ação
	 * de inserir os dados no atributo cliente.
	 */
	/**
	 * @param cliente the cliente to set
	 */
	/**
	 * @author Frank Amorim:
	 * Pega o atributo cliente,
	 * torna o publico e insere
	 * suas informações.
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * @author Frank Amorim:
	 * O método serve para limpar
	 * os campos que iram receber
	 * os dados novamente.
	 */
		public void limparDados() {
			cliente = new Cliente();
		}
/**
 * @author Frank Amorim:
 * Esse método serve para estar
 * adicionando os dados do cliente ao
 * banco de dados.
 */
	public String addCliente() {
/**
 * @author Frank Amorim:
 * Caso o cliente seja diferente
 * de nulo, ele ira execuar as
 * funções a frente.
 */
		if (cliente != null) {
/**
 * @author Frank Amorim:
 * Está Inserindo dados no banco.
 */
			clienteDAO.novo(cliente);
/**
 * @author Frank Amorim:
 * Exibição da mensagem de sucesso.
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
	 * Esse método serve para
	 * listar o cliente ao
	 * banco de dados.
	 */
	public List<Cliente> listarCliente() {
		return clienteDAO.listarTodos(Cliente.class);
	}
	/**
	 * @author Frank Amorim:
	 * Esse método serve para
	 * deletar o cliente no
	 * banco de dados.
	 */
	public String delCliente() {
/**
 * @author Frank Amorim:
 * Caso o cliente seja diferente
 * de nulo, ele ira execuar 
 * as funções a frente.
 */
		if (cliente != null) {
			/**
			 * @author Frank Amorim:
			 * Está Deletando os dados no banco.
			 */
			clienteDAO.deletar(cliente);
			/**
			 * @author Frank Amorim:
			 * Exibiçao da mensagem de 
			 * sucesso ao deletar os dados.
			 */
			FacesContext.getCurrentInstance().addMessage("msg: ok", new FacesMessage("Cliente Deletado"));
			return "Deletado !";
		}
		/**
		 * @author Frank Amorim:
		 * Fecha a conexão com o banco,
		 * para os métodos não
		 * entrarem em conflitos.
		 */
		return "";
	}
}
