package com.company;


public class Main {

    public static void main(String[] args) {
        AsianLily asianLily = new AsianLily(300, 50, 20);
        EasternLily easternLily = new EasternLily(120, 100, 15);
        RedRose redRose = new RedRose(3000, 40, 40);
        WhiteRose whiteRose = new WhiteRose(6000, 90, 40);
        EuropeanPeony europeanPeony = new EuropeanPeony(1000, 100, 30);
        JapanesePeony japanesePeony = new JapanesePeony(3200, 50, 10);

        Bouquet bouquet = new Bouquet(asianLily, easternLily, whiteRose, redRose, europeanPeony, japanesePeony);
    }
}
