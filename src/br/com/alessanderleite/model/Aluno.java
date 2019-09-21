package br.com.alessanderleite.model;

import java.io.Serializable;

public class Aluno implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String nome;
	private String instituicao;
	
	public Aluno() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
}
