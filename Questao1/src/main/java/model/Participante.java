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
public abstract class Participante {
    private String name;
    protected MediatorChat mediator;
    
    public String getName(){
        return name;
    }
    
    public abstract void enviar(String message);
    
    public abstract void receber(String message, Participante participante);

    public void setName(String name) {
        this.name = name;
    }

    public void setMediator(MediatorChat mediator) {
        this.mediator = mediator;
    }
    
    
}
