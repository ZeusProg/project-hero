package com.stefanini.hackaton.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.stefanini.hackaton.annotations.NotNull;


@NamedQueries(value = {
		@NamedQuery(name = "Jogador.PesquisarPorId", query = "SELECT j FROM Jogador j WHERE j.id = :id"),
		@NamedQuery(name = "Jogador.PesquisarPorNome", query = "SELECT j FROM Jogador j WHERE j.nickname = :nickname")
})
@Entity
@Table(name = "jogador")
public class Jogador implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//Colocar a anotação notnull
	@NotNull
	private String nickname;
	//Colocar a anotação notnull
	//Min 06 Max08 char
	
	@NotNull
	private String senha;
	//muitos para um 
	
	@ManyToOne
	@JoinColumn(name = "idHeroi")
	private Heroi heroi;
	
	public Integer getId() {
		return id;
	}
	
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Heroi getHeroi() {
		return heroi;
	}
	public void setHeroi(Heroi heroi) {
		this.heroi = heroi;
	}
	
	
	
}
