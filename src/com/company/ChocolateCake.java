package com.company;

public class ChocolateCake implements Cake{
    @Override
    public String getCream() {
        return " with cream sundae ";
    }

    @Override
    public String getDough() {
        return " with a delicate chocolate biscuit ";
    }

    @Override
    public String toString() {
        return "Chocolate Cake " + this.getDough() + " and " + this.getCream();
    }
}
