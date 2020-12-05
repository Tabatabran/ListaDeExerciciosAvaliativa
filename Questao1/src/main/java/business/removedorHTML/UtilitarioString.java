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
public class UtilitarioString {

    private static UtilitarioString instance;

    private UtilitarioString() {
    }

    public static UtilitarioString getInstance() {
        if (instance == null) {
            instance = new UtilitarioString();
        }
        return instance;
    }

    public String substitui(String texto, String palavra) {
        if (texto.contains(palavra)){
            return "Mensagem removida por conter conteúdo não autorizado";
        }else{
            return texto;
        }
    }
}
