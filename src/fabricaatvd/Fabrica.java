/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaatvd;

public class Fabrica {
    
    public Igarrafa criaGarrafa(float capacidade){
        
        if (capacidade == 0.5){
            return new Vidro();
        }
        if (capacidade == 2){
            return new Pet();
        }
        if (capacidade == 20){
            return new Garrafao();
        }
        return null;
    }
    
 
    
}
