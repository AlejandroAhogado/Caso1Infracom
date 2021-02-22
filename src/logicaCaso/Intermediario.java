package logicaCaso;

public class Intermediario {

	private static final Productores productores = new Productores();
	private static final Consumidores consumidores = new Consumidores();
	
	
	public static void main(String[] args) {
		productores.start();
		consumidores.start();
	}

}
