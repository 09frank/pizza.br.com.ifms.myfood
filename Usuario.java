/**
 * 
 */
package br.com.testeif.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Frank
 *
 */

@Entity
@Table(name = "tb_usuario")
/// @PrimaryKeyJoinColumn(name="id")
public class Usuario extends Pessoa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7130979970282269272L;
	@Column(name = "login")
	private String login;
	@Column(name = "senha")
	private String senha;

	/**
	 * 
	 */
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void autenticar() {
		// TODO Auto-generated methods stub
	}

}
