package br.edu.facear.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.facear.model.Cliente;

public class ClienteDAO extends GenericDAO{
	private PreparedStatement ps;
	private String LOGIN_SQL = "SELECT * "
							 + "FROM TBCLIENTE "
			                 + "WHERE EMAIL = ? AND SENHA = ?;";
	
	public Cliente autenticar(String email, String senha) throws ClassNotFoundException, IOException, SQLException{
		Cliente c = null;
		//Abrir uma conexao
		openConnection();
		
		//Preparar o script
		ps = connect.prepareStatement(LOGIN_SQL);
		ps.setString(1, email);
		ps.setString(2, senha);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs != null)
			while(rs.next()){
				c = new Cliente(rs.getInt("id"), 
						rs.getString("nome"), 
						rs.getString("cpf"), 
						rs.getString("email"), 
						rs.getString("senha"));
			}
		
		
		//Fechar a conexao
		closeConnection();
		
		return c;
	}
}
