package com.pms.add.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.add.model.Endereco;
import com.pms.add.service.EnderecoService;

@RestController
@RequestMapping("/api")
public class EnderecoController {
	
	@Autowired
	private EnderecoService endServ;
	
	@GetMapping("/enderecos")
	public List<Endereco> listarEnderecos(){
		return endServ.getAll();
	}
	
	@GetMapping("/enderecos/{id}")
	public ResponseEntity<?> listarEnderecosPorId(@PathVariable Long id){
		return endServ.getEnderecoById(id);
	}
	
	@PostMapping("/enderecos/novo")
	public Endereco salvarEndereco(@RequestBody Endereco end) {
		return endServ.createEndereco(end);
	}
	
	@PutMapping("/enderecos/editar/{id}")
	public Endereco atualizarEndereco(@PathVariable Long id, @RequestBody Endereco end) {
		return endServ.uptadeEndereco(id, end);
	}
	
	@DeleteMapping("/enderecos/remover/{id}")
	public ResponseEntity<?> deletarEndereco(@PathVariable Long id){
		endServ.removeEndereco(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
