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
public class ProxySalaChat implements MediatorChat{
    public SalaChat salaChat;
    public IProcessadoraRemocao processadora;
    
    public ProxySalaChat() {
    }

    @Override
    public void enviar(Participante participante, String mensagem) {
        processadora.addRemovedor();
        salaChat.enviar(participante, processadora.processaRemovedoras(mensagem));
    }

    @Override
    public Participante criarParticipante(MediatorChat mediador, String nome) {
        return salaChat.criarParticipante(mediador, nome);
    }
    
    @Override
    public void addParticipante(MediatorChat mediador, String nome){
        salaChat.addParticipante(mediador, nome);
    }
    
    @Override
    public void setProcessadora(IProcessadoraRemocao processadora){
        this.processadora = processadora;
    }
    
    
}
