package TRABAJOS;

import java.util.Random;
import java.util.Stack;

public class carga2 {
	public static void main(String[]args) {
		Stack<String> pila =new Stack<String>();
		Random r=new Random();
		int [] arreglo = new int[4];
		int []arreglo2= new int[20];
		String[] animal1= {"perro","gato","gallina","cerdo"};
		System.out.println("descarga de alimento de animal ");
		String animalelegido;
		//int animal=r.nextInt(animal1.length);
		
		int n=r.nextInt(4)+1;
		
	
		int x=0;
		while(x<n) {
		
			int animal=r.nextInt(animal1.length);

			
		pila.push(animal1[animal]);
		mostrarpila(pila);
		
		x++; 
	
		}
		
		
		System.out.println("cajas de alimeto al almacen");
	
		System.out.println("----------------");
		mostrarpila(pila);
		System.out.println(pila);
		
		System.out.println("la pila esta vacia:"+pila.empty());
		System.out.println("posiscion de hola en la pila:"+pila.search("pila"));
	}
	public static void mostrarpila(Stack<String>pila) {
		for (int x = 0; x < pila.size(); x++) {
			System.out.println(pila.get(x));
		}
		     System.out.println("\nalimento de gato:");
		
			
		}
		
		
	
	

}
