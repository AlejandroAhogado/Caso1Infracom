package logicaCaso;

import java.util.ArrayList;

public class BuzonConsumidores
{
	private probarCaso datos = new probarCaso();
	private BuzonIntermediario buzonIntermediaro = new BuzonIntermediario();
	private ArrayList ConsumidoresCantidadProductosA = new ArrayList((int) datos.Datos.get(3));
    private ArrayList ConsumidoresCantidadProductosB = new ArrayList((int) datos.Datos.get(3));
    private boolean disponibleA = false;
    private boolean disponibleB = false;
   
    public synchronized void almacenarProductoB(int valor) {
        while (ConsumidoresCantidadProductosA.size()>(int)datos.Datos.get(5)) {
        	  Thread.yield();
        }
        
        for(int i = 0 ; i < 10 ; i++)
        {
        	ConsumidoresCantidadProductosB.add(buzonIntermediaro.darPosicionB(i));
	       
        }
    }
    
    public synchronized void almacenarProductoA(int valor) {
        while (ConsumidoresCantidadProductosB.size()>(int)datos.Datos.get(5) ) {
            Thread.yield();
        }
        for(int i = 0 ; i < 10 ; i++)
        {
        	ConsumidoresCantidadProductosA.add(buzonIntermediaro.darPosicionA(i));
        }
    }
    
    public synchronized void comprarProductoA(int valor) {
        while (ConsumidoresCantidadProductosA.size()>(int)datos.Datos.get(5) ) {
            Thread.yield();
        }
        ConsumidoresCantidadProductosA.remove(valor);

    }
    public synchronized void comprarProductoB(int valor) {
        while (ConsumidoresCantidadProductosB.size()>(int)datos.Datos.get(5) ) {
        	  Thread.yield();
        }
        ConsumidoresCantidadProductosB.remove(valor);
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
