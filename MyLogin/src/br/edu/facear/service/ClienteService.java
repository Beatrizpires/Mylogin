package br.edu.facear.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import br.edu.facear.dao.ClienteDAO;
import br.edu.facear.model.Cliente;

public class ClienteService {
	private ClienteDAO dao;
	
	public ClienteService() {
		dao = new ClienteDAO();
	}
	
	
	public List<Cliente> listar() throws ClassNotFoundException, IOException, SQLException{
		return dao.listar();
		
	}
}
