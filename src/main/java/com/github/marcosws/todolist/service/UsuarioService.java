package com.github.marcosws.todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.marcosws.todolist.entity.Usuario;
import com.github.marcosws.todolist.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public List<Usuario> findAll() {
		List<Usuario> list = usuarioRepository.findAll();
		return list;
	}
	

}
