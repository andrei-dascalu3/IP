package com.mycompany.lab1;
/*
Clasa Dog mosteneste clasa Animal
Implementeza polimorfismul dinamic prin suprascriere metodelor abstracte
*/
abstract class Dog implements Animal{
    @Override
    public void lives(){
        System.out.println("Everywhere.");
    } 
    @Override
    public void eats(){
        System.out.println("Everything.");
    }
     @Override
    public void age(){
        System.out.println("30 canine years.");
    }
}
