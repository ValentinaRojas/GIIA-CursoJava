package s2t5;


import java.util.Random;
import java.util.Scanner;
public class S2T5 {

    public static void main(String[] args) {
        
      int numeroaleatorio = new java.util.Random().nextInt(10);
        
       int numero = 1 ;
       Scanner input = new Scanner(System.in);
       System.out.print("Introduzca un numero:");
       //numero = input.nextInt();
        
        while(numeroaleatorio != (numero = input.nextInt()))
        {
            if (numero > numeroaleatorio)
             System.out.print("El numero es menor: ");  
            else 
              System.out.print("El numero es mayor: ");  
        }
        System.out.println("Los numeros son iguales");  
       
    }
       
       /*int numero = 0, entrada = 0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		numero = rd.nextInt(4);
		System.out.print("Se ha generado un numero aleatorio entre 1 y 100. Intente adivinarlo: ");
		while(numero != (entrada = sc.nextInt())){
			if(entrada < numero)
				System.out.print("No has acertado: el número es mayor. Prueba otra vez: ");
			else 
				System.out.print("No has acertado: el número es menor. Prueba otra vez: ");
		}
		System.out.println("\nLO HAS ADIVINADO");
    }  */
}
