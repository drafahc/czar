package br.com.czar.confin.model.beans;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_confin_receita")
public class Receita extends ClassePersistente {
	private static final long serialVersionUID = -6502686519660205212L;
	private String nomeReceita;
	private BigDecimal valorReceita;

	public String getNomeReceita() {
		return nomeReceita;
	}

	public void setNomeReceita(String nomeReceita) {
		this.nomeReceita = nomeReceita;
	}

	public BigDecimal getValorReceita() {
		return valorReceita;
	}

	public void setValorReceita(BigDecimal valorReceita) {
		this.valorReceita = valorReceita;
	}
}
