package com.finaxys.academy.coupling;

public class DaoImpl implements IDao{
    // from db
    int value = 10;
    @Override
    public int getValue() {
        return this.value;
    }
}
