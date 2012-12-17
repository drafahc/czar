package br.com.naptec.agenda.services;

import java.util.List;

import br.com.naptec.agenda.beans.Palestra;
import br.com.naptec.agenda.dao.PalestraDAOImpl;

public class PalestraService {
	private PalestraDAOImpl palestraDao;

	public void gravar(Palestra ev){
		if(ev.getId() == null){
			palestraDao.gravar(ev);
		}else{
			palestraDao.atualizar(ev);
		}
	}
	
	public void deletar(Palestra ev){
		palestraDao.deletar(ev);
	}
	
	public Palestra buscarPorId(Long id){
		return palestraDao.buscarPorId(id);
	}
	
	public List<Palestra> listar(){
		return palestraDao.listar();
	}
	
	public PalestraDAOImpl getPalestraDao() {
		return palestraDao;
	}

	public void setPalestraDao(PalestraDAOImpl palestraDao) {
		this.palestraDao = palestraDao;
	}
}
