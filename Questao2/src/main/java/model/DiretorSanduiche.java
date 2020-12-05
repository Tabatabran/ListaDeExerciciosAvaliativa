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
public class DiretorSanduiche {
    public Sanduiche construir(BuilderSanduiche builder){
        builder.addPao();
        builder.addCarne();
        builder.addComplementos();
        
        return builder.getProduto();
    }
}
