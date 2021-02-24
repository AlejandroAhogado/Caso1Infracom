<<<<<<< Updated upstream
package logicaCaso;

import java.util.ArrayList;

public class BuzonConsumidores
{

	private BuzonIntermediario buzonIntermediaro = new BuzonIntermediario();
	private ArrayList ConsumidoresCantidadProductosA = new ArrayList();
    private ArrayList ConsumidoresCantidadProductosB = new ArrayList();
    private boolean disponibleA = false;
    private boolean disponibleB = false;
    private static final int MAX = 10;
   
    public synchronized void almacenarProductoB(int valor) {
        while (ConsumidoresCantidadProductosA.size()>MAX) {
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
    }
    
    public synchronized void almacenarProductoA(int valor) {
        while (ConsumidoresCantidadProductosB.size()>MAX ) {
            Thread.yield();
        }
        
        for(int i = 0 ; i < 10 ; i++)
        {
        	ConsumidoresCantidadProductosA.add(buzonIntermediaro.darPosicionA(i));
	        notify();
        }
    }
    
    public synchronized void comprarProductoA(int valor) {
        while (ConsumidoresCantidadProductosA.size()>MAX ) {
            Thread.yield();
        }
        ConsumidoresCantidadProductosA.remove(valor);
        notify();
    }
    public synchronized void comprarProductoB(int valor) {
        while (ConsumidoresCantidadProductosB.size()>MAX ) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Error en el try/wait");
            }
        }
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
    
    public ArrayList darListaConsumidoresProductosA()
    {
    	return ConsumidoresCantidadProductosA;
    }
    
    public ArrayList darListaConsumidoresProductosB()
    {
    	return ConsumidoresCantidadProductosB;
    }

}
=======
package logicaCaso;

public class BuzonConsumidores {

}
>>>>>>> Stashed changes
