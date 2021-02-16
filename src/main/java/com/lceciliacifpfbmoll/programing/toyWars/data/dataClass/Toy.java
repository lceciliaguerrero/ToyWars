package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import com.lceciliacifpfbmoll.programing.toyWars.ToyWars;
import com.lceciliacifpfbmoll.programing.toyWars.data.abstractClass.LifeBeing;
import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.Action;
import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.Gender;
import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.RenderType;
import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.ToysType;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


public class Toy extends LifeBeing {
    //Atributos privados estaticos final:
    private static final AtomicLong count = new AtomicLong(0);

    //Atributos no privados estaticos:
    private Action action;
    private Estatus estatus;
    private ToysType toysType;
    private Integer actualPoints;

    //Constructores: (alt+insertar)
    /*public Toy(Estatus estatus, Long identification, String name, Gender gender, Action action, Estatus estatus1, ToysType toysType, Integer actualPoints) {
        super(estatus, identification, name, gender);
        this.action = action;
        this.estatus = estatus1;
        this.toysType = toysType;
        this.actualPoints = actualPoints;
    }*/

    public Toy() {
    }

    //Geters y Seters (alt+insertar)
    public static AtomicLong getCount() {
        return count;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Estatus getEstatus() {
        return estatus;
    }

    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }

    public ToysType getToysType() {
        return toysType;
    }

    public void setToysType(ToysType toysType) {
        this.toysType = toysType;
    }
    public Integer getActualPoints() {
        return actualPoints;
    }

    public void setActualPoints(Integer actualPoints) {
        this.actualPoints = actualPoints;
    }


    //-----------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------
    //Methods insertData
    public Toy(String name, String gender, String toysType) {
        ///count
        this.setIdentification(count.incrementAndGet());

        //String name
        this.setName(name.toLowerCase().trim());

        //String gender
        String optionGenderInsertDataToy = gender.toLowerCase().trim();
        try {
            if (StringUtils.equals(optionGenderInsertDataToy, "femenino") ||
                    StringUtils.equals(optionGenderInsertDataToy, "mujer")) {
                this.setGender(Gender.FEMENINO);
            } else if (StringUtils.equals(optionGenderInsertDataToy, "masculino") ||
                    StringUtils.equals(optionGenderInsertDataToy, "hombre")) {
                this.setGender(Gender.MASCULINO);
            } else if (StringUtils.equals(optionGenderInsertDataToy, "ninguno")) {
                //todo si elije esta opción, hasta que no llegue a cierto nivel no
                // sabrá el genero del jugete, en este caso, del Toy.
                this.setGender(Gender.NINGUNO);
            }
        } catch (Exception firstExceptionInsertDataToy) {
            System.out.println(firstExceptionInsertDataToy.getMessage());
        }

        //String toysType
        String optionToysType = toysType.toLowerCase().trim();
        try {
            if (StringUtils.equals(optionToysType, "tamagotchi")) {
                this.setToysType(ToysType.TAMAGOTCHI);
            } else if (StringUtils.equals(optionToysType, "pokemon")) {
                this.setToysType(ToysType.POKEMON);
            } else if (StringUtils.equals(optionToysType, "gi joe") ||
                    StringUtils.equals(optionToysType, "g.i. joe") ||
                    StringUtils.equals(optionToysType, "gijoe")) {
                this.setToysType(ToysType.GIJOE);
            } else {
                this.setToysType(ToysType.TOYS_TYPE_ERROR);
            }
        } catch (Exception secondExceptionInsertDataToy) {
            System.out.println(secondExceptionInsertDataToy.getMessage());
        }

        //ToyWars.beginningPoints
        //this.setEstatus(estatus.setActualPoints(ToyWars.beginningPoints));
        this.setActualPoints(ToyWars.beginningPoints);


        //this.setEstatus(estatus.setCurrentAction(getAction()));
        this.estatus.setCurrentAction(getAction());
    }

    public Toy(String actions) {
        //String actions
        String optionAction = actions.toLowerCase().trim();
        try {
            if (StringUtils.equals(optionAction, "alimentar") ||
                    StringUtils.equals(optionAction, "comer") ||
                    StringUtils.equals(optionAction, "beber")) {
                this.setAction(Action.ALIMENTAR);
            } else if (StringUtils.equals(optionAction, "caminar") ||
                    StringUtils.equals(optionAction, "andar") ||
                    StringUtils.equals(optionAction, "pasear")) {
                this.setAction(Action.CAMINAR);
            } else if (StringUtils.equals(optionAction, "dormir") ||
                    StringUtils.equals(optionAction, "descansar") ||
                    StringUtils.equals(optionAction, "siesta")) {
                this.setAction(Action.DORMIR);
            } else if (StringUtils.equals(optionAction, "enfermar") |
                    StringUtils.equals(optionAction, "malestar") ||
                    StringUtils.equals(optionAction, "dolor")) {
                this.setAction(Action.ENFERMAR);
            } else if (StringUtils.equals(optionAction, "jugar") |
                    StringUtils.equals(optionAction, "divertirse") ||
                    StringUtils.equals(optionAction, "entrenar")) {
                this.setAction(Action.JUGAR);
            } else if (StringUtils.equals(optionAction, "morir") |
                    StringUtils.equals(optionAction, "suicidarse")) {
                this.setAction(Action.MORIR);
            } else {
                this.setAction(Action.ERRORUSUARIO);
            }
        } catch (Exception firstExceptionInsertDataEstatus) {
            System.out.println(firstExceptionInsertDataEstatus.getMessage());
        }

    }

