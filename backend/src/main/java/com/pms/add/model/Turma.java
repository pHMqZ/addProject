package com.pms.add.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	public Long id;
	
	public String nome;
	
	public int capacidade;
	
	@OneToMany
	public Set<Aluno> alunos = new HashSet<>();

	public int escola_id;

	public Turma(Long id, String nome, int capacidade, Set<Aluno> alunos, int escola_id) {
		this.id = id;
		this.nome = nome;
		this.capacidade = capacidade;
		this.alunos = alunos;
		this.escola_id = escola_id;
	}
	
	public Turma() {
		
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

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	
}
