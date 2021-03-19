
package logicaCaso;

import java.util.ArrayList;

public class BuzonConsumidores
{
	private probarCaso datos ;
	private BuzonIntermediario buzonIntermediaro;
	private ArrayList ConsumidoresCantidadProductosA = new ArrayList(Integer.parseInt(datos.archivo.getNumeroConsumidores()));
    private ArrayList ConsumidoresCantidadProductosB = new ArrayList(Integer.parseInt(datos.archivo.getNumeroConsumidores()));
    private boolean disponibleA = false;
    private boolean disponibleB = false;
   
    public synchronized void almacenarProductoB(int valor) {
        while (ConsumidoresCantidadProductosA.size()>(Integer.parseInt(datos.archivo.getNumeroProductosConsumir()))) {
        	  Thread.yield();
        }
        
        for(int i = 0 ; i < 10 ; i++)
        {
        	ConsumidoresCantidadProductosB.add(buzonIntermediaro.darPosicionB(i));
	       
        }
    }
    
    public synchronized void almacenarProductoA(int valor) {
        while (ConsumidoresCantidadProductosB.size()>(Integer.parseInt(datos.archivo.getNumeroProductosConsumir()))) {
            Thread.yield();
        }
        for(int i = 0 ; i < 10 ; i++)
        {
        	ConsumidoresCantidadProductosA.add(buzonIntermediaro.darPosicionA(i));
        }
    }
    
    public synchronized void comprarProductoA(int valor) {
        while (ConsumidoresCantidadProductosA.size()>(Integer.parseInt(datos.archivo.getNumeroProductosConsumir())) ) {
            Thread.yield();
            
        }
        if(ConsumidoresCantidadProductosA.size() != 0)
        ConsumidoresCantidadProductosA.remove(ConsumidoresCantidadProductosA.get(ConsumidoresCantidadProductosA.size()));

    }
    public synchronized void comprarProductoB(int valor) {
        while (ConsumidoresCantidadProductosB.size()>(Integer.parseInt(datos.archivo.getNumeroProductosConsumir()))) {
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
