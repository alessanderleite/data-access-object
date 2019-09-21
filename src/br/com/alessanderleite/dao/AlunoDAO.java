package br.com.alessanderleite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.alessanderleite.connection.ConnectionFactory;
import br.com.alessanderleite.model.Aluno;

public class AlunoDAO {
	
	public void create(Aluno aluno) {
		
		try {
			ConnectionFactory connectionFactory = new ConnectionFactory();
			Connection conn = connectionFactory.createConnection();
			
			String sql = "INSERT INTO aluno (id, nom, inst, gen) values(?, ?, ?, ?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setLong(1, aluno.getMatricula());
			stmt.setString(2, aluno.getNome());
			stmt.setString(3, aluno.getInstituicao());
			stmt.setBoolean(4, aluno.getSexo());
			
			stmt.execute();
			stmt.close();
			
			System.out.println("O aluno " + aluno.getNome() + " foi gravado no Banco de Dados");
			conn.close();
			
		} catch (SQLException e) {
			System.err.println("Erro na comunicação com o banco de dados!");
			e.printStackTrace();
		}
	}

}
