/**
 * @author Frank
 * Controller da classe Pessoa_JuridicaController.
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
 * Importa a classe Pessoa_Juridica da model.
 */
import br.com.testeif.model.Pessoa_Juridica;
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
@ManagedBean(name = "pessoa_juridica_Bean")
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
public class Pessoa_JuridicaController implements Serializable {
	/**
	 * @author Frank
	 * Cria um atributo privado que é uma
	 * chave estatica para liberar o
	 * acesso do Serializable 
	 * para o controller.
	 */
	private static final long serialVersionUID = 7720744645326277779L;
	/**
	 * @author Frank
	 * Cria um atributo privado pessoa_juridica
	 * da classe Pessoa_Juridica que recebe
	 * os seus atributos.
	 */
	private Pessoa_Juridica pessoa_juridica = new Pessoa_Juridica() {
		/**
		 * @author Frank
		 * Cria um atributo privado que é uma
		 * chave estatica para liberar o
		 * acesso da classe Pessoa_Juridica 
		 * para o controller.
		 */
		private static final long serialVersionUID = -6631710101898738110L;
	};
	/**
	 * @author Frank
	 * Teste de percistencia
	 * da classe controller
	 * com o sistema.
	 */
	// String msg = "Pessoa_Juridica";
	/**
	 * @author Frank
	 * Criar um atributo que vai
	 * gerenciar todos os dados
	 * que a controller irá
	 * resceber que no qual
	 * irá mandar para o
	 * banco de dados.
	 */
	GenericDAO<Pessoa_Juridica> pessoa_juridicaDAO = new GenericDAO<>();
	/**
	 * @author Frank 
	 * Ele está exibindo a ação
	 * de pegar os dados no atributo pessoa_juridica.
	 */
	/**
	 * @return the pessoa_juridica
	 */
	/**
	 * @author Frank
	 * Pega o atributo pessoa_juridica,
	 * torna o publico e pega 
	 * suas informações.
	 */
	public Pessoa_Juridica getPessoa_juridica() {
		return pessoa_juridica;
	}
	/**
	 * @author Frank 
	 * Ele está exibindo a ação
	 * de inserir os dados no atributo pessoa_juridica.
	 */
	/**
	 * @param pessoa_juridica the pessoa_juridica to set
	 */
	/**
	 * @author Frank
	 * Pega o atributo pessoa_juridica,
	 * torna o publico e insere
	 * suas informações.
	 */
	public void setPessoa_juridica(Pessoa_Juridica pessoa_juridica) {
		this.pessoa_juridica = pessoa_juridica;
	}
	/**
	 * @author Frank
	 * O método serve para limpar
	 * os campos que iram receber
	 * os dados novamente.
	 */
	public void limparDados() {
		pessoa_juridica = new Pessoa_Juridica() {

			/**
			 * @author Frank
			 * Cria um atributo privado que é uma
			 * chave estatica para liberar o
			 * acesso da classe Pessoa_Juridica 
			 * para o método do controller.
			 */
			private static final long serialVersionUID = 319213661146300796L;
		};
	}
	/**
	 * @author Frank
	 * Esse método serve para estar
	 * adicionando os dados do cliente ao
	 * banco de dados.
	 */
	public String addPessoa_Juridica() {
		/**
		 * @author Frank Caso o pessoa_juridica seja diferente de nulo, ele ira execuar
		 *         as funções a frente.
		 */
		if (pessoa_juridica != null) {
			/**
			 * @author Frank Insere no banco.
			 */
			pessoa_juridicaDAO.novo(pessoa_juridica);
			/**
			 * @author Frank Exibiçao da mensagem de sucesso.
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
	 * @author Frank Esse metodo serve para listar o pessoa_juridica ao banco de
	 *         dados.
	 */
	public List<Pessoa_Juridica> listarPessoa_Juridica() {
		return pessoa_juridicaDAO.listarTodos(Pessoa_Juridica.class);
	}

	/**
	 * @author Frank Esse metodo serve para deletar o pessoa_juridica ao banco de
	 *         dados.
	 */
	public String delPessoa_Juridica() {
		/**
		 * @author Frank Caso o pessoa_juridica seja diferente de nulo, ele ira execuar
		 *         as funções a frente.
		 */
		if (pessoa_juridica != null) {
			/**
			 * @author Frank Deletando no banco.
			 */
			pessoa_juridicaDAO.deletar(pessoa_juridica);
			/**
			 * @author Frank Exibiçao da mensagem de sucesso ao deletar o registro.
			 */
			FacesContext.getCurrentInstance().addMessage("msg: ok", new FacesMessage("Pessoa Juridica Deletado"));
			return "Deletado !";
		}
		/**
		 * @author Frank Checa a conexão com o banco, para os metodos não entrarem em
		 *         conflitos.
		 */
		return "";
	}
}
