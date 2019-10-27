/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.factorymethod;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class ElonMuskTest {
    
    public ElonMuskTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of manage method, of class ElonMusk.
     */
    @Test
    public void testManage() {
        System.out.println("manage");
        ElonMusk instance = new ElonMuskImpl();
        Product expResult = null;
        Product result = instance.manage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ElonMuskImpl extends ElonMusk {

        public Product manage() {
            return null;
        }
    }
    
}
