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
public abstract class Component {
    String nome;
    int quantidade;
    double precoCusto;
    double precoLucroMinimo;
    double precoLucroMaximo;
    
    public void adicionaParte(ParteComponent parte) throws Exception{
        throw new Exception("O arquivo não pode ser adicionado");
    }
    public void removeParte(String nome) throws Exception{
        throw new Exception("O arquivo não pode ser removido");
    }
    
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPrecoLucroMinimo() {
        return precoLucroMinimo;
    }

    public double getPrecoLucroMaximo() {
        return precoLucroMaximo;
    }
    
    
}
