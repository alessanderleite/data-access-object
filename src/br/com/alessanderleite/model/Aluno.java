package br.com.alessanderleite.model;

public class Aluno {

	private long matricula;
	private String nome;
	private String instituicao;
	private boolean sexo;
	
	public static final boolean MASCULINO = false;
	public static final boolean FEMININO = true;
	
	public Aluno() {}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
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

	public boolean getSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public static boolean isMasculino() {
		return MASCULINO;
	}

	public static boolean isFeminino() {
		return FEMININO;
	}
}
