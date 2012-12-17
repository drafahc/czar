package br.com.naptec.agenda.dao;

import java.util.List;

import br.com.naptec.agenda.beans.Palestra;
import br.com.naptec.agenda.enums.Classes;

public class PalestraDAOImpl extends GenericDAO<Palestra, Long> {
	@Override
	public void gravar(Palestra e) {
		super.gravar(e);
	}
	
	@Override
	public void atualizar(Palestra e) {
		super.atualizar(e);
	}
	
	@Override
	public void deletar(Palestra e) {
		super.deletar(e);
	}
	
	@SuppressWarnings("unchecked")
	public Palestra buscarPorId(Long id){
		return super.buscarPorId(id, Classes.PALESTRA.getClasse());
	}
	
	@SuppressWarnings("unchecked")
	public List<Palestra> listar(){
		return super.listar(Classes.PALESTRA.getClasse());
	}
}
