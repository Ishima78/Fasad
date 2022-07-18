package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BinOps binOps = new BinOps();
        String sumD = binOps.sum("11", "01");
        System.out.println(sumD);
        String multF = binOps.mult("11", "01");
        System.out.println(multF);
    }
}