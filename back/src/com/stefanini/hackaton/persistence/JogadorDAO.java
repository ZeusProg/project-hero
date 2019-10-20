package com.stefanini.hackaton.persistence;


import javax.persistence.NoResultException;

import com.stefanini.hackaton.annotations.AbstractValidation;
import com.stefanini.hackaton.entities.Jogador;
import com.stefanini.hackaton.rest.exceptions.NegocioException;

public class JogadorDAO extends GenericDAO<Integer, Jogador> {
	
	public Jogador findById(Integer id) {
		return (Jogador) getEntityManager().createNamedQuery("Jogador.PesquisarPorId").setParameter("id", id).getSingleResult();
	}
	
	public Jogador findByNick(String nick) {
		try {
			return (Jogador) getEntityManager().createNamedQuery("Jogador.PesquisarPorNome").setParameter("nickname", nick).getSingleResult();
		} catch (NoResultException e) {
            
            return null;
		}
	}
	
	public void inserir(Jogador jogador) throws NegocioException {
		try {
			AbstractValidation.valid(jogador.getClass());
			super.insert(jogador);
			
		} catch (IllegalArgumentException | IllegalAccessException e1) {
			e1.printStackTrace();
		}
	}

}
