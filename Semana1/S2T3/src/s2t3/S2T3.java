/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2t3;

/**
 *
 * @author ValentinaR
 */
public class S2T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Ingrese dos argumentos");
            return;
        }
        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[1]);
        System.out.println("Suma" + "=" + (n1 + n2));
        System.out.println("Resta" + "=" + (n1 - n2));
        System.out.println("Multiplicacion" + "=" + (n1 * n2));
        System.out.println("Division" + "=" + (n1 / n2));
    }
    
 }
    
