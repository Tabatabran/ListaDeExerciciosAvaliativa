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
public class ParteComponent extends Component{
    public ParteComponent(String nome, int quantidade, double precoCusto, double precoLucroMinimo, double precoLucroMaximo) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoCusto = precoCusto;
        this.precoLucroMinimo = precoLucroMinimo;
        this.precoLucroMaximo = precoLucroMaximo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public double getPrecoCusto() {
        return precoCusto;
    }

    @Override
    public double getPrecoLucroMinimo() {
        return precoLucroMinimo;
    }

    @Override
    public double getPrecoLucroMaximo() {
        return precoLucroMaximo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n"
                + "Quantidade: " + quantidade + "\n"
                + "Preço custo: " + precoCusto + "\n"
                + "Preço lucro mínimo: " + precoLucroMinimo + "\n"
                + "Preço lucro máximo: " + precoLucroMaximo + "\n";
    }  
    
}
