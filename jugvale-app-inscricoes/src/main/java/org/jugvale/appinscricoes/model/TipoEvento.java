package org.jugvale.appinscricoes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * O tipo de um evento. Pode ser, por exemplo, uma Palestra, Coding Dojo, etc.
 * 
 * @author William Ant�nio
 * 
 */
@Entity(name = "TipoEvento")
@Table(name = "tipo_evento")
public class TipoEvento {
	/**
	 * Identificador �nico de um tipo de evento. <br>
	 * O banco de dados ir� prover o valor desse campo.
	 */
	@Id
	@Column(name = "tpe_id")
	@GeneratedValue
	private int id;

	/**
	 * O nome de um tipo de evento. � um campo obrigat�rio
	 */
	private String nome;

	/**
	 * A descri��o desse tipo de evento, n�o � obrigat�rio.
	 */
	private String descricao;

	public TipoEvento() {
	}

	/**
	 * Cria um tipo novo de evento usando os par�metros passados.
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