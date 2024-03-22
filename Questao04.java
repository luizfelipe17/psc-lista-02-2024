/*4. Faça um programa que peça o preço do litro da gasolina e solicite quantos
litros foi vendido a determinado cliente.
O programa deve informar quanto o cliente deverá pagar pela gasolina
comprada.
*/
package com.mycompany.psc.lista022024;
import java.util.*;

public class Questao04 {
    public static void main(String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        double precoLitro, qtsLitros, valorTotal;
        
        System.out.print("POSTO\n\n"
                + "Qual o valor do litro da gasolina: R$");
            precoLitro = ler.nextDouble();
        System.out.print("Quantidade de gasolina (Litros): ");
            qtsLitros = ler.nextDouble();
            
            
            valorTotal = precoLitro * qtsLitros;
            
        System.out.printf("\nO valor total que deverá ser pago é de: R$%.2f",valorTotal);
      
    }
}
