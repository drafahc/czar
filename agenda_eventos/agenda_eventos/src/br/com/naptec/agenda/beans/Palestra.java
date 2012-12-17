package br.com.naptec.agenda.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_evento_palestrante")
public class Palestra extends ClassePersistente {
	private static final long serialVersionUID = 8401201847306131122L;
	private Evento evento;
	private Palestrante palestrante;
	private Date dataPalestra;
	private Date horaPalestra;

	@ManyToOne
	public Evento getEvento() {
		return evento;
	}

	@ManyToOne
	public Palestrante getPalestrante() {
		return palestrante;
	}

	@Temporal(TemporalType.DATE)
	public Date getDataPalestra() {
		return dataPalestra;
	}

	@Temporal(TemporalType.TIME)
	public Date getHoraPalestra() {
		return horaPalestra;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public void setPalestrante(Palestrante palestrante) {
		this.palestrante = palestrante;
	}

	public void setDataPalestra(Date dataPalestra) {
		this.dataPalestra = dataPalestra;
	}

	public void setHoraPalestra(Date horaPalestra) {
		this.horaPalestra = horaPalestra;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Palestra [evento=");
		builder.append(evento);
		builder.append(", palestrante=");
		builder.append(palestrante);
		builder.append(", dataPalestra=");
		builder.append(dataPalestra);
		builder.append(", horaPalestra=");
		builder.append(horaPalestra);
		builder.append("]");
		return builder.toString();
	}
}
