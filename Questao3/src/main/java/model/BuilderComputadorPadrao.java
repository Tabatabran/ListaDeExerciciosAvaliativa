/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author tabat
 */
public class BuilderComputadorPadrao implements BuilderComputador{

    @Override
    public void addPartes() {
        try {
            computador.adicionaParte(new ParteComponent("Placa mãe", 1, 850, 1300, 1500));
            computador.adicionaParte(new ParteComponent("CPU", 1, 500, 800, 1000));
            computador.adicionaParte(new ParteComponent("Placa de video", 1, 1300, 2000, 2400));
            computador.adicionaParte(new ParteComponent("Memória RAM 2G", 3, 400, 700, 850));
            computador.adicionaParte(new ParteComponent("Hard Disk 1tb", 2, 100, 250, 350));
        } catch (Exception ex) {
            Logger.getLogger(BuilderComputadorPadrao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Component getComputador() {
        return computador;
    }

    
    
}
