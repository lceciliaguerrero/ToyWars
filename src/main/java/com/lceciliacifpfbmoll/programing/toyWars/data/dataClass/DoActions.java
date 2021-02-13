package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

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
}
