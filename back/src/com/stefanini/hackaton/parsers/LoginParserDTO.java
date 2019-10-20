package com.stefanini.hackaton.parsers;

import com.stefanini.hackaton.dto.JogadorDto;
import com.stefanini.hackaton.dto.LoginDto;

public class LoginParserDTO extends AbstractParser<JogadorDto, LoginDto> {

	@Override
	public JogadorDto toDTO(LoginDto entity) {
		
		return null;
	}

	@Override
	public LoginDto toEntity(JogadorDto dto) {
		LoginDto login = new LoginDto();
		login.setNickname(dto.getNickname());
		login.setSenha(dto.getSenha());
		return login;
	}

	

	
	



}
