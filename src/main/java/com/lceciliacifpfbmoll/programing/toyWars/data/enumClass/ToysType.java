package com.lceciliacifpfbmoll.programing.toyWars.data.enumClass;

import org.apache.commons.lang3.StringUtils;

public enum ToysType {
    //Constantes del ToysType de la clase Toy
    POKEMON, TAMAGOTCHI, GIJOE, TOYS_TYPE_ERROR;

    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //Methods printData
    //toString();
    @Override
    public String toString() {
        return StringUtils.toRootLowerCase(StringUtils.trim(super.toString()));
    }
}
