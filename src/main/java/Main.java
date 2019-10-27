
import com.mycompany.oop.abstractfactory.FactoryGenerator;
import com.mycompany.oop.abstractfactory.AbstractFactory;
import com.mycompany.oop.abstractfactory.adidas.AdidasProduct;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import com.mycompany.oop.factorymethod.ElonMusk;
import com.mycompany.oop.factorymethod.SpaceX;
import com.mycompany.oop.factorymethod.Tesla;
import com.mycompany.oop.abstractfactory.nike.NikeProduct;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        //Abstract Factory
        AbstractFactory adidasFactory = FactoryGenerator.getFactory("Adidas");
        AdidasProduct adidasProduct = adidasFactory.getAdidasProduct("Adidas shoes");
        adidasProduct.makeAdidasProduct();
        
        AbstractFactory nikeFactory = FactoryGenerator.getFactory("Nike");
        NikeProduct nikeProduct = nikeFactory.getNikeProduct("Nike shoes");
        nikeProduct.makeNikeProduct();
        
        //Factory Method
        ElonMusk director = new SpaceX();
        director.manage().make();
        
        director = new Tesla();
        director.manage().make();
    }
    
}
