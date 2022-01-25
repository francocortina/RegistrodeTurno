package Hospital;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ComboBoxEditor;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Registromedico extends  JFrame implements ActionListener{
	
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
JLabel Espe;

JLabel clave;
JPasswordField clave1;
JLabel clave2;
JPasswordField clave3;
JButton boton;
JComboBox tipo;
JButton back;


public Registromedico()
{
	tipo = new JComboBox();
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
	 Espe=new JLabel("Especialidad");
	 clave=new JLabel("Clave");
	clave1= new JPasswordField(10);
	 clave2=new JLabel("Clave");
	clave3= new JPasswordField(10);
	back=new JButton("back");
	
	  back.setBounds(0, 385, 70, 25);
	  back.addActionListener(this);
	boton=new JButton("Registrarse");
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
     Espe.setBounds(10, 250, 120, 25);
     tipo.setBounds(100, 250, 150, 25);
     tipo.addItem("Cardiologia");
     tipo.addItem("Cirugia maxilofacial");
     tipo.addItem("Cirugia plastica");
     tipo.addItem("Cirugia vascular");
     tipo.addItem("Gastroenterologia");
     tipo.addItem("Mastologia");
     tipo.addItem("Oncologia");
     tipo.addItem("Otorrinolaringologia");
     tipo.addItem("Proctologia");
     tipo.addItem("Traumatologia/ortopedia");
     tipo.addItem("Urologia");
     tipo.addItem("Pediatria");
     tipo.addItem("Laboratorio");
     tipo.addItem("Ecogrrafia/imagenologia");
     tipo.addItem("Radiologia");
     tipo.addItem("Odontologia");
     boton.setBounds(120, 280, 100, 25);
     boton.addActionListener(this);
     
  
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
	add(Espe);
	add(tipo); 
	add(clave);
	add(clave2);
	add(clave3);
	add(clave1);
	add(boton);
	add(back);
	
	

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
	
		
		
		

		try {
			
			//conexion con el drive
				Class.forName("org.postgresql.Driver");
			//ruta de la base de datos
			 String urlDatabase =  "jdbc:postgresql://localhost:5432/primeraprueba"; 
		    //conexion con la base de datos
			 Connection conn = DriverManager.getConnection(urlDatabase,  "postgres", "sofia928");
			 //traer los datos
			 Statement st=conn.createStatement();
				String sql = "INSERT INTO medico (nombre,apellido,direccion,edad,dni,email,clave,especialidad) "
						+ "Values('" +nom.getText()+"','"+ape.getText()+"','" +dir.getText()+"','"+edad.getText()+"','" +dni.getText()+"','"+correo.getText()+"','"+clave1.getText()+"','"+tipo.getSelectedItem()+"')";
				ResultSet result = st.executeQuery(sql);
				conn.close();
				st.close();
				System.out.println(nom.getText()+"  REGISTRADO CON EXITO");
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

