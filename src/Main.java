import java.util.Scanner;

public class Main {
	
        static Scanner ent;
	static int mes;
	static double venta;
		
	public static void main(String[] args) {
            
		Scanner ent = new Scanner(System.in);
                
		System.out.println("Ingrese el numero correspondiente al mes que desea buscar (1 es Enero, 3 es Marzo, 11 es Noviembre, etc.)");
		mes = ent.nextInt();
                System.out.println("");
                mes = mes -1;
                
		if(mes > 11){   
			System.out.println("Error: Debe seleccionar un numero del 1 al 12");
		}
		
                
		System.out.println("");
		System.out.println("Ingrese el costo de la venta que desea buscar");
		venta = ent.nextDouble();
		
                Sales s = new Sales(mes,venta);
		
	}
}
