package com.lceciliacifpfbmoll.programing.toyWars.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtils {
    //Atributos privados finales:
    private final Logger registro = LoggerFactory.getLogger(this.getClass());

    //logerFactoryInfoToString();
    //Registra un mensaje en el nivel INFO.
    public void logerFactoryInfoToString(String nameLogerFactoryInfoToString) {
        registro.info(nameLogerFactoryInfoToString);
    }

    //logerFactoryDebuggerToString();
    //Registra un mensaje en el nivel DEBUG.
    public void logerFactoryDebuggerToString(String nameLogerFactoryDebuggerToString) {
        registro.debug(nameLogerFactoryDebuggerToString);
    }

    //logerFactoryWarnToString();
    //Registre un mensaje en el nivel WARN.
    public void logerFactoryWarnToString(String nameLogerFactoryWarnToString) {
        registro.warn(nameLogerFactoryWarnToString);
    }

    //logerFactoryErrorToString();
    //Registra un mensaje en el nivel ERROR.
    public void logerFactoryErrorToString(String nameLogerFactoryErrorToString) {
        registro.error(nameLogerFactoryErrorToString);
    }

    //logerFactoryTraceToString();
    //Registra un mensaje en el nivel TRACE.
    public void logerFactoryTraceToString(String nameLogerFactoryTraceToString) {
        registro.trace(nameLogerFactoryTraceToString);
    }
}
