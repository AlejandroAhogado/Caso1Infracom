package logicaCaso;

public class Productores extends Thread {
	
	private Mercado mercado;
	private BuzonProductores productores;
	private int numeroThread;
	
	public Productores(BuzonProductores s, int numeroThread) {
//		mercado = m;
		this.numeroThread = numeroThread;
		productores=s;
	}
	
	
	@Override
	public void run()
	{
		for (int i = 1; i < 10; i++) {
			productores.producirA(i);
            System.out.println("Productor #" + this.numeroThread + " produce producto tipo A: " + i +'\n'+
            	"Cantidad de productos A disponibles: "+	productores.getCantidadProductosA() +'\n' );
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
            }
            
        }
		
		for (int i = 1; i < 10; i++) {
			productores.producirB(i);
            System.out.println("Productor #" + this.numeroThread + " produce producto tipo B: " + i +'\n'+
                	"Cantidad de productos B disponibles: "+	productores.getCantidadProductosB() +'\n');
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
}
