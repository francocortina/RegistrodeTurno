package Hospital;





import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends  JFrame implements ActionListener{
	


JLabel etiApe;

JButton boton;
JButton boton2;

JButton back;
public Register()
{
	 
	
	 etiApe=new JLabel("Register");
	
	boton=new JButton("Personal");
	boton2=new JButton("Médico");
	
     etiApe.setBounds(150, 40, 80, 25);
   
    
     boton.setBounds(80, 100, 100, 25);
     boton.addActionListener(this);
     boton2.setBounds(185, 100, 100, 25);
     boton2.addActionListener(this);
     
     back= new JButton("Back");
     back.setBounds(0, 0, 70, 25);
     back.addActionListener(this);
  	add(back);
  	
	add(etiApe);
	
	add(boton);
	add(boton2);



	
	

}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==boton) {	
			RegisterPersonal  ventana = new RegisterPersonal();
		ventana.setSize(300,450);
		JPanel panel= new JPanel();
		
		ventana.add(panel);
		panel.setLayout(null);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
		ventana.setVisible(true);}
		if (e.getSource()==boton2) {
			Registromedico ventana = new Registromedico();
			ventana.setSize(300,450);
			JPanel panel= new JPanel();
			
			ventana.add(panel);
			panel.setLayout(null);
			
			ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
			ventana.setVisible(true);
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
		
		
	}

}

