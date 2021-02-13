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
    private LifeBeing currentLifeBeing;
    private Action actions;
    private Toy toy;
    private Estatus estatus;


    //-------------------------------------------------->> Methods <<--------------------------------------------------

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
    public Action getActions(String sGetActions) {
        String optionAction = sGetActions.toLowerCase().trim();
        if (estatus.getCurrentAction() == Action.ALIMENTAR) {
            if (StringUtils.equals(optionAction, "caminar") ||
                    StringUtils.equals(optionAction, "andar") ||
                    StringUtils.equals(optionAction, "pasear")) {
                return Action.CAMINAR;
            } else if (StringUtils.equals(optionAction, "dormir") ||
                    StringUtils.equals(optionAction, "descansar") ||
                    StringUtils.equals(optionAction, "siesta")) {
                return Action.DORMIR;
            } else if (StringUtils.equals(optionAction, "enfermar") |
                    StringUtils.equals(optionAction, "malestar") ||
                    StringUtils.equals(optionAction, "dolor")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(optionAction, "errorusuario")) {
                return Action.ERRORUSUARIO;
            } else if (StringUtils.equals(optionAction, "jugar") |
                    StringUtils.equals(optionAction, "divertirse") ||
                    StringUtils.equals(optionAction, "entrenar")) {
                return Action.JUGAR;
            } else if (StringUtils.equals(optionAction, "morir") |
                    StringUtils.equals(optionAction, "suicidarse")) {
                return Action.MORIR;
            }

        } else if (estatus.getCurrentAction() == Action.CAMINAR) {
           if (StringUtils.equals(optionAction, "alimentar") ||
                    StringUtils.equals(optionAction, "comer") ||
                    StringUtils.equals(optionAction, "beber")) {
                return Action.ALIMENTAR;
            } else if (StringUtils.equals(optionAction, "dormir") ||
                    StringUtils.equals(optionAction, "descansar") ||
                    StringUtils.equals(optionAction, "siesta")) {
                return Action.DORMIR;
            } else if (StringUtils.equals(optionAction, "enfermar") |
                    StringUtils.equals(optionAction, "malestar") ||
                    StringUtils.equals(optionAction, "dolor")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(optionAction, "errorusuario")) {
                return Action.ERRORUSUARIO;
            } else if (StringUtils.equals(optionAction, "jugar") |
                    StringUtils.equals(optionAction, "divertirse") ||
                    StringUtils.equals(optionAction, "entrenar")) {
                return Action.JUGAR;
            } else if (StringUtils.equals(optionAction, "morir") |
                    StringUtils.equals(optionAction, "suicidarse")) {
                return Action.MORIR;
            }

        } else if (estatus.getCurrentAction() == Action.DORMIR) {
            if (StringUtils.equals(optionAction, "alimentar") ||
                    StringUtils.equals(optionAction, "comer") ||
                    StringUtils.equals(optionAction, "beber")) {
                return Action.ALIMENTAR;
            } else if (StringUtils.equals(optionAction, "caminar") ||
                    StringUtils.equals(optionAction, "descansar") ||
                    StringUtils.equals(optionAction, "siesta")) {
                return Action.DORMIR;
            } else if (StringUtils.equals(optionAction, "enfermar") |
                    StringUtils.equals(optionAction, "malestar") ||
                    StringUtils.equals(optionAction, "dolor")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(optionAction, "errorusuario")) {
                return Action.ERRORUSUARIO;
            } else if (StringUtils.equals(optionAction, "jugar") |
                    StringUtils.equals(optionAction, "divertirse") ||
                    StringUtils.equals(optionAction, "entrenar")) {
                return Action.JUGAR;
            } else if (StringUtils.equals(optionAction, "morir") |
                    StringUtils.equals(optionAction, "suicidarse")) {
                return Action.MORIR;
            }

        } else if (estatus.getCurrentAction() == Action.ENFERMAR) {
            if (StringUtils.equals(optionAction, "alimentar") ||
                    StringUtils.equals(optionAction, "comer") ||
                    StringUtils.equals(optionAction, "beber")) {
                return Action.ALIMENTAR;
            } else if (StringUtils.equals(optionAction, "caminar") ||
                    StringUtils.equals(optionAction, "descansar") ||
                    StringUtils.equals(optionAction, "siesta")) {
                return Action.DORMIR;
            } else if (StringUtils.equals(optionAction, "dormir") |
                    StringUtils.equals(optionAction, "descansar") ||
                    StringUtils.equals(optionAction, "siesta")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(optionAction, "errorusuario")) {
                return Action.ERRORUSUARIO;
            } else if (StringUtils.equals(optionAction, "jugar") |
                    StringUtils.equals(optionAction, "divertirse") ||
                    StringUtils.equals(optionAction, "entrenar")) {
                return Action.JUGAR;
            } else if (StringUtils.equals(optionAction, "morir") |
                    StringUtils.equals(optionAction, "suicidarse")) {
                return Action.MORIR;
            }

        } else if (estatus.getCurrentAction() == Action.ERRORUSUARIO) {
            if (StringUtils.equals(optionAction, "alimentar") ||
                    StringUtils.equals(optionAction, "comer") ||
                    StringUtils.equals(optionAction, "beber")) {
                return Action.ALIMENTAR;
            } else if (StringUtils.equals(optionAction, "caminar") ||
                    StringUtils.equals(optionAction, "descansar") ||
                    StringUtils.equals(optionAction, "siesta")) {
                return Action.DORMIR;
            } else if (StringUtils.equals(optionAction, "dormir") |
                    StringUtils.equals(optionAction, "descansar") ||
                    StringUtils.equals(optionAction, "siesta")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(optionAction, "enfermar") |
                    StringUtils.equals(optionAction, "malestar") ||
                    StringUtils.equals(optionAction, "dolor")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(optionAction, "jugar") |
                    StringUtils.equals(optionAction, "divertirse") ||
                    StringUtils.equals(optionAction, "entrenar")) {
                return Action.JUGAR;
            } else if (StringUtils.equals(optionAction, "morir") |
                    StringUtils.equals(optionAction, "suicidarse")) {
                return Action.MORIR;
            }

        } else if (estatus.getCurrentAction() == Action.JUGAR) {
            if (StringUtils.equals(optionAction, "alimentar") ||
                    StringUtils.equals(optionAction, "comer") ||
                    StringUtils.equals(optionAction, "beber")) {
                return Action.ALIMENTAR;
            } else if (StringUtils.equals(optionAction, "caminar") ||
                    StringUtils.equals(optionAction, "descansar") ||
                    StringUtils.equals(optionAction, "siesta")) {
                return Action.DORMIR;
            } else if (StringUtils.equals(optionAction, "dormir") |
                    StringUtils.equals(optionAction, "descansar") ||
                    StringUtils.equals(optionAction, "siesta")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(optionAction, "enfermar") |
                    StringUtils.equals(optionAction, "malestar") ||
                    StringUtils.equals(optionAction, "dolor")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(optionAction, "errorusuario")) {
                return Action.ERRORUSUARIO;
            } else if (StringUtils.equals(optionAction, "morir") |
                    StringUtils.equals(optionAction, "suicidarse")) {
                return Action.MORIR;
            }

        } else if (estatus.getCurrentAction() == Action.MORIR) {
            if (StringUtils.equals(optionAction, "alimentar") ||
                    StringUtils.equals(optionAction, "comer") ||
                    StringUtils.equals(optionAction, "beber")) {
                return Action.ALIMENTAR;
            } else if (StringUtils.equals(optionAction, "caminar") ||
                    StringUtils.equals(optionAction, "descansar") ||
                    StringUtils.equals(optionAction, "siesta")) {
                return Action.DORMIR;
            } else if (StringUtils.equals(optionAction, "dormir") |
                    StringUtils.equals(optionAction, "descansar") ||
                    StringUtils.equals(optionAction, "siesta")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(optionAction, "enfermar") |
                    StringUtils.equals(optionAction, "malestar") ||
                    StringUtils.equals(optionAction, "dolor")) {
                return Action.ENFERMAR;
            } else if (StringUtils.equals(optionAction, "jugar") |
                    StringUtils.equals(optionAction, "divertirse") ||
                    StringUtils.equals(optionAction, "entrenar")) {
                return Action.JUGAR;
            } else if (StringUtils.equals(optionAction, "errorusuario")) {
                return Action.ERRORUSUARIO;
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
    //Methods insertData
    //addUsser(User user);
    public boolean addUsser(User user) {
        if (user == null || StringUtils.isEmpty(user.getFirstNamePersona()) ||
                StringUtils.isEmpty(user.getLastNamePersona()) ||
                //StringUtils.isEmpty(cliente.getAgePersona().toString()) ||
                StringUtils.isEmpty(user.getMobilePhoneNumberPersona()) || StringUtils.isEmpty(user.getEmailPersona()) ||
                //StringUtils.isEmpty(cliente.getGeneroPersona().toString()) ||
                StringUtils.isEmpty(user.getPassword())) {
            return false;
        } else {
            ToyWars.USERS_LINKED_LIST.add(user);
            return true;
        }
    }

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

    //addEstatus(Estatus estatus)
    public boolean addEstatus(Estatus estatus) {
        if (estatus == null || StringUtils.isEmpty(estatus.getPoints().toString()) ||
                StringUtils.isEmpty(estatus.getCurrentAction().toString()) ||
                StringUtils.isEmpty(estatus.getActualPoints().toString())) {
            return false;
        } else {
            ToyWars.ESTATUS_LINKED_LIST.add(estatus);
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

    //getEstatuses();
    public List<Estatus> getEstatuses() {
        return ToyWars.ESTATUS_LINKED_LIST;
    }

}
