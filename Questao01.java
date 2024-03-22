/*1. Faça um Programa que peça um número e então mostre a mensagem:
O número informado foi [número]*/

package com.mycompany.psc.lista022024;
import java.util.*;

public class Questao01 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        
        double numero;
        
        System.out.print("Olá, \nInforme um número: ");
            numero = ler.nextDouble();
            
        System.out.printf("\n\nO número informado foi: %.2f",numero);    
        
    }
}
