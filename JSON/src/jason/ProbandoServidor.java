package jason;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ProbandoServidor {
	
	public static void main(String[] args){
		
		MarcoServidor marco = new MarcoServidor();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class MarcoServidor extends JFrame implements Runnable{
	
	private JTextArea areatexto;
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);
		
		JPanel lamina = new JPanel();
		
		lamina.setLayout(new BorderLayout());
		
		areatexto = new JTextArea();
		
		lamina.add(areatexto,BorderLayout.CENTER);
		
		add(lamina);
		
		setVisible(true);
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
