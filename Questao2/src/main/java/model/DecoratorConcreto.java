/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tabat
 */
public class DecoratorConcreto extends DecoratorSanduiche{
    
    public DecoratorConcreto(ISanduiche sanduiche) {
        super.setSanduiche(sanduiche);
    }
    
    @Override
    public void addIngrediente(Ingrediente ingrediente){
        sanduiche.addIngrediente(ingrediente);
    }
}
