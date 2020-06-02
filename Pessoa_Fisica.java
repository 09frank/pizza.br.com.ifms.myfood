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
@Table(name = "tb_pessoa_fisica")
/// @PrimaryKeyJoinColumn(name="id")
public class Pessoa_Fisica extends Cliente {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4634610353526670330L;
	@Column(name = "cpf_pf")
	private int cpf_pf;
	@Column(name = "rg")
	private int rg;

	/**
	 * 
	 */
	public Pessoa_Fisica() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the cpf_pf
	 */
	public int getCpf_pf() {
		return cpf_pf;
	}

	/**
	 * @param cpf_pf the cpf_pf to set
	 */
	public void setCpf_pf(int cpf_pf) {
		this.cpf_pf = cpf_pf;
	}

	/**
	 * @return the rg
	 */
	public int getRg() {
		return rg;
	}

	/**
	 * @param rg the rg to set
	 */
	public void setRg(int rg) {
		this.rg = rg;
	}

}
