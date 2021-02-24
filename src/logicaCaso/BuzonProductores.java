<<<<<<< Updated upstream
package logicaCaso;

import java.util.ArrayList;

public class BuzonProductores {

	private ArrayList ProductoresCantidadProductosA = new ArrayList();
	private ArrayList ProductoresCantidadProductosB = new ArrayList();
    private boolean disponibleA = false;
    private boolean disponibleB = false;
    
   
    public synchronized void producirA(int valor) {
        while (disponibleA == true ) {
            Thread.yield();
        }
        ProductoresCantidadProductosA.add(valor);
        disponibleA = true;
    }
    
    public synchronized void producirB(int valor) {
        while (disponibleB == true) {
            Thread.yield();
        }
        ProductoresCantidadProductosB.add(valor);
        disponibleB = true;
    }
    
    public int getCantidadProductosA() {
        return ProductoresCantidadProductosA.size();
    }
    
    public int getCantidadProductosB() {
        return ProductoresCantidadProductosB.size();
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
    
    public ArrayList darListaProductoresProductosA()
    {
    	return ProductoresCantidadProductosA;
    }
    
    public ArrayList darListaProductoresProductosB()
    {
    	return ProductoresCantidadProductosB;
    }
    
    public int darPosicionB(int pos)
    {
    	return (int) ProductoresCantidadProductosB.get(pos);
    }
    
    public int darPosicionA(int pos)
    {
    	return (int) ProductoresCantidadProductosA.get(pos);
    }

}
=======
package logicaCaso;

public class BuzonProductores extends Thread{

}
>>>>>>> Stashed changes
