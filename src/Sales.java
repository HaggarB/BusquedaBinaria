import java.util.ArrayList;
import java.util.Arrays;
	
public class Sales {
		
	private ArrayList<Double[]> mes = new ArrayList();
	int x;
        double venta;
	Double[] array;
	
	public Sales(int x, double venta){
		this.x = x;
		
		mes.add(new Double[]{31d,87d,8.3,33.1,23.09,67.99,07.2,34.50,21d,15d,54.45,3.80,102.45,199.45,74.99,45d,553d,245d,21d,72d,221d,38.99,12.3,84d,6.2,54.8d,65d,21d,68d,45d,8.02}); 
		mes.add(new Double[]{2d,8.8,2d,6.8,2.3,8.2,4.5,56d,1d,4.5,33.9,22.01,2.83,6.42,98.42,43.55,68d,7d,23d,14d,14.0,83.0,21.12,15d,4453d,111d,75d,81d});
		mes.add(new Double[]{2.12,18.8,4d,84d,56d,72.2,254d,4.53,56d,2.1,3.9,42.41,5.13,12.54,1.8,2.3,8.2,7d,23d,34.62d,12d,27.11,76.5,45.3,29d,75d,2.5,6.42,98.42,43.55,68d});
		mes.add(new Double[]{1.8,2.3,8.2,7d,13.8,26.5,38.67d,72.54,3.9,42.41,5.13,12.54,8.81,56d,22.1,33.9,42.51,56.13,43d,54d,76d,82.2,54d,41.53,17d,21.11,56.5,95.3,59d,42.12});
		mes.add(new Double[]{56d,22.1,33.9,42.51,56.13,72.54,13.8,26.5,62.52,48.82,93.15,18d,26.3,88.2,77d,26d,38.67d,17d,21.11,56.5,95.3,59d,25d,42.12,8.81,43d,54d,76d,82.2,54d,41.53});
		mes.add(new Double[]{3.9,42.41,12.54,2.17d,23d,34.62,54d,76d,82.2,54d,41.53,17d,2.3,8.2,1.8,2.3,3.9,22.1,33.9,42.51,56.13,43d,2.12,18.8,38.67d,72.54,7d});
		mes.add(new Double[]{891.02,3.44,195.78,31.30,82.15,27.98,8.4,1.01,1.02,0.0,24.2,99.99,9453.121,51.74,98.44,90.71,30.68,69.08,98.55,68.33,32.71,93.95,52.70,71.49,30.27,96.73,97.99,37.35,15.04,65.91,26.56});
		mes.add(new Double[]{34.2,4.3,12.65,98.97,94.33,51.95,42.80,38.13,6.42,10.19,79.77,75.28,6.23,4.35,29.13,74.22,7.84,89.83,94.71,85.66,99.84,69.35,38.58,27.14,10.81,83.61,94.54,27.87,2.09,29.22,18.32});
		mes.add(new Double[]{55.88,35.54,63.66,83.16,68.56,10.64,43d,80.31,12.87,96.02,90.70,84.21,48.35,0.04,34.10,50.06,60.55,83.13,42.21,2.11,35.88,43.33,71.48,90.23,55.20,50.06,90.88,81.51,57.93,12.25});
		mes.add(new Double[]{8.21,20.21,11.75,31.94,67.82,55.95,96.33,55.67,68.8,28.97,85.81,79.51,70.06,72.29,1.37,28.67,11.5,59d,90.31,98.86,18.26,74.8,20.44,84.36,62.12,55.84,92.58,74.71,85.12,62.42,28.32});
		mes.add(new Double[]{3.12,13d,4d,12.11,99d,79d,43d,92.14,4.63,55.12,6.02,65.2,1.12,54.36,94.12,91.86,96.41,36.04,2.04,64.02,32.74,52.86,8.45,31.24,54.7,54.14,81.18,9.67,32.55,67.75});
		mes.add(new Double[]{99d,34d,11.34,8d,92d,23d,101d,124d,12d,124d,11d,123d,998.2,15.40,78.34,0.80,1.53,3.99,99.11,72.38,6.15,82.83,19.68,9.61,69.64,91.46,85.62,56.87,66.4,10.7,44.38});

		
		
		
		System.out.println(busqueda(mes(), venta)); 
		
		Ordenar(array); 
                
                Imprimir();
	}
	
	public Double[] mes() {
		
		array = (Double[]) Arrays.copyOf(mes.get(x), mes.get(x).length);
		int i, j, pos;
		Double menor , aux;
      
        for (i = 0; i < array.length - 1; i++) {
              menor = array[i];
              pos = i;
              for (j = i + 1; j < array.length; j++){
                    if (array[j].compareTo(menor) < 0) {
                        menor = array[j];
                        pos = j;
                    }
              }
              if (pos != i){
                  aux = array[i];
                  array[i] = array[pos];
                  array[pos] = aux;
              }
        }
        return array;
	}
	
	
	private static String busqueda(Double[] array, Double n) {
		return buscar(array, 0, array.length - 1, n);
	}

	public void Ordenar(Double[] sort){
            System.out.println("");
		System.out.println("Orden de cantidad de las ventas:");
		for (int i = 0; i < sort.length; i++) {
			System.out.println((i+1) + ")$" + sort[i]);
		}
	}
        
	public void Imprimir(){
            System.out.println("");
		for (int i = 0; i < mes.get(x).length; i++) {
			System.out.println("Dia: " + (i+1) + ", cantidad vendida: $" + mes.get(x)[i] );
		}
	}
        
        
	private static String buscar(Double[] array, int a, int b, Double n) {
		int pos = (a + b) / 2;
		if (a > b) {
                    System.out.println("");
			return "Venta no encontrada";
		}
		else if(array[pos].equals(n)) 
			return "La venta : $" + n + " es la '" + (pos+1) + "' venta de menor a mayor";
		else if (array[pos] < n)
			return buscar(array, pos+1, b, n);
		else
			return buscar(array, a, pos-1, n);
	}
        
	
}
	
