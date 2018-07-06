/*
Programa que imprime los numeros pares entre 1539 y 2505
 */
package s2t1;

/**
 *
 * @author ValentinaR
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        for ( int i = 1539; i <= 2505; i++)
        {
          if ( i % 2 == 0)
          {
              System.out.println(i);
          }
        }
    }
    
}
