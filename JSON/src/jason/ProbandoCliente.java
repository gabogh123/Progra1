package jason;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.json.JSONException;
import org.json.JSONObject;

public class ProbandoCliente {
	
	public static void main(String[] args){
	
	VentanaPrincipal miventana = new VentanaPrincipal();
	
	miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}


class VentanaPrincipal extends JFrame{
	
	
	public VentanaPrincipal(){
		
		setBounds(600,300,280,350);
		
		Lamina lamina = new Lamina();
		
		add(lamina);
		
		setVisible(true);
		
	}
}
	
	
class Lamina extends JPanel implements Runnable{
	
	private JTextField campo1;
	private JButton miboton;
	
	public Lamina(){
		
		campo1 = new JTextField(20);
		add(campo1);
		
		miboton = new JButton("Accion");
		
		RealizarAccion evento = new RealizarAccion();
		
		miboton.addActionListener(evento);

		add(miboton);
	}

		
	
	
	private class RealizarAccion implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e){
			
			try{
				
				Socket misocket = new Socket("172.168.0.20", 9797);
				
				//Envio datos = new Envio();
				
				OutputStreamWriter writer = new OutputStreamWriter(misocket.getOutputStream(), "UTF-8");
				
				
				
				JSONObject json = new JSONObject();
				json.put("mensaje", "Hola");
				
				writer.write(json.toString() + "\n");
				writer.flush();
				
				writer.close();
				
			}catch(IOException e1){
				
				e1.printStackTrace();
				
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}
	

	@Override
	public void run() {
		
		try{
			
			ServerSocket servidorCliente = new ServerSocket(9000);
			
			Socket cliente;
			
			Envio recibidio;
			
			while(true){
				
				cliente = servidorCliente.accept();
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(cliente.getInputStream(),"UTF-8"));
				
				
				
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
}

}


class Envio implements Serializable{
	
	
	
	
}
