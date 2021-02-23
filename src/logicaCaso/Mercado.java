package logicaCaso;

public class Mercado {


    private int cantidadProductosA;
    private int cantidadProductosB;
    private boolean disponibleA = false;
    private boolean disponibleB = false;

    public Mercado() {
        this.cantidadProductosA = 0;
        this.cantidadProductosB = 0;
    }


    public synchronized void producirA(int valor) {
        while (disponibleA == true ) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        cantidadProductosA = valor;
        disponibleA = true;
        notify();
    }
    
    public synchronized void producirB(int valor) {
        while (disponibleB == true) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        cantidadProductosB = valor;
        disponibleB = true;
        notify();
    }

    public synchronized int compraProductoA() {
        while (disponibleA==false ) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Error en el try/wait");
            }
        }
        disponibleA = false;
       
        notify();
        return cantidadProductosA;
    }

    
    public synchronized int compraProductoB() {
        while (disponibleB==false ) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Error en el try/wait");
            }
        }
        disponibleB = false;
        
        notify();
        return cantidadProductosB;
    }
    
    public int getCantidadProductosA() {
        return cantidadProductosA;
    }


    public void setCantidadProductosA(int cantidadProductosA) {
        this.cantidadProductosA = cantidadProductosA;
    }


    public int getCantidadProductosB() {
        return cantidadProductosB;
    }


    public void setCantidadProductosB(int cantidadProductosB) {
        this.cantidadProductosB = cantidadProductosB;
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


}
