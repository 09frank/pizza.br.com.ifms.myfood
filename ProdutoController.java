/**
 * @author Frank
 * Controller da classe ProdutoController.
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
 * Importa a classe Produto da model.
 */
import br.com.testeif.model.Produto;
/**
 *  @author Frank
 *  Revela quem � o autor do classe programada.
 */
/**
 * @author Frank
 *
 */
/**
 *  @author Frank
 *  Vai criar uma conex�o de interpreta��o
 *  dos dados do controller para o 
 *  banco de dados.
 */
@ManagedBean(name = "produto_Bean")
/**
 * @author Frank
 * Ele � anota��o que marca 
 * o inicio da sess�o.
 */
@SessionScoped
/**
 * @author Frank
 * Cria uma classe publica e que est�
 * implementando uma interface.
 */
public class ProdutoController implements Serializable {
	/**
	 * @author Frank
	 * Cria um atributo privado que � uma
	 * chave estatica para liberar o
	 * acesso do Serializable 
	 * para o controller.
	 */
	private static final long serialVersionUID = -3956237582983265975L;
	/**
	 * @author Frank
	 * Cria um atributo privado produto
	 * da classe Produto que recebe
	 * os seus atributos.
	 */
	private Produto produto = new Produto();
	/**
	 * @author Frank
	 * Teste de percistencia
	 * da classe controller
	 * com o sistema.
	 */
	// String msg = "Produto";
	/**
	 * @author Frank
	 * Criar um atributo que vai
	 * gerenciar todos os dados
	 * que a controller ir�
	 * resceber que no qual
	 * ir� mandar para o
	 * banco de dados.
	 */
	GenericDAO<Produto> produtoDAO = new GenericDAO<>();
	/**
	 * @author Frank 
	 * Ele est� exibindo a a��o
	 * de pegar os dados no atributo produto.
	 */
	/**
	 * @return the produto
	 */
	/**
	 * @author Frank
	 * Pega o atributo produto,
	 * torna o publico e pega 
	 * suas informa��es.
	 */
	public Produto getProduto() {
		return produto;
	}
	/**
	 * @author Frank 
	 * Ele est� exibindo a a��o
	 * de inserir os dados no atributo produto.
	 */
	/**
	 * @param produto the cliente to set
	 */
	/**
	 * @author Frank
	 * Pega o atributo produto,
	 * torna o publico e insere
	 * suas informa��es.
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	/**
	 * @author Frank
	 * O m�todo serve para limpar
	 * os campos que iram receber
	 * os dados novamente.
	 */
	public void limparDados() {
		produto = new Produto();
	}
	/**
	 * @author Frank
	 * Esse m�todo serve para estar
	 * adicionando os dados do cliente ao
	 * banco de dados.
	 */
	public String addProduto() {
		/**
		 * @author Frank Caso o produto seja diferente de nulo, ele ira execuar as
		 *         fun��es a frente.
		 */
		if (produto != null) {
			/**
			 * @author Frank Insere no banco.
			 */
			produtoDAO.novo(produto);
			/**
			 * @author Frank Exibi�ao da mensagem de sucesso.
			 */
			FacesContext.getCurrentInstance().addMessage("msg: ok", new FacesMessage("Salvo com sucesso"));
			return "sucesso !";
		}
		/**
		 * @author Frank Caso falhe,mostara a mensegem de erro.
		 */
		else {
			FacesContext.getCurrentInstance().addMessage("msg: ok", new FacesMessage(""));
			return "erro";
		}
	}

	/**
	 * @author Frank Esse metodo serve para listar o produto ao banco de dados.
	 */
	public List<Produto> listarProduto() {
		return produtoDAO.listarTodos(Produto.class);
	}

	/**
	 * @author Frank Esse metodo serve para deletar o produto ao banco de dados.
	 */
	public String delProduto() {
		/**
		 * @author Frank Caso o produto seja diferente de nulo, ele ira execuar as
		 *         fun��es a frente.
		 */
		if (produto != null) {
			/**
			 * @author Frank Deletando no banco.
			 */
			produtoDAO.deletar(produto);
			/**
			 * @author Frank Exibi�ao da mensagem de sucesso ao deletar o registro.
			 */
			FacesContext.getCurrentInstance().addMessage("msg: ok", new FacesMessage("Produto Deletado"));
			return "Deletado !";
		}
		/**
		 * @author Frank Checa a conex�o com o banco, para os metodos n�o entrarem em
		 *         conflitos.
		 */
		return "";
	}
}
