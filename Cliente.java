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
 * Importa o sistema de data do LocalDate.
 */
import java.time.LocalDate;
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
import javax.persistence.PrimaryKeyJoinColumn;
/** 
 * @author Frank Amorim:
 * Importa a persistencia do Table.
 */
import javax.persistence.Table;
/**
 * @author Frank Amorim:
 * Revela quem é o autor do classe programada.
 */
/**
 * @author Frank
 *
 */
/**
 * @author Frank Amorim:
 * Criar entidades dentro do banco.
 */
@Entity
/**
 * @author Frank Amorim:
 * Cria a tabela com o um nome expecifico.
 */
@Table(name = "tb_cliente")
/**
 * @author Frank Amorim:
 * Cria uma chave extrangeira na coluna 
 * de nome id, para ser usada pelas 
 * classes que esta sendo herdadas por ela.
 */
@PrimaryKeyJoinColumn(name="id")
/**
 * @author Frank Amorim:
 * Cria a classe Cliente que rescebe 
 * os dados dos atributos da classe Pessoa.
 * 
 */
public class Cliente extends Pessoa {
	/**
	 * 
	 */
	/**
	 * @author Frank Amorim:
	 * Cria uma atributo privada e uma
	 * chave estatica para liberar
	 * acesso do Serializable 
	 * para a classe.
	 */
	private static final long serialVersionUID = 908572065442352329L;
	/**
	 * @author Frank Amorim:
	 * Cria uma coluna no banco com o nome dado a ela.
	 */
	@Column(name = "data_cadastro")
	/**
	 * @author Frank Amorim:
	 * Cria um atributo privado de data 
	 * local para o sistema de data
	 * 
	 */
	private LocalDate data_cadastro;
	/**
	 * 
	 */
	/**
	 * @author Frank Amorim:
	 * É o contrutor cliente que vai 
	 * construir os atributos da classe 
	 * cliente no banco na tabela cliente
	 */
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @author Frank Amorim:
	 * Ele está exibindo a ação
	 * de pegar os dados no
	 * atributo data_cadastro.
	 */
	/**
	 * @return the data_cadastro
	 */
	/**
	 * @author Frank Amorim:
	 * Pega o atributo Data_cadastro,
	 * torna o publico e pega 
	 * suas informações.
	 */
	public LocalDate getData_cadastro() {
		return data_cadastro;
	}
	/**
	 * @author Frank Amorim:
	 * Ele está exibindo a ação
	 * da inserir os dados no 
	 * atributo data_cadastro.
	 */
	/**
	 * @param data_cadastro the data_cadastro to set
	 */
	/**
	 * @author Frank Amorim:
	 * Pega o atributo data_cadastro,
	 * torna o publico e inserir
	 * suas informações.
	 */
	public void setData_cadastro(LocalDate data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
}
