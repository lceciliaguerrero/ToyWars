package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import java.util.LinkedList;
import java.util.List;

public interface DoActions {

    Actions actionsComer = Actions.COMER;
    Actions actionsDormir = Actions.DORMIR;
    Actions actionsCorrerv= Actions.CORRER;

    default void getCurrentActions() {
        List<Actions> ACTIONS_LINKED_LIST = new LinkedList<>();
    }

}
