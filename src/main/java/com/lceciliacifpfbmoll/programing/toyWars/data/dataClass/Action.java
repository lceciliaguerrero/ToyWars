package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import org.apache.commons.lang3.StringUtils;

public enum Action {
    //Constantes del actions de lifeBoing
    ALIMENTAR, CAMINAR, DORMIR, ENFERMAR, ERRORUSUARIO, JUGAR, MORIR;

    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //toString();
    @Override
    public String toString() {
        return StringUtils.toRootUpperCase(StringUtils.trim(super.toString()));
    }
}