package Hospital;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Turnoafiliado extends  JFrame implements ActionListener{
	
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

JLabel carnet;
JTextField carnet1;






JLabel sintomas;
JTextField sintomas1;

JButton boton;

JComboBox tipo;
JLabel Espe;

JComboBox horario;
JLabel hora;

JLabel modelo1;
JComboBox medicos;

JButton back;

public Turnoafiliado ()
{
	horario= new JComboBox ();
	hora= new JLabel ("Hora");
	
	Espe= new JLabel ("Especialidad");
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
	 
	 
	 carnet=new JLabel("N° Afiliado");
	 carnet1= new JTextField(20);
	 

	 


	 sintomas=new JLabel("Sintomas");
	 sintomas1= new JTextField(150);
	
	 
	 medicos= new JComboBox();
	 modelo1=new JLabel("Médicos");
	 
	 String datos [] = new String[10];
	 try {
			
			//conexion con el drive
				Class.forName("org.postgresql.Driver");
			//ruta de la base de datos
			 String urlDatabase =  "jdbc:postgresql://localhost:5432/primeraprueba"; 
		    //conexion con la base de datos
			 Connection conn = DriverManager.getConnection(urlDatabase,  "postgres", "sofia928");
			 //traer los datos
			 Statement st=conn.createStatement();
			 
				ResultSet result = st.executeQuery("Select * From medico");
				while(result.next()) {	
					medicos.addItem(result.getString("apellido"));
					
				}
				
			}
			catch (ClassNotFoundException ex) {
				System.out.println("Ocurrio un error EN EL DRIVER");
		        
		    } catch (Exception e1) {
		        System.out.println("Ocurrio un error : "+e1.getMessage());
		    }


	
	boton=new JButton("Enviar");
	
	modelo1.setBounds(10, 235, 100, 25);
	medicos.setBounds(150, 235, 100, 25);
	 etinom.setBounds(10, 10, 130, 25);
     nom.setBounds(150, 10, 120, 25);
     etiApe.setBounds(10, 40, 130, 25);
     ape.setBounds(150, 40, 120, 25);
     etiDirc.setBounds(10,70, 130,25);
     dir.setBounds(150,70, 120, 25);
     sintomas.setBounds(10, 100, 130, 25);
     sintomas1.setBounds(150, 100, 130, 40);
     carnet.setBounds(10, 145, 130, 25);
     carnet1.setBounds(150, 145, 120, 25);
     Espe.setBounds(10, 175, 130, 25);
     tipo.setBounds(150, 175, 150, 25);
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
     tipo.addItem("Ecografia/imagenologia");
     tipo.addItem("Radiologia");
     tipo.addItem("Odontologia");
     hora.setBounds(10,205,100,25);
     horario.setBounds(150,205,130,25);
     horario.addItem("7hs");
     horario.addItem("8hs");
     horario.addItem("9hs");
     horario.addItem("10hs");
     horario.addItem("11hs");
     horario.addItem("12hs");
     horario.addItem("13hs");
     horario.addItem("14hs");
     horario.addItem("15hs");
     horario.addItem("16hs");
     horario.addItem("17hs");
     horario.addItem("18hs");
     horario.addItem("19hs");
     horario.addItem("20hs");
     horario.addItem("21hs");
    
     boton.setBounds(150, 275, 100, 25);
     boton.addActionListener(this);
     
    add(nom);
	add(etinom);
	add(etiApe);
	add(ape);
	add(etiDirc);
	add(dir);
	add(carnet);
	add(carnet1);
	add(tipo);
	add(Espe);
	add(boton);
	add(hora);
	add(horario);

	add(sintomas);
	add(sintomas1);
	
	add(medicos);
	add(modelo1);
	
    back= new JButton("Back");
    back.setBounds(0, 385, 70, 25);
    back.addActionListener(this);
 	add(back);
}
	
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource()== boton)
		{
			System.out.print("contenido de nombre"+nom.getText());
		if((nom.getText()=="")&&(ape.getText()=="")&&(correo.getText()=="")&&(dir.getText()=="")&&(carnet1.getText()==""))
		{
			System.out.print("INTRODUSCA DATOS EN TODOS LOS CAMPOS");
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
				String sql = "INSERT INTO turnob (nombre,apellido,direccion,sintomas,afiliado,especialidad,hora,medico) "
						+ "Values('" +nom.getText()+"','"+ape.getText()+"','" +dir.getText()+"','" +sintomas.getText()+"','" +carnet1.getText()+"','"+tipo.getSelectedItem()+"','"+horario.getSelectedItem()+"','"+medicos.getSelectedItem()+"')";
				ResultSet result = st.executeQuery(sql);
				conn.close();
				st.close();
				System.out.println("SOLICITUD ENVIADA");
			}
			catch (ClassNotFoundException ex) {
				System.out.println("Ocurrio un error EN EL DRIVER");
		        
		    } catch (Exception e1) {
		        System.out.println("Ocurrio un error : "+e1.getMessage());
		    }
		   

	}	
		if (e.getSource()==back) {
			  Turno ventana = new Turno();
				ventana.setSize(350,200);
				JPanel panel= new JPanel();
				
				ventana.add(panel);
				panel.setLayout(null);
				
				ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
				ventana.setVisible(true);
			
		}
		
	}
}

