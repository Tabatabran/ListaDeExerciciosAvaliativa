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
public class BuilderMistoQuente implements BuilderSanduiche{

    @Override
    public void addPao() {
        sanduiche.addIngrediente(new Ingrediente("Pão de forma", 2));
    }

    @Override
    public void addCarne() {
        sanduiche.addIngrediente(new Ingrediente("Presunto", 1));
    }

    @Override
    public void addComplementos() {
        sanduiche.addIngrediente(new Ingrediente("Queijo", 1));
    }

    @Override
    public Sanduiche getProduto() {
        return sanduiche;
    }
    
}
