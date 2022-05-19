/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaatvd;

public class Vidro implements Igarrafa {

    public int reuso = 0;
    
    @Override
    public void Encher() {
        if (reuso == 3){
            System.out.println("A garrafa deve ser reciclada!");
        }else{
            reuso++;
        }
        
    }

    @Override
    public void Reciclar() {
       reuso = 0;
        System.out.println("A garrafa foi reciclada com sucesso!");
    }
    
}
