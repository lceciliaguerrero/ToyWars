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
    //void alimentar(String sAlimentar);
    void alimentar();

    //caminar(Integer iCaminar);
    //void caminar(Integer iCaminar);
    void caminar();

    //dormir(Integer iDormir);
    //void dormir(Integer iDormir);
    void dormir();

    //enfermar(String sEnfermar);
    //void enfermar(String sEnfermar);
    void enfermar();

    //jugar(String sJugar);
    //void jugar(String sJugar);
    void jugar();

    //errorUsuario();
    void errorUsuario();
    //morir();
    void morir();

    //resetear();
    void resetear();
}
