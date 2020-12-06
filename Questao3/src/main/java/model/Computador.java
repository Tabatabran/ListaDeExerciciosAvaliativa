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
public class Computador extends Component {

    private ArrayList<ParteComponent> components;

    public Computador() {
        this.components = new ArrayList<>();
    }

    @Override
    public void adicionaParte(ParteComponent parte) {
        components.add(parte);
    }

    @Override
    public void removeParte(String nome) {
        for (ParteComponent parte : components) {
            if (parte.getNome().equals(nome)) {
                components.remove(parte);
            }
        }
    }

    @Override
    public String toString() {
        String computadorDescricao = "Computador: \n";

        for (ParteComponent parte : components) {

            computadorDescricao += parte.toString();

        }

        return computadorDescricao;
    }
}
