/*5 - Faça um programa que peça o valor de uma viagem “eurotrip” que será
realizada por um grupo de amigos. Os brasileiros sairão com destino a três
locais: 1º Alemanha, 2º Portugal e 3º Itália. 
O programa deve solicitar o preço atual de cada viagem, a quantidade de
pessoas que irão nessa viagem. Após isso, imprimir o valor total da viagem
somando a quantidade total de pessoas que visitarão todos os 03 destinos*/
package com.mycompany.psc.lista022024;
import java.util.*;

public class Questao05 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        int qtsPessoas;
        double viagemAlemanha, viagemPortugal, viagemItalia, total;
        
        System.out.print("EUROTRIP\n\n"
                + "Informe o valor de cada viagem \n"
                + "Valor passagem Alemanha: R$");
            viagemAlemanha = ler.nextDouble();
        System.out.print("Valor passagem Portugal: R$");
            viagemPortugal = ler.nextDouble();
        System.out.print("Valor passagem Itália: R$");
            viagemItalia = ler.nextDouble();
            
        System.out.print("Qual será a quantidade de pessoas: ");
            qtsPessoas = ler.nextInt();
        
            total = (viagemAlemanha + viagemPortugal + viagemItalia) * qtsPessoas;
            
        System.out.print("\n\nO valor total da viagem para "+qtsPessoas+" pessoas, será de R$");  
        System.out.printf("%.2f",total);    
    }
}
