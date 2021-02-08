package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import org.apache.commons.lang3.StringUtils;

public enum Gender {
    //Constantes del genero de
    FEMENINO, MASCULINO, NINGUNO;

    //Methods
    //toString();
    @Override
    public String toString() {
        return StringUtils.toRootUpperCase(StringUtils.trim(super.toString()));
    }
}
