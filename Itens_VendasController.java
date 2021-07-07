/**
 * @author Frank
 * Controller da classe Itens_VendasController.
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
 * Importa a classe Itens_Vendas da model.
 */
import br.com.testeif.model.Itens_Vendas;
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
@ManagedBean(name = "itens_vendas_Bean")
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
public class Itens_VendasController implements Serializable {
	/**
	 * @author Frank
	 * Cria um atributo privado que é uma
	 * chave estatica para liberar o
	 * acesso do Serializable 
	 * para o controller.
	 */
	private static final long serialVersionUID = -4992083370105884474L;
	/**
	 * @author Frank
	 * Cria um atributo privado itens_vendas
	 * da classe Itens_Vendas que recebe
	 * os seus atributos.
	 */
	private Itens_Vendas itens_vendas = new Itens_Vendas();
	/**
	 * @author Frank
	 * Teste de percistencia
	 * da classe controller
	 * com o sistema.
	 */
	// String msg = "Itens_Vendas";
	/**
	 * @author Frank
	 * Criar um atributo que vai
	 * gerenciar todos os dados
	 * que a controller irá
	 * resceber que no qual
	 * irá mandar para o
	 * banco de dados.
	 */
	GenericDAO<Itens_Vendas> itens_vendasDAO = new GenericDAO<>();
	/**
	 * @author Frank 
	 * Ele está exibindo a ação
	 * de pegar os dados no atributo itens_vendas.
	 */
	/**
	 * @return the itens_vendas
	 */
	/**
	 * @author Frank
	 * Pega o atributo itens_vendas,
	 * torna o publico e pega 
	 * suas informações.
	 */
	public Itens_Vendas getItens_vendas() {
		return itens_vendas;
	}
	/**
	 * @author Frank 
	 * Ele está exibindo a ação
	 * de inserir os dados no atributo itens_vendas.
	 */
	/**
	 * @param itens_vendas the itens_vendas to set
	 */
	/**
	 * @author Frank
	 * Pega o atributo itens_vendas,
	 * torna o publico e insere
	 * suas informações.
	 */
	public void setItens_vendas(Itens_Vendas itens_vendas) {
		this.itens_vendas = itens_vendas;
	}
	/**
	 * @author Frank
	 * O método serve para limpar
	 * os campos que iram receber
	 * os dados novamente.
	 */
	public void limparDados() {
		itens_vendas = new Itens_Vendas();
	}
	/**
	 * @author Frank
	 * Esse método serve para estar
	 * adicionando os dados do cliente ao
	 * banco de dados.
	 */
	public String addItens_Vendas() {
		/**
		 * @author Frank Caso o itens_vendas seja diferente de nulo, ele ira execuar as
		 *         funções a frente.
		 */
		if (itens_vendas != null) {
			/**
			 * @author Frank Insere no banco.
			 */
			itens_vendasDAO.novo(itens_vendas);
			/**
			 * @author Frank Exibiçao da mensagem de sucesso.
			 */
			FacesContext.getCurrentInstance().addMessage("msg: ok", new FacesMessage("Salvo com sucesso"));
			return "sucesso !";
			/**
			 * @author Frank Caso falhe,mostara a mensegem de erro.
			 */
		} else {
			FacesContext.getCurrentInstance().addMessage("msg: ok", new FacesMessage(""));
			return "erro";
		}
	}

	/**
	 * @author Frank Esse metodo serve para listar o itens_vendas ao banco de dados.
	 */

	public List<Itens_Vendas> listarItens_Vendas() {
		return itens_vendasDAO.listarTodos(Itens_Vendas.class);
	}

	/**
	 * @author Frank Esse metodo serve para deletar o itens_vendas ao banco de
	 *         dados.
	 */
	public String delItens_Vendas() {
		/**
		 * @author Frank Caso o itens_vendas seja diferente de nulo, ele ira execuar as
		 *         funções a frente.
		 */
		if (itens_vendas != null) {
			/**
			 * @author Frank Deletando no banco.
			 */
			itens_vendasDAO.deletar(itens_vendas);
			/**
			 * @author Frank Exibiçao da mensagem de sucesso ao deletar o registro.
			 */
			FacesContext.getCurrentInstance().addMessage("msg: ok", new FacesMessage("Item da venda Deletado"));
			return "Deletado !";
		}
		/**
		 * @author Frank Checa a conexão com o banco, para os metodos não entrarem em
		 *         conflitos.
		 */
		return "";
	}

}
