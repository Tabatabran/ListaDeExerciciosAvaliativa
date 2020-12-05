/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import business.removedorDeMarcas.ProcessadoraRemocaoDeMarca;

/**
 *
 * @author tabat
 */
public class BuilderChatSemMarcas implements BuilderChat{

    @Override
    public void setTipoChat() {
        mediator.setProcessadora(new ProcessadoraRemocaoDeMarca());
    }

    @Override
    public MediatorChat getProduto() {
        return mediator;
    }
    
}
