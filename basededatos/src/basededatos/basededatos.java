
package basededatos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class basededatos extends JFrame implements ActionListener {


	JLabel  usuario;
	JTextField  usertext;
	JPasswordField  passwordText;
    JLabel  clave;
    JButton botonLogin;
    JButton botonR;
	
	public basededatos()
	{
		  usuario=new JLabel("Usuarios");
		 usertext= new JTextField(20);
	  passwordText= new JPasswordField(20);
		
		usuario.setBounds(10, 10, 80, 25);
		add(usuario);
		
		
		
		usertext.setBounds(100, 10, 160, 25);
		add(usertext);
		
		
      clave=new JLabel("Possword");
		clave.setBounds(10, 40, 80, 25);
		add(clave);
		
		
		
		passwordText.setBounds(100, 40, 160, 25);
		add(passwordText);
		
		
	     botonLogin= new JButton("login");
	     botonLogin.setBounds(10, 80, 80, 25);
		add(botonLogin);
		botonLogin.addActionListener(this);
		
		botonR= new JButton("registro");
	    botonR.setBounds(180, 80, 80, 25);
		add(botonR);
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		basededatos ventana = new basededatos();
		ventana.setSize(300,150);
		JPanel panel= new JPanel();
		
		ventana.add(panel);
		panel.setLayout(null);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
		ventana.setVisible(true);
		
		
		

	}

	
	
public static void realizaConexion(String claves , String usuarios) {
	try {
		
	//conexion con el drive
		Class.forName("org.postgresql.Driver");
	//ruta de la base de datos
	 String urlDatabase =  "jdbc:postgresql://localhost:5432/primeraprueba"; 
    //conexion con la base de datos
	 Connection conn = DriverManager.getConnection(urlDatabase,  "postgres", "sofia928");
	 //traer los datos
	 Statement st=conn.createStatement();
	 
	 //seleccionar la tabla
	 String sql ="SELECT * FROM persona";
	 
	ResultSet rs=st.executeQuery(sql);
	  lista(rs,claves,usuarios);
   
	}
	catch (ClassNotFoundException ex) {
		System.out.println("Ocurrio un error EN EL DRIVER");
        
    } catch (Exception e) {
        System.out.println("Ocurrio un error : "+e.getMessage());
    }
   


}	
public static void lista(ResultSet rs,String claves , String usuarios) throws SQLException{
	
	System.out.println("");
	ResultSetMetaData meta = rs.getMetaData();

	while(rs.next())
	{
		if(usuarios.equals(rs.getString(1))&&claves.equals(rs.getString(2)))
		{
			System.out.println("los datos son correctos");
		}
		
		
		
		
	}
	
	
	
	
}


@Override
public void actionPerformed(ActionEvent e) {
	String user;
     String clav ;
	if (e.getSource()== botonLogin){
		
	// TODO Auto-generated method stub
	user=usertext.getText();
	 clav=passwordText.getText();
	 realizaConexion(clav,user);
	 
}	
	
	
}
}