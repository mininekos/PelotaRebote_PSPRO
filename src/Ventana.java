

import java.awt.BorderLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.text.StyledEditorKit.ForegroundAction;

//Marco con l�mina y botones------------------------------------------------------------------------------

class Ventana extends JFrame{
	
	private static final int NUM_MOVIMIENTOS = 1000;
	private PanelRebote zonaRebote;
	JButton btnNuevaPelota, btnSalir,btnPausar;
	private ArrayList<Pelota> pelotas;
	
	public Ventana(){
		
		setBounds(600,300,400,350);
		
		setTitle ("Juego pelotas");
		
		zonaRebote=new PanelRebote();
		
		add(zonaRebote, BorderLayout.CENTER);
		
		JPanel zonaBotones=new JPanel();
		
		btnNuevaPelota = new JButton("Nueva pelota");
		zonaBotones.add(btnNuevaPelota);
		btnNuevaPelota.addActionListener( new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				new HiloPelota();
			}
			
		});
		btnPausar= new JButton("Pausar");
		zonaBotones.add(btnPausar);
		btnPausar.addActionListener( new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				if(btnPausar.getText().equals("Pausar")) {
					btnPausar.setText("Reanudar");
					for (Pelota pelota : pelotas) {
						
					}
				}
				else {
					btnPausar.setText("Pausar");
					for (Pelota pelota : pelotas) {
						
					}
				}
			}
			
		});
		
		btnSalir = new JButton("Salir");
		zonaBotones.add(btnSalir);
		btnSalir.addActionListener( new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				
				System.exit(0);
				
			}
			
		});
		
		add(zonaBotones, BorderLayout.SOUTH);
	}
	
	
	
	
	
}
