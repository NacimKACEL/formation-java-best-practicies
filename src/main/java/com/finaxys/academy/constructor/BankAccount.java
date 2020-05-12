package com.finaxys.academy.constructor;

public class BankAccount {
    private double balance;
    private double interest;

    // balance = 0
    // interest = 0.1

    public BankAccount() {
        this(0);
    }

    public BankAccount(double balance) {
        this(balance, 0.1);
    }

    public BankAccount(double balance, double interest) {
        if ( balance < 0)
            throw new IllegalArgumentException("bank account balance should be > 0");

        if( interest < 0)
            throw  new IllegalArgumentException("banck account intetest should b > 0");
        this.interest = interest;
        this.balance = balance;
    }
}
