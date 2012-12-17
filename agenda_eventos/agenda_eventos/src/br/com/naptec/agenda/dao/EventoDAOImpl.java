package br.com.naptec.agenda.dao;

import java.util.List;

import br.com.naptec.agenda.beans.Evento;
import br.com.naptec.agenda.enums.Classes;

public class EventoDAOImpl extends GenericDAO<Evento, Long> {
	@Override
	public void gravar(Evento e) {
		super.gravar(e);
	}
	
	@Override
	public void atualizar(Evento e) {
		super.atualizar(e);
	}
	
	@Override
	public void deletar(Evento e) {
		super.deletar(e);
	}
	
	@SuppressWarnings("unchecked")
	public Evento buscarPorId(Long id){
		return super.buscarPorId(id, Classes.EVENTO.getClasse());
	}
	
	@SuppressWarnings("unchecked")
	public List<Evento> listar(){
		return super.listar(Classes.EVENTO.getClasse());
	}
}
