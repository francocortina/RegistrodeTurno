package Hospital;

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

public class LoginM  extends JFrame implements ActionListener {


	JLabel  usuario;
	JTextField  usertext;
	JPasswordField  passwordText;
    JLabel  clave;
    JButton botonLogin;
    JButton botonR;
    JButton back;
	
	public LoginM()
	{
		  usuario=new JLabel("Email");
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
	    botonR.addActionListener(this);
		add(botonR);
		
		back= new JButton("back");
		  back.setBounds(0, 0, 70, 15);
		     back.addActionListener(this);
		     add(back);
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
	 String sql ="SELECT * FROM medico";
	 
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
		if(usuarios.equals(rs.getString(6))&&claves.equals(rs.getString(7)))
		{
			System.out.println("Bienvenido: "+ rs.getString(1));
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
	if (e.getSource()== botonR){
		
		  Register ventana = new Register();
			ventana.setSize(350,200);
			JPanel panel= new JPanel();
			
			ventana.add(panel);
			panel.setLayout(null);
			
			ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
			ventana.setVisible(true);	
	}
	if (e.getSource()==back) {
		 Login ventana = new Login();
			ventana.setSize(350,200);
			JPanel panel= new JPanel();
			
			ventana.add(panel);
			panel.setLayout(null);
			
			ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
			ventana.setVisible(true);
		
	}
	
	
}
}