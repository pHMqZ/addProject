package com.pms.add.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.pms.add.model.Aluno;
import com.pms.add.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alRepo;
	
	public List<Aluno> getAll(){
		return alRepo.findAll();
	}
	
	public ResponseEntity<?> getAlunoById(@PathVariable Long id){
		Optional<Aluno> Opt = alRepo.findById(id);
		if(Opt.isPresent()) {
			Aluno Und = Opt.get();
			return new ResponseEntity<>(Und, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	public Aluno createAluno(@RequestBody Aluno alu) {
		return alRepo.save(alu);
	}
	
	public Aluno uptadeAluno(@PathVariable Long id, @RequestBody Aluno alu) {
		alu.setId(id);
		alRepo.save(alu);
		return alu;
	}
	
	public void removeAluno(@PathVariable Long id) {
		alRepo.deleteById(id);
	}
}

