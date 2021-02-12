package com.lceciliacifpfbmoll.programing.toyWars;

import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.Actions;
import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.DoActions;

import java.util.LinkedList;
import java.util.List;

public class ToyWars implements DoActions {
    public static final List<Actions> ACTIONS_LINKED_LIST = new LinkedList<>();

    @Override
    public List<Actions> getCurrentActions() {
        return ACTIONS_LINKED_LIST;
    }
}
