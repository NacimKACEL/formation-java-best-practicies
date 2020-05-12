package com.finaxys.academy.constructor;

public class Pizza {

    static class Builder {
        // modatory
        private final int size;

        // boolean
        private boolean cheese;
        private boolean chicken;

        Builder(int size) {
            this.size = size;
        }

        Builder cheese(boolean value) {
            this.cheese = value;
            return  this;
        }

        Builder chicken(boolean value) {
            this.chicken = value;
            return  this;
        }

        Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        int size = builder.size;
        boolean cheese = builder.cheese;
        boolean chicken = builder.chicken;
    }

}
