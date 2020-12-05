
import model.BuilderChatSemHTML;
import model.BuilderChat;
import model.BuilderChatSemMarcas;
import model.DiretorChat;
import model.MediatorChat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tabat
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuilderChat builderChat = new BuilderChatSemHTML();
        BuilderChat builderChat2 = new BuilderChatSemMarcas();
        
        DiretorChat diretor = new DiretorChat();
        
        MediatorChat chatSemHTML = diretor.construir(builderChat);
        
        MediatorChat chatSemMarcas = diretor.construir(builderChat2);
        
        System.out.println("chat sem html:");
        
        chatSemHTML.addParticipante(chatSemHTML, "Fulano");
        chatSemHTML.addParticipante(chatSemHTML, "Sicrano");
        chatSemHTML.addParticipante(chatSemHTML, "Beltrano");
        
        System.out.println("");
        System.out.println("chat sem marcas:");
        
        chatSemMarcas.addParticipante(chatSemMarcas, "Fulano");
        chatSemMarcas.addParticipante(chatSemMarcas, "Sicrano");
        chatSemMarcas.addParticipante(chatSemMarcas, "Beltrano");
    }
    
}
