package br.com.naptec.agenda.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_eventos")
public class Evento extends ClassePersistente {
	private static final long serialVersionUID = 6490743063676273282L;
	private String nome;
	private Date dataInicioEvento;
	private Date dataFimEvento;

	public String getNome() {
		return nome;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_ini_evento")
	public Date getDataInicioEvento() {
		return dataInicioEvento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_fim_evento")
	public Date getDataFimEvento() {
		return dataFimEvento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataInicioEvento(Date dataInicioEvento) {
		this.dataInicioEvento = dataInicioEvento;
	}

	public void setDataFimEvento(Date dataFimEvento) {
		this.dataFimEvento = dataFimEvento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Evento [nome=");
		builder.append(nome);
		builder.append(", dataInicioEvento=");
		builder.append(dataInicioEvento);
		builder.append(", dataFimEvento=");
		builder.append(dataFimEvento);
		builder.append("]");
		return builder.toString();
	}
}
