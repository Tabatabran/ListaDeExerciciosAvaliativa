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
public class ParticipanteChat extends Participante{

    public ParticipanteChat(MediatorChat chatMediador, String participantName) {
        super.setMediator(mediator);
        super.setName(participantName);
    }
    
    @Override
    public String getName(){
        return super.getName();
    }
    
    @Override
    public void enviar(String message){
    
    }
    
    @Override
    public void receber(String message, Participante participante){
    
    }
    
    
}
