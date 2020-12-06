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
public interface BuilderComputador {
    final Component computador = new Computador();
    
    public void addPartes();
    public Component getComputador();
}
