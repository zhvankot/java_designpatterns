/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.factorymethod;

/**
 *
 * @author Admin
 */
public class SpaceX extends ElonMusk {
    @Override
    public Product manage(){
        return new Falcon9();
    }
}
