package com.lceciliacifpfbmoll.programing.toyWars.service;

import com.lceciliacifpfbmoll.programing.toyWars.data.abstractClass.LifeBeing;
import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.Actions;
import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.Estatus;
import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.UserAction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    private List<UserAction> userActions;
    private Integer maxPoints;
    private Estatus currentLifeBeing;

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



    public Actions doAction(Actions actions) {

    }

    public LifeBeing resetLifeBeing() {

    }


    public LifeBeing render() {

    }

    public LifeBeing getStatus() {

    }

    public Actions getActions() {

    }

    public List<Actions> getUserActions() {

    }



}
