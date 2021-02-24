package logicaCaso;

import java.util.ArrayList;

public class BuzonConsumidores
{

	private BuzonIntermediario buzonIntermediaro = new BuzonIntermediario();
	private ArrayList ConsumidoresCantidadProductosA = new ArrayList();
    private ArrayList ConsumidoresCantidadProductosB = new ArrayList();
    private boolean disponibleA = false;
    private boolean disponibleB = false;
   
    public synchronized void almacenarProductoB(int valor) {
        while (disponibleB==false ) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Error en el try/wait");
            }
        }
        
        for(int i = 0 ; i < 10 ; i++)
        {
        	ConsumidoresCantidadProductosB.add(buzonIntermediaro.darPosicionB(i));
	        notify();
        }
        disponibleB = false;
    }
    
    public synchronized void almacenarProductoA(int valor) {
        while (disponibleA == true ) {
            Thread.yield();
        }
        
        for(int i = 0 ; i < 10 ; i++)
        {
        	ConsumidoresCantidadProductosA.add(buzonIntermediaro.darPosicionA(i));
	        notify();
        }
        disponibleA = false;

    }
    
    public synchronized void comprarProductoA(int valor) {
        while (disponibleA == true ) {
            Thread.yield();
        }
        disponibleA = false;
        ConsumidoresCantidadProductosA.remove(valor);
        notify();
    }
    public synchronized void comprarProductoB(int valor) {
        while (disponibleB==false ) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Error en el try/wait");
            }
        }
        disponibleB = true;
        ConsumidoresCantidadProductosB.remove(valor);
        notify();
    }
    
    public int getCantidadProductosA() {
        return ConsumidoresCantidadProductosA.size();
    }
    
    public int getCantidadProductosB() {
        return ConsumidoresCantidadProductosB.size();
    }
    
    public boolean isDisponibleA() {
        return disponibleA;
    }
    
    public void setDisponibleA(boolean disponibleA) {
        this.disponibleA = disponibleA;
    }


    public boolean isDisponibleB() {
        return disponibleB;
    }


    public void setDisponibleB(boolean disponibleB) {
        this.disponibleB = disponibleB;
    }

    public Object darPosicionB(int pos)
    {
    	return ConsumidoresCantidadProductosB.get(pos);
    }
    
    public Object darPosicionA(int pos)
    {
    	return ConsumidoresCantidadProductosA.get(pos);
    }

}
