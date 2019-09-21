package br.com.alessanderleite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.alessanderleite.connection.ConnectionFactory;
import br.com.alessanderleite.model.Aluno;

public class AlunoDAO {
	
	public int registerAluno(Aluno aluno) {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection conn = connectionFactory.createConnection();
		
		String sql = "INSERT INTO aluno (id, nome, instituicao) values(?, ?, ?);";
		int result = 0;
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			
			preparedStatement.setLong(1, aluno.getId());
			preparedStatement.setString(2, aluno.getNome());
			preparedStatement.setString(3, aluno.getInstituicao());
			
			System.out.println(preparedStatement);
			
			result = preparedStatement.executeUpdate();
			preparedStatement.close();
			conn.close();
			
		} catch (SQLException e) {
			System.err.println("Erro na comunicação com o banco de dados!");
			e.printStackTrace();
		}
		
		return result;
	}
}
