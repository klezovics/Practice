package com.klezovich.simples.switches;

public class SimpleSwitch implements Switch {

    private boolean on;

    @Override
    public boolean isOn(){

        return on;
    }

    @Override
    public void on(){

        on = true;
    }

    @Override
    public void off(){

        on=false;
    }
}
