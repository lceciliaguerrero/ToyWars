package com.lceciliacifpfbmoll.programing.toyWars.data.enumClass;

import org.apache.commons.lang3.StringUtils;

public enum RenderType {
    //Constantes del RenderType
    HTML, JSON, CONSOLE, RENDER_TYPE_ERROR;

    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //toString();
    @Override
    public String toString() {
        return StringUtils.toRootLowerCase(StringUtils.trim(super.toString()));
    }
}
