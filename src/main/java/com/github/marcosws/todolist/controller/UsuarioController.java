package com.github.marcosws.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.marcosws.todolist.entity.Usuario;
import com.github.marcosws.todolist.service.UsuarioService;

@CrossOrigin("*")
@RestController
@RequestMapping("/todolist")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
    @GetMapping
    public String inicio(){
        return "<h1>Bem vindo ao Serviço Todo List</h1>";
    }
    
	@GetMapping("/list")
	public ResponseEntity<List<Usuario>> listAll(){
		List<Usuario> list = usuarioService.findAll();
		return ResponseEntity.ok().body(list);
	}

}
