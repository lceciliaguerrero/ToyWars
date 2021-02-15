package com.lceciliacifpfbmoll.programing.toyWars.service;

import com.lceciliacifpfbmoll.programing.toyWars.ToyWars;
import com.lceciliacifpfbmoll.programing.toyWars.data.abstractClass.LifeBeing;
import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    //Atributos privados estaticos:
    private List<UserAction> userAction;
    private Integer maxPoints;
    private LifeBeing currentLifeBeing;
    private Action actions;
    private Toy toy;
    private Estatus estatus;

    //Geters y Seters (alt+insertar)
    public List<UserAction> getUserAction() {
        return userAction;
    }

    public void setUserAction(List<UserAction> userAction) {
        this.userAction = userAction;
    }

    public Integer getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(Integer maxPoints) {
        this.maxPoints = maxPoints;
    }

    public LifeBeing getCurrentLifeBeing() {
        return currentLifeBeing;
    }

    public void setCurrentLifeBeing(LifeBeing currentLifeBeing) {
        this.currentLifeBeing = currentLifeBeing;
    }

    public void setActions(Action actions) {
        this.actions = actions;
    }

    public Toy getToy() {
        return toy;
    }

    public Estatus getEstatus() {
        return estatus;
    }

    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }

    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //Methods insertData
    //setUser(User user);
    public boolean setUser(User user) {
        if (user == null || StringUtils.isEmpty(user.getFirstNamePersona()) ||
                StringUtils.isEmpty(user.getLastNamePersona()) ||
                //StringUtils.isEmpty(cliente.getAgePersona().toString()) ||
                StringUtils.isEmpty(user.getMobilePhoneNumberPersona()) ||
                StringUtils.isEmpty(user.getEmailPersona()) ||
                //StringUtils.isEmpty(cliente.getGeneroPersona().toString()) ||
                StringUtils.isEmpty(user.getKeyUser())) {
            return false;
        } else {
            ToyWars.USERS_LINKED_LIST.add(user);
            return true;
        }
    }

    //setToy(Toy toy);
    public boolean setToy(Toy toy) {
        if (toy == null || StringUtils.isEmpty(toy.getGender().toString()) ||
                StringUtils.isEmpty(toy.getName()) ||
                StringUtils.isEmpty(toy.getToysType().toString()) ||
        StringUtils.isEmpty(toy.getAction().toString())) {
            return false;
        } else {
            ToyWars.TOYS_LINKED_LIST.add(toy);
            return true;
        }
    }


    //Methods pintData
    //getUsers()
    public List<User> getUsers() {
        return ToyWars.USERS_LINKED_LIST;
    }

    //getToys();
    public List<Toy> getToys() {
        return ToyWars.TOYS_LINKED_LIST;
    }

    //getUserActions();
    public List<UserAction> getUserActions() {
        return ToyWars.USER_ACTIONS_LINKED_LIST;
    }

    //getUserActionsVoid();
    public void getUserActionsVoid() {
        for (UserAction userAction : ToyWars.USER_ACTIONS_LINKED_LIST) {
            userAction.printUserActionConsole();
        }
    }


    //getEstatuses();
    public List<Estatus> getEstatuses() {
        return ToyWars.ESTATUS_LINKED_LIST;
    }

    //resetLifeBeing();
    public LifeBeing resetLifeBeing() {
        return null;
    }

    //render();
    public LifeBeing render() {
        return currentLifeBeing;
    }

    //getStatus();
    public LifeBeing getStatus() {
        return null;
    }

    //getActions();
    /*public Action getActions(String optionNewAction) {
        String sOptionNewAction = optionNewAction.toLowerCase().trim();
        Action optionAction = estatus.getCurrentAction();


        if (optionAction == Action.ALIMENTAR) {
            //Action.ALIMENTAR
            if (sOptionNewAction.equals("caminar") ||
                    StringUtils.equals(sOptionNewAction, "andar") ||
                    StringUtils.equals(sOptionNewAction, "pasear")) {
                return Action.CAMINAR;
            } else if (StringUtils.equals(sOptionNewAction, "dormir") ||
                    StringUtils.equals(sOptionNewAction, "descansar") ||
                    StringUtils.equals(sOptionNewAction, "siesta")) {
                return Action.DORMIR;
            } else if (StringUtils.equals(sOptionNewAction, "enfermar") |
                    StringUtils.equals(sOptionNewAction, "malestar") ||
                    StringUtils.equals(sOptionNewAction, "dolor")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(sOptionNewAction, "jugar") |
                    StringUtils.equals(sOptionNewAction, "divertirse") ||
                    StringUtils.equals(sOptionNewAction, "entrenar")) {
                return Action.JUGAR;
            } else if (StringUtils.equals(sOptionNewAction, "morir") |
                    StringUtils.equals(sOptionNewAction, "suicidarse")) {
                return Action.MORIR;
            }

        } else if (optionAction == Action.CAMINAR) {
            //Action.CAMINAR
            if (StringUtils.equals(sOptionNewAction, "alimentar") ||
                    StringUtils.equals(sOptionNewAction, "comer") ||
                    StringUtils.equals(sOptionNewAction, "beber")) {
                return Action.ALIMENTAR;
            } else if (StringUtils.equals(sOptionNewAction, "dormir") ||
                    StringUtils.equals(sOptionNewAction, "descansar") ||
                    StringUtils.equals(sOptionNewAction, "siesta")) {
                return Action.DORMIR;
            } else if (StringUtils.equals(sOptionNewAction, "enfermar") |
                    StringUtils.equals(sOptionNewAction, "malestar") ||
                    StringUtils.equals(sOptionNewAction, "dolor")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(sOptionNewAction, "jugar") |
                    StringUtils.equals(sOptionNewAction, "divertirse") ||
                    StringUtils.equals(sOptionNewAction, "entrenar")) {
                return Action.JUGAR;
            } else if (StringUtils.equals(sOptionNewAction, "morir") |
                    StringUtils.equals(sOptionNewAction, "suicidarse")) {
                return Action.MORIR;
            }

        } else if (optionAction == Action.DORMIR) {
            //Action.DORMIR
            if (StringUtils.equals(sOptionNewAction, "alimentar") ||
                    StringUtils.equals(sOptionNewAction, "comer") ||
                    StringUtils.equals(sOptionNewAction, "beber")) {
                return Action.ALIMENTAR;
            } else if (StringUtils.equals(sOptionNewAction, "caminar") ||
                    StringUtils.equals(sOptionNewAction, "descansar") ||
                    StringUtils.equals(sOptionNewAction, "siesta")) {
                return Action.DORMIR;
            } else if (StringUtils.equals(sOptionNewAction, "enfermar") |
                    StringUtils.equals(sOptionNewAction, "malestar") ||
                    StringUtils.equals(sOptionNewAction, "dolor")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(sOptionNewAction, "jugar") |
                    StringUtils.equals(sOptionNewAction, "divertirse") ||
                    StringUtils.equals(sOptionNewAction, "entrenar")) {
                return Action.JUGAR;
            } else if (StringUtils.equals(sOptionNewAction, "morir") |
                    StringUtils.equals(sOptionNewAction, "suicidarse")) {
                return Action.MORIR;
            }

        } else if (optionAction == Action.ENFERMAR) {
            //Action.ENFERMAR
            if (StringUtils.equals(sOptionNewAction, "alimentar") ||
                    StringUtils.equals(sOptionNewAction, "comer") ||
                    StringUtils.equals(sOptionNewAction, "beber")) {
                return Action.ALIMENTAR;
            } else if (StringUtils.equals(sOptionNewAction, "caminar") ||
                    StringUtils.equals(sOptionNewAction, "descansar") ||
                    StringUtils.equals(sOptionNewAction, "siesta")) {
                return Action.DORMIR;
            } else if (StringUtils.equals(sOptionNewAction, "dormir") |
                    StringUtils.equals(sOptionNewAction, "descansar") ||
                    StringUtils.equals(sOptionNewAction, "siesta")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(sOptionNewAction, "jugar") |
                    StringUtils.equals(sOptionNewAction, "divertirse") ||
                    StringUtils.equals(sOptionNewAction, "entrenar")) {
                return Action.JUGAR;
            } else if (StringUtils.equals(sOptionNewAction, "morir") |
                    StringUtils.equals(sOptionNewAction, "suicidarse")) {
                return Action.MORIR;
            }

        } else if (optionAction == Action.JUGAR) {
            //Action.JUGAR
            if (StringUtils.equals(sOptionNewAction, "alimentar") ||
                    StringUtils.equals(sOptionNewAction, "comer") ||
                    StringUtils.equals(sOptionNewAction, "beber")) {
                return Action.ALIMENTAR;
            } else if (StringUtils.equals(sOptionNewAction, "caminar") ||
                    StringUtils.equals(sOptionNewAction, "descansar") ||
                    StringUtils.equals(sOptionNewAction, "siesta")) {
                return Action.DORMIR;
            } else if (StringUtils.equals(sOptionNewAction, "dormir") |
                    StringUtils.equals(sOptionNewAction, "descansar") ||
                    StringUtils.equals(sOptionNewAction, "siesta")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(sOptionNewAction, "enfermar") |
                    StringUtils.equals(sOptionNewAction, "malestar") ||
                    StringUtils.equals(sOptionNewAction, "dolor")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(sOptionNewAction, "morir") |
                    StringUtils.equals(sOptionNewAction, "suicidarse")) {
                return Action.MORIR;
            }

        } else if (optionAction == Action.MORIR) {
            //Action.MORIR
            if (StringUtils.equals(sOptionNewAction, "alimentar") ||
                    StringUtils.equals(sOptionNewAction, "comer") ||
                    StringUtils.equals(sOptionNewAction, "beber")) {
                return Action.ALIMENTAR;
            } else if (StringUtils.equals(sOptionNewAction, "caminar") ||
                    StringUtils.equals(sOptionNewAction, "descansar") ||
                    StringUtils.equals(sOptionNewAction, "siesta")) {
                return Action.DORMIR;
            } else if (StringUtils.equals(sOptionNewAction, "dormir") |
                    StringUtils.equals(sOptionNewAction, "descansar") ||
                    StringUtils.equals(sOptionNewAction, "siesta")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(sOptionNewAction, "enfermar") |
                    StringUtils.equals(sOptionNewAction, "malestar") ||
                    StringUtils.equals(sOptionNewAction, "dolor")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(sOptionNewAction, "jugar") |
                    StringUtils.equals(sOptionNewAction, "divertirse") ||
                    StringUtils.equals(sOptionNewAction, "entrenar")) {
                return Action.JUGAR;
            }
        }
        return null;
    }

    //doAction(Action action);
    public void doAction(Action action) {
        /*for (Estatus estatus : ToyWars.ESTATUS_LINKED_LIST) {
            if (Enum.valueOf(Action.class, estatus.getCurrentAction().toString())) {

            }
        }*/
        switch (action) {
            case ALIMENTAR:
                System.out.println("¿que quieres comer?: ");
                String optionAlimentar = ToyWars.consoleUtils.getLectorNextLineLowerCase();
                currentLifeBeing.alimentar(optionAlimentar);
                break;
            case CAMINAR:
                System.out.println("¿cuantas horas quieres caminar?: ");
                Integer optionCaminar = Integer.parseInt(ToyWars.consoleUtils.getLectorNextLineLowerCase());
                currentLifeBeing.caminar(optionCaminar);
                break;
            case DORMIR:
                System.out.println("¿cuantas horas quieres dormir?: ");
                Integer optionDormir = Integer.parseInt(ToyWars.consoleUtils.getLectorNextLineLowerCase());
                currentLifeBeing.dormir(optionDormir);
                break;
            case ENFERMAR:
                System.out.println("¿qué enfermedad tienes?: ");
                String optionEnfermar = ToyWars.consoleUtils.getLectorNextLineLowerCase();
                currentLifeBeing.enfermar(optionEnfermar);
                break;
            case JUGAR:
                System.out.println("¿qué quieres jugar?: ");
                String optionJugar = ToyWars.consoleUtils.getLectorNextLineLowerCase();
                currentLifeBeing.jugar(optionJugar);
                break;
            case MORIR:
                currentLifeBeing.morir();
                break;
            case RESETEAR:
                currentLifeBeing.resetear();
            default:
                break;

        }
        Estatus firstEstatus = new Estatus();
        toy.setEstatus(firstEstatus);


        //hace una acción
        //crear nuevo estatus con sus atributos
        //setear el currentLifeBeing con ese status
        //crear new UserAction
        //agrego a la lista de userActions ese userAction que he creado.

    }


    //-------------------------------------------------->> Methods <<--------------------------------------------------


}
