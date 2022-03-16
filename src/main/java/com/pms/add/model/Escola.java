package com.pms.add.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Escola {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	public Long id;
	
	public String nome;
	
	@OneToOne
	public Endereco endereco;
	
	@OneToMany
	public Set<Turma> turma = new HashSet<>();
	
		
	public Escola() {
		
	}

	public Escola(Long id, String nome, Endereco endereco, Set<Turma> turma) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.turma = turma;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Set<Turma> getTurma() {
		return turma;
	}

	
}
