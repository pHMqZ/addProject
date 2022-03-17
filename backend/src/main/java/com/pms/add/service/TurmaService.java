package com.pms.add.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.pms.add.model.Turma;
import com.pms.add.repository.TurmaRepository;

@Service
public class TurmaService {

	@Autowired
	private TurmaRepository turRepo;
	
	public List<Turma> getAll(){
		return turRepo.findAll();
	}
	
	public ResponseEntity<?> getTurmaById(@PathVariable Long id){
		Optional<Turma> Opt = turRepo.findById(id);
		if(Opt.isPresent()) {
			Turma Und = Opt.get();
			return new ResponseEntity<>(Und, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	public Turma createTurma(@RequestBody Turma tur) {
		return turRepo.save(tur);
	}
	
	public Turma uptadeTurma(@PathVariable Long id, @RequestBody Turma tur) {
		tur.setId(id);
		turRepo.save(tur);
		return tur;
	}
	
	public void removeTurma(@PathVariable Long id) {
		turRepo.deleteById(id);
	}
}

