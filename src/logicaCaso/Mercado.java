package logicaCaso;

public class Mercado {


	private int cantidadProductosA;
	//	private int cantidadProductosB;
	private boolean disponibleA = false;
	//	private boolean disponibleB = false;

	public Mercado() {
		this.cantidadProductosA = 0;
		//		this.cantidadProductosB = 0;
	}


	public synchronized int compraProducto() {
		while (disponibleA==false 
				//				&& disponibleB==false
				) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println("Error en el try");
			}
		}
		disponibleA = false;
		notify();
		return cantidadProductosA;
	}

	public synchronized void put(int value) {
		while (disponibleA == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		cantidadProductosA = value;
		disponibleA = true;
		notify();
	}

}
