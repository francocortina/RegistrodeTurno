package Hospital;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Turno extends  JFrame implements ActionListener{
	


JLabel etiApe;

JButton boton;
JButton boton2;
JButton back;

public Turno()
{
	 
	
	 etiApe=new JLabel("TURNO");
	
	boton=new JButton("Afiliado");
	boton2=new JButton("No Afiliado");

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
			Turnoafiliado  ventana = new Turnoafiliado();
		ventana.setSize(400,450);
		JPanel panel= new JPanel();
		
		ventana.add(panel);
		panel.setLayout(null);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
		ventana.setVisible(true);}
		if (e.getSource()==boton2) {		
			Turnonoafiliado  ventana = new Turnonoafiliado();
		ventana.setSize(400,700);
		JPanel panel= new JPanel();
		
		ventana.add(panel);
		panel.setLayout(null);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
		ventana.setVisible(true);	}
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
