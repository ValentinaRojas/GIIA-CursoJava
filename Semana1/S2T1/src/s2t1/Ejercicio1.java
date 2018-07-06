/*
 Programa que imprime los numeros del 1 al 100 que no terminen ni en 2 ni en 5
 */
package s2t1;

/**
 *
 * @author ValentinaR
 */
public class Ejercicio1 {
    
    

    public static void main(String[] args) {
        
       for ( int i = 1; i <= 100; i ++ )
       {
           
         if (  i % 10 != 2  && i % 10 != 5 )  
         {
             System.out.println(i);  
         }
    }
       
  }
    
}
