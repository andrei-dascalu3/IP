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
public class main {
    public static void main(String[] args) {
        //System.out.println("Hahaha");
        Animal rex = new Dog();
        rex.age();
        rex.lives();
        rex.eats();
        Dalmatian grivei = new Dalmatian();
        grivei.eats("bananas and cats for dessert");
    }
}
