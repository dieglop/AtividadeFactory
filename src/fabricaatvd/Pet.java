/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaatvd;


public class Pet implements Igarrafa{

    public int reuso = 0;
    
    @Override
    public void Encher() {
        if (reuso == 2){
            System.out.println("A garrafa pet precisa ser reciclada!");
        }else{
            reuso++;
        }
    }

    @Override
    public void Reciclar() {
        reuso = 0;
        
        System.out.println("Garrafa pet reciclada com sucesso!");
    }
    
}
