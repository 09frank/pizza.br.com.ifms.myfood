/**
 * @author Frank
 * Controller da classe UsuarioController.
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
 * Importa a interface Faces.
 * bean.ManagedBean.
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
 * Importa a classe Usuario da model.
 */
import br.com.testeif.model.Usuario;
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
@ManagedBean(name = "usuario_Bean")
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
public class UsuarioController implements Serializable {
	/**
	 * @author Frank
	 * Cria um atributo privado que é uma
	 * chave estatica para liberar o
	 * acesso do Serializable 
	 * para o controller.
	 */
	private static final long serialVersionUID = 2271943417751602665L;
	/**
	 * @author Frank
	 * Cria um atributo privado usuario
	 * da classe Usuario que recebe
	 * os seus atributos.
	 */
	private Usuario usuario = new Usuario();
	/**
	 * @author Frank
	 * Teste de percistencia
	 * da classe controller
	 * com o sistema.
	 */
	// String msg = "Usuario";
	/**
	 * @author Frank
	 * Criar um atributo que vai
	 * gerenciar todos os dados
	 * que a controller irá
	 * resceber que no qual
	 * irá mandar para o
	 * banco de dados.
	 */
	GenericDAO<Usuario> usuarioDAO = new GenericDAO<>();
	/**
	 * @author Frank 
	 * Ele está exibindo a ação
	 * de pegar os dados no atributo usuario.
	 */
	/**
	 * @return the usuario
	 */
	/**
	 * @author Frank
	 * Pega o atributo usuario,
	 * torna o publico e pega 
	 * suas informações.
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	/**
	 * @author Frank 
	 * Ele está exibindo a ação
	 * de inserir os dados no atributo usuario.
	 */
	/**
	 * @param usuario the usuario to set
	 */
	/**
	 * @author Frank
	 * Pega o atributo usuario,
	 * torna o publico e insere
	 * suas informações.
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @author Frank O metodo serve parar 
	 * limpar os campos que iram receber 
	 * os dados novamente.
	 */
	public void limparDados() {
		usuario = new Usuario();
	}

	/**
	 * @author Frank Esse metodo serve 
	 * para adicionando usuario 
	 * ao banco de dados.
	 */
	public String addUsuario() {
		/**
		 * @author Frank Caso o usuario seja 
		 * diferente de nulo, ele ira execuar
		 * as funções a frente.
		 */
		if (usuario != null) {
			/**
			 * @author Frank Insere no banco.
			 */
			usuarioDAO.novo(usuario);
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
	 * @author Frank Esse metodo serve para listar
	 *  o usuario ao banco de dados.
	 */
	public List<Usuario> listarUsuario() {
		return usuarioDAO.listarTodos(Usuario.class);
	}

	/**
	 * @author Frank Esse metodo serve para deletar
	 *  o usuario ao banco de dados.
	 */
	public String delUsuario() {
		/**
		 * @author Frank Caso o usuario seja diferente
		 * de nulo, ele ira execuar as
		 * funções a frente.
		 */
		if (usuario != null) {
			/**
			 * @author Frank Deletando no banco.
			 */
			usuarioDAO.deletar(usuario);
			/**
			 * @author Frank Exibiçao da mensagem de sucesso
			 * ao deletar o registro.
			 */
			FacesContext.getCurrentInstance().addMessage("msg: ok", new FacesMessage("Úsuario Deletado"));
			return "Deletado !";
		}
		/**
		 * @author Frank Checa a conexão com o banco,
		 * para os metodos não entrarem em
		 * conflitos.
		 */
		return "";
	}

}
