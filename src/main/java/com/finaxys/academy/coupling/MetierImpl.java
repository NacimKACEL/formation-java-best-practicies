package com.finaxys.academy.coupling;

public class MetierImpl implements IMetier{
    public DaoImpl dao;
    @Override
    public int calcul() {
        return dao.value;
    }
}
