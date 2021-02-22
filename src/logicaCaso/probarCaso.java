package logicaCaso;

public class probarCaso {

	 public static void main(String[] args) {
	        Mercado cantidad = new Mercado();
	        Productores[] productor = new Productores[10];
	        Consumidores[] consumidor= new Consumidores[10];;
	        
	      
	        for (int i = 0; i < 10; i++) {
	        	productor[i]= new Productores(cantidad, i);
	        	consumidor[i]= new Consumidores(cantidad, i);
			}
	        
	        for (int i = 0; i < 10; i++) {
				productor[i].start();
				consumidor[i].start();
			}
	        

	    }

}
