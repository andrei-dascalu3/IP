package com.mycompany.lab1;

public class main {
    public static void main(String[] args) {
        //System.out.println("Hahaha");
        Animal rex = new Dalmatian();
        rex.age();
        rex.lives();
        rex.eats();
        Dalmatian grivei = new Dalmatian();
        grivei.eats("bananas and cats for dessert");
        grivei.eats();
        grivei.needs();
        grivei.needs("B3+O3");
        grivei.age();
        
    }
}
