/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

/**
 *
 * @author Andrei
 */
public class Dog implements Animal{
    public void lives(){
        System.out.println("Everywhere.\n");
    }
    public void eats(){
        System.out.println("Everything.\n");
    }
    public void age(){
        System.out.println("30 canine years.\n");
    }
}
