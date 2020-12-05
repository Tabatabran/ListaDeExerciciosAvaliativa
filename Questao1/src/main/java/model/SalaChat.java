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
public class SalaChat implements MediatorChat{
    
    private ArrayList<Participante> participants;

    public SalaChat() {
        this.participants = new ArrayList<>();
    }

    @Override
    public void enviar(Participante participante, String mensagem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Participante criarParticipante(MediatorChat mediador, String nome) {
        Participante participante = new ParticipanteChat(mediador, nome);
        
        return participante;
    }

    public ArrayList<Participante> getParticipants() {
        return participants;
    }

    @Override
    public void addParticipante(MediatorChat mediador, String nome) {
        participants.add(this.criarParticipante(mediador, nome));
        System.out.println(nome + " entrou na sala");
    }

    @Override
    public void setProcessadora(IProcessadoraRemocao processadora) {
        
    }
    
    
    
    
}
