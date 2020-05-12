package com.finaxys.academy.constructor;

public class App {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(10)
                                .cheese(true)
                                .build();
    }

}
