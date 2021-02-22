package logicaCaso;

public class Productores extends Thread {

	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("Productor " + i);

			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public int numeroProductores = 10;
	public int numeroProductosA = 0;
	public int numeroProductosB = 0;
	public final static int MAX_PRODUCTOS = 10;
	public boolean generando = true;

	private synchronized void generarProductoA() {
		
		if (numeroProductosA+numeroProductosB<=MAX_PRODUCTOS ) {
			generando = true;
			numeroProductosA++;
		}else {
			System.out.println("No hay espacio para almacenar productos");
			generando = false;
		}
	}

	private synchronized void generarProductoB() {
			if (numeroProductosA+numeroProductosB<=MAX_PRODUCTOS ) {
				generando = true;
				numeroProductosB++;
			}else {
				System.out.println("No hay espacio para almacenar productos");
				generando = false;
			}
			
	}

}
