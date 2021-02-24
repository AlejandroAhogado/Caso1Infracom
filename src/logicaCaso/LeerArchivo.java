package logicaCaso;

public class LeerArchivo implements Comparable <LeerArchivo> {

	int numeroProductores = 0;
	
	int numeroConsumidores = 0;
	
	int tamañoBuzonProductores = 0;
	
	int tamañoBuzonConsumidores = 0;
	
	int numeroProductosProducir = 0;
	
	int numeroProductosConsumir = 0;
	
	public LeerArchivo(int numeroProductores, int numeroConsumidores, int tamañoBuzonProductores,
			int tamañoBuzonConsumidores, int numeroProductosProducir, int numeroProductosConsumir) {
		super();
		this.numeroProductores = numeroProductores;
		this.numeroConsumidores = numeroConsumidores;
		this.tamañoBuzonProductores = tamañoBuzonProductores;
		this.tamañoBuzonConsumidores = tamañoBuzonConsumidores;
		this.numeroProductosProducir = numeroProductosProducir;
		this.numeroProductosConsumir = numeroProductosConsumir;
	}

	public int getNumeroProductores() {
		return numeroProductores;
	}

	public void setNumeroProductores(int numeroProductores) {
		this.numeroProductores = numeroProductores;
	}

	public int getNumeroConsumidores() {
		return numeroConsumidores;
	}

	public void setNumeroConsumidores(int numeroConsumidores) {
		this.numeroConsumidores = numeroConsumidores;
	}

	public int getTamañoBuzonProductores() {
		return tamañoBuzonProductores;
	}

	public void setTamañoBuzonProductores(int tamañoBuzonProductores) {
		this.tamañoBuzonProductores = tamañoBuzonProductores;
	}

	public int getTamañoBuzonConsumidores() {
		return tamañoBuzonConsumidores;
	}

	public void setTamañoBuzonConsumidores(int tamañoBuzonConsumidores) {
		this.tamañoBuzonConsumidores = tamañoBuzonConsumidores;
	}

	public int getNumeroProductosProducir() {
		return numeroProductosProducir;
	}

	public void setNumeroProductosProducir(int numeroProductosProducir) {
		this.numeroProductosProducir = numeroProductosProducir;
	}

	public int getNumeroProductosConsumir() {
		return numeroProductosConsumir;
	}

	public void setNumeroProductosConsumir(int numeroProductosConsumir) {
		this.numeroProductosConsumir = numeroProductosConsumir;
	}

	@Override
	public int compareTo(LeerArchivo arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
