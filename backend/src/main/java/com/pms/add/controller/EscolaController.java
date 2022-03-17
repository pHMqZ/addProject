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

import com.pms.add.model.Escola;
import com.pms.add.service.EscolaService;

@RestController
@RequestMapping("/api")
public class EscolaController {
	
	@Autowired
	private EscolaService escServ;
	
	@GetMapping("/escolas")
	public List<Escola> listarEscolas(){
		return escServ.getAll();
	}
	
	@GetMapping("/escolas/{id}")
	public ResponseEntity<?> listarEscolasPorId(@PathVariable Long id){
		return escServ.getEscolaById(id);
	}
	
	@PostMapping("/escolas/novo")
	public Escola salvarEscola(@RequestBody Escola esc) {
		return escServ.createEscola(esc);
	}
	
	@PutMapping("/escolas/editar/{id}")
	public Escola atualizarEscola(@PathVariable Long id, @RequestBody Escola esc) {
		return escServ.uptadeEscola(id, esc);
	}
	
	@DeleteMapping("/escolas/remover/{id}")
	public ResponseEntity<?> deletarEscola(@PathVariable Long id){
		escServ.removeEscola(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
