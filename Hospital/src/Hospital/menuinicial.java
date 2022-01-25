package Hospital;





import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class menuinicial extends  JFrame implements ActionListener{
	


JLabel etiApe;

JButton boton;
JButton boton2;
JButton boton3;

public menuinicial()
{
	 
	
	 etiApe=new JLabel("Hospital");
	
	boton=new JButton("Turn");
	boton2=new JButton("Login");
	boton3=new JButton("Register");
     etiApe.setBounds(150, 40, 80, 25);
   
    
     boton.setBounds(10, 100, 100, 25);
     boton.addActionListener(this);
     boton2.setBounds(115, 100, 100, 25);
     boton2.addActionListener(this);
     boton3.setBounds(220, 100, 100, 25);
     boton3.addActionListener(this);
  
	add(etiApe);
	
	add(boton);
	add(boton2);
	add(boton3);

	
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  menuinicial ventana = new menuinicial();
		ventana.setSize(350,200);
		JPanel panel= new JPanel();
		
		ventana.add(panel);
		panel.setLayout(null);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
		ventana.setVisible(true);
	}




















	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton) {
			  Turno ventana = new Turno();
				ventana.setSize(350,200);
				JPanel panel= new JPanel();
				
				ventana.add(panel);
				panel.setLayout(null);
				
				ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
				ventana.setVisible(true);
			
		}
		if (e.getSource()==boton2) {
			 Login ventana = new Login();
				ventana.setSize(350,200);
				JPanel panel= new JPanel();
				
				ventana.add(panel);
				panel.setLayout(null);
				
				ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
				ventana.setVisible(true);
			
		}

		if (e.getSource()==boton3) {
			  Register ventana = new Register();
				ventana.setSize(350,200);
				JPanel panel= new JPanel();
				
				ventana.add(panel);
				panel.setLayout(null);
				
				ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
				ventana.setVisible(true);
		}
		
		
	}

}
