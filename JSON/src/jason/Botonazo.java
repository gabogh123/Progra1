package jason;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Botonazo {
	
	public static void main(String[] args){
	
	MarcoCliente mimarco = new MarcoCliente();

	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class MarcoCliente extends JFrame implements ActionListener{
	
	private JButton miboton;
	private JLabel tag;

	public MarcoCliente() {

		setBounds(200, 200, 200, 200);
		
		setLayout(new FlowLayout());
		
		miboton = new JButton("Enviar");
		
		miboton.addActionListener(this);
		
		add(miboton);

		//miboton.addActionListener(new ActionListener());
		
		setVisible(true);

	}
	
	public void actionPerformed(ActionEvent e){
		
		System.out.println("Click en boton");
		
	}
	
}