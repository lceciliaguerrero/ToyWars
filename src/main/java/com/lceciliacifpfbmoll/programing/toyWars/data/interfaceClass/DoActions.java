package com.lceciliacifpfbmoll.programing.toyWars.data.interfaceClass;

import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.Action;

import java.util.List;

public interface DoActions {
    List<Action> getCurrentActions();
    void alimentar(String sAlimentar);
    void caminar(Integer iCaminar);
    void dormir(Integer iDormir);
    void enfermar(String sEnfermar);
    void errorUsuario();
    void jugar(String sJugar);
    void morir();
    void resetear();
}
