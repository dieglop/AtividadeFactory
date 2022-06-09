/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaatvd;

import java.util.Locale;
import java.util.Scanner;

public class FabricaAtvd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Fabrica fab = new Fabrica();
        final var regiaoLocal = new Locale("en", "US");

        Igarrafa agua;
        Igarrafa vinho;
        Igarrafa refrigerante;
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um volume: ");
        float capacidade = sc.useLocale(regiaoLocal).nextFloat();   
        
        agua = fab.criaGarrafa(20);
        vinho = fab.criaGarrafa(2);
        refrigerante = fab.criaGarrafa(capacidade);
        
        refrigerante.Encher();
        refrigerante.Encher();
        refrigerante.Encher();
        refrigerante.Encher();
        refrigerante.Reciclar();
        
    }
    
}
