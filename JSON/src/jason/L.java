package jason;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import org.json.JSONException;
import org.json.JSONObject;

public class L {

	
	


	 	
	 	public static void main(String[] args) throws IOException, JSONException{
	 		Socket socket = new Socket("localhost", 8080);
	 		OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
	 		BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
	 		
	 		JSONObject jsonObject = new JSONObject();
	 		jsonObject.put("message", "Hola Mundo!");
	 		jsonObject.put("mensaje", "Servidor con JSON hecho");
	 		jsonObject.put("Action", "De punto 53 a 62");
	 		
	 		writer.write(jsonObject.toString() + "\n");
	 		writer.flush();
	 		
	 		String line = reader.readLine();
	 		jsonObject = new JSONObject(line);
	 		
	 		System.out.println("Recieved from Server:\n" + jsonObject.toString(2));
	 		
	 		socket.close();
	 	}

	 }

