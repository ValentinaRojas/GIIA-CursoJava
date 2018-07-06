/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ValentinaR
 */

import javax.swing.JOptionPane;
public class JO {
    
    public static void main(String[] args) {
        
       String palabra1 = "";
       String palabra2 = "";
       String palabra3 = "";
       palabra1 = JOptionPane.showInputDialog("Por favor ingrese la primera palabra:");
       palabra2 = JOptionPane.showInputDialog("Por favor ingrese la segunda palabra:");
       palabra3 = JOptionPane.showInputDialog("Por favor ingrese la tercera palabra:");
       String msg =  palabra1 + " " + palabra2 + " " + palabra3;
       JOptionPane.showMessageDialog(null, msg);
               
    }
    
}
