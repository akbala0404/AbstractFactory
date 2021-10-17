package com.company;

public class ChocolateCakeFactory implements CakeFactory{
    @Override
    public Cake getCake() {
        return new ChocolateCake();
    }

    @Override
    public Pie getPie() {
        return new ChocolatePie();
    }
}
