
public class HiloPelota extends Thread{

	
	private Boolean stop;
	private Pelota pelota;
	private static final int NUM_MOVIMIENTOS = 1000;
	private PanelRebote zonaRebote;

	public HiloPelota() {
		super();
		this.stop=false;
	}

	public synchronized void reanudar(){
        stop=false;
        notify();
    }

    public boolean isStop() {
        return stop;
    }

	public synchronized void run() {		
		lanzarJuego();
	}
	
	public void lanzarJuego () {
		
		Pelota pelota=new Pelota(zonaRebote);//pasarle zonarebote y que se pinte a si misma

		zonaRebote.add(pelota);
		try {
			if(!stop) {
				for (int i=1; i<=NUM_MOVIMIENTOS; i++){				
					pelota.paint();	
					//zonaRebote.paint(zonaRebote.getGraphics());//borrar y que paint sea llamado desde update o update desde un paint de pelota
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
			}
			else {
				wait();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		

}
	
	

	
}