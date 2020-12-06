
import model.BuilderBeirute;
import model.BuilderMistoQuente;
import model.BuilderSanduiche;
import model.DecoratorConcreto;
import model.DecoratorSanduiche;
import model.DiretorSanduiche;
import model.ISanduiche;
import model.Ingrediente;

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
        BuilderSanduiche builderBeirute = new BuilderBeirute();
        BuilderSanduiche builderMistoQuente = new BuilderMistoQuente();
        
        DiretorSanduiche diretor = new DiretorSanduiche();
        
        ISanduiche beirute = diretor.construir(builderBeirute);
        ISanduiche mistoQuente = diretor.construir(builderMistoQuente);
        
        Ingrediente ingrediente = new Ingrediente("Ovo Frito", 1);
        
        DecoratorSanduiche decorator = new DecoratorConcreto(mistoQuente);
        
        decorator.addIngrediente(ingrediente);
        
        System.out.println("Beirute: ");
        System.out.println(beirute);
        System.out.println("");
        System.out.println("MistoQuente: ");
        System.out.println(mistoQuente);
    }
    
}
