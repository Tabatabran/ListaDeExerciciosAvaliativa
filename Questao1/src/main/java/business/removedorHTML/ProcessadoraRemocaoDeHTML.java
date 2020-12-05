/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.removedorHTML;

import java.util.ArrayList;
import model.IProcessadoraRemocao;

/**
 *
 * @author tabat
 */
public class ProcessadoraRemocaoDeHTML implements IProcessadoraRemocao{

    private final ArrayList<IRemovedora> removedores = new ArrayList<>();

    @Override
    public void addRemovedor() {
        removedores.add(new RemovedoraDeIMG());
        removedores.add(new RemovedoraDeTABLE());
        removedores.add(new RemovedoraDeP());
        removedores.add(new RemovedoraDeAHREF());
    }

    @Override
    public String processaRemovedoras(String texto) {
        for (IRemovedora removedor : removedores) {

            texto = removedor.removeMarca(texto);

        }
        return texto;
    }
}
