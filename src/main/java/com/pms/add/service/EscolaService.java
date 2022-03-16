package com.pms.add.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.pms.add.model.Escola;
import com.pms.add.repository.EscolaRepository;

@Service
public class EscolaService {

	@Autowired
	private EscolaRepository escRepo;
	
	public List<Escola> getAll(){
		return escRepo.findAll();
	}
	
	public ResponseEntity<?> getEscolaById(@PathVariable Long id){
		Optional<Escola> Opt = escRepo.findById(id);
		if(Opt.isPresent()) {
			Escola Und = Opt.get();
			return new ResponseEntity<>(Und, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	public Escola createEscola(@RequestBody Escola esc) {
		return escRepo.save(esc);
	}
	
	public Escola uptadeEscola(@PathVariable Long id, @RequestBody Escola esc) {
		esc.setId(id);
		escRepo.save(esc);
		return esc;
	}
	
	public void removeEscola(@PathVariable Long id) {
		escRepo.deleteById(id);
	}
}

