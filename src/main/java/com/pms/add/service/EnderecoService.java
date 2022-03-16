package com.pms.add.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.pms.add.model.Endereco;
import com.pms.add.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository endRepo;
	
	public List<Endereco> getAll(){
		return endRepo.findAll();
	}
	
	public ResponseEntity<?> getEnderecoById(@PathVariable Long id){
		Optional<Endereco> Opt = endRepo.findById(id);
		if(Opt.isPresent()) {
			Endereco Und = Opt.get();
			return new ResponseEntity<>(Und, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	public Endereco createEndereco(@RequestBody Endereco end) {
		return endRepo.save(end);
	}
	
	public Endereco uptadeEndereco(@PathVariable Long id, @RequestBody Endereco end) {
		end.setId(id);
		endRepo.save(end);
		return end;
	}
	
	public void removeEndereco(@PathVariable Long id) {
		endRepo.deleteById(id);
	}
}

