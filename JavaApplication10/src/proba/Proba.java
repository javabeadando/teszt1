package proba;

import alg.Jatek;

public class Proba {

    public static void main(String[] args) {

        Jatek jatek = new Jatek("Dezsõ", 10);
        jatek.alapallas();
        jatek.setTipp(57);
        if ( jatek.isIndithato()){
            System.out.println(jatek.lejatszas());
        }

        //2. 
        jatek.alapallas();
        jatek.setTipp(57);
        System.out.println(jatek.lejatszas());
        System.out.println(jatek.isJolTippelt());
    }

}
