package Hospital;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends  JFrame implements ActionListener{
	


JLabel etiApe;

JButton boton;
JButton boton2;

JButton back;
public Login()
{
	 
	
	 etiApe=new JLabel("Login Usuario");
	
	boton=new JButton("Personal");
	boton2=new JButton("Médico");
	back= new JButton("back");
	 back.setBounds(0, 0, 70, 25);
     back.addActionListener(this);
     etiApe.setBounds(150, 40, 80, 25);
   
    
     boton.setBounds(80, 100, 100, 25);
     boton.addActionListener(this);
     boton2.setBounds(185, 100, 100, 25);
     boton2.addActionListener(this);
   
  
	add(etiApe);
	add(back);
	add(boton);
	add(boton2);


	
	

}
	
	



	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==boton) {
			
			LoginP ventana = new LoginP();
			ventana.setSize(300,150);
			JPanel panel= new JPanel();
			
			ventana.add(panel);
			panel.setLayout(null);
			
			ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
			ventana.setVisible(true);
			}
		if (e.getSource()==boton2) {

			LoginM ventana = new LoginM();
			ventana.setSize(300,150);
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

