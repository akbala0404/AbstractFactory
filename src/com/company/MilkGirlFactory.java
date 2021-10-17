package com.company;

public class MilkGirlFactory implements CakeFactory{
    public Cake getCake() {
        return new MilkGirlCake();
    }

    @Override
    public Pie getPie() {
        return new MilkGirlPie();
    }
}
