/*3. Faça um Programa que peça as 4 notas bimestrais e mostre a média.*/

package com.mycompany.psc.lista022024;
import java.util.*;

public class Questao03 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        double nota1, nota2, nota3, nota4, media;
        
        System.out.print("Informe as notas dos quatros bimestres \n"
                + " Primeiro Bimestre: ");
            nota1 = ler.nextDouble();
        System.out.print(" Segundo Bimestre: ");
            nota2 = ler.nextDouble();
        System.out.print(" Terceiro Bimestre: ");
            nota3 = ler.nextDouble();
        System.out.print(" Quarto Bimestre: ");
            nota4 = ler.nextDouble();
            
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        
        System.out.printf("\nA média das notas foi de: %.2f",media);
        System.out.print(" pontos");
                
    }
}
