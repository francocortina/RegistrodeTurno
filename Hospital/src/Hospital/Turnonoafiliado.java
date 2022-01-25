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

public class Turnonoafiliado extends  JFrame implements ActionListener{
	
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
JLabel Ced;
JTextField cedula;
JLabel lugar;
JTextField lugar1;
JLabel ocupacion;
JTextField ocupacion1;

JLabel estadocivil;
JComboBox estadocivil1;

JLabel residencia;
JTextField residencia1;

JLabel fechaN;
JTextField fechaN1;

JLabel historia;
JTextField historia1;

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

public Turnonoafiliado ()
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
	 
	 etidni=new JLabel("DNI");
	dni= new JTextField(10);
	
	 etitel=new JLabel("telefono");
	 tel= new JTextField(10);
	 
	 Ced=new JLabel("C�dula de Ciudadania");
	 cedula= new JTextField(20);
	 
	 lugar=new JLabel("Lugar de Procendecia");
	 lugar1= new JTextField(20);
	 
	 ocupacion=new JLabel("Ocupaci�n");
	 ocupacion1= new JTextField(20);
	 
	 residencia=new JLabel("Residencia");
	 residencia1 = new JTextField(20);

	 fechaN=new JLabel("Fecha de Nacimiento");
	 fechaN1= new JTextField(20);

	 historia=new JLabel("N� historia clinica");
	 historia1= new JTextField(20);

	 sintomas=new JLabel("Sintomas");
	 sintomas1= new JTextField(150);
	 
	 estadocivil=new JLabel("Estado Civil");
	 estadocivil1=new JComboBox();
	 
	 medicos= new JComboBox();
	 modelo1=new JLabel("M�dicos");
	 
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
	
	modelo1.setBounds(10, 505, 100, 25);
	medicos.setBounds(150, 505, 100, 25);
	 etinom.setBounds(10, 10, 130, 25);
     nom.setBounds(150, 10, 120, 25);
     etiApe.setBounds(10, 40, 130, 25);
     ape.setBounds(150, 40, 120, 25);
     etiDirc.setBounds(10,70, 130,25);
     dir.setBounds(150,70, 120, 25);
     etiEdad.setBounds(10, 100, 130, 25);
     edad.setBounds(150, 100, 120, 25);
     etidni.setBounds(10, 130, 130, 25);
     dni.setBounds(150, 130, 120, 25);
     etiCorreo.setBounds(10, 160, 160, 25);
     correo.setBounds(150, 160, 120, 25);
     lugar.setBounds(10, 190, 130, 25);
     lugar1.setBounds(150, 190, 120, 25);
     ocupacion.setBounds(10, 220, 130, 25);
     ocupacion1.setBounds(150, 220, 120, 25);
     estadocivil.setBounds(10, 250, 130, 25);
     estadocivil1.setBounds(150, 250, 100, 25);
     estadocivil1.addItem("Soltero");
     estadocivil1.addItem("Casado");
     estadocivil1.addItem("Viudo");
     residencia.setBounds(10, 280, 130, 25);
     residencia1.setBounds(150, 280, 100, 25);
     fechaN.setBounds(10, 310, 130, 25);
     fechaN1.setBounds(150, 310, 100, 25);
     historia.setBounds(10, 340, 130, 25);
     historia1.setBounds(150, 340, 100, 25);
     sintomas.setBounds(10, 370, 130, 25);
     sintomas1.setBounds(150, 370, 130, 40);
     Ced.setBounds(10, 415, 130, 25);
     cedula.setBounds(150, 415, 120, 25);
     Espe.setBounds(10, 445, 130, 25);
     tipo.setBounds(150, 445, 150, 25);
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
     hora.setBounds(10,475,100,25);
     horario.setBounds(150,475,130,25);
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
    
     boton.setBounds(150, 535, 100, 25);
     boton.addActionListener(this);
     
     back= new JButton("Back");
     back.setBounds(0, 600, 70, 25);
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
	add(Ced);
	add(cedula);
	add(tipo);
	add(Espe);
	add(boton);
	add(hora);
	add(horario);
	add(lugar);
	add(lugar1);
	add(residencia);
	add(residencia1);
	add(estadocivil);
	add(estadocivil1);
	add(historia);
	add(historia1);
	add(fechaN);
	add(fechaN1);
	add(sintomas);
	add(sintomas1);
	add(ocupacion);
	add(ocupacion1);
	add(medicos);
	add(modelo1);
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
		
		try {
			
			//conexion con el drive
				Class.forName("org.postgresql.Driver");
			//ruta de la base de datos
			 String urlDatabase =  "jdbc:postgresql://localhost:5432/primeraprueba"; 
		    //conexion con la base de datos
			 Connection conn = DriverManager.getConnection(urlDatabase,  "postgres", "sofia928");
			 //traer los datos
			 Statement st=conn.createStatement();
				String sql = "INSERT INTO turnoa (nombre,apellido,direccion,edad,dni,email,procedencia,ocupacion,estadocivil,residencia,fechan,historia,sintomas,cedula,especialidad,hora,medico) "
						+ "Values('" +nom.getText()+"','"+ape.getText()+"','" +dir.getText()+"','"+edad.getText()+"','" +dni.getText()+"','"+correo.getText()+"','"+lugar1.getText()+"','"+ocupacion1.getText()+"',"
								+ "'"+estadocivil1.getSelectedItem()+"','"+residencia1.getText()+"','"+fechaN1.getText()+"','"+historia1.getText()+"','"+sintomas1.getText()+"','"+cedula.getText()+"','"+tipo.getSelectedItem()+"','"+horario.getSelectedItem()+"','"+medicos.getSelectedItem()+"')";
				
				ResultSet result = st.executeQuery(sql);
				conn.close();
				st.close();
		
			}
			catch (ClassNotFoundException ex) {
				System.out.println("Ocurrio un error EN EL DRIVER");
		        
		    } catch (Exception e1) {
		        System.out.println("Ocurrio un error : "+e1.getMessage());
		    }
		   
		System.out.println("SOLICITUD ENVIADA");
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
