package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import com.lceciliacifpfbmoll.programing.toyWars.ToyWars;
import com.lceciliacifpfbmoll.programing.toyWars.data.abstractClass.LifeBeing;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


public class Toy extends LifeBeing implements DoActions, IRender {
    //Atributos privados estaticos final:
    private static Actions actions;
    private static final AtomicLong count = new AtomicLong(0);

    //Constructores: (alt+insertar)
    public Toy() {
    }

    //Geters y Seters (alt+insertar)
    public static AtomicLong getCount() {
        return count;
    }


    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //Methods insertData
    public Toy(String gender, String name, String option) {
        this.setIdentification(count.incrementAndGet());
        String optionGenderInsertDataTamagotchi = gender.toLowerCase().trim();
        try {
            if (StringUtils.equals(optionGenderInsertDataTamagotchi, "femenino") ||
                    StringUtils.equals(optionGenderInsertDataTamagotchi, "mujer")) {
                this.setGender(Gender.FEMENINO);
            } else if (StringUtils.equals(optionGenderInsertDataTamagotchi, "masculino") ||
                    StringUtils.equals(optionGenderInsertDataTamagotchi, "hombre")) {
                this.setGender(Gender.MASCULINO);
            } else if (StringUtils.equals(optionGenderInsertDataTamagotchi, "ninguno")) {
                //todo si elije esta opción, hasta que no llegue a cierto nivel no
                // sabrá el genero del jugete, en este caso, del Toy.
                this.setGender(Gender.NINGUNO);
            }
        } catch (Exception firstExceptionInsertDataTamagotchi) {
            System.out.println(firstExceptionInsertDataTamagotchi.getMessage());
        }
        this.setName(name.toLowerCase().trim());
        this.setPoints(100);

        /*boolean salir = false;
        while (!salir) {
            System.out.println("");
            System.out.println("==============================================================");
            System.out.println("--------------------->> Menú Principal <<---------------------");
            System.out.println("==============================================================");
            System.out.println("<<---------------------------------------------------------->>");
            System.out.println("1. Insertar un Producto.");
            System.out.println("2. Editar un Producto.");
            System.out.println("3. Mostrar la lista de los productos comprados.");
            System.out.println("4. Mostrar la lista de la compra. (Ticket)");
            System.out.println("9. Salir del Menú Principal.");
            try {
                int opcion = Integer.parseInt(option.toLowerCase().trim());
                System.out.println("<<---------------------------------------------------------->>");
                System.out.println("Elija una de las opciones: ");
                System.out.println("<<---------------------------------------------------------->>");
                switch (opcion) {
                    case 1:
                        Actions actionsAlimentar = Actions.ALIMENTAR;
                        alimentar(String actionsAlimentar);
                        break;
                    case CAMINAR:
                        break;
                    case DORMIR:
                        break;
                    case ENFERMAR:
                        break;
                    case JUGAR:
                        break;
                    case MORIR:
                        break;
                    default:
                        actions.ERRORUSUARIO;

                }
            } catch (Exception firstException) {
                System.out.println(firstException.getMessage());
            }
        }*/
    }

    //Methods printData
    public void printTConsole() {
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("Impresión del Toy " + this.getIdentification() + ".");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("Su nomre es: " + this.getName() + ".");
        System.out.println("Su género es: " + this.getGender() + ".");
        System.out.println("Sus puntos son: " + this.getPoints() + ".");
        System.out.println("");
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("");
    }

    @Override
    public List<Actions> getCurrentActions() {
        return ToyWars.ACTIONS_LINKED_LIST;
    }

    //DoActions
    @Override
    public void alimentar(String actionsAlimento) {

    }

    @Override
    public void caminar(String actionsCamino) {

    }

    @Override
    public void dormir(String actionsDuermo) {

    }

    @Override
    public void enfermer(String actionsEnfermo) {

    }

    @Override
    public void errorUsuario(String actionsError) {

    }

    @Override
    public void jugar(String actionsJuego) {

    }

    @Override
    public void morir(String actionsMuero) {

    }

    //IRender
    @Override
    public List doRender() {
        return null;
    }


    /**
     * Todo
     *
     */


}
