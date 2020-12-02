package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import connection.ConnectionFactory;
import model.Candidato;

public class CandidatoDao {
	
	/** Evento create Candidato c**/
	
	 public int create(Candidato c) {
		 Connection con = null;
		 String sql = "INSERT INTO candidato(cpf, nome, cargo) VALUES(?,?,?)";
		 PreparedStatement stmt = null;
		 con = ConnectionFactory.getConnection();
		 try {
			 stmt = con.prepareStatement(sql);
			 stmt.setString(1, c.getCpf());
			 stmt.setString(2, c.getNome());
			 stmt.setString(3, c.getCargo());
			 stmt.execute();
			 return 1;
		 } catch(SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro ao cadastrar no banco de dados!"+e.getMessage(), "Erro", 2);
				return 0;
			}
			finally {
				ConnectionFactory.closeConnection(con,stmt);
			}
	 }
	 
	 public List<Candidato> read(){
		 Connection con=ConnectionFactory.getConnection();
		 PreparedStatement stmt = null;
		 ResultSet rs = null;
		 String sql="SELECT * FROM candidato";
		 List<Candidato> candidato=new ArrayList<>();
		 try {
			 stmt= con.prepareStatement(sql);
			 rs= stmt.executeQuery();
			 while(rs.next()) {
					Candidato c = new Candidato();
					c.setCpf(rs.getString("cpf"));
					c.setNome(rs.getString("nome"));
					c.setCargo(rs.getString("cargo"));
					candidato.add(c);
				}

		 }catch(SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro ao consultar no Banco de Dados" +e.getMessage(), "Erro", 2);
				
				ConnectionFactory.closeConnection(con, stmt, rs);
		 	}
			return candidato;
		 
	 }
}
