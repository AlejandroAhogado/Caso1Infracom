package logicaCaso;

public class probarCaso {

	 public static void main(String[] args) {
	        Mercado cantidad = new Mercado();
	        Productores productor1 = new Productores(cantidad, 1);
	        Consumidores consumidor1 = new Consumidores(cantidad, 1);
	        
	        for (int i = 0; i < 10; i++) {
	        	Productores productor + i = new Productores(cantidad, 1);
		        Consumidores consumidor + i = new Consumidores(cantidad, 1);
			}
	        
	        
	        
	        productor1.start();
	        consumidor1.start();
	    }

}
