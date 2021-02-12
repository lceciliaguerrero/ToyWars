package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class TestUserAction {
    @Test
    void createUserActionTest() {

        UserAction userAction = new UserAction("Tamagotchi", "20");
        userAction.printUserActionConsole();
        Assert.isNull(userAction.getPointsStart(), "Error");
    }
}