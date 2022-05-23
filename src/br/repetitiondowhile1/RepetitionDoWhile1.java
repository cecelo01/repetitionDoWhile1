/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.repetitiondowhile1;

import java.util.Scanner;
/**
 *
 * @author Marce
 */
public class RepetitionDoWhile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num, resu=0;
        
        Scanner entrada = new Scanner(System.in);
        String cont;
        
        do{
            
            System.out.print("Digite um numero: ");
            num = entrada.nextInt();
            resu += num;
            System.out.print("Deseja continuar? [s/n]");
            cont = entrada.next();
            
        } while(cont.equals("s"));
        
        System.out.println("Valor da soma: "+resu);
    }
    
}
