package br.com.naptec.agenda.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class GenericDAO<E, PK extends Serializable> extends HibernateDaoSupport{
	private HibernateTemplate template;
	
	protected void gravar(E e){
		getTemplate().save(e);
	}
	
	protected void atualizar(E e){
		getTemplate().update(e);
	}
	
	protected void deletar(E e){
		getTemplate().delete(e);
	}
	
	protected E buscarPorId(PK pk, Class<E> clazz){
		return (E) getTemplate().get(clazz, pk);
	}
	
	@SuppressWarnings("unchecked")
	protected List<E> listar(Class<E> clazz){
		DetachedCriteria criteria = DetachedCriteria.forClass(clazz);
		return (List<E>) getTemplate().findByCriteria(criteria);
	}
	
	public HibernateTemplate getTemplate() {
		return template;
	}
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
}
