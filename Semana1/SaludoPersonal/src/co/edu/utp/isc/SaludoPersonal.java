
package co.edu.utp.isc;

public class SaludoPersonal {

  
    public static void main(String[] args) {
        
         if(args.length > 0)
        {
            System.out.println(args[0] + ", Bienvenido al curso de Programación en Java! ");
            return;
        }
        System.out.println("Ingrese algun nombre");
    }
    
}
