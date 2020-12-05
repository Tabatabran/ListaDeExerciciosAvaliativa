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
public abstract class DecoratorSanduiche implements ISanduiche{
    ISanduiche sanduiche;

    public DecoratorSanduiche(ISanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }
    
    @Override
    public void addIngrediente(Ingrediente ingrediente){}

    public void setSanduiche(ISanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }
    
    
    
    
    
}
