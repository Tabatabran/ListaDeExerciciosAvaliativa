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
public interface MediatorChat {
    public void enviar(Participante participante, String mensagem);
    public Participante criarParticipante(MediatorChat mediador, String nome);
    public void addParticipante(MediatorChat mediador, String nome);
    public void setProcessadora(IProcessadoraRemocao processadora);
}
