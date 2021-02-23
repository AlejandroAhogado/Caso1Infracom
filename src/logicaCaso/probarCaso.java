package logicaCaso;

public class probarCaso {

	 public static void main(String[] args) {
	        Mercado mercado = new Mercado();
	        Productores[] productor = new Productores[10];
	        Consumidores[] consumidor= new Consumidores[10];;
	        
	      
	        for (int i = 0; i < 10; i++) {
	        	productor[i]= new Productores(mercado, i);
	        	consumidor[i]= new Consumidores(mercado, i);
			}
	        
	        for (int i = 0; i < 10; i++) {
				
	        	productor[i].start();
				consumidor[i].start();
			}
	        

	    }

}
