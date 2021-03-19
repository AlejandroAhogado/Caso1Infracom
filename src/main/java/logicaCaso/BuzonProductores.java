
package logicaCaso;

import java.util.ArrayList;
import logicaCaso.probarCaso;

public class BuzonProductores {


	private probarCaso datos;
	private LeerArchivo leerArchivo;
	private ArrayList ProductoresCantidadProductosA = new ArrayList(Integer.parseInt(datos.archivo.getNumeroProductores()));
	private ArrayList ProductoresCantidadProductosB = new ArrayList(Integer.parseInt(datos.archivo.getNumeroProductores()));

    private boolean disponibleA = false;
    private boolean disponibleB = false;
    
   
    public synchronized void producirA(int valor) {
    	
        while (ProductoresCantidadProductosA.size()>Integer.parseInt(datos.archivo.getNumeroProductosProducir()) ) {
            Thread.yield();
        }
        ProductoresCantidadProductosA.add(valor);
        
    }
    
    public synchronized void producirB(int valor) {
        while (ProductoresCantidadProductosB.size()>Integer.parseInt(datos.archivo.getNumeroProductosProducir())) {
            Thread.yield();
        }
        ProductoresCantidadProductosB.add(valor);
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

