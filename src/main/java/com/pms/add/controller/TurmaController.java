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
import com.pms.add.model.Turma;
import com.pms.add.service.EscolaService;
import com.pms.add.service.TurmaService;

@RestController
@RequestMapping("/api")
public class TurmaController {
	
	@Autowired
	private TurmaService turServ;
	
	@GetMapping("/turmas")
	public List<Turma> listarTurmas(){
		return turServ.getAll();
	}
	
	@GetMapping("/turmas/{id}")
	public ResponseEntity<?> listarTurmasPorId(@PathVariable Long id){
		return turServ.getTurmaById(id);
	}
	
	@PostMapping("/turmas/novo")
	public Turma salvarTurma(@RequestBody Turma tur) {
		return turServ.createTurma(tur);
	}
	
	@PutMapping("/turmas/editar/{id}")
	public Turma atualizarTurma(@PathVariable Long id, @RequestBody Turma tur) {
		return turServ.uptadeTurma(id, tur);
	}
	
	@DeleteMapping("/turmas/remover/{id}")
	public ResponseEntity<?> deletarEscola(@PathVariable Long id){
		turServ.removeTurma(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
