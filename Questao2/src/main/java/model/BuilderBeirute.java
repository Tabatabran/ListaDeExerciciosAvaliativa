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
public class BuilderBeirute implements BuilderSanduiche{

    @Override
    public void addPao() {
        sanduiche.addIngrediente(new Ingrediente("Pão sírio", 1));
    }

    @Override
    public void addCarne() {
        sanduiche.addIngrediente(new Ingrediente("Rosbife", 1));
    }

    @Override
    public void addComplementos() {
        sanduiche.addIngrediente(new Ingrediente("Queijo", 1));
        sanduiche.addIngrediente(new Ingrediente("Alface", 2));
        sanduiche.addIngrediente(new Ingrediente("Tomate", 2));
        sanduiche.addIngrediente(new Ingrediente("Ovo frito", 1));
    }

    @Override
    public Sanduiche getProduto() {
        return sanduiche;
    }

    
    
}
