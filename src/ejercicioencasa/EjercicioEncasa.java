
package ejercicioencasa;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class EjercicioEncasa {

   
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
      int a[]; 
      int b[];
      int c[];
   
      a = new int [10];
      b = new int [10];
      c = new int [20];
     
        for (int i=0; i<10; i++){
           System.out.print((i+1)+". Digite un numero: ");
           a[i] = entrada.nextInt();
        }
        for (int i=0; i<10; i++){
           System.out.println((i+1)+". Digite un numero: ");
           b[i] = entrada.nextInt();
        }
      int j=0;
        for (int i=0; i<10; i++){
         c[j] = a [i];
         j++;
         c[j] = b [i];
         j++;
        }
        
        System.out.print(" \n El tercer arreglo es: ");
        for (int i=0; i<20; i++){
           System.out.print(c[i]+ " "); 
        }
        System.out.println();
        
    }
    
}
