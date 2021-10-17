package com.company;

public class MilkGirlCake implements Cake{
    @Override
    public String getCream() {
        return " with cream sundae ";
    }

    @Override
    public String getDough() {
        return " with sweet condensed dough ";
    }

    @Override
    public String toString() {
        return "Milk Girl Cake " + this.getDough() + " and " + this.getCream();
    }
}
