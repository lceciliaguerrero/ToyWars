package com.lceciliacifpfbmoll.programing.toyWars.data.enumClass;

import org.apache.commons.lang3.StringUtils;

public enum Action {
    //Constantes del action de la interfaz DoActions y a la vez viene de la clase lifeBeing
    ALIMENTAR, CAMINAR, DORMIR, ENFERMAR, ERRORUSUARIO, JUGAR, MORIR, RESETEAR;

    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //Methods printData
    //toString();
    @Override
    public String toString() {
        return StringUtils.toRootLowerCase(StringUtils.trim(super.toString()));
    }
}
