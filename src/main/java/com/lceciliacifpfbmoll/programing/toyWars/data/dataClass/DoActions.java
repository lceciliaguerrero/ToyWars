package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import java.util.List;

public interface DoActions {
    List<Actions> getCurrentActions();

    void alimentar(String actionsAlimento);
    void caminar(String actionsCamino);
    void dormir(String actionsDuermo);
    void enfermer(String actionsEnfermo);
    void errorUsuario(String actionsError);
    void jugar(String actionsJuego);
    void morir(String actionsMuero);
}
