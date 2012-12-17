package br.com.naptec.agenda.services;

import java.util.List;

import br.com.naptec.agenda.beans.Palestrante;
import br.com.naptec.agenda.dao.PalestranteDAOImpl;

public class PalestranteService {
	private PalestranteDAOImpl palestranteDAO;

	public void gravar(Palestrante ev){
		if(ev.getId() == null){
			palestranteDAO.gravar(ev);
		}else{
			palestranteDAO.atualizar(ev);
		}
	}
	
	public void deletar(Palestrante ev){
		palestranteDAO.deletar(ev);
	}
	
	public Palestrante buscarPorId(Long id){
		return palestranteDAO.buscarPorId(id);
	}
	
	public List<Palestrante> listar(){
		return palestranteDAO.listar();
	}
	
	public PalestranteDAOImpl getPalestranteDAO() {
		return palestranteDAO;
	}

	public void setPalestranteDAO(PalestranteDAOImpl palestranteDAO) {
		this.palestranteDAO = palestranteDAO;
	}
}
