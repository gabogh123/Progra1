package servidorJSON;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import org.json.JSONException;
import org.json.JSONObject;



public class ServidorJSON {
	
	 public static void main(String[] args) throws IOException{
		 
		 MarcoServidor mimarco = new MarcoServidor();
			
			mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		 
	 }

}



class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);
		
		JPanel milamina = new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto = new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		
		Thread hilo = new Thread(this);
		
		hilo.start();
		
		}
	
	private JTextArea areatexto;

	@Override
	public void run() {
		
		try{

			ServerSocket servidor = new ServerSocket(9898);
			
			while(true){
					
				Socket socket = servidor.accept();
				
				OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
                
                String line = reader.readLine();
                JSONObject jsonObject = new JSONObject(line);
					
				}
			
		
		
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		
	}
		
		
	}
}

