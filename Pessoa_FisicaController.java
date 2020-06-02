/**
 * @author Frank
 * Controller da classe Pessoa_FisicaController.
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
 * Importa a classe Pessoa_Fisica da model.
 */
import br.com.testeif.model.Pessoa_Fisica;
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
@ManagedBean(name = "pessoa_fisica_Bean")
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
public class Pessoa_FisicaController implements Serializable {
	/**
	 * @author Frank
	 * Cria um atributo privado que é uma
	 * chave estatica para liberar o
	 * acesso do Serializable 
	 * para o controller.
	 */
	private static final long serialVersionUID = -2916974964023300147L;
	/**
	 * @author Frank
	 * Cria um atributo privado pessoa_fisica
	 * da classe Pessoa_Fisica que recebe
	 * os seus atributos.
	 */
	private Pessoa_Fisica pessoa_fisica = new Pessoa_Fisica();
	/**
	 * @author Frank
	 * Teste de percistencia
	 * da classe controller
	 * com o sistema.
	 */
	// String msg = "Pessoa_Fisica";
	/**
	 * @author Frank
	 * Criar um atributo que vai
	 * gerenciar todos os dados
	 * que a controller irá
	 * resceber que no qual
	 * irá mandar para o
	 * banco de dados.
	 */
	GenericDAO<Pessoa_Fisica> pessoa_fisicaDAO = new GenericDAO<>();
	/**
	 * @author Frank 
	 * Ele está exibindo a ação
	 * de pegar os dados no atributo pessoa_fisica.
	 */
	/**
	 * @return the pessoa_fisica
	 */
	/**
	 * @author Frank
	 * Pega o atributo pessoa_fisica,
	 * torna o publico e pega 
	 * suas informações.
	 */
	public Pessoa_Fisica getPessoa_fisica() {
		return pessoa_fisica;
	}
	/**
	 * @author Frank 
	 * Ele está exibindo a ação
	 * de inserir os dados no atributo pessoa_fisica.
	 */
	/**
	 * @param pessoa_fisica the pessoa_fisica to set
	 */
	/**
	 * @author Frank
	 * Pega o atributo pessoa_fisica,
	 * torna o publico e insere
	 * suas informações.
	 */
	public void setPessoa_fisica(Pessoa_Fisica pessoa_fisica) {
		this.pessoa_fisica = pessoa_fisica;
	}
	/**
	 * @author Frank
	 * O método serve para limpar
	 * os campos que iram receber
	 * os dados novamente.
	 */
	public void limparDados() {
		pessoa_fisica = new Pessoa_Fisica();
	}
	/**
	 * @author Frank
	 * Esse método serve para estar
	 * adicionando os dados do cliente ao
	 * banco de dados.
	 */
	public String addPessoa_Fisica() {
		/**
		 * @author Frank Caso o pessoa_fisica seja diferente de nulo, ele ira execuar as
		 *         funções a frente.
		 */
		if (pessoa_fisica != null) {
			/**
			 * @author Frank Insere no banco.
			 */
			pessoa_fisicaDAO.novo(pessoa_fisica);
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
	 * @author Frank Esse metodo serve para listar o pessoa_fisica ao banco de dados.
	 */
	public List<Pessoa_Fisica> listarPessoa_Fisica() {
		return pessoa_fisicaDAO.listarTodos(Pessoa_Fisica.class);
	}

	/**
	 * @author Frank Esse metodo serve para deletar o pessoa_fisica ao banco de dados.
	 */
	public String delPessoa_Fisica() {
		/**
		 * @author Frank Caso o pessoa_fisica seja diferente de nulo, ele ira execuar as
		 *         funções a frente.
		 */
		if (pessoa_fisica != null) {
			/**
			 * @author Frank Deletando no banco.
			 */
			pessoa_fisicaDAO.deletar(pessoa_fisica);
			/**
			 * @author Frank Exibiçao da mensagem de sucesso ao deletar o registro.
			 */
			FacesContext.getCurrentInstance().addMessage("msg: ok", new FacesMessage("Pessoa Fisica Deletado"));
			return "Deletado !";
		}
		/**
		 * @author Frank Checa a conexão com o banco, para os metodos não entrarem em
		 *         conflitos.
		 */
		return "";
	}

}
