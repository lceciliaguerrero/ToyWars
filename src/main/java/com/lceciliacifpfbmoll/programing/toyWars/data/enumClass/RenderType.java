package com.lceciliacifpfbmoll.programing.toyWars.data.enumClass;

import org.apache.commons.lang3.StringUtils;

public enum RenderType {
    //Constantes del RenderType de la interfaz IRender y a la vez viene de la clase LifeBeing
    HTML, JSON, CONSOLE, RENDER_TYPE_ERROR;

    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //Methods printData
    //toString();
    @Override
    public String toString() {
        return StringUtils.toRootLowerCase(StringUtils.trim(super.toString()));
    }
}
