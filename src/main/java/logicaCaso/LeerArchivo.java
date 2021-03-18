package logicaCaso;

public class LeerArchivo implements Comparable <LeerArchivo> {

	String numeroProductores = null;
	
	String numeroConsumidores = null;
	
	String tamañoBuzonProductores = null;
	
	String tamañoBuzonConsumidores = null;
	
	String numeroProductosProducir = null;
	
	String numeroProductosConsumir = null;
	
	public LeerArchivo(String numeroProductores, String numeroConsumidores, String tamañoBuzonProductores,
			String tamañoBuzonConsumidores, String numeroProductosProducir, String numeroProductosConsumir) {
		super();
		this.numeroProductores = numeroProductores;
		this.numeroConsumidores = numeroConsumidores;
		this.tamañoBuzonProductores = tamañoBuzonProductores;
		this.tamañoBuzonConsumidores = tamañoBuzonConsumidores;
		this.numeroProductosProducir = numeroProductosProducir;
		this.numeroProductosConsumir = numeroProductosConsumir;
	}

	public String getNumeroProductores() {
		return numeroProductores;
	}

	public void setNumeroProductores(String numeroProductores) {
		this.numeroProductores = numeroProductores;
	}

	public String getNumeroConsumidores() {
		return numeroConsumidores;
	}

	public void setNumeroConsumidores(String numeroConsumidores) {
		this.numeroConsumidores = numeroConsumidores;
	}

	public String getTamañoBuzonProductores() {
		return tamañoBuzonProductores;
	}

	public void setTamañoBuzonProductores(String tamañoBuzonProductores) {
		this.tamañoBuzonProductores = tamañoBuzonProductores;
	}

	public String getTamañoBuzonConsumidores() {
		return tamañoBuzonConsumidores;
	}

	public void setTamañoBuzonConsumidores(String tamañoBuzonConsumidores) {
		this.tamañoBuzonConsumidores = tamañoBuzonConsumidores;
	}

	public String getNumeroProductosProducir() {
		return numeroProductosProducir;
	}

	public void setNumeroProductosProducir(String numeroProductosProducir) {
		this.numeroProductosProducir = numeroProductosProducir;
	}

	public String getNumeroProductosConsumir() {
		return numeroProductosConsumir;
	}

	public void setNumeroProductosConsumir(String numeroProductosConsumir) {
		this.numeroProductosConsumir = numeroProductosConsumir;
	}

	@Override
	public int compareTo(LeerArchivo arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
