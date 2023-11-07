package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DatabaseConnection;

import utils.Colors;

public class CadastroDAO {
	private Connection connection;
	private String sql;
	private static Connection conexao;

	public CadastroDAO() throws SQLException {
		conexao = DatabaseConnection.conectar();
		connection = conexao;
	}

	public void closeConnection() {
		try {
			if (conexao != null && !conexao.isClosed()) {
				conexao.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// CREATE - Cadastro
	public void criarCadastro(Cadastro cadastro) {

		String sql = "INSERT INTO usuarios(nome,email,senha)" + " VALUES(?,?,?)";
		try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
			stmt.setString(1, cadastro.getNome());
			stmt.setString(2, cadastro.getEmail());
			stmt.setString(3, cadastro.getSenha());
			stmt.executeUpdate();
			System.out.println("Cadastro criado com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Cadastro findCadastro(int id) {
		Cadastro cadastro = null;
		sql = "SELECT * FROM usuarios WHERE id=?";

		try (PreparedStatement stmt = connection.prepareStatement(sql)) {

			stmt.setInt(1, id);
			ResultSet r = stmt.executeQuery();

			if (r.next()) {
				Cadastro cad = new Cadastro();
				cad.setId(r.getInt("id"));
				cad.setNome(r.getString("nome"));
				cad.setEmail(r.getString("email"));
				cad.setSenha(r.getString("senha"));
				return cad;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return cadastro;
	}

	public List<Cadastro> findCadastros() {

		String sql = "SELECT * FROM usuarios";

		List<Cadastro> cadastro1 = new ArrayList<Cadastro>();

		ResultSet r = null;

		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			r = stmt.executeQuery();

			while (r.next()) {
				Cadastro cadastro = new Cadastro();
				cadastro = new Cadastro();
				cadastro.setId(r.getInt("id"));
				cadastro.setNome(r.getString("nome"));
				cadastro.setEmail(r.getString("email"));
				cadastro.setSenha(r.getString("senha"));

				cadastro1.add(cadastro);
			}
		} catch (Exception e) {

			e.printStackTrace();

		}
		return cadastro1;

	}

	public void updateCadastro(Cadastro cadastro) {
		sql = "UPDATE usuarios SET nome = ?, email  = ?, senha = ? WHERE id = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, cadastro.getNome());
			stmt.setString(2, cadastro.getEmail());
			stmt.setString(3, cadastro.getSenha());
			stmt.setInt(4, cadastro.getId());

			stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteCadastro(int id) {
		sql = "DELETE FROM usuarios WHERE id = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setInt(1, id);
			stmt.executeUpdate();

			System.out.println("Cliente Deletado com sucesso!");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
