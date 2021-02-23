package logicaCaso;

public class Productores extends Thread {
	
	private Mercado mercado;
	private int numeroThread;
	
	public Productores(Mercado m, int numeroThread) {
		mercado = m;
		this.numeroThread = numeroThread;
	}
	
	
	@Override
	public void run()
	{
		for (int i = 1; i < 10; i++) {
			mercado.producirA(i);
			synchronized (System.out) {
            System.out.println("Productor #" + this.numeroThread + " produce producto tipo A: " + i +'\n'+
            	"Cantidad de productos A disponibles: "+	mercado.getCantidadProductosA() +'\n' );}
            try {
                sleep((int)(Math.random() * 3000));
            } catch (InterruptedException e) {
            }
            
        }
		
		for (int i = 1; i < 10; i++) {
			mercado.producirB(i);
			synchronized (System.out) {
			            System.out.println("Productor #" + this.numeroThread + " produce producto tipo B: " + i +'\n'+
                	"Cantidad de productos B disponibles: "+	mercado.getCantidadProductosB() +'\n');}
            try {
                sleep((int)(Math.random() * 3000));
            } catch (InterruptedException e) {
            }
        }
    }
}
