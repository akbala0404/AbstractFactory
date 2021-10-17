package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's get a Chocolate cake and pie");
        CakeFactory factory = new ChocolateCakeFactory();
        System.out.println(factory.getCake());
        System.out.println(factory.getPie());
    }
}
