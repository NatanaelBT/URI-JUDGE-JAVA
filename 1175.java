/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author fax_c
 */
public class sala {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int[] vetor = new int[20];
        
       
        Random r = new Random();
        
        
          double arrayDeNumeros[] = new double[20];
        for (int i = 0; i < arrayDeNumeros.length; i++) {
            String num = JOptionPane.showInputDialog("Digite o "+(i+1)+"º número:");
          arrayDeNumeros[i] = Double.parseDouble(num);
          
        }
         for (int i = arrayDeNumeros.length-1,j = 00; i >=0; i--, j++) {
             //JOptionPane.showMessageDialog(null, "Na Ordem inversa:\n"+arrayDeNumeros[i]);
             System.out.println("N["+j+"]= "+(arrayDeNumeros[i]));
        }
        }
        }
