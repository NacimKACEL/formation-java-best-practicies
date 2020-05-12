package com.finaxys.academy.coupling;

public class Presentation {
    public IMetier metier;

    Presentation() {
        System.out.println(metier.calcul());
    }
}
