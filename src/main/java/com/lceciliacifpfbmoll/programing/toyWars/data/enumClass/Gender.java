package com.lceciliacifpfbmoll.programing.toyWars.data.enumClass;

import org.apache.commons.lang3.StringUtils;

public enum Gender {
    //Constantes del genero de la clase lifeBeing y Person
    FEMENINO, MASCULINO, NINGUNO;

    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //Methods printData
    //toString();
    @Override
    public String toString() {
        return StringUtils.toRootLowerCase(StringUtils.trim(super.toString()));
    }
}
