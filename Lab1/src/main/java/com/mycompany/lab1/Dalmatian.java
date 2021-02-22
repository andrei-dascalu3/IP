package com.mycompany.lab1;

/*
->Clasa Dalmatian mostenteste clasa Animal si este de asemenea o clasa abstracta
->Implementeza polimorfismul dinamic prin suprascriere metodei age
-> Polimorfismul(static) este integrat in aceasta clasa prin metodele needs() si needs(String )
*/
public class Dalmatian extends Dog {

     @Override
    public void age()
    {
        System.out.println("45 canine years or 7 hooman years");
    }
    public void eats(String food) {
        System.out.println("It eats "+food+".");
    }
    public void needs()
    {
        System.out.println("Poops 2 times a day");
    }
    public void needs(String vitamins)
    {
        System.out.println("Dalmatians need lots of vitamin "+vitamins);
    }
}
