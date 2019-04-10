package com.klezovich.simples;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.validation.constraints.AssertFalse;

import static org.junit.Assert.*;

public class SwitchTest {

    private Switch sw;

    @Before
    public void setup(){

        sw = new Switch();
    }

    @Test
    public void switchStateIsOffByDefault(){

        assertFalse( sw.isOn() );
    }

    @Test
    public void on() {

        sw.on();
        assertTrue( sw.isOn() );
    }

    @Test
    public void off() {

        sw.on();
        sw.off();
        assertFalse( sw.isOn() );
    }

    @Test
    public void correctStateAfterOnOffSequence(){

        sw.on();
        sw.on();
        assertTrue( sw.isOn() );

        sw.off();
        sw.off();
        assertFalse( sw.isOn() );

        sw.on();
        sw.off();
        sw.on();
        sw.off();
        assertFalse( sw.isOn() );
    }
}