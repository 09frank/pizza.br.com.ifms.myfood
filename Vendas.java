/**
 * 
 */
package br.com.testeif.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Frank
 *
 */

@Entity
@Table(name = "tb_vendas")

public class Vendas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name = "datas")
	private LocalDate data;
	// @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "horas")
	private LocalTime horas;
	@Column(name = "total_venda")
	private double total_venda;
	@OneToOne
	@JoinColumn(name = "fk_clientes")
	private Cliente clientes;
	@OneToMany
	@JoinColumn(name = "fk_iten_venda", insertable = false, updatable = false)
	private List<Itens_Vendas> itens;

	/**
	 * 
	 */
	public Vendas() {
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
	 * @return the data
	 */
	public LocalDate getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(LocalDate data) {
		this.data = data;
	}

	/**
	 * @return the horas
	 */
	public LocalTime getHoras() {
		return horas;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(LocalTime horas) {
		this.horas = horas;
	}

	/**
	 * @return the total_venda
	 */
	public double getTotal_venda() {
		return total_venda;
	}

	/**
	 * @param total_venda the total_venda to set
	 */
	public void setTotal_venda(double total_venda) {
		this.total_venda = total_venda;
	}

	/**
	 * @return the clientes
	 */
	public Cliente getClientes() {
		return clientes;
	}

	/**
	 * @param clientes the clientes to set
	 */
	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}

	/**
	 * @return the itens
	 */
	public List<Itens_Vendas> getItens() {
		return itens;
	}

	/**
	 * @param itens the itens to set
	 */
	public void setItens(List<Itens_Vendas> itens) {
		this.itens = itens;
	}

}
