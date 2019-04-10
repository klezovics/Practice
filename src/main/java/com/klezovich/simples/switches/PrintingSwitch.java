package com.klezovich.simples.switches;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintingSwitch extends SimpleSwitch {

    @Override
    public void on() {
        super.on();
        log.info("ON");
    }

    @Override
    public void off() {
        super.off();
        log.info("OFF");
    }

    public static void main(String[] args) {

        var sw = new PrintingSwitch();
        sw.on();
        sw.off();
    }
}
