package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ToyTest {

    @Test
    void createToyTest() {
        Toy toy = new Toy("", "", "");
    }

    @Test
    void createActionTest() {
        Toy actionToy = new Toy("");
    }
}