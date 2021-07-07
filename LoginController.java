/**
 * @author Frank
 * Controller da classe LoginController.
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
 * Importa a interface Faces.
 * bean.ManagedBean.
 */
import javax.faces.bean.ManagedBean;
/**
 * Importa a interface faces.
 * bean.SessionScoped.
 */
import javax.faces.bean.SessionScoped;
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
@ManagedBean(name = "login_Bean")
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
public class LoginController implements Serializable {
	/**
	 * @author Frank
	 * Cria um atributo privado que � uma
	 * chave estatica para liberar o
	 * acesso do Serializable 
	 * para o controller.
	 */
	private static final long serialVersionUID = -7725740579213764715L;

}
