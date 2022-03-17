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

import com.pms.add.model.Aluno;
import com.pms.add.service.AlunoService;

@RestController
@RequestMapping("/api")
public class AlunoController {
	
	@Autowired
	private AlunoService alServ;
	
	@GetMapping("/alunos")
	public List<Aluno> listarAlunos(){
		return alServ.getAll();
	}
	
	@GetMapping("/alunos/{id}")
	public ResponseEntity<?> listarAlunosPorId(@PathVariable Long id){
		return alServ.getAlunoById(id);
	}
	
	@PostMapping("/alunos/novo")
	public Aluno salvarAluno(@RequestBody Aluno al) {
		return alServ.createAluno(al);
	}
	
	@PutMapping("/alunos/editar/{id}")
	public Aluno atualizarAluno(@PathVariable Long id, @RequestBody Aluno al) {
		return alServ.uptadeAluno(id, al);
	}
	
	@DeleteMapping("/alunos/remover/{id}")
	public ResponseEntity<?> deletarAluno(@PathVariable Long id){
		alServ.removeAluno(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
