package com.stefanini.hackaton.persistence;

import java.util.List;

import com.stefanini.hackaton.entities.Heroi;

public class HeroiDAO extends GenericDAO<Integer, Heroi> {
	
	@SuppressWarnings("unchecked")
	public List<Heroi> list(){
		return getEntityManager().createNamedQuery("Heroi.getAll").getResultList();
	}
	
	
}
