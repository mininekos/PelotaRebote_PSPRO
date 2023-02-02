

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;
//Lamina que dibuja las pelotas----------------------------------------------------------------------

class PanelRebote extends JPanel{
	
	
	private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
	
	
	public void add(Pelota b){
		
		pelotas.add(b);
	}
	
	

	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D)g;
		
		for(int i = 0; i < pelotas.size(); i++){
			
			g2.fill(pelotas.get(i).getForma());
			
		}
		
	}
	
	public void borrarPelota(Pelota pelota) {
		
		pelotas.remove(pelota);
		
	}
	public void actualizarPantalla() {
		
		
	}
	
	
}
