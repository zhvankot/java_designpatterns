/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.factorymethod;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Admin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mycompany.oop.factorymethod.ElonMuskTest.class, com.mycompany.oop.factorymethod.TeslaTest.class, com.mycompany.oop.factorymethod.SpaceXTest.class, com.mycompany.oop.factorymethod.ProductTest.class, com.mycompany.oop.factorymethod.TeslaRoadsterTest.class, com.mycompany.oop.factorymethod.Falcon9Test.class})
public class FactorymethodSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
