package logicaCaso;

public class Consumidores extends Thread {

	private Mercado mercado;
	private int numeroThread;
	
	public Consumidores(Mercado m, int numeroThread) {
		mercado = m;
		this.numeroThread = numeroThread;
	}

	@Override
	public void run()
	{
		int valor = 0;
        for (int i = 0; i < 10; i++) {
            valor = mercado.compraProductoA();
            synchronized (System.out) {
				
			
            System.out.println("Consumidor #" + this.numeroThread + " compra producto tipo A: " + valor);
        }}
        
        for (int i = 0; i < 10; i++) {
            valor = mercado.compraProductoB();
            synchronized (System.out) {
			
            System.out.println("Consumidor #" + this.numeroThread + " compra producto tipo B: " + valor);
        }}
	}
	
	
	
}
