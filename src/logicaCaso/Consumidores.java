package logicaCaso;

public class Consumidores extends Thread {

	private Mercado mercado;
	private BuzonConsumidores consumidores;
	private int numeroThread;
	
	public Consumidores(BuzonConsumidores m, int numeroThread) {
		consumidores = m;
		this.numeroThread = numeroThread;
	}

	@Override
	public void run()
	{
		int valor = 0;

        for (int i = 0; i < 10; i++) 
        {
        	consumidores.comprarProductoA(i);
            valor = (int) consumidores.darPosicionA(i);
            synchronized (System.out) {
            System.out.println("Consumidor #" + this.numeroThread + " compra producto tipo A: " + valor);
        }}
        
        for (int i = 0; i < 10; i++) {
        	valor = (int) consumidores.darPosicionB(i);
            synchronized (System.out) {
			

            System.out.println("Consumidor #" + this.numeroThread + " compra producto tipo B: " + valor);
        }}
	}
	
	
	
}