    //Methods printData
    @Override
    public void printTConsoleLifeBeing() {
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("Impresión del Toy " + this.getIdentification() + ".");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("Su nomre es: " + this.getName() + ".");
        System.out.println("Su género es: " + this.getGender().toString() + ".");
        System.out.println("Su acion es: " + this.getAction().toString() + ".");
        System.out.println("Sus puntos actuales son: " + this.getActualPoints() + ".");
        System.out.println("Su acción es: " + this.getEstatus().getCurrentAction() + ".");
        System.out.println("");
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("");
    }


    //-----------------------------------------------------------------------------------------------------------------
    //---------------------------------------->> Methods interface DoActions <<----------------------------------------
    //-----------------------------------------------------------------------------------------------------------------
    //DoActions
    //getCurrentActions();
    @Override
    public List<Action> getCurrentActions() {
        return ToyWars.ACTIONS_ARRAY_LIST;
    }

    //enum Action
    //alimentar();
    @Override
    public void alimentar(String actionsAlimento) {

    }

    //caminar();
    @Override
    public void caminar(Integer iCaminar) {
        if (iCaminar == 0) {
            this.setActualPoints(ToyWars.beginningPoints); //no aumenta la vida
        } else if (iCaminar > 0 & iCaminar <= 1) {
            this.setActualPoints(ToyWars.beginningPoints + 10); //aumenta la vida + 10
        } else if (iCaminar > 1 & iCaminar <= 2) {
            this.setActualPoints(ToyWars.beginningPoints + 20); //aumenta la vida + 20
        } else if (iCaminar > 2 & iCaminar <= 3) {
            this.setActualPoints(ToyWars.beginningPoints + 35); //aumenta la vida + 35
        } else if (iCaminar > 3 & iCaminar <= 4) {
            this.setActualPoints(ToyWars.beginningPoints + 50); //aumenta la vida + 35
        }
    }

    //dormir();
    @Override
    public void dormir(Integer iDormir) {
        if (iDormir >= 6 & iDormir <= 8) {
            this.setActualPoints(ToyWars.beginningPoints + 25); //aumenta la vida + 25
        } else if (iDormir > 8 & iDormir <= 10) {
            this.setActualPoints(ToyWars.beginningPoints + 15); //aumenta la vida + 15
        } else if (iDormir > 10 & iDormir <= 12) {
            this.setActualPoints(ToyWars.beginningPoints - 35); //disminuye la vida - 15
        }
    }

    //enfermar();
    @Override
    public void enfermar(String sEnfermar) {
        if (StringUtils.equals(sEnfermar, "gripe")) {
            this.setActualPoints(ToyWars.beginningPoints - 20); //disminuye la vida - 20
        } else if (StringUtils.equals(sEnfermar, "catarro")) {
            this.setActualPoints(ToyWars.beginningPoints - 10); //disminuye la vida - 10
        } else if (StringUtils.equals(sEnfermar, "cancer")) {
            this.setActualPoints(ToyWars.beginningPoints - getActualPoints()); //disminuye a cero
        }
    }

    //jugar();
    @Override
    public void jugar(String sJugar) {
        if (StringUtils.equals(sJugar, "videojuegos")) {
            this.setActualPoints(ToyWars.beginningPoints - 15); //disminuye la vida - 15
        } else if (StringUtils.equals(sJugar, "futbol")) {
            this.setActualPoints(ToyWars.beginningPoints + 30); //aumenta la vida + 30
        } else if (StringUtils.equals(sJugar, "piano")) {
            this.setActualPoints(ToyWars.beginningPoints + 20); //aumenta + 20
        }
    }

    //errorUsuario();
    @Override
    public void errorUsuario() {
        //Todo pabina web error
    }

    //morir();
    @Override
    public void morir() {
        this.setActualPoints(ToyWars.beginningPoints - getActualPoints()); //aumenta la vida + 0 puntos
    }

    //resetear()
    @Override
    public void resetear() {
        this.setIdentification(null);
        this.setName(null);
        this.setGender(null);
    }


    //-----------------------------------------------------------------------------------------------------------------
    //----------------------------------------->> Methods interface IRender <<-----------------------------------------
    //-----------------------------------------------------------------------------------------------------------------

    /*@Override
    public String doRender(RenderType renderType) {
        //switch HTML, JSON, CONSOLE, RENDER_TYPE_ERROR;
        //return renderType.values();
        switch (renderType) {
            case HTML:
                break;
            case JSON:
                break;
            case CONSOLE:
                break;
            case RENDER_TYPE_ERROR:
                break;
            default:
                break;
        }
        return renderType.toString();
    }*/

    //IRender
    @Override
    public void doRender(RenderType renderType) {
        //switch HTML, JSON, CONSOLE, RENDER_TYPE_ERROR;
        //return renderType.values();
        try {
            switch (renderType) {
                case HTML:
                    printHtml();
                    break;

                case JSON:
                    printJson();
                    break;

                case CONSOLE:
                    printConsole();
                    break;

                default:
                    System.out.println("La opción indicada no es correcta, por favor, indica otra.");
                    System.out.println("'HTML', 'JSON' o 'CONSOLE'");
                    //RenderType.RENDER_TYPE_ERROR.values();
                    renderType.values();
                    break;

            }


        } catch (Exception firstExceptionToyDoRender) {
            System.out.println(firstExceptionToyDoRender.getMessage());
            printError();
        }

    }


    //enum RenderType
    //printHtml();
    @Override
    public void printHtml() {

    }

    //printJson();
    @Override
    public void printJson() {

    }

    //printConsole();
    @Override
    public void printConsole() {

    }

    //printError();
    @Override
    public void printError() {

    }
}
