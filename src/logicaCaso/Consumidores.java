package logicaCaso;

public class Consumidores extends Thread {

	private Mercado mercado;
	private int cantidad;
	
	public Consumidores(Mercado m, int cantidad) {
		mercado = m;
		this.cantidad = cantidad;
	}

	@Override
	public void run()
	{
		int valor = 0;
        for (int i = 0; i < 10; i++) {
            valor = mercado.compraProducto();
            System.out.println("Consumidor #" + this.cantidad + " compra: " + valor);
        }
	}
	
	
	
}
