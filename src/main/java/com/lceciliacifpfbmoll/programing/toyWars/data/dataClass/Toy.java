package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import com.lceciliacifpfbmoll.programing.toyWars.ToyWars;
import com.lceciliacifpfbmoll.programing.toyWars.data.abstractClass.LifeBeing;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


public class Toy extends LifeBeing implements DoActions, IRender {
    //Atributos privados estaticos final:
    private static final AtomicLong count = new AtomicLong(0);

    //Constructores: (alt+insertar)
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

    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //Methods insertData
    public Toy(String gender, String name) {
        ///count
        this.setIdentification(count.incrementAndGet());

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
        } catch (Exception firstExceptionInsertDataTamagotchi) {
            System.out.println(firstExceptionInsertDataTamagotchi.getMessage());
        }

        //String name
        this.setName(name.toLowerCase().trim());

        //ToyWars.beginningPoints
        this.estatus.setActualPoints(ToyWars.beginningPoints);

        //f
        this.estatus.setCurrentAction(getAction());
    }

    //Methods printData
    public void printTConsole() {
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("Impresión del Toy " + this.getIdentification() + ".");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("Su nomre es: " + this.getName() + ".");
        /*System.out.println("Su género es: " + this.getGender() + ".");
        System.out.println("Sus puntos son: " + this.getPoints() + ".");*/
        System.out.println("");
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("");
    }

    @Override
    public List<Action> getCurrentActions() {
        return ToyWars.ACTION_LINKED_LIST;
    }

    //DoActions
    @Override
    public void alimentar(String actionsAlimento) {

    }

    @Override
    public void caminar(Integer iCaminar) {
        if (iCaminar == 0) {
            this.estatus.setActualPoints(getEstatus().getActualPoints()); //no aumenta la vida
        } else if (iCaminar > 0 & iCaminar <= 1) {
            this.estatus.setActualPoints(getEstatus().getActualPoints() + 10); //aumenta la vida + 10
        } else if (iCaminar > 1 & iCaminar <= 2) {
            this.estatus.setActualPoints(getEstatus().getActualPoints() + 20); //aumenta la vida + 20
        } else if (iCaminar > 2 & iCaminar <= 3) {
            this.estatus.setActualPoints(getEstatus().getActualPoints() + 35); //aumenta la vida + 35
        } else if (iCaminar > 3 & iCaminar <= 4) {
            this.estatus.setActualPoints(getEstatus().getActualPoints() + 50); //aumenta la vida + 35
        }
    }

    @Override
    public void dormir(Integer iDormir) {
        if (iDormir >= 6 & iDormir <= 8) {
            this.estatus.setActualPoints(getEstatus().getActualPoints() + 25); //aumenta la vida + 25
        } else if (iDormir > 8 & iDormir <= 10) {
            this.estatus.setActualPoints(getEstatus().getActualPoints() + 15); //aumenta la vida + 15
        } else if (iDormir > 10 & iDormir <= 12) {
            this.estatus.setActualPoints(getEstatus().getActualPoints() - 35); //disminuye la vida - 15
        }
    }

    @Override
    public void enfermar(String sEnfermar) {
        if (StringUtils.equals(sEnfermar, "gripe")) {
            this.estatus.setActualPoints(getEstatus().getActualPoints() - 20); //disminuye la vida - 20
        } else if (StringUtils.equals(sEnfermar, "catarro")) {
            this.estatus.setActualPoints(getEstatus().getActualPoints() - 10); //disminuye la vida - 10
        } else if (StringUtils.equals(sEnfermar, "cancer")) {
            this.estatus.setActualPoints(getEstatus().getActualPoints() - estatus.getActualPoints()); //disminuye a cero
        }
    }

    @Override
    public void errorUsuario() {
        //Todo pabina web error
    }

    @Override
    public void jugar(String sJugar) {
        if (StringUtils.equals(sJugar, "videojuegos")) {
            this.estatus.setActualPoints(getEstatus().getActualPoints() - 15); //disminuye la vida - 15
        } else if (StringUtils.equals(sJugar, "futbol")) {
            this.estatus.setActualPoints(getEstatus().getActualPoints() + 30); //aumenta la vida + 30
        } else if (StringUtils.equals(sJugar, "piano")) {
            this.estatus.setActualPoints(getEstatus().getActualPoints() + 20); //aumenta + 20
        }
    }

    @Override
    public void morir() {
        this.estatus.setActualPoints(getEstatus().getActualPoints() - estatus.getActualPoints()); //aumenta la vida + 0 puntos
    }


    /**
     * Todo
     *
     */


}
