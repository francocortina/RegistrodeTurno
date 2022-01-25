package Hospital;

import java.sql.*;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterPersonal extends  JFrame implements ActionListener{
	
JLabel etinom;
JTextField nom;
JLabel etiApe;
JTextField ape;
JLabel etiEdad;
JTextField edad;
JLabel etiCorreo;
JTextField correo;
JLabel etiDirc;	
JTextField dir;
JLabel etitel;
JTextField tel;
JLabel etidni;
JTextField dni;
JLabel Carg;
JTextField Cargo;
JLabel clave;
JPasswordField clave1;
JLabel clave2;
JPasswordField clave3;
JButton boton;
JButton back;


public RegisterPersonal ()
{
	  etinom=new JLabel("Nombre");
	 nom= new JTextField(10);
	 etiApe=new JLabel("Apellido");
	 ape= new JTextField(10);
	 etiCorreo=new JLabel("E-mail");
	 correo= new JTextField(20);
	 etiDirc=new JLabel("Direccion");
	  dir= new JTextField(20);
	 etiEdad=new JLabel("Edad");
	 edad= new JTextField(2);
	 etidni=new JLabel("DNI");
	dni= new JTextField(10);
	 etitel=new JLabel("telefono");
	 tel= new JTextField(10);
	 Carg=new JLabel("Cargo");
	 Cargo= new JTextField(20);
	 clave=new JLabel("Clave");
	clave1= new JPasswordField(10);
	 clave2=new JLabel("Clave");
	clave3= new JPasswordField(10);
	boton=new JButton("guardar");
	back=new JButton("back");
	 etinom.setBounds(10, 10, 80, 25);
     nom.setBounds(100, 10, 120, 25);
     etiApe.setBounds(10, 40, 80, 25);
     ape.setBounds(100, 40, 120, 25);
     etiDirc.setBounds(10,70, 80,25);
     dir.setBounds(100,70, 120, 25);
     etiEdad.setBounds(10, 100, 80, 25);
     edad.setBounds(100, 100, 120, 25);
     etidni.setBounds(10, 130, 80, 25);
     dni.setBounds(100, 130, 120, 25);
     etiCorreo.setBounds(10, 160, 80, 25);
     correo.setBounds(100, 160, 120, 25);
    clave.setBounds(10, 190, 80, 25);
     clave1.setBounds(100, 190, 120, 25);
     clave2.setBounds(10, 220, 80, 25);
     clave3.setBounds(100, 220, 120, 25);
     Carg.setBounds(10, 250, 120, 25);
     Cargo.setBounds(100, 250, 120, 25);
     boton.setBounds(120, 280, 100, 25);
     boton.addActionListener(this);
     back.setBounds(0, 385, 70, 25);
     back.addActionListener(this);
     
    add(back); 
    add(nom);
	add(etinom);
	add(etiApe);
	add(ape);
	add(etiDirc);
	add(dir);
	add(etiEdad);
	add(edad);
	add(etidni);
	add(dni);
	add(etiCorreo);
	add(correo);
	add(Carg);
	add(Cargo);
	add(clave);
	add(clave2);
	add(clave3);
	add(clave1);
	add(boton);

	
	

}
	
	
	
	



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource()== boton)
		{
			System.out.print("contenido de nombre"+nom.getText());
		if((nom.getText()=="")&&(ape.getText()=="")&&(edad.getText()=="")&&(correo.getText()=="")&&(dir.getText()=="")&&(dni.getText()==""))
		{
			System.out.print("INTRODUSCA DATOS EN TODOS LOS CAMPOS");
		}
		if(!clave1.getText().equals(clave3.getText()))
		{
			System.out.print("son distintas");
		}
		if (e.getSource()==back) {
			 menuinicial ventana = new menuinicial();
				ventana.setSize(350,200);
				JPanel panel= new JPanel();
				
				ventana.add(panel);
				panel.setLayout(null);
				
				ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
				ventana.setVisible(true);
		}

		try {
			
			//conexion con el drive
				Class.forName("org.postgresql.Driver");
			//ruta de la base de datos
			 String urlDatabase =  "jdbc:postgresql://localhost:5432/primeraprueba"; 
		    //conexion con la base de datos
			 Connection conn = DriverManager.getConnection(urlDatabase,  "postgres", "sofia928");
			 //traer los datos
			 Statement st=conn.createStatement();
				String sql = "INSERT INTO personal (nombre,apellido,direccion,edad,dni,email,clave,cargo) "
						+ "Values('" +nom.getText()+"','"+ape.getText()+"','" +dir.getText()+"','"+edad.getText()+"','" +dni.getText()+"','"+correo.getText()+"','"+clave1.getText()+"','"+Cargo.getText()+"')";
				System.out.println(nom.getText()+"  REGISTRADO CON EXITO");
				ResultSet result = st.executeQuery(sql);
				conn.close();
				st.close();
			
			}
			catch (ClassNotFoundException ex) {
				System.out.println("Ocurrio un error EN EL DRIVER");
		        
		    } catch (Exception e1) {
		        System.out.println("Ocurrio un error : "+e1.getMessage());
		    }
		   

	}	
		if (e.getSource()==back) {
			  Register ventana = new Register();
				ventana.setSize(350,200);
				JPanel panel= new JPanel();
				
				ventana.add(panel);
				panel.setLayout(null);
				
				ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
				ventana.setVisible(true);}
		
	}

}
