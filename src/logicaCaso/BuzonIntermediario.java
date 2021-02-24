package logicaCaso;

import java.util.ArrayList;

import logicaCaso.BuzonConsumidores;
import logicaCaso.BuzonProductores;

public class BuzonIntermediario 
{

	private BuzonProductores buzonProductores = new BuzonProductores();
	private BuzonConsumidores buzonConsumidores = new BuzonConsumidores();
	private ArrayList buzonIntermediarioA = new ArrayList();
	private ArrayList buzonIntermediarioB = new ArrayList();
	private ArrayList buzonIntermediarioConsumidoresA = new ArrayList();
	private ArrayList buzonIntermediarioConsumidoresB = new ArrayList();
	
//	public BuzonIntermediario()
//	{
//		this.buzonIntermediarioA = buzonProductores.darListaProductoresProductosA();
//		this.buzonIntermediarioB = buzonProductores.darListaProductoresProductosB();
//	}
	
	 public synchronized void almacenarA() {
	        while (buzonProductores.isDisponibleA() == true ) {
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
	        while (buzonProductores.isDisponibleB() == true ) {
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
	        while (buzonConsumidores.isDisponibleA() == true ) {
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
	        while (buzonConsumidores.isDisponibleB() == true ) {
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
