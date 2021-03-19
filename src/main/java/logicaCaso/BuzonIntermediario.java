package logicaCaso;

import java.util.ArrayList;

import logicaCaso.BuzonConsumidores;
import logicaCaso.BuzonProductores;

public class BuzonIntermediario 
{

	private BuzonProductores buzonProductores;
	
	private BuzonConsumidores buzonConsumidores;
	
	private ArrayList buzonIntermediarioA = new ArrayList();
	private ArrayList buzonIntermediarioB = new ArrayList();
	private ArrayList buzonIntermediarioConsumidoresA = new ArrayList();
	private ArrayList buzonIntermediarioConsumidoresB = new ArrayList();
	 private static final int MAX = 10;
	
//	public BuzonIntermediario()
//	{
//		this.buzonIntermediarioA = buzonProductores.darListaProductoresProductosA();
//		this.buzonIntermediarioB = buzonProductores.darListaProductoresProductosB();
//	}
	
	 public synchronized void almacenarA() {
	        while (buzonProductores.darListaProductoresProductosA().size()>MAX) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	            }
	        }
	        for(int i = 0 ; i < 10 ; i++)
	        {
	        	buzonIntermediarioA.add(buzonProductores.darPosicionA(i));
		        notify();
	        }
	    }
	 public synchronized void almacenarB() {
	        while (buzonProductores.darListaProductoresProductosB().size()>MAX) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	            }
	        }
	        for(int i = 0 ; i < 10 ; i++)
	        {
	        	buzonIntermediarioB.add(buzonProductores.darPosicionB(i));
		        notify();
	        }
	    }
	 
	 public synchronized void asignarA() {
	        while (buzonConsumidores.darListaConsumidoresProductosA().size()>MAX ) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	            }
	        }
	        for(int i = 0 ; i < 10 ; i++)
	        {
	        	buzonIntermediarioConsumidoresA.add(buzonIntermediarioA.get(i));
		        notify();
	        }
	    }
	 
	 public synchronized void asignarB() {
	        while (buzonConsumidores.darListaConsumidoresProductosA().size()>MAX) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	            }
	        }
	        for(int i = 0 ; i < 10 ; i++)
	        {
	        	buzonIntermediarioConsumidoresB.add(buzonIntermediarioB.get(i));
		        notify();
	        }
	    }
	 
	 public Object darPosicionB(int pos)
	    {
	    	return buzonIntermediarioB.get(pos);
	    }
	    
	    public Object darPosicionA(int pos)
	    {
	    	return buzonIntermediarioA.get(pos);
	    }
	
}
