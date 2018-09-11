package proyecto;

	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Graphics2D;

	import javax.swing.JFrame;

	public class Dot extends JFrame{
		
		protected int diametro = 20;
		protected int coordenadaX = 50;
		protected int coordenadaY = 50;
		private Dot next;
		private Dot punto;
		
		public Dot(){
			
			super("Dot");
			setSize(1000,1000);
			setVisible(true);
			setResizable(false);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.next = next;
			this.punto = punto;
		}
		
		public void insertar(Graphics g){
			super.paint(g);
			Graphics2D circulo = (Graphics2D)g;
			circulo.setPaint(Color.black);
			circulo.fillOval(coordenadaX, coordenadaY, diametro, diametro);	
			
		}
		
		public Dot getNext(){
			return next;
		}
		
		public void setNext(Dot next){
			this.next = next;
		}
		
		public Dot getPunto(){
			return punto;
		}
		
		public void setPunto(Dot punto){
			this.punto = punto;
			
		}
		

}
