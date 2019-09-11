package curso;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fax_c
 */
public class sala {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        double[] arrayDeInteiros = new double[100];
        
       
        Random r = new Random();
        
        
        
       
        for (int j = 0; j < 100; j++) {
            System.out.println("DIgite um numero:");
            
            arrayDeInteiros[j] = 10*r.nextDouble()*Math.pow(-1, r.nextInt(2));
            if (arrayDeInteiros[j]<= 10) {
                
                DecimalFormat df = new DecimalFormat("#0.0");
                System.out.println("A["+j+"]= "+df.format(arrayDeInteiros[j]));
            
                
                
            }
                      

        }
