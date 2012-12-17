package br.com.naptec.agenda.services;

import java.util.List;

import br.com.naptec.agenda.beans.Evento;
import br.com.naptec.agenda.dao.EventoDAOImpl;

public class EventoService {
	private EventoDAOImpl eventoDAO;

	public void gravar(Evento ev){
		if(ev.getId() == null){
			eventoDAO.gravar(ev);
		}else{
			eventoDAO.atualizar(ev);
		}
	}
	
	public void deletar(Evento ev){
		eventoDAO.deletar(ev);
	}
	
	public Evento buscarPorId(Long id){
		return eventoDAO.buscarPorId(id);
	}
	
	public List<Evento> listar(){
		return eventoDAO.listar();
	}
	
	public EventoDAOImpl getEventoDAO() {
		return eventoDAO;
	}

	public void setEventoDAO(EventoDAOImpl eventoDAO) {
		this.eventoDAO = eventoDAO;
	}
}
