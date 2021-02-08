package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import com.lceciliacifpfbmoll.programing.toyWars.data.abstractClass.LifeBeing;

import java.util.concurrent.atomic.AtomicLong;

public class Tamagotchi extends LifeBeing {
    //Atributos privados estaticos finales:
    private static final AtomicLong count = new AtomicLong(0);


    @Override
    public void options() {

    }
}
