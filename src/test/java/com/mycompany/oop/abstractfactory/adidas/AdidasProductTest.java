/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.abstractfactory.adidas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class AdidasProductTest {
    
    public AdidasProductTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of makeAdidasProduct method, of class AdidasProduct.
     */
    @Test
    public void testMakeAdidasProduct() {
        System.out.println("makeAdidasProduct");
        AdidasProduct instance = new AdidasProductImpl();
        instance.makeAdidasProduct();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AdidasProductImpl implements AdidasProduct {

        public void makeAdidasProduct() {
        }
    }
    
}
