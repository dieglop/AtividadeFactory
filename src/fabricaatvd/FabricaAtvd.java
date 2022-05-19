/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaatvd;

import java.util.Scanner;

public class FabricaAtvd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Fabrica fab = new Fabrica();
        
        Igarrafa agua;
        Igarrafa vinho;
        Igarrafa refrigerante;
   
        agua = fab.criaGarrafa(20);
        vinho = fab.criaGarrafa(2);
        refrigerante = fab.criaGarrafa(0.5f);
        
        refrigerante.Encher();
        refrigerante.Encher();
        refrigerante.Encher();
        refrigerante.Reciclar();
        
    }
    
}
