package org.jugvale.appinscricoes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * O tipo de um evento. Pode ser, por exemplo, uma Palestra, Coding Dojo, etc.
 * 
 * @author William Antônio
 * 
 */
@Entity(name = "TipoEvento")
@Table(name = "tipo_evento")
public class TipoEvento {
	/**
	 * Identificador único de um tipo de evento. <br>
	 * O banco de dados irá prover o valor desse campo.
	 */
	@Id
	@Column(name = "tpe_id")
	@GeneratedValue
	private int id;

	/**
	 * O nome de um tipo de evento. É um campo obrigatório
	 */
	private String nome;

	/**
	 * A descrição desse tipo de evento, não é obrigatório.
	 */
	private String descricao;

	public TipoEvento() {
	}

	/**
	 * Cria um tipo novo de evento usando os parâmetros passados.
	 * 
	 * @param nome
	 * @param descricao
	 */
	public TipoEvento(String nome, String descricao) {

		this.nome = nome;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}