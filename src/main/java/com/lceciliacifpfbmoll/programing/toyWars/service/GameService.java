package com.lceciliacifpfbmoll.programing.toyWars.service;

import com.lceciliacifpfbmoll.programing.toyWars.ToyWars;
import com.lceciliacifpfbmoll.programing.toyWars.data.abstractClass.LifeBeing;
import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    //Atributos privados no estaticos:
    private List<UserAction> userActions;
    private Integer maxPoints;
    private Estatus currentLifeBeing;


    //Constructores: (alt+insertar)
    public GameService() {
    }

    //Geters y Seters (alt+insertar)
    public List<UserAction> getUserActions() {
        return userActions;
    }

    public void setUserActions(List<UserAction> userActions) {
        this.userActions = userActions;
    }

    public Integer getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(Integer maxPoints) {
        this.maxPoints = maxPoints;
    }

    public Estatus getCurrentLifeBeing() {
        return currentLifeBeing;
    }

    public void setCurrentLifeBeing(Estatus currentLifeBeing) {
        this.currentLifeBeing = currentLifeBeing;
    }


    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //doAction(Actions actions);
    public Actions doAction(Actions actions) {
        return null;
    }

    //resetLifeBeing();
    public LifeBeing resetLifeBeing() {
        return null;
    }

    //render();
    public LifeBeing render() {
        return null;
    }

    //getStatus();
    public LifeBeing getStatus() {
        return null;
    }

    //getActions(String option);
    public Actions getActions(String option) {
        String optionActions = option.toLowerCase().trim();
        if (StringUtils.equals(optionActions, "alimentar")) {
            return Actions.ALIMENTAR;
        } else if (StringUtils.equals(optionActions, "caminar")) {
            return Actions.DORMIR;
        } else if (StringUtils.equals(optionActions, "dormir")) {
            return Actions.CAMINAR;
        } else if (StringUtils.equals(optionActions, "enfermar")) {
            return Actions.ENFERMAR;
        } else if (StringUtils.equals(optionActions, "jugar")) {
            return Actions.JUGAR;
        } else if (StringUtils.equals(optionActions, "morir")) {
            return Actions.MORIR;
        } else {
            return Actions.ERRORUSUARIO;
        }
    }


    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //Methods insertData
    //addToy(Toy toy);
    public boolean addToy(Toy toy) {
        if (toy == null || StringUtils.isEmpty(toy.getGender().toString()) ||
                StringUtils.isEmpty(toy.getName())) {
            return false;
        } else {
            ToyWars.TOYS_LINKED_LIST.add(toy);
            return true;
        }
    }

    //addUsser(User user);
    public boolean addUsser(User user) {
        if (user == null || StringUtils.isEmpty(user.getEmailUser()) ||
                StringUtils.isEmpty(user.getPassword())) {
            return false;
        } else {
            ToyWars.USERS_LINKED_LIST.add(user);
            return true;
        }
    }

    //addUserAction(UserAction userAction);
    public boolean addUserAction(UserAction userAction) {
        if (userAction == null || StringUtils.isEmpty(userAction.getTypeToy()) ||
                StringUtils.isEmpty(userAction.getPointsObtained().toString())) {
            return false;
        } else {
            ToyWars.USER_ACTIONS_LINKED_LIST.add(userAction);
            return true;
        }
    }


}
