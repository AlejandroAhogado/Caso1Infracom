package logicaCaso;

public class probarCaso {

	 public static void main(String[] args) {
	        BuzonProductores productores = new BuzonProductores();
	        BuzonConsumidores consumidores = new BuzonConsumidores();
	        Productores[] productor = new Productores[10];
	        Consumidores[] consumidor= new Consumidores[10];;
	        
	      
	        for (int i = 0; i < 10; i++) {
	        	productor[i]= new Productores(productores, i);
	        	consumidor[i]= new Consumidores(consumidores, i);
			}
	        
	        for (int i = 0; i < 10; i++) {
				
	        	productor[i].start();
				consumidor[i].start();
			}
	        

	    }

}
