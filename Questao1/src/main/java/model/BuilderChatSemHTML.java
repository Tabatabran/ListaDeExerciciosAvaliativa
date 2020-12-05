/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import business.removedorHTML.ProcessadoraRemocaoDeHTML;

/**
 *
 * @author tabat
 */
public class BuilderChatSemHTML implements BuilderChat{

    @Override
    public void setTipoChat() {
        mediator.setProcessadora(new ProcessadoraRemocaoDeHTML());
    }

    @Override
    public MediatorChat getProduto() {
        return mediator;
    }
    
}
