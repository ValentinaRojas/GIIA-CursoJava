

/**
 *
 * @author ValentinaR
 */

import java.util.Scanner;

public class Scan {
    
    
    public static void main(String[] args) {
        
        String palabra1 = "";
        String palabra2 = "";
        String palabra3 = "";
        Scanner scanIn = new Scanner (System.in);
        System.out.println("Por Favor, ingrese las palabras: ");
        palabra1 = scanIn.nextLine();
        palabra2 = scanIn.nextLine();
        palabra3 = scanIn.nextLine();
        System.out.println( palabra1 + " " + palabra2 + " " + palabra3);
    }
    
    
    
}
