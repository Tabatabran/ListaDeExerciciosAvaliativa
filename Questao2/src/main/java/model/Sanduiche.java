/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author tabat
 */
public class Sanduiche implements ISanduiche{
    ArrayList<Ingrediente> ingredientes;

    public Sanduiche() {
        this.ingredientes = new ArrayList<>();
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    
    @Override
    public void addIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }
    
}
