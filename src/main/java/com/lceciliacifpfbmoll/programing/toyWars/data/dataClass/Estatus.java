package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import org.apache.commons.lang3.StringUtils;

public class Estatus {
    //Atributos privados no estaticos:
    private Integer points;
    private Action currentAction;
    private Integer actualPoints;

    //principio puntos y puntos actuales.


    //Constructores (alt+insertar)
    /*public Estatus(Integer points, Action currentAction, Integer actualPoints) {
        this.points = points;
        this.currentAction = currentAction;
        this.actualPoints = actualPoints;
    }*/

    public Estatus() {
    }

    //Geters y Seters (alt+insertar)
    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

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
    public Estatus(String points, String currentAction, String actualPoints) {
        this.setPoints(Integer.parseInt(points.toLowerCase().trim()));
        String optionAction = currentAction.toLowerCase().trim();
        try {
            if (StringUtils.equals(optionAction, "alimentar") ||
                    StringUtils.equals(optionAction, "comer") ||
                    StringUtils.equals(optionAction, "beber")) {
                this.setCurrentAction(Action.ALIMENTAR);
            } else if (StringUtils.equals(optionAction, "caminar") ||
                    StringUtils.equals(optionAction, "andar") ||
                    StringUtils.equals(optionAction, "pasear")) {
                this.setCurrentAction(Action.CAMINAR);
            } else if (StringUtils.equals(optionAction, "dormir") ||
                    StringUtils.equals(optionAction, "descansar") ||
                    StringUtils.equals(optionAction, "siesta")) {
                this.setCurrentAction(Action.DORMIR);
            } else if (StringUtils.equals(optionAction, "enfermar") |
                    StringUtils.equals(optionAction, "malestar") ||
                    StringUtils.equals(optionAction, "dolor")) {
                this.setCurrentAction(Action.ENFERMAR);
            } else if (StringUtils.equals(optionAction, "errorusuario")) {
                this.setCurrentAction(Action.ERRORUSUARIO);
            } else if (StringUtils.equals(optionAction, "jugar") |
                    StringUtils.equals(optionAction, "divertirse") ||
                    StringUtils.equals(optionAction, "entrenar")) {
                this.setCurrentAction(Action.JUGAR);
            } else if (StringUtils.equals(optionAction, "morir") |
                    StringUtils.equals(optionAction, "suicidarse")) {
                this.setCurrentAction(Action.MORIR);
            }
        } catch (Exception firstExceptionInsertDataEstatus) {
            System.out.println(firstExceptionInsertDataEstatus.getMessage());
        }
        this.setActualPoints(Integer.parseInt(actualPoints));
    }
}
