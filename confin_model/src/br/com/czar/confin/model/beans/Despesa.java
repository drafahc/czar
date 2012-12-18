package br.com.czar.confin.model.beans;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_confin_despesas")
public class Despesa extends ClassePersistente {
	private static final long serialVersionUID = 796774188387339616L;
	private String nomeDespesa;
	private BigDecimal valorDespesa;

	public String getNomeDespesa() {
		return nomeDespesa;
	}

	public BigDecimal getValorDespesa() {
		return valorDespesa;
	}

	public void setNomeDespesa(String nomeDespesa) {
		this.nomeDespesa = nomeDespesa;
	}

	public void setValorDespesa(BigDecimal valorDespesa) {
		this.valorDespesa = valorDespesa;
	}
}
