package com.mycompany.lab1;

/*
Clasa main in care sunt create obiectele  si afisate informatii despre conceptele implementate

Clasa Animal constituie interfata

->Clasa Dalmatian mostenteste clasa Animal si este de asemenea o clasa abstracta
->Implementeza polimorfismul dinamic prin suprascriere metodei age
-> Polimorfismul(static) este integrat in aceasta clasa prin metodele needs() si needs(String )

Clasa Dog mosteneste clasa Animal
Implementeza polimorfismul dinamic prin suprascriere metodelor abstracte
*/
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
