package com.lceciliacifpfbmoll.programing.toyWars.service;

import com.lceciliacifpfbmoll.programing.toyWars.ToyWars;
import com.lceciliacifpfbmoll.programing.toyWars.data.abstractClass.LifeBeing;
import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.*;
import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.Action;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GameService {
    //Atributos privados estaticos:
    private List<UserAction> userAction;
    private Integer maxPoints;
    private LifeBeing currentLifeBeing;
    private Action action;
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

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public Estatus getEstatus() {
        return estatus;
    }

    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }


    //-----------------------------------------------------------------------------------------------------------------
    //----------------------------------------->> Methods package dataClass <<-----------------------------------------
    //-----------------------------------------------------------------------------------------------------------------
    //Methods insertData
    //setUserRest(User user);
    public boolean setUserRest(User user) {
        /*if (user == null || StringUtils.isEmpty(user.getFirstNamePersona()) ||
                StringUtils.isEmpty(user.getLastNamePersona()) ||
                StringUtils.isEmpty(user.getAgePersona().toString()) ||
                StringUtils.isEmpty(user.getMobilePhoneNumberPersona()) ||
                StringUtils.isEmpty(user.getEmailPersona()) ||
                StringUtils.isEmpty(user.getGeneroPersona().toString()) ||
                StringUtils.isEmpty(user.getKeyUser())) {
            return false;
        } else {
            ToyWars.USERS_LINKED_LIST.add(user);
            return true;
        }*/
        /**/
        AtomicLong count = new AtomicLong(0);
        Long id = count.incrementAndGet();
        User sUser = new User(id, user.getFirstNamePersona(), user.getLastNamePersona(), user.getAgePersona(),
                user.getMobilePhoneNumberPersona(), user.getEmailPersona(), user.getGeneroPersona(), user.getKeyUser(), user.getToy());
        //String number = "6472428223";
        /*User firtsUser = new User(user.getToy());
        ToyWars.USERS_LINKED_LIST.add(user);
        User sUser = new User(id, user.getFirstNamePersona(), user.getLastNamePersona(), user.getAgePersona(),
                user.getMobilePhoneNumberPersona(), user.getEmailPersona(), user.getGeneroPersona(), user.getKeyUser());
        ToyWars.USERS_LINKED_LIST.add(user);/**/
        return true;
        /*if (!(user == null || (user.getToy() == null || user.getToy().equals( "")))) {
            User user1 = new User(user.getToy());
            ToyWars.USERS_LINKED_LIST.add(user);
            return true;
        } else if (!(user == null || StringUtils.isEmpty(user.getFirstNamePersona()) ||
                StringUtils.isEmpty(user.getLastNamePersona()) ||
                StringUtils.isEmpty(user.getAgePersona().toString()) ||
                StringUtils.isEmpty(user.getMobilePhoneNumberPersona()) ||
                StringUtils.isEmpty(user.getEmailPersona()) ||
                StringUtils.isEmpty(user.getGeneroPersona().toString()) ||
                StringUtils.isEmpty(user.getKeyUser()))) {
            User firtsUser = new User(id, user.getFirstNamePersona(), user.getLastNamePersona(), user.getAgePersona(),
                    user.getMobilePhoneNumberPersona(), user.getEmailPersona(), user.getGeneroPersona(), user.getKeyUser());
            ToyWars.USERS_LINKED_LIST.add(user);
            return true;
        } else {
            return false;
        }*/

    }

    //setToyRest(Toy toy);
    public boolean setToyRest(Toy toy) {
        //Todo Revisar quiero que si StringUtils.isEmpty(toy.getAction().toString())
        // esta mal directamente 'return false;' pero también si... (no se explicar con
        // palabras) mirar RestToyWarsAplication y Toy
        /*if (toy == null ||
                StringUtils.isEmpty(toy.getGender().toString()) ||
                StringUtils.isEmpty(toy.getName()) ||
                StringUtils.isEmpty(toy.getToysType().toString()) ||
                StringUtils.isEmpty(toy.getAction().toString())) {
            return false;
        } else {
            ToyWars.TOYS_LINKED_LIST.add(toy);
            return true;
        }*/
        AtomicLong count = new AtomicLong(0);
        Long id = count.incrementAndGet();
        /*Toy toy1 = new Toy(toy.getName(), toy.getGender().toString(), toy.getToysType().toString());*/
        Toy firstToy = new Toy(toy.getEstatus(), id, toy.getName(), toy.getGender(), toy.getAction(), toy.getToysType(), toy.getActualPoints());
        ToyWars.TOYS_LINKED_LIST.add(toy);
        return true;
    }

    public boolean setToyActionRest(Toy toy) {
        //Todo Revisar quiero que si StringUtils.isEmpty(toy.getAction().toString())
        // esta mal directamente 'return false;' pero también si... (no se explicar con
        // palabras) mirar RestToyWarsAplication y Toy
        /*if (toy == null ||
                StringUtils.isEmpty(toy.getGender().toString()) ||
                StringUtils.isEmpty(toy.getName()) ||
                StringUtils.isEmpty(toy.getToysType().toString()) ||
                StringUtils.isEmpty(toy.getAction().toString())) {
            return false;
        } else {
            ToyWars.TOYS_LINKED_LIST.add(toy);
            return true;
        }*/

        AtomicLong count = new AtomicLong(0);
        Long id = count.incrementAndGet();
        /*Toy toy1 = new Toy(toy.getName(), toy.getGender().toString(), toy.getToysType().toString());*/
        Toy firstToy = new Toy(toy.getEstatus(), id, toy.getName(), toy.getGender(), toy.getAction(), toy.getToysType(), toy.getActualPoints());
        ToyWars.TOYS_LINKED_LIST.add(toy);
        return true;
    }


    //Methods pintData
    //getUsersRest()
    public List<User> getUsersRest() {
        return ToyWars.USERS_LINKED_LIST;
    }

    //getToysRest();
    public List<Toy> getToysRest() {
        return ToyWars.TOYS_LINKED_LIST;
    }

    //getUserActionsRest();
    //KEVIN
    public List<UserAction> getUserActionsRest() {
        return ToyWars.USER_ACTIONS_LINKED_LIST;
    }

    //getEstatusesRest();
    public List<Estatus> getEstatusesRest() {
        return ToyWars.ESTATUS_LINKED_LIST;
    }


    //-----------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------
    //getUserActions();
    /*public void getUserActions() {
        for (UserAction userAction : ToyWars.USER_ACTIONS_LINKED_LIST) {
            userAction.printUserActionConsole();
        }
    }*/

    //resetLifeBeing();
    public void resetLifeBeing() {
        LifeBeing lifeBeing = new Toy();
        lifeBeing.setIdentification(null);
        lifeBeing.setName(null);
        lifeBeing.setGender(null);
    }/**/

    //render();
    /**/public LifeBeing render() {
        return currentLifeBeing;
    }

    //getStatus();
    public Estatus getStatus() {
        //*return toy.getEstatus();*/
        return currentLifeBeing.getEstatus();
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
    }*/

    /*public Action[] getActions() {
        return Action.values();
    }*/




    /*
    public ArrayList<Action> getActions() {
        ACTIONS_ARRAY_LIST[] actions = Action.values();
        ArrayList<String> stringAction = new ArrayList<>();
        for (ACTIONS_ARRAY_LIST actions) {
            stringAction.add(day.toString());
        }
        return stringAction;


    public ArrayList<String> enumIteration() {
        Days[] days = Days.values();
        ArrayList<String> stringDay = new ArrayList<String>();
        for (Days day : days) {
            stringDay.add(day.toString());
        }
        return stringDay;


    public List<Action> getActions(Action action) {
        if (action == Action.ALIMENTAR) {

            return ToyWars.ACTIONS_ARRAY_LIST - Action.ALIMENTAR;
        }
    }
    }
    }*/

    //doAction(Action action);
    /**/
    public void doAction(Action action) {
        /*for (Estatus estatus : ToyWars.ESTATUS_LINKED_LIST) {
            if (Enum.valueOf(Action.class, estatus.getCurrentAction().toString())) {

            }
        }*/
        //switch ALIMENTAR, CAMINAR, DORMIR, ENFERMAR, ERRORUSUARIO, JUGAR, MORIR, RESETEAR;/**/
        try {
            switch (action) {
                case ALIMENTAR:
                    System.out.println("¿que quieres comer?: ");
                    String optionAlimentar = ToyWars.consoleUtils.getLectorNextLineLowerCase();
                    //currentLifeBeing.alimentar(optionAlimentar);
                    //toy.alimentar(optionAlimentar);
                    getToy().alimentar(optionAlimentar);
                    break;

                case CAMINAR:
                    System.out.println("¿cuantas horas quieres caminar?: ");
                    Integer optionCaminar = Integer.parseInt(ToyWars.consoleUtils.getLectorNextLineLowerCase());
                    //currentLifeBeing.caminar(optionCaminar);
                    //toy.caminar(optionCaminar);
                    getToy().caminar(optionCaminar);
                    break;

                case DORMIR:
                    System.out.println("¿cuantas horas quieres dormir?: ");
                    Integer optionDormir = Integer.parseInt(ToyWars.consoleUtils.getLectorNextLineLowerCase());
                    //currentLifeBeing.dormir(optionDormir);
                    //toy.dormir(optionDormir);
                    getToy().dormir(optionDormir);
                    break;

                case ENFERMAR:
                    System.out.println("¿qué enfermedad tienes?: ");
                    String optionEnfermar = ToyWars.consoleUtils.getLectorNextLineLowerCase();
                    //currentLifeBeing.enfermar(optionEnfermar);
                    //toy.enfermar(optionEnfermar);
                    getToy().enfermar(optionEnfermar);
                    break;

                case JUGAR:
                    System.out.println("¿qué quieres jugar?: ");
                    String optionJugar = ToyWars.consoleUtils.getLectorNextLineLowerCase();
                    //currentLifeBeing.jugar(optionJugar);
                    //toy.jugar(optionJugar);
                    getToy().jugar(optionJugar);
                    break;

                case MORIR:
                    //currentLifeBeing.morir();
                    //toy.morir();
                    getToy().morir();
                    break;

                case RESETEAR:
                    //currentLifeBeing.resetear();
                    //toy.resetear();
                    getToy().resetear();
                    break;

                default:
                    System.out.println("La opción indicada no es correcta, por favor, indica otra.");
                    System.out.println("'ALIMENTAR', 'CAMINAR', 'DORMIR', 'ENFERMAR', 'JUGAR', 'MORIR' o 'RESETEAR'");
                    //Action.ERRORUSUARIO.values();
                    action.values();
                    break;

            }


        } catch (Exception firstExceptionGameServiceDoAction) {
            System.out.println(firstExceptionGameServiceDoAction.getMessage());
            //currentLifeBeing.errorUsuario();
            //toy.errorUsuario();
            getToy().errorUsuario();
        }

        Estatus firstEstatus = new Estatus();
        //toy.setEstatus(firstEstatus);
        getToy().setEstatus(firstEstatus);


        //hace una acción
        //crear nuevo estatus con sus atributos
        //setear el currentLifeBeing con ese status
        //crear new UserAction
        //agrego a la lista de userActions ese userAction que he creado.

    }
}
