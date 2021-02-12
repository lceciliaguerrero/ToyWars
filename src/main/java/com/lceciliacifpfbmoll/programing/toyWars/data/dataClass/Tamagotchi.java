package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import com.lceciliacifpfbmoll.programing.toyWars.data.abstractClass.LifeBeing;
import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.atomic.AtomicLong;


public class Tamagotchi extends LifeBeing {
    //Atributos publicos estaticos final:
    private static final AtomicLong count = new AtomicLong(0);

    //Constructores: (alt+insertar)
    public Tamagotchi() {
    }

    //Geters y Seters (alt+insertar)
    public static AtomicLong getCount() {
        return count;
    }


    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //Methods insertData
    public Tamagotchi(String gender, String name) {
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
                // sabrá el genero del jugete, en este caso, del Tamagotchi.
                this.setGender(Gender.NINGUNO);
            }
        } catch (Exception firstExceptionInsertDataTamagotchi) {
            System.out.println(firstExceptionInsertDataTamagotchi.getMessage());
        }
        this.setName(name.toLowerCase().trim());
        this.setPoints(100);
    }

    //Methods printData
    public void printTamagotchiConsole() {
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("Impresión del Tamagotchi " + this.getIdentification() + ".");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("Su tipo de juguete es: " + this.getTypeToy() + ".");
        System.out.println("Su puntos de inicio son: " + this.getPointsStart() + ".");
        System.out.println("Su puntos obtenidos son: " + this.getPointsObtained() + ".");
        System.out.println("");
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("");
    }
}
