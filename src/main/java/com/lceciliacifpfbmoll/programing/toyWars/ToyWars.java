package com.lceciliacifpfbmoll.programing.toyWars;

import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.Actions;
import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.Toy;
import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.User;
import com.lceciliacifpfbmoll.programing.toyWars.helper.ConsoleUtils;
import com.lceciliacifpfbmoll.programing.toyWars.helper.LoggerUtils;

import java.util.LinkedList;
import java.util.List;

public class ToyWars {
    public static final List<Actions> ACTIONS_LINKED_LIST = new LinkedList<>();
    public static final List<User> USERS_LINKED_LIST = new LinkedList<>();
    public static final List<Toy> TOYS_LINKED_LIST = new LinkedList<>();
    public static final ConsoleUtils consoleUtils = new ConsoleUtils();
    public static final LoggerUtils loggerUtils = new LoggerUtils();
}
