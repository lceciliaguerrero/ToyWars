package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;


import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.Action;

public class Estatus {
    //Atributos privados estaticos
    private static Toy toy;

    //Atributos privados no estaticos
    private Action currentAction;
    private Integer actualPoints;

    //principio puntos y puntos actuales.


    //Constructores (alt+insertar)
    /*public Estatus(Integer points, Action currentAction, Integer actualPoints) {
        this.points = points;
        this.currentAction = currentAction;
        this.actualPoints = actualPoints;
    }*/

    //Geters y Seters (alt+insertar)
    public Action getCurrentAction() {
        return currentAction;
    }

    public void setCurrentAction(Action currentAction) {
        this.currentAction = currentAction;
    }

    public Integer getActualPoints() {
        return actualPoints;
    }

    public void setActualPoints(Integer actualPoints) {
        this.actualPoints = actualPoints;
    }

    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //Methods insertData
    public Estatus() {
        this.setCurrentAction(toy.getAction());
    }


}
