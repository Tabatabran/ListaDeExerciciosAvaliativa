/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.removedorHTML;

/**
 *
 * @author tabat
 */
public class RemovedoraDeTABLE implements IRemovedora{

    public RemovedoraDeTABLE() {
    }
    
    @Override
    public String removeMarca(String texto) {
        return UtilitarioString.getInstance().substitui(texto, "<table");
    }
}
