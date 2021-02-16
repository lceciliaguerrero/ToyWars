package com.lceciliacifpfbmoll.programing.toyWars.data.interfaceClass;

import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.Action;

import java.util.List;

public interface DoActions {
    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //-----> clase LifeBeing <-----
    //getCurrentActions();
    List<Action> getCurrentActions();

    //Action
    //alimentar(String sAlimentar);
    void alimentar(String sAlimentar);

    //caminar(Integer iCaminar);
    void caminar(Integer iCaminar);

    //dormir(Integer iDormir);
    void dormir(Integer iDormir);

    //enfermar(String sEnfermar);
    void enfermar(String sEnfermar);

    //jugar(String sJugar);
    void jugar(String sJugar);

    //errorUsuario();
    void errorUsuario();
    //morir();
    void morir();

    //resetear();
    void resetear();
}
