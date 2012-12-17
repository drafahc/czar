package br.com.naptec.agenda.dao;

import java.util.List;

import br.com.naptec.agenda.beans.Palestrante;
import br.com.naptec.agenda.enums.Classes;

public class PalestranteDAOImpl extends GenericDAO<Palestrante, Long> {
	@Override
	public void gravar(Palestrante e) {
		super.gravar(e);
	}
	
	@Override
	public void atualizar(Palestrante e) {
		super.atualizar(e);
	}
	
	@Override
	public void deletar(Palestrante e) {
		super.deletar(e);
	}
	
	@SuppressWarnings("unchecked")
	public Palestrante buscarPorId(Long id){
		return super.buscarPorId(id, Classes.PALESTRANTE.getClasse());
	}
	
	@SuppressWarnings("unchecked")
	public List<Palestrante> listar(){
		return super.listar(Classes.PALESTRANTE.getClasse());
	}
}
