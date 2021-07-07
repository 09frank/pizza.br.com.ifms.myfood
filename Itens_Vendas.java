/**
 * @author Frank Amorim:
 * Model da classe Cliente.
 */
/**
 * @author Frank Amorim:
 * Acesando o pacote model.
 */
package br.com.testeif.model;
/** 
 * @author Frank Amorim:
 * Importa a persistencia do Column.
 */
import javax.persistence.Column;
/** 
 * @author Frank Amorim:
 * Importa a persistencia do Entity.
 */
import javax.persistence.Entity;
/** 
 * @author Frank Amorim:
 * Importa a persistencia do 
 * CPrimaryKeyJoinColumn.
 */
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Frank
 *
 */

@Entity
@Table(name = "tb_itens_vendas")

public class Itens_Vendas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name = "qtd")
	private int qtd;
	@ManyToOne
	@JoinColumn(name = "fk_produtos")
	private Produto produtos;
	/*@ManyToOne
	@JoinColumn(name = "fk_vendas", insertable = false, updatable = false)
	private Vendas vendas;
*/
	/**
	 * 
	 */
	public Itens_Vendas() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the qtd
	 */
	public int getQtd() {
		return qtd;
	}

	/**
	 * @param qtd the qtd to set
	 */
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	/**
	 * @return the produtos
	 */
	public Produto getProdutos() {
		return produtos;
	}

	/**
	 * @param produtos the produtos to set
	 */
	public void setProdutos(Produto produtos) {
		this.produtos = produtos;
	}

	/**
	 * @return the vendas
	 */
	/*public Vendas getVendas() {
		return vendas;
	}
*/
	/**
	 * @param vendas the vendas to set
	 */
	/* public void setVendas(Vendas vendas) {
		this.vendas = vendas;
	}
*/
}
