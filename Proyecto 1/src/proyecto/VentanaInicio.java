package proyecto;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class VentanaInicio extends JFrame implements ActionListener{

		
		JLabel texto;
		JButton boton1;
		
		public VentanaInicio(){
			
			super("Ventana");
			setBounds(200,200,500,500);
			setVisible(true);
			setResizable(false);
			setLayout(new FlowLayout());
			this.getContentPane().setBackground(Color.cyan);
			
			boton1 = new JButton("Boton 1");

			boton1.addActionListener(this);

			
			add(boton1);

		}
		
		@Override
		public void actionPerformed(ActionEvent evento) {
			
			if(evento.getSource() == boton1){
				
				
				
			}
	
		}
		
		public static void main(String[] args){
			VentanaInicio ventana = new VentanaInicio();
			
		
		}
	
	}

