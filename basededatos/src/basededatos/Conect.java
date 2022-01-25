package basededatos;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


import javax.swing.JOptionPane;
public class Conect {

	public static void main(String[] args) {
		try {	
	String BD= "jdbc:postgresql://localhost:5432/primeraprueba";
	String US ="postgres";
	String PS = "sofia928";
	

		Class.forName("org.postgresql.Driver");
		Connection conectar = DriverManager.getConnection(BD,US,PS);
		JOptionPane.showMessageDialog(null, "base de datos conecatada con exito");
	}catch(Exception e) {	
	JOptionPane.showMessageDialog(null, "error al conectar"+ e);}
	}

}
