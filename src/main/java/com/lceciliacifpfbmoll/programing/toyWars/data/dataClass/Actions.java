package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import org.apache.commons.lang3.StringUtils;

public enum Actions {
    //Constantes del actions de lifeBoing
    DORMIR, CORRER, COMER;

    //Methods
    //toString();
    @Override
    public String toString() {
        return StringUtils.toRootUpperCase(StringUtils.trim(super.toString()));
    }
}
