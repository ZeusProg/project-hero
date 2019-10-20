package com.stefanini.hackaton.api;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.stefanini.hackaton.dto.JogadorDto;
import com.stefanini.hackaton.dto.LoginDto;
import com.stefanini.hackaton.rest.exceptions.NegocioException;
import com.stefanini.hackaton.service.JogadorService;

@Path("/jogador")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JogadorApi {
	
	@Inject
	JogadorService service;
	

	
	
	@GET
	public Response listarJogadores() {
		return Response.ok(service.listar()).build();
	}
	
	@POST
	public Response inserirJogador(JogadorDto dto) throws NegocioException {
		
		
			//throw new NegocioException("Nickname ja existe");
		
		service.inserir(dto);	
		return Response.ok(dto).build();
	}
	
	
	//Separar em local próprio
	@Path("/autentica")
	@POST
	public Response login(LoginDto dto) throws NegocioException {
		List<JogadorDto> jogadores = service.listar();
		boolean autenticado = false;
		for (JogadorDto jogador : jogadores) {
			if(jogador.getNickname().equals(dto.getNickname()) && jogador.getSenha().equals(dto.getSenha())) {
				autenticado = true;
				return Response.ok(autenticado).build();
				
			}else {
				continue;
			}
			
		}
			
		return null;
		
		
	}
	
	
}
