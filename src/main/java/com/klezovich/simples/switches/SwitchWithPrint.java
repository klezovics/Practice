package com.klezovich.simples.switches;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwitchWithPrint implements Switch {

    Switch sw = new SimpleSwitch();

    @Override
    public boolean isOn() {

        return sw.isOn();
    }

    @Override
    public void on() {

       sw.on();
       log.info("ON");
    }

    @Override
    public void off() {

        sw.off();
        log.info("OFF");
    }

    public static void main(String[] args) {

        var sw = new SwitchWithPrint();
        sw.on();
        sw.off();
        sw.on();
    }
}
