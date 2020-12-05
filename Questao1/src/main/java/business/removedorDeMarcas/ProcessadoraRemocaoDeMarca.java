/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.removedorDeMarcas;

import java.util.ArrayList;
import model.IProcessadoraRemocao;

/**
 *
 * @author tabat
 */
public class ProcessadoraRemocaoDeMarca implements IProcessadoraRemocao{

    private final ArrayList<RemovedoraDeMarcas> removedores = new ArrayList<>();

    @Override
    public void addRemovedor() {

        removedores.add(new RemovedoraDeMarcas("IBM"));
        removedores.add(new RemovedoraDeMarcas("Apple"));
        removedores.add(new RemovedoraDeMarcas("Microsoft"));
        removedores.add(new RemovedoraDeMarcas("Lenovo"));
        removedores.add(new RemovedoraDeMarcas("HP"));
        removedores.add(new RemovedoraDeMarcas("Sansung"));
        removedores.add(new RemovedoraDeMarcas("Nokia"));
        
    }

    @Override
    public String processaRemovedoras(String texto) {
        for (RemovedoraDeMarcas removedor : removedores) {

            texto = removedor.removeMarca(texto);

        }
        return texto;
    }
}
