
package ejercicioencasa;

import java.util.Scanner;


public class EjercicioEncasa {

   
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
      int a[]; 
      int b[];
   
      a = new int [10];
      b = new int [10];
      
      System.out.println("Digite el primer arreglo: ");
        for (int i=0; i<10; i++){
           System.out.println((i+1)+". Digite un numero: ");
           a[i] = entrada.nextInt();
        }
      System.out.println("Digite el segundo arreglo: ");
        for (int i=0; i<10; i++){
           System.out.println((i+1)+". Digite un numero: ");
           b[i] = entrada.nextInt();
        }  
    }
    
}
