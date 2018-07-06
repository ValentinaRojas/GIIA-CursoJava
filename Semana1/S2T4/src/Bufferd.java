import java.io.*;


public class Bufferd {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        String palabra1 = "";
        String palabra2 = "";
        String palabra3 = "";
        
        System.out.println("Por favor, ingrese las  palabras: " );
        
        try{
            palabra1 =dataIn.readLine();
            palabra2 =dataIn.readLine();
            palabra3 =dataIn.readLine();
            
        }catch (IOException e){
            System.out.println("Error!");
        }
        
        System.out.println( palabra1+ " " + palabra2 + " " + palabra3);
        
    }
    
}
