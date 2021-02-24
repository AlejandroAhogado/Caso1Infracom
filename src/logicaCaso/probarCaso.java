//Santiago Diaz Moreno 201912247
//Alejandro Ahogado 201920701

package logicaCaso;

import java.io.FileReader;
import java.util.ArrayList;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;


public class probarCaso {

	public static ArrayList Datos = new ArrayList();
	
	private static int numeroProductoresConsumidores = 0;
	
	
	 public static void main(String[] args) {
		 
		 try 
			{
				CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
				
				FileReader filereader = new FileReader("./data/ArchivoDeTexto.csv");
			     
				 CSVReader csvReader = ( new CSVReaderBuilder(filereader)).withCSVParser(parser).build();
				 
				 csvReader.readNext();         
				 String [] data;
				 int contador = 0;
				 
			     while ((data = csvReader.readNext()) != null) 
			     {
			       
						
						int k = 0; 

						String pnumeroProductores = data[k];
						k++;
						
						String pnumeroConsumidores =data[k];
						k++;
						
						String ptamañoBuzonProductores  =data[k];  
						k++;
						
						String ptamañoBuzonConsumidores  = data[k];  
						k++;
						
						String pnumeroProductosProducir = data[k];
						
						String pnumeroProductosConsumir = data[k];
						
						LeerArchivo archivo1 = new LeerArchivo(pnumeroProductores, pnumeroConsumidores,
								ptamañoBuzonProductores, ptamañoBuzonConsumidores, pnumeroProductosProducir,
								pnumeroProductosConsumir);
						
						Datos.add(archivo1);
						numeroProductoresConsumidores = Integer.parseInt(pnumeroProductores);
						contador++;
						System.out.println("Datos cargados: "+ contador);
			     }
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		
		 
	        BuzonProductores productores = new BuzonProductores();
	        BuzonConsumidores consumidores = new BuzonConsumidores();
	        Productores[] productor = new Productores[10];
	        Consumidores[] consumidor= new Consumidores[10];
	        
	      
	        for (int i = 0; i < numeroProductoresConsumidores; i++) {
	        	productor[i]= new Productores(productores, i);
	        	consumidor[i]= new Consumidores(consumidores, i);
			}
	        
	        for (int i = 0; i < numeroProductoresConsumidores; i++) {
				
	        	productor[i].start();
				consumidor[i].start();
	    }
	 }
}
