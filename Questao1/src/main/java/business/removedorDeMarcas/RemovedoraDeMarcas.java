/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.removedorDeMarcas;

/**
 *
 * @author tabat
 */
public class RemovedoraDeMarcas {
    private String nomeMarca;

    public RemovedoraDeMarcas(String nomeMarcaARemover) {
        this.nomeMarca = nomeMarcaARemover;
    }

    public String removeMarca(String texto) {
        return UtilitarioString.getInstance().substitui(texto, nomeMarca, "*");
    }
}
