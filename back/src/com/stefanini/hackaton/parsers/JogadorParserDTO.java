package com.stefanini.hackaton.parsers;

import com.stefanini.hackaton.dto.JogadorDto;
import com.stefanini.hackaton.entities.Heroi;
import com.stefanini.hackaton.entities.Jogador;

public class JogadorParserDTO extends AbstractParser<JogadorDto, Jogador> {

	@Override
	public JogadorDto toDTO(Jogador jogador) {
		JogadorDto dto = new JogadorDto();
		dto.setHeroi(jogador.getHeroi());
		dto.setId(jogador.getId());
		dto.setNickname(jogador.getNickname());
		dto.getHeroi().setAtaque(jogador.getHeroi().getAtaque());
		dto.getHeroi().setDefesa(jogador.getHeroi().getDefesa());
		dto.getHeroi().setForca(jogador.getHeroi().getForca());
		dto.getHeroi().setVelocidade(jogador.getHeroi().getVelocidade());
		dto.getHeroi().setInteligencia(jogador.getHeroi().getInteligencia());
		dto.getHeroi().setPoder(jogador.getHeroi().getPoder());
		dto.getHeroi().setVida(jogador.getHeroi().getVida());
		dto.getHeroi().setVelocidade(jogador.getHeroi().getVelocidade());
		dto.getHeroi().setId(jogador.getHeroi().getId());
		dto.getHeroi().setNome(jogador.getHeroi().getNome());
		
		
		return dto;
	}

	@Override
	public Jogador toEntity(JogadorDto dto) {
		Jogador entity = new Jogador();
		entity.setHeroi(new Heroi());
		
		entity.setNickname(dto.getNickname());
		entity.setSenha(dto.getSenha());
		
		return entity;
	}

}
