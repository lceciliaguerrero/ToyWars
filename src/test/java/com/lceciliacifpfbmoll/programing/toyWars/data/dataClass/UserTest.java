package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class UserTest {

    @Test
    void createUserTest() {
       User user = new User("Laura", "Cecilia Guerrero",
               "20", "111111111",
               "laura@ejemplo.com", "femenino", "laura2021",
               "", "", "");
       user.printConsolePerson();
    }
}