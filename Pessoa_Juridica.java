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
@Table(name = "tb_pessoa_juridica")
/// @PrimaryKeyJoinColumn(name="id")
public abstract class Pessoa_Juridica extends Cliente {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8670922953856413207L;
	@Column(name = "cnpj_pj")
	private int cnpj_pj;
	@Column(name = "ie")
	private String ie;

	/**
	 * 
	 */
	public Pessoa_Juridica() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the cnpj
	 */
	public int getCnpj_pj() {
		return cnpj_pj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj_pj(int cnpj_pj) {
		this.cnpj_pj = cnpj_pj;
	}

	/**
	 * @return the ie
	 */
	public String getIe() {
		return ie;
	}

	/**
	 * @param ie the ie to set
	 */
	public void setIe(String ie) {
		this.ie = ie;
	}

}
