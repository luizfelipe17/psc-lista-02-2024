/*2. Faça um Programa que peça dois números e imprima a soma, a subtração e a
multiplicação do primeiro pelo segundo.*/
package com.mycompany.psc.lista022024;
import java.util.*;

public class Questao02 {
    public static void main(String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        double numero1, numero2, soma, subtracao, multiplicacao;
        
        System.out.print("Olá,\nInforme o primeiro número: ");
            numero1 = ler.nextDouble();
        
        System.out.print("Informe o segundo número: ");
            numero2 = ler.nextDouble();
            
           soma = numero1 + numero2; 
           subtracao = numero1 - numero2;  
           multiplicacao = numero1 * numero2;  
           
        System.out.print("\n\nO resultado das operações serão:\n"
                + "SOMA: "+numero1+" + "+numero2+" = "+soma);
        System.out.print("\nSubtração: "+numero1+" - "+numero2+" = "+subtracao);
        System.out.print("\nMultiplicação: "+numero1+" x "+numero2+" = "+multiplicacao);
        
    }
}
