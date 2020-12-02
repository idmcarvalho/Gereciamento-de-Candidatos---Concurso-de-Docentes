package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {

	private final static String url = "jdbc:sqlserver://localhost:1433;databaseName=bdCandidato";  
	private final static String user = "sa";
	private final static String password = "12345";

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados!"+e.getMessage(), "Erro", 2);
		}
		return null;
	}

	public static void closeConnection(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro ao finalizar a conexão com o banco de dados!"+e.getMessage(), "Erro", 2);
			}
		}
	}

	public static void closeConnection(Connection con, PreparedStatement stmt) {

		closeConnection(con);
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão do Banco de Dados", "Erro", 2);
			}
		}
	}

	public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
		
		closeConnection(con, stmt);
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão do Banco de Dados" + e.getMessage(),
						"Erro", 2);
			}
		}
	}

}
