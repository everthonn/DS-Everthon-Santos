/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class EX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int[] n = new int[10];
        
        int soma = 0;
        for (int i = 0; i < n.length;i++)
        {
            System.out.println("me diga um numero");
            n[i] = entrada.nextInt(); 
            soma += n[i];
        }
        
        System.out.println("A soma de todos os numeros e"+soma);
    }
}
