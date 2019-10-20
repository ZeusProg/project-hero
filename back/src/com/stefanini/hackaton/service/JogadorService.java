package com.stefanini.hackaton.service;

import java.util.List;

import javax.inject.Inject;

import com.stefanini.hackaton.dto.JogadorDto;
import com.stefanini.hackaton.parsers.JogadorParserDTO;
import com.stefanini.hackaton.persistence.JogadorDAO;

public class JogadorService {

	@Inject
	JogadorParserDTO parser;
	
	@Inject
	JogadorDAO dao;
	
	public List<JogadorDto> listar(){
		return parser.toDTO(dao.list());
	}
	
	public JogadorDto pesquisarPorId(Integer id) {
		return parser.toDTO(dao.findById(id));
	}
	
	
	public JogadorDto inserir(JogadorDto jogadorDto) {
		
		dao.insert(parser.toEntity(jogadorDto));
		return jogadorDto;
		
	}
	
	public JogadorDto pesquisarPorNick(String nome) {
		return parser.toDTO(dao.findByNick(nome));
	}
	
}
