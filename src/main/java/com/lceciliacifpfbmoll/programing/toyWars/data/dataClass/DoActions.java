package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import java.util.List;

public interface DoActions {
    Actions actionsAlimentar = Actions.ALIMENTAR;
    Actions actionsCaminar = Actions.CAMINAR;
    Actions actionsDormir = Actions.DORMIR;
    Actions actionsEnfermar = Actions.ENFERMAR;
    Actions actionsError = Actions.ERROR;
    Actions actionsJugar = Actions.JUGAR;
    Actions actionsMorir = Actions.MORIR;

    List<Actions> getCurrentActions();
}
