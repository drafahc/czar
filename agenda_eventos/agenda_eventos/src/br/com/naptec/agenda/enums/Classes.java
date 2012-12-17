package br.com.naptec.agenda.enums;

import br.com.naptec.agenda.beans.Evento;
import br.com.naptec.agenda.beans.Palestra;
import br.com.naptec.agenda.beans.Palestrante;

@SuppressWarnings("rawtypes")
public enum Classes {
	EVENTO(Evento.class),
	PALESTRANTE(Palestrante.class),
	PALESTRA(Palestra.class);
	
	private Class classe;
	
	private Classes(Class classe){
		this.setClasse(classe);
	}
	
	public Class getClasse() {
		return classe;
	}
	
	public void setClasse(Class classe) {
		this.classe = classe;
	}
}
