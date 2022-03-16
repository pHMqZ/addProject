package com.pms.add.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	public Long id;
	
	public String nome;
	
	public LocalDate dataNascimento;
	
	public int turma_id;

	public Aluno(Long id, String nome, LocalDate dataNascimento, int turma_id) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.turma_id = turma_id;
	}

	public Aluno() {
		
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int getTurma_id() {
		return turma_id;
	}

	public void setTurma_id(int turma_id) {
		this.turma_id = turma_id;
	}

}
