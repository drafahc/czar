package br.com.naptec.agenda.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_palestrantes")
public class Palestrante extends ClassePersistente{
	private static final long serialVersionUID = -5331800202231053811L;
	private String nome;
	private String especialidade;
	private String paisOrigem;

	public String getNome() {
		return nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	@Column(name="pais_origem")
	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Palestrante [nome=");
		builder.append(nome);
		builder.append(", especialidade=");
		builder.append(especialidade);
		builder.append(", paisOrigem=");
		builder.append(paisOrigem);
		builder.append("]");
		return builder.toString();
	}
}
